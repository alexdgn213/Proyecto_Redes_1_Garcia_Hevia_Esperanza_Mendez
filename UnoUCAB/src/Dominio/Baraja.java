/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alexd
 */
public class Baraja {
    List<Carta> cartas;

    public Baraja() {
        cartas=new ArrayList<Carta>();
    }
    
    public void llenarMazo(){
        Carta c;
        c = new CartaSimple("Azul", 1, "A1", "/Interfaz/Imagenes/Cartas/B1.png","11111111");
        cartas.add(c);
        c = new CartaSimple("Azul", 2, "A2", "/Interfaz/Imagenes/Cartas/B2.png", "11111111");
        cartas.add(c);
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(List<Carta> cartas) {
        this.cartas = cartas;
    }
    
    
}
