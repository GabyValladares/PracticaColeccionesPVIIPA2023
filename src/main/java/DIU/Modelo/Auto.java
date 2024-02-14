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
    private String placa, color, anioFa, marca, tipo, multas;
    private int idpersona;
    private int valor;

    public Auto() {
    }

    public Auto(String placa, String color, String anioFa, String marca, String tipo, String multas, int idpersona, int valor) {
        this.placa = placa;
        this.color = color;
        this.anioFa = anioFa;
        this.marca = marca;
        this.tipo = tipo;
        this.multas = multas;
        this.idpersona = idpersona;
        this.valor = valor;
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

    public String getMultas() {
        return multas;
    }

    public void setMultas(String multas) {
        this.multas = multas;
    }

    public int getIDpersona() {
        return idpersona;
    }

    public void setIDpersona(int IDpersona) {
        this.idpersona = IDpersona;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    }


