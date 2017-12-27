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
        c = new CartaSimple("Azul", 3, "A3", "/Interfaz/Imagenes/Cartas/B3.png", "11111111");
        cartas.add(c);
        c = new CartaSimple("Azul", 4, "A4", "/Interfaz/Imagenes/Cartas/B4.png", "11111111");
        cartas.add(c);
        c = new CartaSimple("Azul", 5, "A5", "/Interfaz/Imagenes/Cartas/B5.png", "11111111");
        cartas.add(c);
        c = new CartaSimple("Azul", 6, "A6", "/Interfaz/Imagenes/Cartas/B6.png", "11111111");
        cartas.add(c);
        c = new CartaSimple("Azul", 7, "A7", "/Interfaz/Imagenes/Cartas/B7.png", "11111111");
        cartas.add(c);
        c = new CartaSimple("Azul", 8, "A8", "/Interfaz/Imagenes/Cartas/B8.png", "11111111");
        cartas.add(c);
        c = new CartaSimple("Azul", 9, "A9", "/Interfaz/Imagenes/Cartas/B9.png", "11111111");
        cartas.add(c);
        c = new CartaSimple("Azul", 0, "A0", "/Interfaz/Imagenes/Cartas/B0.png", "11111111");
        cartas.add(c);
        c = new CartaSimple("Rojo", 1, "R1", "/Interfaz/Imagenes/Cartas/R1.png","11111111");
        cartas.add(c);
        c = new CartaSimple("Rojo", 2, "R2", "/Interfaz/Imagenes/Cartas/R2.png", "11111111");
        cartas.add(c);
        c = new CartaSimple("Rojo", 3, "R3", "/Interfaz/Imagenes/Cartas/R3.png", "11111111");
        cartas.add(c);
        c = new CartaSimple("Rojo", 4, "R4", "/Interfaz/Imagenes/Cartas/R4.png", "11111111");
        cartas.add(c);
        c = new CartaSimple("Rojo", 5, "R5", "/Interfaz/Imagenes/Cartas/R5.png", "11111111");
        cartas.add(c);
        c = new CartaSimple("Rojo", 6, "R6", "/Interfaz/Imagenes/Cartas/R6.png", "11111111");
        cartas.add(c);
        c = new CartaSimple("Rojo", 7, "R7", "/Interfaz/Imagenes/Cartas/R7.png", "11111111");
        cartas.add(c);
        c = new CartaSimple("Rojo", 8, "R8", "/Interfaz/Imagenes/Cartas/R8.png", "11111111");
        cartas.add(c);
        c = new CartaSimple("Rojo", 9, "R9", "/Interfaz/Imagenes/Cartas/R9.png", "11111111");
        cartas.add(c);
        c = new CartaSimple("Rojo", 0, "R0", "/Interfaz/Imagenes/Cartas/R0.png", "11111111");
        cartas.add(c);
                c = new CartaSimple("Verde", 1, "G1", "/Interfaz/Imagenes/Cartas/G1.png","11111111");
        cartas.add(c);
        c = new CartaSimple("Verde", 2, "G2", "/Interfaz/Imagenes/Cartas/G2.png", "11111111");
        cartas.add(c);
        c = new CartaSimple("Verde", 3, "G3", "/Interfaz/Imagenes/Cartas/G3.png", "11111111");
        cartas.add(c);
        c = new CartaSimple("Verde", 4, "G4", "/Interfaz/Imagenes/Cartas/G4.png", "11111111");
        cartas.add(c);
        c = new CartaSimple("Verde", 5, "G5", "/Interfaz/Imagenes/Cartas/G5.png", "11111111");
        cartas.add(c);
        c = new CartaSimple("Verde", 6, "G6", "/Interfaz/Imagenes/Cartas/G6.png", "11111111");
        cartas.add(c);
        c = new CartaSimple("Verde", 7, "G7", "/Interfaz/Imagenes/Cartas/G7.png", "11111111");
        cartas.add(c);
        c = new CartaSimple("Verde", 8, "G8", "/Interfaz/Imagenes/Cartas/G8.png", "11111111");
        cartas.add(c);
        c = new CartaSimple("Verde", 9, "G9", "/Interfaz/Imagenes/Cartas/G9.png", "11111111");
        cartas.add(c);
        c = new CartaSimple("Verde", 0, "G0", "/Interfaz/Imagenes/Cartas/G0.png", "11111111");
        cartas.add(c);
        c = new CartaSimple("Amarillo", 1, "Y1", "/Interfaz/Imagenes/Cartas/Y1.png","11111111");
        cartas.add(c);
        c = new CartaSimple("Amarillo", 2, "Y2", "/Interfaz/Imagenes/Cartas/Y2.png", "11111111");
        cartas.add(c);
        c = new CartaSimple("Amarillo", 3, "Y3", "/Interfaz/Imagenes/Cartas/Y3.png", "11111111");
        cartas.add(c);
        c = new CartaSimple("Amarillo", 4, "Y4", "/Interfaz/Imagenes/Cartas/Y4.png", "11111111");
        cartas.add(c);
        c = new CartaSimple("Amarillo", 5, "Y5", "/Interfaz/Imagenes/Cartas/Y5.png", "11111111");
        cartas.add(c);
        c = new CartaSimple("Amarillo", 6, "Y6", "/Interfaz/Imagenes/Cartas/Y6.png", "11111111");
        cartas.add(c);
        c = new CartaSimple("Amarillo", 7, "Y7", "/Interfaz/Imagenes/Cartas/Y7.png", "11111111");
        cartas.add(c);
        c = new CartaSimple("Amarillo", 8, "Y8", "/Interfaz/Imagenes/Cartas/Y8.png", "11111111");
        cartas.add(c);
        c = new CartaSimple("Amarillo", 9, "Y9", "/Interfaz/Imagenes/Cartas/Y9.png", "11111111");
        cartas.add(c);
        c = new CartaSimple("Amarillo", 0, "Y0", "/Interfaz/Imagenes/Cartas/Y0.png", "11111111");
        cartas.add(c);
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(List<Carta> cartas) {
        this.cartas = cartas;
    }
    
    
}
