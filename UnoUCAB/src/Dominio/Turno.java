/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import Comunicacion.ServicioTransmision;
import Interfaz.MensajeUI;
import Interfaz.Tablero;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alexd
 * Descripcion: Clase que se encarga de manejar la espera del turno en un hilo aparte,
 * permite definir si el jugador puede hacer algo o no
 */
public class Turno implements Runnable{
    boolean puedeJugar; // Booleando que indica si es el turno del jugador
    Tablero t; // Es necesario para manejar los datos del tablero
    String codigoJugador; // Contiene el codigo del jugador actual

    public Turno( Tablero t) {
        this.puedeJugar = false;
        this.t=t;
        this.codigoJugador="00"; 
    }
    
    // Metodo que permite invocar a la espera de un mensaje,
    // Una vez terminado es turno del jugador
    @Override
    public void run() {
        this.puedeJugar=false; // QUito el turno al jugador
        // MIentras no sea el turno del jugador
        while(!puedeJugar){
            try{Thread.sleep(1000);
            }   catch (InterruptedException ex) {
                Logger.getLogger(MensajeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.puedeJugar=t.getS().ObtenerMensaje(t,t.getMesa(),t.getMazo()); // recibo un mensaje 
            t.mostrarMesa();
            t.mostrarSentido();
            t.mostrarColor();
        } 
    }

    public boolean puedeJugar() {
        return puedeJugar;
    }

    public void setPuedeJugar(boolean puedeJugar) {
        this.puedeJugar = puedeJugar;
    }
    
}
