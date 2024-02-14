/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Moldelos;

/**
 *
 * @author USER-HP
 */
public class VehiculoModel {
    
    private String placa,anioFabricacion,marca,color,tipo,valor,multas,cedula;

    public VehiculoModel() {
    }

    public VehiculoModel(String placa, String anioFabricacion, String marca, String color, String tipo, String valor, String multas, String cedula) {
        this.placa = placa;
        this.anioFabricacion = anioFabricacion;
        this.marca = marca;
        this.color = color;
        this.tipo = tipo;
        this.valor = valor;
        this.multas = multas;
        this.cedula = cedula;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(String anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "placa=" + placa + ", anioFabricacion=" + anioFabricacion + ", marca=" + marca + ", color=" + color + ", tipo=" + tipo + ", valor=" + valor + ", multas=" + multas + ", cedula=" + cedula + '}';
    }

   
    

}
