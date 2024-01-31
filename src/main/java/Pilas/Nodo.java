/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pilas;

/**
 *
 * @author USUARIO
 */
public class Nodo {
    
    private String dato;
    private Nodo Arriba;
    private Nodo Abajo;
    
    public Nodo(){
        
    }

    public Nodo(String dato, Nodo Arriba, Nodo Abajo) {
        this.dato = dato;
        this.Arriba = Arriba;
        this.Abajo = Abajo;
    }

    
    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public Nodo getArriba() {
        return Arriba;
    }

    public void setArriba(Nodo Arriba) {
        this.Arriba = Arriba;
    }

    public Nodo getAbajo() {
        return Abajo;
    }

    public void setAbajo(Nodo Abajo) {
        this.Abajo = Abajo;
    }
    
    
}
