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
import javax.swing.JPanel;

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
    JPanel panelMensaje;
    boolean enUso=false;

    public Turno( Tablero t, JPanel panelMensaje) {
        this.puedeJugar = false;
        this.t=t;
        this.panelMensaje = panelMensaje;
        this.codigoJugador="00"; 
    }
    
    // Metodo que permite invocar a la espera de un mensaje,
    // Una vez terminado es turno del jugador
    @Override
    public void run() {
        enUso=true;
        this.puedeJugar=false; // QUito el turno al jugador
        new Thread(new MensajeUI(panelMensaje,"Esperando el turno",1)).start();
        // Mientras no sea el turno del jugador
        while(!puedeJugar){
        try{Thread.sleep(10);
            }   catch (InterruptedException ex) {
                Logger.getLogger(MensajeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.puedeJugar=t.getS().ObtenerMensaje(t); // recibo un mensaje 
            t.mostrarTodo();
        } 
        new Thread(new MensajeUI(panelMensaje,"Es tu turno!",4)).start();
        enUso=false;
    }
    
    public void esperar(){
        if(!enUso){
            new Thread(this).start();
        }
    }

    public boolean puedeJugar() {
        return puedeJugar;
    }

    public void setPuedeJugar(boolean puedeJugar) {
        this.puedeJugar = puedeJugar;
    }
    
}
