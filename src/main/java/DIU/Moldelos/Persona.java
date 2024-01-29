/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Moldelos;

import java.util.ArrayList;

/**
 *
 * @author USER-HP
 */
public class Persona {
    
    private String nombre;
    private int cedula;
    private ArrayList <Vehiculo> listaNombres;

    public Persona() {
    }

    public Persona(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }
    

    public Persona(String nombre, int cedula, ArrayList<Vehiculo> listaNombres) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.listaNombres = listaNombres;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public ArrayList<Vehiculo> getListaNombres() {
        return listaNombres;
    }

    public void setListaNombres(ArrayList<Vehiculo> listaNombres) {
        this.listaNombres = listaNombres;
    }

    

    
    
    
}
