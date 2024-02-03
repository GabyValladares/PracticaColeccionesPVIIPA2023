/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Modelo;

import java.util.ArrayList;

/**
 *
 * @author guami
 */
public class PersonaLD {
    private String nombre;
    private int cedula;
    private  ArrayList<VehiculoLD> listaVehiculos;

    public PersonaLD() {
    }

    public PersonaLD(String nombre) {
        this.nombre = nombre;
        
    }
    public PersonaLD(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public PersonaLD(String nombre, int cedula, ArrayList<VehiculoLD> listaVehiculos) {
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

    public ArrayList<VehiculoLD> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(ArrayList<VehiculoLD> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }
}
