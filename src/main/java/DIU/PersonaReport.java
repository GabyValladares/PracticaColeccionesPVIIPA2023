/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU;

/**
 *
 * @author oli
 */
public class PersonaReport {
    String Cédula;
    String Nombre;

    public PersonaReport() {
    }

    public PersonaReport(String Cédula, String Nombre) {
        this.Cédula = Cédula;
        this.Nombre = Nombre;
    }

    public String getCédula() {
        return Cédula;
    }

    public void setCédula(String Cédula) {
        this.Cédula = Cédula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
}
