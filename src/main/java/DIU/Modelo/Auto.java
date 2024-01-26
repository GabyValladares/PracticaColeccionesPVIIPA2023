/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Modelo;

/**
 *
 * @author usuario
 */
public class Auto {
    private String  placa,color,anioFa,marca,tipo,valor,multas;

    public Auto() {
    }

    public Auto(String placa, String anioFa, String marca, String tipo, String valor, String multas,String color) {
        this.placa = placa;
        this.anioFa = anioFa;
        this.marca = marca;
        this.tipo = tipo;
        this.valor = valor;
        this.multas = multas;
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAnioFa() {
        return anioFa;
    }

    public void setAnioFa(String anioFa) {
        this.anioFa = anioFa;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
