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
public class CartaSimple extends Carta{
    int numero;

    public CartaSimple(String color, int numero, String codigo, String imagen, String campoInformacion) {
        super(codigo, imagen, campoInformacion,color);
        this.numero = numero;
    }
    
    public void jugar(ServicioTransmision s, String origen, String destino, String direccion){
        // AL ser una carta simple debe primedo comprobarse si se puede jugar(PENDIENTE) y luego se envia
        s.enviarCartaMesa(this, origen,destino,direccion);
    
    }

    public void sacar(ServicioTransmision s, String origen, String destino, String direccion){
        // AL ser una carta simple debe primedo comprobarse si se puede jugar(PENDIENTE) y luego se envia
        s.enviarCartaMano(this, origen,destino,direccion);
    
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public void mostrarColor(JLabel rojo, JLabel azul, JLabel verde, JLabel amarillo, String color) {
        if(this.color.equals("Rojo")) rojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/CCRojo.png")));
        else if(this.color.equals("Azul")) azul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/CCAzul.png")));
        else if(this.color.equals("Verde")) verde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/CCVerde.png")));
        else if(this.color.equals("Amarillo")) amarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/Imagenes/CCAmarillo.png")));
    
    }
    
    
   
}
