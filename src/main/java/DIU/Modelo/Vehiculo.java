/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Modelo;

/**
 *
 * @author jefe
 */
public class Vehiculo {


  private  String  numeroPlaca, marca, multa, tipo, valor,color,aniofabricacion;

  

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAniofabricacion() {
        return aniofabricacion;
    }

    public void setAniofabricacion(String aniofabricacion) {
        this.aniofabricacion = aniofabricacion;
    }

    public Vehiculo(String numeroPlaca, String marca, String multa, String tipo, String valor, String color, String aniofabricacion) {
       
        this.numeroPlaca = numeroPlaca;
        this.marca = marca;
        this.multa = multa;
        this.tipo = tipo;
        this.valor = valor;
        this.color = color;
        this.aniofabricacion = aniofabricacion;
    }

  
    
}
