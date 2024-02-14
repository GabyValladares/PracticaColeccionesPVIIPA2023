/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.modelo;

import java.util.ArrayList;

/**
 *
 * @author oli
 */
public class PersonaReport {
    String idpersona;
    String Cédula;
    String Nombre;
    private ArrayList<String> listaVehiculos;

    public PersonaReport() {
    }

    public PersonaReport(String Cédula, String Nombre,ArrayList listaVehiculo,String idpersona) {
        this.idpersona=idpersona;
        this.Cédula = Cédula;
        this.Nombre = Nombre;
        this.listaVehiculos=listaVehiculo;
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

    public String getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(String idpersona) {
        this.idpersona = idpersona;
    }
    
    
}
