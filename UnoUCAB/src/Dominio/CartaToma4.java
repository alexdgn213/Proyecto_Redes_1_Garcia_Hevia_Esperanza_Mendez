/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import Comunicacion.ServicioTransmision;
import javax.swing.JLabel;

/**
 *
 * @author alexd
 */
public class CartaToma4 extends Carta{

    public CartaToma4(String color, String codigo, String imagen, String campoInformacion) {
        super(codigo, imagen, campoInformacion,color);
    }

    @Override
    public void jugar(ServicioTransmision s, String origen, String destino, String direccion, String color) {
        String temp = this.campoInformacion;
        this.campoInformacion=color+this.campoInformacion;
        s.enviarCartaMesa(this, origen, destino, direccion);
        this.campoInformacion=temp;
    }

    @Override
    public void mostrarColor(JLabel rojo, JLabel azul, JLabel verde, JLabel amarillo, String color) {
    }
    
    public void sacar(ServicioTransmision s, String origen, String destino, String direccion){
        String temp = this.campoInformacion;
        this.campoInformacion="00"+this.campoInformacion;
        s.enviarCartaMano(this, origen,destino,direccion);
        this.campoInformacion=temp;
    }

    @Override
    public boolean puedeJugar(String colorActual, Carta cartaActual) {
        return true;
    }
    
}
