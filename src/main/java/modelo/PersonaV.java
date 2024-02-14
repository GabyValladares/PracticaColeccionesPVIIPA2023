/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Leo
 */
public class PersonaV {
    private String nombre;
    private int cedula;
    private  ArrayList<VehiculoV> listaVehiculos;

    public PersonaV() {
    }

    public PersonaV(String nombre) {
        this.nombre = nombre;
        
    }
    public PersonaV(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public PersonaV(String nombre, int cedula, ArrayList<VehiculoV> listaVehiculos) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.listaVehiculos = listaVehiculos;
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

    public ArrayList<VehiculoV> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(ArrayList<VehiculoV> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }
    
    
}
