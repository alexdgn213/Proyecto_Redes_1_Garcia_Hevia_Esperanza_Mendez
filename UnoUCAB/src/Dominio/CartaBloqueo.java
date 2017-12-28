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
public class CartaBloqueo extends Carta{
    String color;

    public CartaBloqueo(String color, String codigo, String imagen, String campoInformacion) {
        super(codigo, imagen, campoInformacion);
        this.color=color;
    }

    @Override
    public void enviar(ServicioTransmision s) {
        s.enviarCartaMesa(this, "00", "00", "1");
    }

}
