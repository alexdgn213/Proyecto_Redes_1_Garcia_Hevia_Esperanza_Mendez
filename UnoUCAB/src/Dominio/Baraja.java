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
 * Descripcion: Clase que contiene un grupo de cartas(Mazo,mesa,mano de cada jugador)
 */
public class Baraja {
    List<Carta> cartas;

    public Baraja() {
        cartas=new ArrayList<Carta>();
    }
    
    // Genera el mazo completo de cartas
    public void llenarMazo(){
        Carta c;
        // Cargo todas las cartas Azules
        c = new CartaSimple("00", 0, "B0", "/Interfaz/Imagenes/Cartas/B0.png", "000000");
        cartas.add(c);
        c = new CartaSimple("00", 1, "B1A", "/Interfaz/Imagenes/Cartas/B1.png", "000001");
        cartas.add(c);
        c = new CartaSimple("00", 2, "B2A", "/Interfaz/Imagenes/Cartas/B2.png", "000010");
        cartas.add(c);
        c = new CartaSimple("00", 3, "B3A", "/Interfaz/Imagenes/Cartas/B3.png", "000011");
        cartas.add(c);
        c = new CartaSimple("00", 4, "B4A", "/Interfaz/Imagenes/Cartas/B4.png", "000100");
        cartas.add(c);
        c = new CartaSimple("00", 5, "B5A", "/Interfaz/Imagenes/Cartas/B5.png", "000101");
        cartas.add(c);
        c = new CartaSimple("00", 6, "B6A", "/Interfaz/Imagenes/Cartas/B6.png", "000110");
        cartas.add(c);
        c = new CartaSimple("00", 7, "B7A", "/Interfaz/Imagenes/Cartas/B7.png", "000111");
        cartas.add(c);
        c = new CartaSimple("00", 8, "B8A", "/Interfaz/Imagenes/Cartas/B8.png", "001000");
        cartas.add(c);
        c = new CartaSimple("00", 9, "B9A", "/Interfaz/Imagenes/Cartas/B9.png", "001001");
        cartas.add(c); 
        c = new CartaBloqueo("00", "BBA", "/Interfaz/Imagenes/Cartas/BB.png", "001010");
        cartas.add(c);
        c = new CartaReversa("00", "BRA", "/Interfaz/Imagenes/Cartas/BR.png", "001011");
        cartas.add(c);
        c = new CartaToma2("00", "BTA", "/Interfaz/Imagenes/Cartas/BT.png", "001100");
        cartas.add(c);
        c = new CartaSimple("00", 1, "B1B", "/Interfaz/Imagenes/Cartas/B1.png", "000001");
        cartas.add(c);
        c = new CartaSimple("00", 2, "B2B", "/Interfaz/Imagenes/Cartas/B2.png", "000010");
        cartas.add(c);
        c = new CartaSimple("00", 3, "B3B", "/Interfaz/Imagenes/Cartas/B3.png", "000011");
        cartas.add(c);
        c = new CartaSimple("00", 4, "B4B", "/Interfaz/Imagenes/Cartas/B4.png", "000100");
        cartas.add(c);
        c = new CartaSimple("00", 5, "B5B", "/Interfaz/Imagenes/Cartas/B5.png", "000101");
        cartas.add(c);
        c = new CartaSimple("00", 6, "B6B", "/Interfaz/Imagenes/Cartas/B6.png", "000110");
        cartas.add(c);
        c = new CartaSimple("00", 7, "B7B", "/Interfaz/Imagenes/Cartas/B7.png", "000111");
        cartas.add(c);
        c = new CartaSimple("00", 8, "B8B", "/Interfaz/Imagenes/Cartas/B8.png", "001000");
        cartas.add(c);
        c = new CartaSimple("00", 9, "B9B", "/Interfaz/Imagenes/Cartas/B9.png", "001001");
        cartas.add(c);
        c = new CartaBloqueo("00", "BBB", "/Interfaz/Imagenes/Cartas/BB.png", "001010");
        cartas.add(c);
        c = new CartaReversa("00", "BRB", "/Interfaz/Imagenes/Cartas/BR.png", "001011");
        cartas.add(c);
        c = new CartaToma2("00", "BTB", "/Interfaz/Imagenes/Cartas/BT.png", "001100");
        cartas.add(c);
        
        // Cargo todas las cartas Verdes
        c = new CartaSimple("01", 0, "G0", "/Interfaz/Imagenes/Cartas/G0.png", "010000");
        cartas.add(c);
        c = new CartaSimple("01", 1, "G1A", "/Interfaz/Imagenes/Cartas/G1.png", "010001");
        cartas.add(c);
        c = new CartaSimple("01", 2, "G2A", "/Interfaz/Imagenes/Cartas/G2.png", "010010");
        cartas.add(c);
        c = new CartaSimple("01", 3, "G3A", "/Interfaz/Imagenes/Cartas/G3.png", "010011");
        cartas.add(c);
        c = new CartaSimple("01", 4, "G4A", "/Interfaz/Imagenes/Cartas/G4.png", "010100");
        cartas.add(c);
        c = new CartaSimple("01", 5, "G5A", "/Interfaz/Imagenes/Cartas/G5.png", "010101");
        cartas.add(c);
        c = new CartaSimple("01", 6, "G6A", "/Interfaz/Imagenes/Cartas/G6.png", "010110");
        cartas.add(c);
        c = new CartaSimple("01", 7, "G7A", "/Interfaz/Imagenes/Cartas/G7.png", "010111");
        cartas.add(c);
        c = new CartaSimple("01", 8, "G8A", "/Interfaz/Imagenes/Cartas/G8.png", "011000");
        cartas.add(c);
        c = new CartaSimple("01", 9, "G9A", "/Interfaz/Imagenes/Cartas/G9.png", "011001");
        cartas.add(c);
        c = new CartaBloqueo("01", "GBA", "/Interfaz/Imagenes/Cartas/GB.png", "011010");
        cartas.add(c);
        c = new CartaReversa("01", "GRA", "/Interfaz/Imagenes/Cartas/GR.png", "011011");
        cartas.add(c);
        c = new CartaToma2("01", "GTA", "/Interfaz/Imagenes/Cartas/GT.png", "011100");
        cartas.add(c);
        c = new CartaSimple("01", 1, "G1B", "/Interfaz/Imagenes/Cartas/G1.png", "010001");
        cartas.add(c);
        c = new CartaSimple("01", 2, "G2B", "/Interfaz/Imagenes/Cartas/G2.png", "010010");
        cartas.add(c);
        c = new CartaSimple("01", 3, "G3B", "/Interfaz/Imagenes/Cartas/G3.png", "010011");
        cartas.add(c);
        c = new CartaSimple("01", 4, "G4B", "/Interfaz/Imagenes/Cartas/G4.png", "010100");
        cartas.add(c);
        c = new CartaSimple("01", 5, "G5B", "/Interfaz/Imagenes/Cartas/G5.png", "010101");
        cartas.add(c);
        c = new CartaSimple("01", 6, "G6B", "/Interfaz/Imagenes/Cartas/G6.png", "010110");
        cartas.add(c);
        c = new CartaSimple("01", 7, "G7B", "/Interfaz/Imagenes/Cartas/G7.png", "010111");
        cartas.add(c);
        c = new CartaSimple("01", 8, "G8B", "/Interfaz/Imagenes/Cartas/G8.png", "011000");
        cartas.add(c);
        c = new CartaSimple("01", 9, "G9B", "/Interfaz/Imagenes/Cartas/G9.png", "011001");
        cartas.add(c);
        c = new CartaBloqueo("01", "GBB", "/Interfaz/Imagenes/Cartas/GB.png", "011010");
        cartas.add(c);
        c = new CartaReversa("01", "GRB", "/Interfaz/Imagenes/Cartas/GR.png", "011011");
        cartas.add(c);
        c = new CartaToma2("01", "GTB", "/Interfaz/Imagenes/Cartas/GT.png", "011100");
        cartas.add(c);
        
        // Cargo todas las cartas Rojas
        c = new CartaSimple("10", 0, "R0", "/Interfaz/Imagenes/Cartas/R0.png", "100000");
        cartas.add(c);
        c = new CartaSimple("10", 1, "R1A", "/Interfaz/Imagenes/Cartas/R1.png", "100001");
        cartas.add(c);
        c = new CartaSimple("10", 2, "R2A", "/Interfaz/Imagenes/Cartas/R2.png", "100010");
        cartas.add(c);
        c = new CartaSimple("10", 3, "R3A", "/Interfaz/Imagenes/Cartas/R3.png", "100011");
        cartas.add(c);
        c = new CartaSimple("10", 4, "R4A", "/Interfaz/Imagenes/Cartas/R4.png", "100100");
        cartas.add(c);
        c = new CartaSimple("10", 5, "R5A", "/Interfaz/Imagenes/Cartas/R5.png", "100101");
        cartas.add(c);
        c = new CartaSimple("10", 6, "R6A", "/Interfaz/Imagenes/Cartas/R6.png", "100110");
        cartas.add(c);
        c = new CartaSimple("10", 7, "R7A", "/Interfaz/Imagenes/Cartas/R7.png", "100111");
        cartas.add(c);
        c = new CartaSimple("10", 8, "R8A", "/Interfaz/Imagenes/Cartas/R8.png", "101000");
        cartas.add(c);
        c = new CartaSimple("10", 9, "R9A", "/Interfaz/Imagenes/Cartas/R9.png", "101001");
        cartas.add(c);
        c = new CartaBloqueo("10", "RBA", "/Interfaz/Imagenes/Cartas/RB.png", "101010");
        cartas.add(c);
        c = new CartaReversa("10", "RRA", "/Interfaz/Imagenes/Cartas/RR.png", "101011");
        cartas.add(c);
        c = new CartaToma2("10", "RTA", "/Interfaz/Imagenes/Cartas/RT.png", "101100");
        cartas.add(c);
        c = new CartaSimple("10", 1, "R1B", "/Interfaz/Imagenes/Cartas/R1.png", "100001");
        cartas.add(c);
        c = new CartaSimple("10", 2, "R2B", "/Interfaz/Imagenes/Cartas/R2.png", "100010");
        cartas.add(c);
        c = new CartaSimple("10", 3, "R3B", "/Interfaz/Imagenes/Cartas/R3.png", "100011");
        cartas.add(c);
        c = new CartaSimple("10", 4, "R4B", "/Interfaz/Imagenes/Cartas/R4.png", "100100");
        cartas.add(c);
        c = new CartaSimple("10", 5, "R5B", "/Interfaz/Imagenes/Cartas/R5.png", "100101");
        cartas.add(c);
        c = new CartaSimple("10", 6, "R6B", "/Interfaz/Imagenes/Cartas/R6.png", "100110");
        cartas.add(c);
        c = new CartaSimple("10", 7, "R7B", "/Interfaz/Imagenes/Cartas/R7.png", "100111");
        cartas.add(c);
        c = new CartaSimple("10", 8, "R8B", "/Interfaz/Imagenes/Cartas/R8.png", "101000");
        cartas.add(c);
        c = new CartaSimple("10", 9, "R9B", "/Interfaz/Imagenes/Cartas/R9.png", "101001");
        cartas.add(c);
        c = new CartaBloqueo("10", "RBB", "/Interfaz/Imagenes/Cartas/RB.png", "101010");
        cartas.add(c);
        c = new CartaReversa("10", "RRB", "/Interfaz/Imagenes/Cartas/RR.png", "101011");
        cartas.add(c);
        c = new CartaToma2("10", "RTB", "/Interfaz/Imagenes/Cartas/RT.png", "101100");
        cartas.add(c);
        
        // Cargo todas las cartas Amarillas
        c = new CartaSimple("11", 0, "Y0", "/Interfaz/Imagenes/Cartas/Y0.png", "110000");
        cartas.add(c);
        c = new CartaSimple("11", 1, "Y1A", "/Interfaz/Imagenes/Cartas/Y1.png", "110001");
        cartas.add(c);
        c = new CartaSimple("11", 2, "Y2A", "/Interfaz/Imagenes/Cartas/Y2.png", "110010");
        cartas.add(c);
        c = new CartaSimple("11", 3, "Y3A", "/Interfaz/Imagenes/Cartas/Y3.png", "110011");
        cartas.add(c);
        c = new CartaSimple("11", 4, "Y4A", "/Interfaz/Imagenes/Cartas/Y4.png", "110100");
        cartas.add(c);
        c = new CartaSimple("11", 5, "Y5A", "/Interfaz/Imagenes/Cartas/Y5.png", "110101");
        cartas.add(c);
        c = new CartaSimple("11", 6, "Y6A", "/Interfaz/Imagenes/Cartas/Y6.png", "110110");
        cartas.add(c);
        c = new CartaSimple("11", 7, "Y7A", "/Interfaz/Imagenes/Cartas/Y7.png", "110111");
        cartas.add(c);
        c = new CartaSimple("11", 8, "Y8A", "/Interfaz/Imagenes/Cartas/Y8.png", "111000");
        cartas.add(c);
        c = new CartaSimple("11", 9, "Y9A", "/Interfaz/Imagenes/Cartas/Y9.png", "111001");
        cartas.add(c);
        c = new CartaBloqueo("11", "YBA", "/Interfaz/Imagenes/Cartas/YB.png", "111010");
        cartas.add(c);
        c = new CartaReversa("11", "YRA", "/Interfaz/Imagenes/Cartas/YR.png", "111011");
        cartas.add(c);
        c = new CartaToma2("11", "YTA", "/Interfaz/Imagenes/Cartas/YT.png", "111100");
        cartas.add(c);
        c = new CartaSimple("11", 1, "Y1B", "/Interfaz/Imagenes/Cartas/Y1.png", "110001");
        cartas.add(c);
        c = new CartaSimple("11", 2, "Y2B", "/Interfaz/Imagenes/Cartas/Y2.png", "110010");
        cartas.add(c);
        c = new CartaSimple("11", 3, "Y3B", "/Interfaz/Imagenes/Cartas/Y3.png", "110011");
        cartas.add(c);
        c = new CartaSimple("11", 4, "Y4B", "/Interfaz/Imagenes/Cartas/Y4.png", "110100");
        cartas.add(c);
        c = new CartaSimple("11", 5, "Y5B", "/Interfaz/Imagenes/Cartas/Y5.png", "110101");
        cartas.add(c);
        c = new CartaSimple("11", 6, "Y6B", "/Interfaz/Imagenes/Cartas/Y6.png", "110110");
        cartas.add(c);
        c = new CartaSimple("11", 7, "Y7B", "/Interfaz/Imagenes/Cartas/Y7.png", "110111");
        cartas.add(c);
        c = new CartaSimple("11", 8, "Y8B", "/Interfaz/Imagenes/Cartas/Y8.png", "111000");
        cartas.add(c);
        c = new CartaSimple("11", 9, "Y9B", "/Interfaz/Imagenes/Cartas/Y9.png", "111001");
        cartas.add(c);
        c = new CartaBloqueo("11", "YBB", "/Interfaz/Imagenes/Cartas/YB.png", "111010");
        cartas.add(c);
        c = new CartaReversa("11", "YRB", "/Interfaz/Imagenes/Cartas/YR.png", "111011");
        cartas.add(c);
        c = new CartaToma2("11", "YTB", "/Interfaz/Imagenes/Cartas/YT.png", "111100");
        cartas.add(c);
        
        // Cargo todas las cartas Cambia Color
        c = new CartaCambiaColor("Ëspecial","CCA", "/Interfaz/Imagenes/Cartas/CC.png", "1101");
        cartas.add(c);
        c = new CartaCambiaColor("Ëspecial","CCB", "/Interfaz/Imagenes/Cartas/CC.png", "1101");
        cartas.add(c);
        c = new CartaCambiaColor("Ëspecial","CCC", "/Interfaz/Imagenes/Cartas/CC.png", "1101");
        cartas.add(c);
        c = new CartaCambiaColor("Ëspecial","CCD", "/Interfaz/Imagenes/Cartas/CC.png", "1101");
        cartas.add(c);
        
        // Cargo todas las cartas +4
        c = new CartaToma4("Ëspecial","+4A", "/Interfaz/Imagenes/Cartas/+4.png", "1110");
        cartas.add(c);
        c = new CartaToma4("Ëspecial","+4B", "/Interfaz/Imagenes/Cartas/+4.png", "1110");
        cartas.add(c);
        c = new CartaToma4("Ëspecial","+4C", "/Interfaz/Imagenes/Cartas/+4.png", "1110");
        cartas.add(c);
        c = new CartaToma4("Ëspecial","+4D", "/Interfaz/Imagenes/Cartas/+4.png", "1110");
        cartas.add(c);
        
    }
    
    
    /// Quita una carta de la baraja
    public void eliminarCarta(String codigo){
        Carta borrar = null;
        for (Carta c:cartas){
            if(c.getCodigo().equals(codigo)){
                borrar = c;
            }
        }
        if (borrar!=null) cartas.remove(borrar);
    }
    
    // Ordena al azar las cartas
    public void barajear(){
        Collections.shuffle(cartas);
    }
    
    // Quita la primera carta de la baraja y la retorna    
    public Carta obtenerCarta(){
        Carta c = cartas.get(0);
        cartas.remove(0);
        return c;
    }
    
    // Quita una carta en especifico de la baraja y la retorna 
    public Carta obtenerCarta(String codigo){
        Carta nuevaCarta = null;
        for(Carta c : cartas){
            if(c.getCampoInformacion().equals(codigo)) 
                nuevaCarta=c;
        }
        cartas.remove(nuevaCarta);
        return nuevaCarta;
    }
    
    // Añade una carta a la baraja
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
