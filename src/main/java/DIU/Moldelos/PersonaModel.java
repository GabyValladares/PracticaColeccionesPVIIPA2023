/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Moldelos;

/**
 *
 * @author USER-HP
 */
public class PersonaModel {

    private int idPersoan;
    private String nombre;
    private String apellidos;
    private String cedula;
    private String usuario;
    private String clave;

    public PersonaModel() {
    }

    public PersonaModel(int idPersoan, String nombre, String apellidos, String cedula, String usuario, String clave) {
        this.idPersoan = idPersoan;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.usuario = usuario;
        this.clave = clave;
    }

    public int getIdPersoan() {
        return idPersoan;
    }

    public void setIdPersoan(int idPersoan) {
        this.idPersoan = idPersoan;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        return "PersonaModel{" + "idPersoan=" + idPersoan + ", nombre=" + nombre + ", apellidos=" + apellidos + ", cedula=" + cedula + ", usuario=" + usuario + ", clave=" + clave + '}';
    }
    
    
}
