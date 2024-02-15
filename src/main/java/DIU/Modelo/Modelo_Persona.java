/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Modelo;

import java.util.ArrayList;


public class Modelo_Persona {
    private String nombre;
    private String cedula;
    private ArrayList<Modelo_Automovil> listaVehiculos;

    public Modelo_Persona() {
    }

    public Modelo_Persona(String nombre, String cedula, ArrayList<Modelo_Automovil> listaVehiculos) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.listaVehiculos = listaVehiculos;
    }
    public void agregarAutomovil(Modelo_Automovil automovil) {
        listaVehiculos.add(automovil);
    }
    public ArrayList<Modelo_Automovil> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(ArrayList<Modelo_Automovil> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
