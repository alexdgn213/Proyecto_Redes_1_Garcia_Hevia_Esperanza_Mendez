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
public class CartaReversa extends Carta{
    String color;

    public CartaReversa(String color, String codigo, String imagen, String campoInformacion) {
        super(codigo, imagen, campoInformacion);
        this.color = color;
    }

    @Override
    public void jugar(ServicioTransmision s) {
        s.enviarCartaMesa(this, "00", "00", "1");
    }

    @Override
    public void mostrarColor(JLabel rojo, JLabel azul, JLabel verde, JLabel amarillo, String color) {
        if(this.color.equals("Rojo")) rojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/CCRojo.png")));
        else if(this.color.equals("Azul")) azul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/CCAzul.png")));
        else if(this.color.equals("Verde")) verde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/CCVerde.png")));
        else if(this.color.equals("Amarillo")) amarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/CCAmarillo.png")));
    }
    
    
}
