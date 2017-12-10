package Comunicacion;

import com.fazecast.jSerialComm.*;
import java.util.ArrayList;

public class ServicioTransmision {
    SerialPort puertoEntrada;
    SerialPort puertoSalida;

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
            //while (true) {
                System.out.print("Leyendo datos\n");
                while (puertoEntrada.bytesAvailable() <= 0) {
                    Thread.sleep(20);
                }
                readBuffer = new byte[puertoEntrada.bytesAvailable()];
                
                int numRead = puertoEntrada.readBytes(readBuffer, readBuffer.length);
                System.out.print("Se ecnontraron: " + numRead + " bytes.:");
                for(int i=0; i<numRead;i++) System.out.print(" "+readBuffer[i] );
                System.out.print("\n");
                
            //}
        } catch (Exception e) {
            e.printStackTrace();
        }
        return readBuffer;
    }
    
    public void escribir(byte[] writeBuffer){
        try {
            puertoSalida.writeBytes(writeBuffer, writeBuffer.length);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
