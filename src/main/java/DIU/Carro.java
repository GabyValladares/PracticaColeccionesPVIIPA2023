/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU;

/**
 *
 * @author oli
 */
public class Carro {
    private String anioFab;
    private String color;
    private String tipo;
    private String placa;
    private String marca;
    private String multa,valor;

    public Carro() {
    }

    public Carro(String anioFab, String color, String tipo, String placa, String marca, String multa,String valor) {
        this.anioFab = anioFab;
        this.color = color;
        this.tipo = tipo;
        this.placa = placa;
        this.marca = marca;
        this.multa = multa;
        this.valor=valor;
    }

    public String getAnioFab() {
        return anioFab;
    }

    public void setAnioFab(String anioFab) {
        this.anioFab = anioFab;
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

    public String getMulta() {
        return multa;
    }

    public void setMulta(String multa) {
        this.multa = multa;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    
}
