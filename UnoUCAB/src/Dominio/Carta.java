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
 * Descirpcion: Clase Abstracta para mantener todos los tipos de cartas ordenados y con sus funciones al dia
 */
public abstract class Carta {
    String codigo;//Codigo unico de cada carta:
                  // Letras 1 y 2: Color y tipo en caso de cartas de color(Colores: B:Azul R:Rojo G:Verde Y:Amarillo),
                  //                                                       Tipos: 0-9 si la carta es numerica, R: reversa, B:Bloqueo, t:toma 2.
                  //               Codigo de las cartas especiales: CC: cambia color, +4: Toma 4
                  // Letra 3: para difetrenciar las copias de una misma carta(se les coloca una letra para diferenciarlas)
    String imagen;// Ruta en la que se consigue dicha carta;
    String campoInformacion; // Bits que se deben enviar en la trama de informacion:
                             //    - Si es de color se guardan 6 bits incluyendo el color;
                             //    - Si es especial solo se guardan 4 bits y los demas se agrega al jugar(el color al que se cambiara)
    String color;
    
    public Carta(String codigo, String imagen, String campoInformacion) {
        this.codigo = codigo;
        this.imagen = imagen;
        this.campoInformacion = campoInformacion;
    }

    public Carta(String codigo, String imagen, String campoInformacion, String color) {
        this.codigo = codigo;
        this.imagen = imagen;
        this.campoInformacion = campoInformacion;
        this.color = color;
    }

    
    public Carta() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getCampoInformacion() {
        return campoInformacion;
    }

    public void setCampoInformacion(String campoInformacion) {
        this.campoInformacion = campoInformacion;
    }
    
    // Metodo con todo lo que debe hacer cada carta al jugarse
    public abstract void jugar(ServicioTransmision s, String origen, String destino, String direccion);
    
    // Metodo con todo lo que debe hacer cada carta al jugarse
    public abstract void sacar(ServicioTransmision s, String origen, String destino, String direccion);
    
    // Metodo con lo que se debe hacer para mostrar el color de la carta
    // El String color es para cuando se coloca un cambia color o un +4
    public abstract void mostrarColor(JLabel rojo, JLabel azul, JLabel verde, JLabel amarillo, String color);
    
    
}
