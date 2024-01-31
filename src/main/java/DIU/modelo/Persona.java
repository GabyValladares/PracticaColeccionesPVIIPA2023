/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.modelo;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Persona {
    private String nombres;
    private int cedula;
    private ArrayList<Vehiculo> listaVehiculos;
    

    public Persona() {
    }
    public Persona(String nombres) {
        this.nombres = nombres;
    }

    public Persona(String nombres, int cedula, ArrayList<Vehiculo> listaVehiculos) {
        this.nombres = nombres;
        this.cedula = cedula;
        this.listaVehiculos = listaVehiculos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    
    
    
}
