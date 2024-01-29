/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author Sarita
 */
public class Jugador {
    
    private String apellido;
    private int    edad;
    private String puesto;
    private String nacionalidad;
    private int    goles;

    public Jugador() {
    }

    public Jugador(String apellido, int edad, String puesto, String nacionalidad, int goles) {
        this.apellido = apellido;
        this.edad = edad;
        this.puesto = puesto;
        this.nacionalidad = nacionalidad;
        this.goles = goles;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }
    
    
    
}
