/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Modelo;

/**
 *
 * @author usuario
 */
public class PersonaModel {
    private int idpersona;
    private String Nombres,Apellidos,Usuario,Clave;
    private int Cedula;

    public PersonaModel() {
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public PersonaModel(int idpersona, String Nombres, String Apellidos, String Usuario, String Clave, int Cedula) {
        this.idpersona = idpersona;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Usuario = Usuario;
        this.Clave = Clave;
        this.Cedula = Cedula;
    }

    
   @Override
    public String toString() {
        return "DATOS DE PERSONA";}
    
}
