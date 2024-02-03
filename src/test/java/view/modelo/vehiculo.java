/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.modelo;

/**
 *
 * @author Andy Moya
 */
public class vehiculo {
    private String placa,
    anio, marca,color,tipo_ve,valor,multas;
public vehiculo() {
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

    public String getTipo_ve() {
        return tipo_ve;
    }

    public void setTipo_ve(String tipo_ve) {
        this.tipo_ve = tipo_ve;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getMultas() {
        return multas;
    }

    public void setMultas(String multas) {
        this.multas = multas;
    }

    public vehiculo(String placa, String anio, String marca, String color, String tipo_ve, String valor, String multas) {
        this.placa = placa;
        this.anio = anio;
        this.marca = marca;
        this.color = color;
        this.tipo_ve = tipo_ve;
        this.valor = valor;
        this.multas = multas;
    }
    
    
}
