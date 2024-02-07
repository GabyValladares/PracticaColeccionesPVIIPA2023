/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica;

/**
 *
 * @author 59399
 */
public class E4_Jugador {
    private String apellidos;
    private int edad;
    private String nacionalidad;
    private int goles;
    private String puesto;
    public E4_Jugador() {
    }

    public E4_Jugador(String apellidos, int edad, String nacionalidad, int goles, String puesto) {
        this.apellidos = apellidos;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.goles = goles;
        this.puesto = puesto;
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
    
    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    

    @Override
    public String toString() {
        return "Apellido: " + apellidos + "Edad: " 
                + edad + " Puesto " + puesto + " Nacionalidad" + nacionalidad + " Goles = " + goles;
    }
    
    
}
