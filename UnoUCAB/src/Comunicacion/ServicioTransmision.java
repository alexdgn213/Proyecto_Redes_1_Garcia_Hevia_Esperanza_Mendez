package Comunicacion;

import Dominio.Baraja;
import Dominio.Carta;
import Interfaz.Tablero;
import com.fazecast.jSerialComm.*;
import java.util.ArrayList;
import java.util.List;

/*
    Descripcion: clase encargada de toda la configuracion para envio y recivo de informacion por el rs232,
                 es una sola en toda la aplicacion y se configura al inicio.
*/

public class ServicioTransmision {
    SerialPort puertoEntrada;
    SerialPort puertoSalida;
    
    //Constantes de la comunicacion
    String flag = "01111110";
    String instruccionCartaMesa = "0111";
    String instruccionCartaMano = "0110";
    String instruccionInicio = "0001";
    String instruccionCartasIniciales = "0010";

    public ServicioTransmision(int entrada, int salida) {    
        //COnfiguracion inicial
        puertoEntrada = SerialPort.getCommPorts()[entrada];
        puertoEntrada.setComPortParameters(2400, 8, 0, 1);
        puertoEntrada.setComPortTimeouts(SerialPort.TIMEOUT_SCANNER, 1, 1);
        puertoEntrada.openPort();
        if(entrada!=salida){
            // Los puertos de salida y entrada son diferentes(para realizar pruebas en una sola maquina)
            puertoSalida = SerialPort.getCommPorts()[salida];
            puertoSalida.setComPortParameters(2400, 8, 0, 1);
            puertoSalida.setComPortTimeouts(SerialPort.TIMEOUT_SCANNER, 1, 1);
            puertoSalida.openPort(); 
        }
        else{
            // COnfiguracion real
            puertoSalida=puertoEntrada;
        }
    }
   
    // genera la lista de los puertos disponibles
    public static ArrayList<String> listaPuertos(){
        ArrayList<String> puertos = new ArrayList<String>();
        SerialPort[] comPort = SerialPort.getCommPorts();
        for (int i=0; i<comPort.length; i++){
            puertos.add(comPort[i].getDescriptivePortName());
        }
        return puertos;
    }
    
    // Desconecta la coneccion
    public void deconectar(){
        puertoEntrada.closePort();
        puertoSalida.closePort();
    }
    
