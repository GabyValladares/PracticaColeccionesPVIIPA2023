/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU;

import javax.swing.JComboBox;

/**
 *
 * @author Usuario
 */
public class Jugador {

    private String apellidos;
    private int edad;
    private String puesto;
    private String posicion;
    private String nacionalidad;
    private int goles;
    private String categoria;

    public Jugador() {
    }

    public Jugador(String apellidos, int edad, String puesto, String posicion, String nacionalidad, int goles, String categoria) {
        this.apellidos = apellidos;
        this.edad = edad;
        this.puesto = puesto;
        this.posicion = posicion;
        this.nacionalidad = nacionalidad;
        this.goles = goles;
        this.categoria = categoria;
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

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    
    
    public static void Puesto (JComboBox cbxPuesto) {
         // agregamos los items
        cbxPuesto.addItem("Portero");
        cbxPuesto.addItem("Defensa");
        cbxPuesto.addItem("Centrocampista");
        cbxPuesto.addItem("Delantero");
    }
    
    public static void Posicion (JComboBox cbxPuesto,JComboBox cbxPosicion){
        cbxPosicion.removeAllItems();
        switch (cbxPuesto.getSelectedItem().toString()) {
            case "Portero":
                cbxPosicion.addItem("Arquero");
                break;
            case "Defensa":
                cbxPosicion.addItem("Defensa central");
                cbxPosicion.addItem("Lateral");
                cbxPosicion.addItem("Libre");
                cbxPosicion.addItem("Carrilero");
                break;
                
            case "Centrocampista":
                cbxPosicion.addItem("Pivote");
                cbxPosicion.addItem("Media punta");
                cbxPosicion.addItem("Volante");
                cbxPosicion.addItem("Interior");
                break;
            case "Delantero":
                cbxPosicion.addItem("Segundo delantero");
                cbxPosicion.addItem("Delantero centro");
                cbxPosicion.addItem("Extremo");
                break;
            default:
        }
    }
     
}
