/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Moldelos;

/**
 *
 * @author USER-HP
 */
public class Vehiculo {
    
    private String placa,marca,color,tipo,multas,anio;

    public Vehiculo() {
    }

    public Vehiculo(String placa, String marca, String color, String tipo, String multas, String anio) {
        this.placa = placa;
        this.marca = marca;
        this.color = color;
        this.tipo = tipo;
        this.multas = multas;
        this.anio = anio;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMultas(String multas) {
        this.multas = multas;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }
    
    
}
