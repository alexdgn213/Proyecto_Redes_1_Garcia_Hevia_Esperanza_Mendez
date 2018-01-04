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
public class CartaToma2 extends Carta{

    public CartaToma2(String color, String codigo, String imagen, String campoInformacion) {
        super(codigo, imagen, campoInformacion,color,20);
    }

    @Override
    public void jugar(ServicioTransmision s, String origen, String destino, String direccion,String color) {
        s.enviarCartaMesa(this, origen, destino, direccion);
    }

    public void sacar(ServicioTransmision s, String origen, String destino, String direccion){
        s.enviarCartaMano(this, origen,destino,direccion);
    }
    
    @Override
    public void mostrarColor(JLabel rojo, JLabel azul, JLabel verde, JLabel amarillo, String color) {
        if(this.color.equals("Rojo")) rojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/CCRojo.png")));
        else if(this.color.equals("Azul")) azul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/CCAzul.png")));
        else if(this.color.equals("Verde")) verde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/CCVerde.png")));
        else if(this.color.equals("Amarillo")) amarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/CCAmarillo.png")));
    }

    @Override
    public boolean puedeJugar(String colorActual, Carta cartaActual) {
        if(colorActual.equals(this.color)){
            return true;
        }
        if(cartaActual instanceof CartaToma2){
            return true;
        }
        return false;
    }
    
    
    
}
