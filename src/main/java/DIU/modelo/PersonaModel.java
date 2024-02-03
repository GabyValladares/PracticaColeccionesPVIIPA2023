/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.modelo;

/**
 *
 * @author Dilan Lara
 */
public class PersonaModel {
    private int idpersona;
    private String nombres;
    private String apellidos;
    private String cedula;
    private String usuario;
    private String clave;
    
    public PersonaModel(){}

    public PersonaModel(int idpersona, String nombres, String apellidos, String cedula, String usuario, String clave) {
        this.idpersona = idpersona;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.usuario = usuario;
        this.clave = clave;
    }

    public int getIdPersona() {
        return idpersona;
    }

    public void setIdPersona(int idPersona) {
        this.idpersona = idPersona;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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
        return "DATOS DE PERSONA";} 
}
