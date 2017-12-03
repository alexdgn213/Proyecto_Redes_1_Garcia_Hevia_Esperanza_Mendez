package Comunicacion;

import com.fazecast.jSerialComm.*;

public class ServicioTransmision {

    public ServicioTransmision() {
//        SerialPort comPort = SerialPort.getCommPorts()[1];
//        comPort.setComPortParameters(2400, 8, 0, 1);
//        comPort.setComPortTimeouts(SerialPort.TIMEOUT_SCANNER, 1, 1);
//        comPort.openPort();
//
//        try {
//            while (true) {
//                while (comPort.bytesAvailable() < 0) {
//                    Thread.sleep(20);
//                }
//                byte[] readBuffer = new byte[comPort.bytesAvailable()];
//                int numRead = comPort.readBytes(readBuffer, readBuffer.length);
//                System.out.println("Read " + numRead + " bytes.");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        comPort.closePort();
//        System.out.print("Error");
    }
    
    // Imprime por terminal la lista de los puertos disponibles
    public void listaPuertos(){
        SerialPort[] comPort = SerialPort.getCommPorts();
        for (int i=0; i<comPort.length; i++){
            System.out.println(comPort[i].getDescriptivePortName());
        }
        
    }
    
    
    
}
