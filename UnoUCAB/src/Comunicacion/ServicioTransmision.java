package Comunicacion;

import Dominio.Baraja;
import Dominio.Carta;
import com.fazecast.jSerialComm.*;
import java.util.ArrayList;
import java.util.List;

public class ServicioTransmision {
    SerialPort puertoEntrada;
    SerialPort puertoSalida;
    String flag = "01111110";
    String instruccionCartaMesa = "0111";
    String instruccionCartaMano = "0110";

    public ServicioTransmision(int entrada, int salida) {    
        puertoEntrada = SerialPort.getCommPorts()[entrada];
        puertoEntrada.setComPortParameters(2400, 8, 0, 1);
        puertoEntrada.setComPortTimeouts(SerialPort.TIMEOUT_SCANNER, 1, 1);
        puertoEntrada.openPort();
        if(entrada!=salida){
            puertoSalida = SerialPort.getCommPorts()[salida];
            puertoSalida.setComPortParameters(2400, 8, 0, 1);
            puertoSalida.setComPortTimeouts(SerialPort.TIMEOUT_SCANNER, 1, 1);
            puertoSalida.openPort(); 
        }
        else{
            puertoSalida=puertoEntrada;
        }
    }
   
    // Imprime por terminal la lista de los puertos disponibles
    public static ArrayList<String> listaPuertos(){
        ArrayList<String> puertos = new ArrayList<String>();
        SerialPort[] comPort = SerialPort.getCommPorts();
        for (int i=0; i<comPort.length; i++){
            puertos.add(comPort[i].getDescriptivePortName());
        }
        return puertos;
    }
    
    public void deconectar(){
        puertoEntrada.closePort();
        puertoSalida.closePort();
    }
    
    public byte[] leer(){
        byte[] readBuffer = null;
        try {
            System.out.print("Leyendo datos\n");
            while (puertoEntrada.bytesAvailable() <= 0) {
                Thread.sleep(20);
            }
            readBuffer = new byte[puertoEntrada.bytesAvailable()];
            int numRead = puertoEntrada.readBytes(readBuffer, readBuffer.length);
            System.out.print("Se ecnontraron: " + numRead + " bytes.:");
            for(int i=0; i<numRead;i++) System.out.print(" "+Integer.toBinaryString(readBuffer[i] & 0xFF));
            System.out.print("\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return readBuffer;
    }
    
        public void ObtenerMensaje(Baraja mesa, Baraja mazo){
        byte[] readBuffer = null;
        try {
            System.out.print("Leyendo datos\n");
            while (puertoEntrada.bytesAvailable() <= 0) {
                Thread.sleep(20);
            }
            readBuffer = new byte[puertoEntrada.bytesAvailable()];
            int numRead = puertoEntrada.readBytes(readBuffer, readBuffer.length);
            System.out.print("Se encontro el mensaje:\n");
            for(int i=0; i<numRead;i++) System.out.print(" "+Integer.toBinaryString(readBuffer[i] & 0xFF));
            System.out.print("\n");
            nuevaCartaMesa(readBuffer[2],mesa,mazo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        
    public void escribir(byte[] writeBuffer){
        try {
            puertoSalida.writeBytes(writeBuffer, writeBuffer.length);
            /*byte[] envio = new byte[2];
            envio[0] = (byte)Short.parseShort("11000000", 2);
            envio[1] = (byte)Short.parseShort("11000000", 2);
            puertoSalida.writeBytes(envio, envio.length);
            */
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
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
    
    public void nuevaCartaMesa(byte informacion, Baraja mesa, Baraja mazo){
        String campoCarta = pasarByteAString(informacion);
        String tipoCarta = campoCarta.substring(4);
        String codigoCarta;
        int num = Integer.parseInt(tipoCarta);
        if(num<=1001){
            codigoCarta = campoCarta.substring(2);
        }
        else codigoCarta = tipoCarta;
        Carta nuevaCarta = mazo.obtenerCarta(codigoCarta);
        mesa.añadirCarta(nuevaCarta);
    }
    
    public String pasarByteAString(byte b){
        String retorno = Integer.toBinaryString(b & 0xFF);
        while(retorno.length()<8) retorno = "0" + retorno;
        return retorno;
    }
}
