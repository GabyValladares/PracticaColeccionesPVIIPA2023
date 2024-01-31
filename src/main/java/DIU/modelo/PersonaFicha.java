/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.modelo;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class PersonaFicha {
    
    private int cedula;
    private String nombre;
    private ArrayList<Vehiculo>  listaVehiculo;

    public PersonaFicha() {
    }

    public PersonaFicha(int cedula, String nombre, ArrayList<Vehiculo> listaVehiculo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.listaVehiculo = listaVehiculo;
    }

    

    public int getCedula() {
        return cedula;
    }
    
    public PersonaFicha(String nombre) {
        this.nombre = nombre;
        
    }
    public PersonaFicha(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }
    
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Vehiculo> getListaVehiculo() {
        return listaVehiculo;
    }

    public void setListaVehiculo(ArrayList<Vehiculo> listaVehiculo) {
        this.listaVehiculo = listaVehiculo;
    }
    
    
}
