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
    
    private String placa, marca, tipo, multas, valorV, color;
    private int numAnio;
    private double valorAuto;

    public Vehiculo(String placa, String marca, String tipo, String multas, String valorV, String color, int numAnio, double valorAuto) {
        this.placa = placa;
        this.marca = marca;
        this.tipo = tipo;
        this.multas = multas;
        this.valorV = valorV;
        this.color = color;
        this.numAnio = numAnio;
        this.valorAuto = valorAuto;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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

    public String getMultas() {
        return multas;
    }

    public void setMultas(String multas) {
        this.multas = multas;
    }

    public String getValorV() {
        return valorV;
    }

    public void setValorV(String valorV) {
        this.valorV = valorV;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
    
    
    
    
    
    
}
