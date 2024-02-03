/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU;

/**
 *
 * @author Usuario
 */
public class Cliente {
    private int numeroAtencion;
    private String tipoAtencion;

    public Cliente() {
    }

    public Cliente( int numeroAtencion, String tipoAtencion) {
        this.numeroAtencion = numeroAtencion;
        this.tipoAtencion = tipoAtencion;
    }

    
   
    public int getNumeroAtencion() {
        return numeroAtencion;
    }

    public void setNumeroAtencion(int numeroAtencion) {
        this.numeroAtencion = numeroAtencion;
    }

    public String getTipoAtencion() {
        return tipoAtencion;
    }

    public void setTipoAtencion(String tipoAtencion) {
        this.tipoAtencion = tipoAtencion;
    }
    
    
}
