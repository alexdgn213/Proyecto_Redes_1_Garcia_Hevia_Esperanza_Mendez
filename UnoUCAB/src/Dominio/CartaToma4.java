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

    public CartaToma4(String codigo, String imagen, String campoInformacion) {
        super(codigo, imagen, campoInformacion);
    }

    @Override
    public void jugar(ServicioTransmision s) {
        s.enviarCartaMesa(this, "00", "00", "1");
    }

    @Override
    public void mostrarColor(JLabel rojo, JLabel azul, JLabel verde, JLabel amarillo, String color) {
    }
    
    
    
    
}
