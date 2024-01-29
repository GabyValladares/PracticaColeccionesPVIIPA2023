/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Moldelos;

/**
 *
 * @author USER-HP
 */
public class PersonaSeguro {
    
    private int cedula;
    private String nombres;
    private String Apellidos;
    private String estado;
    private String tipo;

    public PersonaSeguro() {
    }

    public PersonaSeguro(int cedula, String nombres, String Apellidos, String estado, String tipo) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.Apellidos = Apellidos;
        this.estado = estado;
        this.tipo = tipo;
    }
    

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "PersonaSeguro{" + "cedula=" + cedula + ", nombres=" + nombres + ", Apellidos=" + Apellidos + ", estado=" + estado + ", tipo=" + tipo + '}';
    }
    
    
    
    
    
    
}
