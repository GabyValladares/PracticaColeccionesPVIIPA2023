/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Modelo;

import java.util.ArrayList;

/**
 *
 * @author kevin
 */
public class Vehiculo {

    private String placas;
    private String marca;
    private String color;
    private double valor;
    private String multas;
    private String tipo;
    private int anio;
    private ArrayList<Vehiculo> vehiculo;

    

    public Vehiculo() {
    }

    public Vehiculo(String placas, String marca, String color, double valor, String multas, String tipo, int anio) {
        this.placas = placas;
        this.marca = marca;
        this.color = color;
        this.valor = valor;
        this.multas = multas;
        this.tipo = tipo;
        this.anio = anio;
 
    }

    

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    
}
