/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.modelo;

/**
 *
 * @author Usuario
 */
public class VehiculoLD {
     private String placa,marca,color,tipo,multas,anio;
    private double valor;

    public VehiculoLD() {
    }

    public VehiculoLD(String placa, String marca, String color, String tipo, String multas,String anio, double valor) {
        this.placa = placa;
        this.marca = marca;
        this.color = color;
        this.tipo = tipo;
        this.multas = multas;
        this.valor = valor;
        this.anio=anio;
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

    public String getMultas() {
        return multas;
    }

    public void setMultas(String multas) {
        this.multas = multas;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }
    
    
    
    
}
