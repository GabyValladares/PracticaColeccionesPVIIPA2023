/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrayslist;

/**
 *
 * @author usuario
 */
public class Jugador {
     private String apellidos;
    private int edad;
    private String puesto;
    private String nacionalidad;
    private int goles;

    public Jugador() {
    }

    public Jugador(String apellidos, int edad, String puesto, String nacionalidad, int goles) {
        this.apellidos = apellidos;
        this.edad = edad;
        this.puesto = puesto;
        this.nacionalidad = nacionalidad;
        this.goles = goles;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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
