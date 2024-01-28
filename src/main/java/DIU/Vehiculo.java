/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU;

import java.util.Date;

/**
 *
 *  @author HP
 */
public class Vehiculo {
    private String placa,marca,color,tipo,multas;
    private double valor;
    
    private Date añoFabricacion;

    public Vehiculo() {
    }

    public Vehiculo(String placa, String marca, String color, String tipo, double valor, String multas, Date añoFabricacion) {
        this.placa = placa;
        this.marca = marca;
        this.color = color;
        this.tipo = tipo;
        this.valor = valor;
        this.multas = multas;
        this.añoFabricacion = añoFabricacion;
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

    public Date getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(Date añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }
    
    
    
    
}
