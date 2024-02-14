/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.modelo;

/**
 *
 * @author Dilan Lara
 */
public class VehiculoModel {
    private int idvehiculos;
    private String placa;
    private String color;
    private String marca;
    public String tipo;
    private int valor;
    private int idpersona;
    public VehiculoModel(){}

    public VehiculoModel(int idvehiculos, String placa, String color, String marca, String tipo, int valor, int idpersona) {
        this.idvehiculos = idvehiculos;
        this.placa = placa;
        this.color = color;
        this.marca = marca;
        this.tipo = tipo;
        this.valor = valor;
        this.idpersona = idpersona;
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

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }
    
}
