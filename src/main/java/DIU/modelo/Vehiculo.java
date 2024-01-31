/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.modelo;

import java.util.Date;

/**
 *
 * @author Inty Simbaña 
 */
public class Vehiculo {
    private String placa;
    private String anio;
    private String marca;
    private String color;
    private String tipo;
    private double valor;
    private String multas;

    public Vehiculo() {
    }

    public Vehiculo(String numeroPlaca, String anioFabricacion, String marca, String color, String tipo, double valor, String multas) {
        this.placa = numeroPlaca;
        this.anio = anioFabricacion;
        this.marca = marca;
        this.color = color;
        this.tipo = tipo;
        this.valor = valor;
        this.multas = multas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getMultas() {
        return multas;
    }

    public void setMultas(String multas) {
        this.multas = multas;
    }

    

    
    
}
