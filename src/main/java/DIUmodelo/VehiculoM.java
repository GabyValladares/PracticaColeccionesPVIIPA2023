/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIUmodelo;

/**
 *
 * @author HP
 */
public class VehiculoM {
    
   private int id;
private String placa;
private String color;
private String marca ;
private String tipo ; 
private int valor ;
private int persona; 
private int anio;
public VehiculoM(){
    
}

    public VehiculoM(int id, String placa, String color, String marca, String tipo, int valor, int persona, int anio) {
        this.id = id;
        this.placa = placa;
        this.color = color;
        this.marca = marca;
        this.tipo = tipo;
        this.valor = valor;
        this.persona = persona;
        this.anio = anio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getPersona() {
        return persona;
    }

    public void setPersona(int persona) {
        this.persona = persona;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    
    
    
    
}
