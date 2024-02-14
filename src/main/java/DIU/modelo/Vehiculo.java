/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.modelo;

/**
 *
 * @author USUARIO
 */
public class Vehiculo {
   
    
    private String placa, color, marca, tipo;
    private int numAnio;
    private double valorAuto;
    private int idPersona;

    public Vehiculo(String placa, String color, String marca, String tipo, int numAnio, double valorAuto, int idPersona) {
        this.placa = placa;
        this.color = color;
        this.marca = marca;
        this.tipo = tipo;
        this.numAnio = numAnio;
        this.valorAuto = valorAuto;
        this.idPersona = idPersona;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumAnio() {
        return numAnio;
    }

    public void setNumAnio(int numAnio) {
        this.numAnio = numAnio;
    }

    public double getValorAuto() {
        return valorAuto;
    }

    public void setValorAuto(double valorAuto) {
        this.valorAuto = valorAuto;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
    
    
    

}

    
    
   
