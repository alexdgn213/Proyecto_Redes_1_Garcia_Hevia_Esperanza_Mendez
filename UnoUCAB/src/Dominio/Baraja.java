/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.ArrayList;
import java.util.Collections;
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
        
        // Cargo todas las cartas azules
        c = new CartaSimple("Azul", 0, "B0", "/Interfaz/Imagenes/Cartas/B0.png", "000000");
        cartas.add(c);
        c = new CartaSimple("Azul", 1, "B1A", "/Interfaz/Imagenes/Cartas/B1.png", "000001");
        cartas.add(c);
        c = new CartaSimple("Azul", 2, "B2A", "/Interfaz/Imagenes/Cartas/B2.png", "000010");
        cartas.add(c);
        c = new CartaSimple("Azul", 3, "B3A", "/Interfaz/Imagenes/Cartas/B3.png", "000011");
        cartas.add(c);
        c = new CartaSimple("Azul", 4, "B4A", "/Interfaz/Imagenes/Cartas/B4.png", "000100");
        cartas.add(c);
        c = new CartaSimple("Azul", 5, "B5A", "/Interfaz/Imagenes/Cartas/B5.png", "000101");
        cartas.add(c);
        c = new CartaSimple("Azul", 6, "B6A", "/Interfaz/Imagenes/Cartas/B6.png", "000110");
        cartas.add(c);
        c = new CartaSimple("Azul", 7, "B7A", "/Interfaz/Imagenes/Cartas/B7.png", "000111");
        cartas.add(c);
        c = new CartaSimple("Azul", 8, "B8A", "/Interfaz/Imagenes/Cartas/B8.png", "001000");
        cartas.add(c);
        c = new CartaSimple("Azul", 9, "B9A", "/Interfaz/Imagenes/Cartas/B9.png", "001001");
        cartas.add(c); 
        c = new CartaBloqueo("Azul", "BBA", "/Interfaz/Imagenes/Cartas/BB.png", "001010");
        cartas.add(c);
        c = new CartaReversa("Azul", "BRA", "/Interfaz/Imagenes/Cartas/BR.png", "001011");
        cartas.add(c);
        c = new CartaToma2("Azul", "BTA", "/Interfaz/Imagenes/Cartas/BT.png", "001100");
        cartas.add(c);
        c = new CartaSimple("Azul", 1, "B1B", "/Interfaz/Imagenes/Cartas/B1.png", "000001");
        cartas.add(c);
        c = new CartaSimple("Azul", 2, "B2B", "/Interfaz/Imagenes/Cartas/B2.png", "000010");
        cartas.add(c);
        c = new CartaSimple("Azul", 3, "B3B", "/Interfaz/Imagenes/Cartas/B3.png", "000011");
        cartas.add(c);
        c = new CartaSimple("Azul", 4, "B4B", "/Interfaz/Imagenes/Cartas/B4.png", "000100");
        cartas.add(c);
        c = new CartaSimple("Azul", 5, "B5B", "/Interfaz/Imagenes/Cartas/B5.png", "000101");
        cartas.add(c);
        c = new CartaSimple("Azul", 6, "B6B", "/Interfaz/Imagenes/Cartas/B6.png", "000110");
        cartas.add(c);
        c = new CartaSimple("Azul", 7, "B7B", "/Interfaz/Imagenes/Cartas/B7.png", "000111");
        cartas.add(c);
        c = new CartaSimple("Azul", 8, "B8B", "/Interfaz/Imagenes/Cartas/B8.png", "001000");
        cartas.add(c);
        c = new CartaSimple("Azul", 9, "B9B", "/Interfaz/Imagenes/Cartas/B9.png", "001001");
        cartas.add(c);
        c = new CartaBloqueo("Azul", "BBB", "/Interfaz/Imagenes/Cartas/BB.png", "001010");
        cartas.add(c);
        c = new CartaReversa("Azul", "BRB", "/Interfaz/Imagenes/Cartas/BR.png", "001011");
        cartas.add(c);
        c = new CartaToma2("Azul", "BTB", "/Interfaz/Imagenes/Cartas/BT.png", "001100");
        cartas.add(c);
        
        // Cargo todas las cartas Verdes
        c = new CartaSimple("Verde", 0, "G0", "/Interfaz/Imagenes/Cartas/G0.png", "010000");
        cartas.add(c);
        c = new CartaSimple("Verde", 1, "G1A", "/Interfaz/Imagenes/Cartas/G1.png", "010001");
        cartas.add(c);
        c = new CartaSimple("Verde", 2, "G2A", "/Interfaz/Imagenes/Cartas/G2.png", "010010");
        cartas.add(c);
        c = new CartaSimple("Verde", 3, "G3A", "/Interfaz/Imagenes/Cartas/G3.png", "010011");
        cartas.add(c);
        c = new CartaSimple("Verde", 4, "G4A", "/Interfaz/Imagenes/Cartas/G4.png", "010100");
        cartas.add(c);
        c = new CartaSimple("Verde", 5, "G5A", "/Interfaz/Imagenes/Cartas/G5.png", "010101");
        cartas.add(c);
        c = new CartaSimple("Verde", 6, "G6A", "/Interfaz/Imagenes/Cartas/G6.png", "010110");
        cartas.add(c);
        c = new CartaSimple("Verde", 7, "G7A", "/Interfaz/Imagenes/Cartas/G7.png", "010111");
        cartas.add(c);
        c = new CartaSimple("Verde", 8, "G8A", "/Interfaz/Imagenes/Cartas/G8.png", "011000");
        cartas.add(c);
        c = new CartaSimple("Verde", 9, "G9A", "/Interfaz/Imagenes/Cartas/G9.png", "011001");
        cartas.add(c);
        c = new CartaBloqueo("Verde", "GBA", "/Interfaz/Imagenes/Cartas/GB.png", "001010");
        cartas.add(c);
        c = new CartaReversa("Verde", "GRA", "/Interfaz/Imagenes/Cartas/GR.png", "001011");
        cartas.add(c);
        c = new CartaToma2("Verde", "GTA", "/Interfaz/Imagenes/Cartas/GT.png", "001100");
        cartas.add(c);
        c = new CartaSimple("Verde", 1, "G1B", "/Interfaz/Imagenes/Cartas/G1.png", "010001");
        cartas.add(c);
        c = new CartaSimple("Verde", 2, "G2B", "/Interfaz/Imagenes/Cartas/G2.png", "010010");
        cartas.add(c);
        c = new CartaSimple("Verde", 3, "G3B", "/Interfaz/Imagenes/Cartas/G3.png", "010011");
        cartas.add(c);
        c = new CartaSimple("Verde", 4, "G4B", "/Interfaz/Imagenes/Cartas/G4.png", "010100");
        cartas.add(c);
        c = new CartaSimple("Verde", 5, "G5B", "/Interfaz/Imagenes/Cartas/G5.png", "010101");
        cartas.add(c);
        c = new CartaSimple("Verde", 6, "G6B", "/Interfaz/Imagenes/Cartas/G6.png", "010110");
        cartas.add(c);
        c = new CartaSimple("Verde", 7, "G7B", "/Interfaz/Imagenes/Cartas/G7.png", "010111");
        cartas.add(c);
        c = new CartaSimple("Verde", 8, "G8B", "/Interfaz/Imagenes/Cartas/G8.png", "011000");
        cartas.add(c);
        c = new CartaSimple("Verde", 9, "G9B", "/Interfaz/Imagenes/Cartas/G9.png", "011001");
        cartas.add(c);
        c = new CartaBloqueo("Verde", "GBB", "/Interfaz/Imagenes/Cartas/GB.png", "001010");
        cartas.add(c);
        c = new CartaReversa("Verde", "GRB", "/Interfaz/Imagenes/Cartas/GR.png", "001011");
        cartas.add(c);
        c = new CartaToma2("Verde", "GTB", "/Interfaz/Imagenes/Cartas/GT.png", "001100");
        cartas.add(c);
        
        // Cargo todas las cartas Rojas
        c = new CartaSimple("Rojo", 0, "R0", "/Interfaz/Imagenes/Cartas/R0.png", "100000");
        cartas.add(c);
        c = new CartaSimple("Rojo", 1, "R1A", "/Interfaz/Imagenes/Cartas/R1.png", "100001");
        cartas.add(c);
        c = new CartaSimple("Rojo", 2, "R2A", "/Interfaz/Imagenes/Cartas/R2.png", "100010");
        cartas.add(c);
        c = new CartaSimple("Rojo", 3, "R3A", "/Interfaz/Imagenes/Cartas/R3.png", "100011");
        cartas.add(c);
        c = new CartaSimple("Rojo", 4, "R4A", "/Interfaz/Imagenes/Cartas/R4.png", "100100");
        cartas.add(c);
        c = new CartaSimple("Rojo", 5, "R5A", "/Interfaz/Imagenes/Cartas/R5.png", "100101");
        cartas.add(c);
        c = new CartaSimple("Rojo", 6, "R6A", "/Interfaz/Imagenes/Cartas/R6.png", "100110");
        cartas.add(c);
        c = new CartaSimple("Rojo", 7, "R7A", "/Interfaz/Imagenes/Cartas/R7.png", "100111");
        cartas.add(c);
        c = new CartaSimple("Rojo", 8, "R8A", "/Interfaz/Imagenes/Cartas/R8.png", "101000");
        cartas.add(c);
        c = new CartaSimple("Rojo", 9, "R9A", "/Interfaz/Imagenes/Cartas/R9.png", "101001");
        cartas.add(c);
        c = new CartaBloqueo("Rojo", "RBA", "/Interfaz/Imagenes/Cartas/RB.png", "001010");
        cartas.add(c);
        c = new CartaReversa("Rojo", "RRA", "/Interfaz/Imagenes/Cartas/RR.png", "001011");
        cartas.add(c);
        c = new CartaToma2("Rojo", "RTA", "/Interfaz/Imagenes/Cartas/RT.png", "001100");
        cartas.add(c);
        c = new CartaSimple("Rojo", 1, "R1B", "/Interfaz/Imagenes/Cartas/R1.png", "100001");
        cartas.add(c);
        c = new CartaSimple("Rojo", 2, "R2B", "/Interfaz/Imagenes/Cartas/R2.png", "100010");
        cartas.add(c);
        c = new CartaSimple("Rojo", 3, "R3B", "/Interfaz/Imagenes/Cartas/R3.png", "100011");
        cartas.add(c);
        c = new CartaSimple("Rojo", 4, "R4B", "/Interfaz/Imagenes/Cartas/R4.png", "100100");
        cartas.add(c);
        c = new CartaSimple("Rojo", 5, "R5B", "/Interfaz/Imagenes/Cartas/R5.png", "100101");
        cartas.add(c);
        c = new CartaSimple("Rojo", 6, "R6B", "/Interfaz/Imagenes/Cartas/R6.png", "100110");
        cartas.add(c);
        c = new CartaSimple("Rojo", 7, "R7B", "/Interfaz/Imagenes/Cartas/R7.png", "100111");
        cartas.add(c);
        c = new CartaSimple("Rojo", 8, "R8B", "/Interfaz/Imagenes/Cartas/R8.png", "101000");
        cartas.add(c);
        c = new CartaSimple("Rojo", 9, "R9B", "/Interfaz/Imagenes/Cartas/R9.png", "101001");
        cartas.add(c);
        c = new CartaBloqueo("Rojo", "RBB", "/Interfaz/Imagenes/Cartas/RB.png", "001010");
        cartas.add(c);
        c = new CartaReversa("Rojo", "RRB", "/Interfaz/Imagenes/Cartas/RR.png", "001011");
        cartas.add(c);
        c = new CartaToma2("Rojo", "RTB", "/Interfaz/Imagenes/Cartas/RT.png", "001100");
        cartas.add(c);
        
        // Cargo todas las cartas Amarillas
        c = new CartaSimple("Amarillo", 0, "Y0", "/Interfaz/Imagenes/Cartas/Y0.png", "110000");
        cartas.add(c);
        c = new CartaSimple("Amarillo", 1, "Y1A", "/Interfaz/Imagenes/Cartas/Y1.png", "110001");
        cartas.add(c);
        c = new CartaSimple("Amarillo", 2, "Y2A", "/Interfaz/Imagenes/Cartas/Y2.png", "110010");
        cartas.add(c);
        c = new CartaSimple("Amarillo", 3, "Y3A", "/Interfaz/Imagenes/Cartas/Y3.png", "110011");
        cartas.add(c);
        c = new CartaSimple("Amarillo", 4, "Y4A", "/Interfaz/Imagenes/Cartas/Y4.png", "110100");
        cartas.add(c);
        c = new CartaSimple("Amarillo", 5, "Y5A", "/Interfaz/Imagenes/Cartas/Y5.png", "110101");
        cartas.add(c);
        c = new CartaSimple("Amarillo", 6, "Y6A", "/Interfaz/Imagenes/Cartas/Y6.png", "110110");
        cartas.add(c);
        c = new CartaSimple("Amarillo", 7, "Y7A", "/Interfaz/Imagenes/Cartas/Y7.png", "110111");
        cartas.add(c);
        c = new CartaSimple("Amarillo", 8, "Y8A", "/Interfaz/Imagenes/Cartas/Y8.png", "111000");
        cartas.add(c);
        c = new CartaSimple("Amarillo", 9, "Y9A", "/Interfaz/Imagenes/Cartas/Y9.png", "111001");
        cartas.add(c);
        c = new CartaBloqueo("Amarillo", "YBA", "/Interfaz/Imagenes/Cartas/YB.png", "001010");
        cartas.add(c);
        c = new CartaReversa("Amarillo", "YRA", "/Interfaz/Imagenes/Cartas/YR.png", "001011");
        cartas.add(c);
        c = new CartaToma2("Amarillo", "YTA", "/Interfaz/Imagenes/Cartas/YT.png", "001100");
        cartas.add(c);
        c = new CartaSimple("Amarillo", 1, "Y1B", "/Interfaz/Imagenes/Cartas/Y1.png", "110001");
        cartas.add(c);
        c = new CartaSimple("Amarillo", 2, "Y2B", "/Interfaz/Imagenes/Cartas/Y2.png", "110010");
        cartas.add(c);
        c = new CartaSimple("Amarillo", 3, "Y3B", "/Interfaz/Imagenes/Cartas/Y3.png", "110011");
        cartas.add(c);
        c = new CartaSimple("Amarillo", 4, "Y4B", "/Interfaz/Imagenes/Cartas/Y4.png", "110100");
        cartas.add(c);
        c = new CartaSimple("Amarillo", 5, "Y5B", "/Interfaz/Imagenes/Cartas/Y5.png", "110101");
        cartas.add(c);
        c = new CartaSimple("Amarillo", 6, "Y6B", "/Interfaz/Imagenes/Cartas/Y6.png", "110110");
        cartas.add(c);
        c = new CartaSimple("Amarillo", 7, "Y7B", "/Interfaz/Imagenes/Cartas/Y7.png", "110111");
        cartas.add(c);
        c = new CartaSimple("Amarillo", 8, "Y8B", "/Interfaz/Imagenes/Cartas/Y8.png", "111000");
        cartas.add(c);
        c = new CartaSimple("Amarillo", 9, "Y9B", "/Interfaz/Imagenes/Cartas/Y9.png", "111001");
        cartas.add(c);
        c = new CartaBloqueo("Amarillo", "YBB", "/Interfaz/Imagenes/Cartas/YB.png", "001010");
        cartas.add(c);
        c = new CartaReversa("Amarillo", "YRB", "/Interfaz/Imagenes/Cartas/YR.png", "001011");
        cartas.add(c);
        c = new CartaToma2("Amarillo", "YTB", "/Interfaz/Imagenes/Cartas/YT.png", "001100");
        cartas.add(c);
        
        // Cargo todas las cartas Cambia Color
        c = new CartaCambiaColor("CCA", "/Interfaz/Imagenes/Cartas/CC.png", "1101");
        cartas.add(c);
        c = new CartaCambiaColor("CCB", "/Interfaz/Imagenes/Cartas/CC.png", "1101");
        cartas.add(c);
        c = new CartaCambiaColor("CCC", "/Interfaz/Imagenes/Cartas/CC.png", "1101");
        cartas.add(c);
        c = new CartaCambiaColor("CCD", "/Interfaz/Imagenes/Cartas/CC.png", "1101");
        cartas.add(c);
        
        // Cargo todas las cartas +4
        c = new CartaToma4("+4A", "/Interfaz/Imagenes/Cartas/+4.png", "1101");
        cartas.add(c);
        c = new CartaToma4("+4B", "/Interfaz/Imagenes/Cartas/+4.png", "1101");
        cartas.add(c);
        c = new CartaToma4("+4C", "/Interfaz/Imagenes/Cartas/+4.png", "1101");
        cartas.add(c);
        c = new CartaToma4("+4D", "/Interfaz/Imagenes/Cartas/+4.png", "1101");
        cartas.add(c);
    }
    
    public void eliminarCarta(String codigo){
        Carta borrar = null;
        for (Carta c:cartas){
            if(c.getCodigo().equals(codigo)){
                borrar = c;
            }
        }
        if (borrar!=null) cartas.remove(borrar);
    }
    
    public void barajear(){
        Collections.shuffle(cartas);
    }
    
    public Carta obtenerCarta(){
        Carta c = cartas.get(0);
        cartas.remove(0);
        return c;
    }
    
    public Carta obtenerCarta(String codigo){
        Carta nuevaCarta = null;
        for(Carta c : cartas){
            if(c.getCampoInformacion().equals(codigo)) 
                nuevaCarta=c;
        }
        cartas.remove(nuevaCarta);
        return nuevaCarta;
    }
    
    public void añadirCarta(Carta c){
        cartas.add(c);
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(List<Carta> cartas) {
        this.cartas = cartas;
    }
    
    
}
