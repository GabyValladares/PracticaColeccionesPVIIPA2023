/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.modelo;

import java.util.ArrayList;

/**
 *
 * @author Andy Moya
 */
public class Persona {
    private String nombre;  
    private String cedula;
    private ArrayList<vehiculo> listaVehiculos; // Corregir el tipo de datos de la lista

    // Constructor de la clase Persona
    public Persona(String nombre) {
        this.nombre = nombre;
        
    }
    public Persona(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.listaVehiculos = new ArrayList<>(); // Inicializar la lista de vehículos
    }
    public Persona(String nombre, String cedula, ArrayList<vehiculo> listaVehiculos) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.listaVehiculos = listaVehiculos;
    }

    // Métodos getter y setter para el atributo nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos getter y setter para el atributo cedula
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    // Métodos getter y setter para la lista de vehículos
    public ArrayList<vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(ArrayList<vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    // Método para añadir un vehículo a la lista
    public void agregarVehiculo(vehiculo vehiculo) {
        this.listaVehiculos.add(vehiculo);
    }
}
