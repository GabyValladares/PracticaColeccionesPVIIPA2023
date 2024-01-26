/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author USER-HP
 */
public class Jugador {
    
    private String apellido;
    private String edad;
    private String puesto;
    private String nacionalidad;
    private String goles;

    public Jugador() {
    }

    public Jugador(String apellido, String edad, String puesto, String nacionalidad, String goles) {
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

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
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

    public String getGoles() {
        return goles;
    }

    public void setGoles(String goles) {
        this.goles = goles;
    }

    @Override
    public String toString() {
        return   "apellido " + apellido + "edad " + edad + " puesto " + puesto + " nacionalidad" + nacionalidad + " goles=" + goles;
    }

    
}
