/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Modelo;

/**
 *
 * @author tutut
 */
public class VehiculoModelo {


private int idvehiculos; 
private String placa,color,marca,tipo; 
private double valor;

public VehiculoModelo(){
}

    public VehiculoModelo(int idvehiculos, String placa, String color, String marca, String tipo, double valor) {
        this.idvehiculos = idvehiculos;
        this.placa = placa;
        this.color = color;
        this.marca = marca;
        this.tipo = tipo;
        this.valor = valor;
    }

    public int getIdvehiculos() {
        return idvehiculos;
    }

    public void setIdvehiculos(int idvehiculos) {
        this.idvehiculos = idvehiculos;
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
