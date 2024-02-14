/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.modelo;

/**
 *
 * @author Andy Moya
 */


public class perosnamodel {
   private int idPersona;
    private String nombres;
    private String apellidos;
    private int cedula;
    private String usuario;
    private String clave;
    //public String geUsusario;
    
     public perosnamodel() {
    }

    public perosnamodel(int idPersona, String nombres, String apellidos, int cedula, String usuario, String clave) {
        this.idPersona = idPersona;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.usuario = usuario;
        this.clave = clave;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
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

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
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
    
    

//Columns:
//idpersona int(11) AI PK 
//nombres varchar(45) 
//apellidos varchar(45) 
//cedula int(11) 
//usuario varchar(45) 
//clave
