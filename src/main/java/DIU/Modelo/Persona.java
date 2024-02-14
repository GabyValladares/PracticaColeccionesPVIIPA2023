/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Modelo;

import java.util.ArrayList;

/**
 *
 * @author tutut
 */
public class Persona {
    private String Nombres;
    private int cedula;
    private int idPersona;
    private String apellidos;
    private String usuario;
    private String clave;
    private  ArrayList<Auto> listaVehiculos;
 
    
    
    public Persona() {
    }

    public Persona(String Nombres, int cedula, int idPersona, String apellidos, String usuario, String clave) {
        this.Nombres = Nombres;
        this.cedula = cedula;
        this.idPersona = idPersona;
        this.apellidos = apellidos;
        this.usuario = usuario;
        this.clave = clave;
    }
    
    public Persona(String Nombre, int cedula,ArrayList<Auto> listaVehiculos) {
        this.Nombres = Nombre;
        this.cedula = cedula;
        this.listaVehiculos = listaVehiculos;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
  

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombre) {
        this.Nombres = Nombre;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
     @Override
    public String toString() {
        return "DATOS DE PERSONA";
    } 
}
