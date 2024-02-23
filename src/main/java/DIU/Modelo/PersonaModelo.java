package DIU.modelo;

import java.util.ArrayList;
import DIU.Modelo.VehiculoModelo;
public class PersonaModelo {

   private String nombre;
    private String cedula;
    private ArrayList<VehiculoModelo> listaVehiculos;

    public PersonaModelo() {
    }

    public PersonaModelo(String nombre, String cedula, ArrayList<VehiculoModelo> listaVehiculos) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.listaVehiculos = listaVehiculos;
    }
    public void agregarAutomovil(VehiculoModelo automovil) {
        listaVehiculos.add(automovil);
    }
    public ArrayList<VehiculoModelo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(ArrayList<VehiculoModelo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}