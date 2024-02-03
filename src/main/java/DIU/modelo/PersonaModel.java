/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.modelo;

/**
 *
 * @author Belial
 */
public class PersonaModel {
    private int idPersona;
    private String Nombres;
    private String Apellidos;
    private String Cedula;
    private String Usuario;
    private String Clave; 

    public PersonaModel(int idPersona, String Nombres, String Apellidos, String Cedula, String Usuario, String Clave) {
        this.idPersona = idPersona;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Cedula = Cedula;
        this.Usuario = Usuario;
        this.Clave = Clave;
    }
    
    
    
    public PersonaModel(){
        
    }
    
    
    

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
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

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
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
    
    
     @Override
    public String toString() {
        return "DATOS DE PERSONA";}
    
    
    
}
    
