/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU;

/**
 *
 * @author Usuario
 */
public class Nodo {
    private String Dato;
    private String Arriba;
    private String Abajo;

    public Nodo() {
    }

    public Nodo(String Dato, String Arriba, String Abajo) {
        this.Dato = Dato;
        this.Arriba = Arriba;
        this.Abajo = Abajo;
    }

    public String getDato() {
        return Dato;
    }

    public void setDato(String Dato) {
        this.Dato = Dato;
    }

    public String getArriba() {
        return Arriba;
    }

    public void setArriba(String Arriba) {
        this.Arriba = Arriba;
    }

    public String getAbajo() {
        return Abajo;
    }

    public void setAbajo(String Abajo) {
        this.Abajo = Abajo;
    }
    
    
}