    // Metodo principal a ejecutarse cuando se espera una jugada, aqui es donde se lee la informacion enviada y se decide
    // que se hara dependiendo de lo enviado, retorna un booleano el cual indica si ahora es turno del jugador o no
    public boolean ObtenerMensaje(Tablero t){
        byte[] readBuffer = null; // Bytes para almacenar la informacion
        try {
            //Espero a que algo llegue
            while (puertoEntrada.bytesAvailable() < 4) {
                Thread.sleep(20);
            }
            
            // Algo llego asi que lo almaceno en el buffer
            readBuffer = new byte[4];
            int numRead = puertoEntrada.readBytes(readBuffer, 4);
            
            //Comprobacion de que se envio
            System.out.print("Se encontro el mensaje:\n");
            for(int i=0; i<numRead;i++) System.out.print(" "+
                    pasarByteAString(readBuffer[i]));
            System.out.print("\n");
            
            //Una vez aqui debo ver que tipo de instruccion es y decidir que hare
            String byteControl = pasarByteAString(readBuffer[1]);
            String instruccion = byteControl.substring(4); // Campo de control
            String origen = byteControl.substring(0,2); // Equipo de Origen
            String destino =  byteControl.substring(2,4); // Equipo de destino
            if(instruccion.equals(instruccionCartaMesa)){ 
                if(!origen.equals(t.getCodigoJugador())){
                    // La informacion enviada es una carta juagada
                    return nuevaCartaMesa(t,origen,destino,readBuffer[2]);
                }
                else{ 
                    return false;
                }
            }
            else if(instruccion.equals(instruccionCartaMano)){  
                if(!origen.equals(t.getCodigoJugador())){
                    // La informacion enviada es una carta tomada del mazo
                    return nuevaCartaMano(t,origen,destino,readBuffer[2]);
                }
                else{ 
                    return false;
                }
            }
            else if(instruccion.equals(instruccionCartasIniciales)){  
                if(!origen.equals(t.getCodigoJugador())){
                    if(destino.equals(t.getCodigoJugador())){
                        t.obtenerCartasPropias();
                    }
                    else{
                        anunciarTomarCartas(t.getCodigoJugador(),t.getJugadorSiguiente(),String.valueOf(t.getSentido()));
                    }  
                }
                if(destino.equals("00")){
                    t.obtenerPrimeraCarta();
                }
                return false;
            }
            else if(instruccion.equals(instruccionInicio)){
                // La informacion enviada es sobre el inicio de la partida
                String informacion = pasarByteAString(readBuffer[2]);
                String modo = informacion.substring(5,6);
                String jugadores = informacion.substring(6);
                if(modo.equals("0")){
                    // La informacion enviada es para iniciar la partida y asignar jugadores
                    if(!origen.equals(t.getCodigoJugador())){
                        // es un jugador nuevo asi que se cambia su codigo por el nuevo
                        t.setCodigoJugador(unirseAPartida(readBuffer[2],t.getCodigoJugador()));
                        return false;
                    }
                    else{
                        // Es el mismo jugador que inicio asi que se envia el mensaje con el num de jugadores
                        anunciarJugadores(jugadores);
                        return false;
                    }
                }
                else{
                    // La informecion es el anuncio de cuantos jugadores son se envia a los demas 
                    // a menos que sea el jugador inicial
                    jugadoresContinuos(t,jugadores);
                    if(!origen.equals(t.getCodigoJugador())){
                        anunciarJugadores(jugadores);
                        return false;
                    }
                    else{
                        t.setJugadorAnterior(jugadores);
                        t.obtenerCartasPropias();
                        return false;
                    }
                }
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
    
        
    // Metodo que envia la informacion para iniciar una partida
    public void IniciarPartida(){
        byte[] envio = new byte[4];
        envio[0] = (byte)Short.parseShort(flag, 2);
        envio[1] = (byte)Short.parseShort("0000"+instruccionInicio, 2);
        envio[2] = (byte)Short.parseShort("10000000", 2);
        envio[3] = (byte)Short.parseShort(flag, 2);
        System.out.print("Mensaje enviado: "
                +" "+pasarByteAString(envio[0])
                +" "+pasarByteAString(envio[1])
                +" "+pasarByteAString(envio[2])
                +" "+pasarByteAString(envio[3])
                +"\n");
        puertoSalida.writeBytes(envio, envio.length);
    }
    
    // Metodo que envia cuantos jugadores hay en tota, El string es el numero de jugadores en binario
    public void anunciarJugadores(String jugadores){
        byte[] envio = new byte[4];
        envio[0] = (byte)Short.parseShort(flag, 2);
        envio[1] = (byte)Short.parseShort("0000"+instruccionInicio, 2);
        envio[2] = (byte)Short.parseShort("100001"+jugadores, 2);
        envio[3] = (byte)Short.parseShort(flag, 2);
        System.out.print("Mensaje enviado: "
                +" "+pasarByteAString(envio[0])
                +" "+pasarByteAString(envio[1])
                +" "+pasarByteAString(envio[2])
                +" "+pasarByteAString(envio[3])
                +"\n");
        puertoSalida.writeBytes(envio, envio.length);
    }
    
    public void anunciarTomarCartas(String origen,String destino,String sentido){
        byte[] envio = new byte[4];
        envio[0] = (byte)Short.parseShort(flag, 2);
        envio[1] = (byte)Short.parseShort(origen+destino+instruccionCartasIniciales, 2);
        envio[2] = (byte)Short.parseShort("1"+sentido+"000000", 2);
        envio[3] = (byte)Short.parseShort(flag, 2);
        System.out.print("Mensaje enviado: "
                +" "+pasarByteAString(envio[0])
                +" "+pasarByteAString(envio[1])
                +" "+pasarByteAString(envio[2])
                +" "+pasarByteAString(envio[3])
                +"\n");
        puertoSalida.writeBytes(envio, envio.length);
    }
    
    // Metodo ejecutado al querer unirse a una partida, asigna el numero de jugador y envia el mensaje al siguiente
    public String unirseAPartida(byte informacion,String codigoJugador){
        byte[] envio = new byte[4];
        envio[0] = (byte)Short.parseShort(flag, 2);
        envio[1] = (byte)Short.parseShort("0000"+instruccionInicio, 2);
        envio[2] = (byte) (informacion+(byte)Short.parseShort("0000001", 2));
        envio[3] = (byte)Short.parseShort(flag, 2);
        System.out.print("Mensaje enviado: "
                +" "+pasarByteAString(envio[0])
                +" "+pasarByteAString(envio[1])
                +" "+pasarByteAString(envio[2])
                +" "+pasarByteAString(envio[3])
                +"\n");
        codigoJugador = pasarByteAString(envio[2]).substring(6);
        System.out.println("Soy el jugador: "+codigoJugador);
        puertoSalida.writeBytes(envio, envio.length);
        return codigoJugador;
    }

    // Metodo que envia una carta al ser jugada, las comprobaciones deben ir en el metodo de la carta
    public void enviarCartaMesa(Carta c, String origen, String destino,String sentido){
        byte[] envio = new byte[4];
        envio[0] = (byte)Short.parseShort(flag, 2);
        envio[1] = (byte)Short.parseShort(origen+destino+instruccionCartaMesa, 2);
        envio[2] = (byte)Short.parseShort("1"+sentido+c.getCampoInformacion(), 2);
        envio[3] = (byte)Short.parseShort(flag, 2);
        System.out.print("Mensaje enviado: "
                +" "+pasarByteAString(envio[0])
                +" "+pasarByteAString(envio[1])
                +" "+pasarByteAString(envio[2])
                +" "+pasarByteAString(envio[3])
                +"\n");
        puertoSalida.writeBytes(envio, envio.length);
    }
      
    // Metodo ejecutado al definir que un mensaje es de una nueva carta, la quita de la mano del jugador(Pendiente por hacer)
    // y la inserta en la mesa
    public boolean nuevaCartaMesa(Tablero t,String origen,String destino,byte informacion){
        String campoCarta = pasarByteAString(informacion);
        // Obtengo el campoInformacion de dicha carta
        String tipoCarta = campoCarta.substring(4);
        String direccion = campoCarta.substring(1,2);
        // El usuario no paso si no que coloco una carta
        String codigoCarta;
        int num = Integer.parseInt(tipoCarta);
        if(num<=1100){
            // Si es una carta de color me importan los ultimos 6 bits
            codigoCarta = campoCarta.substring(2);
        }
        // Si es una carta especial solo me importan los ultimos 4 bits
        else codigoCarta = tipoCarta;
        // Quito la carta de la mano del jugador)
        Carta nuevaCarta=null;
        if(nuevaCarta==null){
            nuevaCarta=t.getJugador4().obtenerCarta(codigoCarta);
        }
        if(nuevaCarta==null){
            nuevaCarta=t.getJugador2().obtenerCarta(codigoCarta);
        }
        if(nuevaCarta==null){
            nuevaCarta=t.getJugador3().obtenerCarta(codigoCarta);
        }
        // la agrego a la mesa
        if(nuevaCarta!=null){
            t.getMesa().añadirCarta(nuevaCarta);
            nuevaCarta.jugar(this, origen, destino, direccion);
        }
        if(t.getCodigoJugador().equals(destino)) return true;
        return false;
        
    }
    
    public void enviarCartaMano(Carta c, String origen,String destino,String sentido){
        byte[] envio = new byte[4];
        envio[0] = (byte)Short.parseShort(flag, 2);
        envio[1] = (byte)Short.parseShort(origen+destino+instruccionCartaMano, 2);
        envio[2] = (byte)Short.parseShort("1"+sentido+c.getCampoInformacion(), 2);
        envio[3] = (byte)Short.parseShort(flag, 2);
        System.out.print("Mensaje enviado: "
                +" "+pasarByteAString(envio[0])
                +" "+pasarByteAString(envio[1])
                +" "+pasarByteAString(envio[2])
                +" "+pasarByteAString(envio[3])
                +"\n");
        puertoSalida.writeBytes(envio, envio.length);
    }
    
    public boolean nuevaCartaMano(Tablero t,String origen,String destino,byte informacion){
        String campoCarta = pasarByteAString(informacion);
        // Obtengo el campoInformacion de dicha carta
        String tipoCarta = campoCarta.substring(4);
        String direccion = campoCarta.substring(1,2);
        // El usuario no paso si no que coloco una carta
        String codigoCarta;
        int num = Integer.parseInt(tipoCarta);
        if(num<=1100){
            // Si es una carta de color me importan los ultimos 6 bits
            codigoCarta = campoCarta.substring(2);
        }
        // Si es una carta especial solo me importan los ultimos 4 bits
        else codigoCarta = tipoCarta;
        // Quito la carta del mazo
        Carta nuevaCarta=t.getMazo().obtenerCarta(codigoCarta);
        // La agrego a su correspondiente jugador
        if(nuevaCarta!=null){
            enviarCartaMano(nuevaCarta,origen,destino,direccion);
            if(origen.equals(t.getJugadorSiguiente())){
                t.getJugador2().añadirCarta(nuevaCarta);
            }
            else if(origen.equals(t.getJugadorExtra())){
                t.getJugador3().añadirCarta(nuevaCarta);
            }
            else if(origen.equals(t.getJugadorAnterior())){
                t.getJugador4().añadirCarta(nuevaCarta);
            }
            
        }
        return false;
        
    }
    
    // Metodo que envia una el paso de un turno
    public void pasarTurno(String origen, String destino,String sentido){
        byte[] envio = new byte[4];
        envio[0] = (byte)Short.parseShort(flag, 2);
        envio[1] = (byte)Short.parseShort(origen+destino+instruccionCartaMesa, 2);
        envio[2] = (byte)Short.parseShort("1"+sentido+"1111", 2);
        envio[3] = (byte)Short.parseShort(flag, 2);
        System.out.print("Mensaje enviado: "
                +" "+pasarByteAString(envio[0])
                +" "+pasarByteAString(envio[1])
                +" "+pasarByteAString(envio[2])
                +" "+pasarByteAString(envio[3])
                +"\n");
        puertoSalida.writeBytes(envio, envio.length);
    }
    
    //COnvierte un Byte en un string(para poder comparar) 
    public String pasarByteAString(byte b){
        String retorno = Integer.toBinaryString(b & 0xFF);
        //Para asegurar que sean 8 caracteres(llenar de ceros a la izquierda)
        while(retorno.length()<8) retorno = "0" + retorno;
        return retorno;
    }
    
    //Asigna quien es el jugador siguiente y quien es el anterior
    public void jugadoresContinuos(Tablero t,String jugadores){
        if(jugadores.equals("11")){
            if(t.getCodigoJugador().equals("00")){
                t.setJugadorAnterior("11");
                t.setJugadorSiguiente("01");
                t.setJugadorExtra("10");
            }
            else if(t.getCodigoJugador().equals("01")){
                t.setJugadorAnterior("00");
                t.setJugadorSiguiente("10");
                t.setJugadorExtra("11");
            }
            else if(t.getCodigoJugador().equals("10")){
                t.setJugadorAnterior("01");
                t.setJugadorSiguiente("11");
                t.setJugadorExtra("00");
            }
            else if(t.getCodigoJugador().equals("11")){
                t.setJugadorAnterior("10");
                t.setJugadorSiguiente("00");
                t.setJugadorExtra("01");
            }
        }
        else if(jugadores.equals("10")){
            if(t.getCodigoJugador().equals("00")){
                t.setJugadorAnterior("10");
                t.setJugadorSiguiente("01");
            }
            else if(t.getCodigoJugador().equals("01")){
                t.setJugadorAnterior("00");
                t.setJugadorSiguiente("10");
            }
            else if(t.getCodigoJugador().equals("10")){
                t.setJugadorAnterior("01");
                t.setJugadorSiguiente("00");
            }
        }
        else if(jugadores.equals("01")){
            if(t.getCodigoJugador().equals("00")){
                t.setJugadorAnterior("01");
                t.setJugadorSiguiente("01");
            }
            else if(t.getCodigoJugador().equals("01")){
                t.setJugadorAnterior("00");
                t.setJugadorSiguiente("00");
            }
        }
        else if(jugadores.equals("00")){
            if(t.getCodigoJugador().equals("00")){
                t.setJugadorAnterior("00");
                t.setJugadorSiguiente("00");
            }
        }
        
    }
}
