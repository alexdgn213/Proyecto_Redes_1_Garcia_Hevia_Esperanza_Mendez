/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import Comunicacion.ServicioTransmision;

/**
 *
 * @author alexd
 */
public class CartaSimple extends Carta{
    String color;
    int numero;

    public CartaSimple(String color, int numero, String codigo, String imagen, String campoInformacion) {
        super(codigo, imagen, campoInformacion);
        this.color = color;
        this.numero = numero;
    }
    
    public void enviar(ServicioTransmision s){
        s.enviarCartaMesa(this, "00", "00", "1");
    
    }
    
   
}
