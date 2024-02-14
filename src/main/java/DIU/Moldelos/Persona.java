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
    private ArrayList <VehiculoModel> listaVehiculos;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    

    public Persona(String nombre, int cedula, ArrayList<VehiculoModel> listaVehiculos) {
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

    public ArrayList<VehiculoModel> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(ArrayList<VehiculoModel> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    
    

    
    
    
}
