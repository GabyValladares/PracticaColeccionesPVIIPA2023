/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU;

import java.util.Calendar;
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
    
    
    
    ////
    public double calcularMultaContaminacion() {
    int añoActual = Calendar.getInstance().get(Calendar.YEAR);
    int añosContaminacion = añoActual - añoFabricacion.getYear() + 1900;

    if (añosContaminacion < 0) {
        return 2010; 
    }

    // Calcular la multa por contaminación equivalente al 2% por cada año de contaminación
    double multaContaminacion = 0.02 * añosContaminacion;
    return multaContaminacion;
}
public double calcularValorMatriculacion() {
    double valorMatriculacion = 0;

    if (marca.equals("Toyota")) {
        if (tipo.equals("Jeep")) {
            valorMatriculacion = 0.08 * valor;
        } else if (tipo.equals("Camioneta")) {
            valorMatriculacion = 0.12 * valor;
        }
    } else if (marca.equals("Suzuki")) {
        if (tipo.equals("Vitara")) {
            valorMatriculacion = 0.10 * valor;
        } else if (tipo.equals("Automóvil")) {
            valorMatriculacion = 0.09 * valor;
        }
    }

    return valorMatriculacion;
}
}