/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Modelo;

import java.util.ArrayList;

/**
 *
 * @author kevin
 */
public class Persona {
    
    private String nombre;
    private int cedula;
    private ArrayList<Vehiculo> vehiculo;

    public Persona() {
    }

    public Persona(String nombre, int cedula, ArrayList<Vehiculo> vehiculo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.vehiculo = vehiculo;
    }

   


    public int getCedula() {
        return cedula;
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

    public ArrayList<Vehiculo> getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(ArrayList<Vehiculo> vehiculo) {
        this.vehiculo = vehiculo;
    }

    
    
    
}
