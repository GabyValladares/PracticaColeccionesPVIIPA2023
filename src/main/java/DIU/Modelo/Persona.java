/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Modelo;

/**
 *
 * @author carlo
 */
public class Persona {
    private String nombre;
    private String cedula;
    private int[] listaVehiculos;

    public Persona() {
    }

    public Persona(String nombre, String cedula, int[] listaVehiculos) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.listaVehiculos = listaVehiculos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int[] getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(int[] listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
