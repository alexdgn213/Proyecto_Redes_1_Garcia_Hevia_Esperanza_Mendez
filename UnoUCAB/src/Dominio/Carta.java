/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author alexd
 */
public abstract class Carta {
    String codigo;
    String imagen;
    String campoInformacion;

    public Carta(String codigo, String imagen, String campoInformacion) {
        this.codigo = codigo;
        this.imagen = imagen;
        this.campoInformacion = campoInformacion;
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
    
    
    
}
