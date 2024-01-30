/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.modelo;

import java.util.ArrayList;

/**
 *
 * @author 59399
 */
public class PersonaFicha {
    private String nombre;
    private int cedula;
    private ArrayList <VehiculoFicha> listaVehiculos;

    public PersonaFicha() {
    }

    public PersonaFicha(String nombre, int cedula, ArrayList<VehiculoFicha> listaVehiculos) {
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

    public ArrayList<VehiculoFicha> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(ArrayList<VehiculoFicha> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }
    
    
    
    
    
    
    
}
