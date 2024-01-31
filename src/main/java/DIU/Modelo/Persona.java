/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Modelo;

import java.util.ArrayList;

/**
 *
 * @author jefe
 */
public class Persona {
    
    private String nombre;
    private String cedula;
    private static ArrayList <Vehiculo> Listavehiculos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Vehiculo> getListavehiculos() {
        return Listavehiculos;
    }

    public void setListavehiculos(ArrayList<Vehiculo> Listavehiculos) {
        this.Listavehiculos = Listavehiculos;
    }

  

    public Persona(String nombre, String cedula,ArrayList<Vehiculo> Listavehiculos) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.Listavehiculos=Listavehiculos;
    }
    
}
