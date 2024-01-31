/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Modelo;

import javax.swing.JComboBox;

/**
 *
 * @author kevin
 */
public class Jugador {

    private String apellidos;
    private int edad;
    private String puesto;
    private String subPuesto;
    private String nacionalidad;
    private int goles;

    public Jugador() {
    }

    public Jugador(String apellidos, int edad, String puesto, String subPuesto, String nacionalidad, int goles) {
        this.apellidos = apellidos;
        this.edad = edad;
        this.puesto = puesto;
        this.subPuesto = subPuesto;
        this.nacionalidad = nacionalidad;
        this.goles = goles;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getSubPuesto() {
        return subPuesto;
    }

    public void setSubPuesto(String subPuesto) {
        this.subPuesto = subPuesto;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public static void posicion(JComboBox cbPosicion) {

        cbPosicion.addItem("Portero");
        cbPosicion.addItem("Defensa");
        cbPosicion.addItem("CentroCampista");
        cbPosicion.addItem("Delantero");

    }

    public static void subposicion(JComboBox cbPosicion, JComboBox cbSubposicion) {
        cbSubposicion.removeAllItems();
        switch (cbPosicion.getSelectedItem().toString()) {
            case "Portero":
                cbSubposicion.setEnabled(false);
                cbSubposicion.addItem("Ninguno");
                break;
            case "Defensa":
                cbSubposicion.setEnabled(true);
                cbSubposicion.addItem("Defensa Central");
                cbSubposicion.addItem("Lateral");
                cbSubposicion.addItem("Libre");
                cbSubposicion.addItem("Carrilero");
                break;
            case "CentroCampista":
                cbSubposicion.setEnabled(true);
                cbSubposicion.addItem("Pivote");
                cbSubposicion.addItem("Media Punta");
                cbSubposicion.addItem("Volante");
                cbSubposicion.addItem("Interior");
                break;
            case "Delantero":
                cbSubposicion.setEnabled(true);
                cbSubposicion.addItem("Segundo Delantero");
                cbSubposicion.addItem("Delantero Centro");
                cbSubposicion.addItem("Extremo");

                break;
            default:
                throw new AssertionError();
        }

    }

    
}
