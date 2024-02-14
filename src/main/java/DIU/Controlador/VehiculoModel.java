/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Controlador;

/**
 *
 * @author 59398
 */
public class VehiculoModel {
    package DIU.Controlador;

/**
 *
 * @author 59398
 */
public class VehiculoModel {
    private int idVehiculo;
    private String placa;
    private String color;
    private String marca;
    private String tipo;
    private int valor;
    private int idPersona;

    public VehiculoModel() {
    }

    public VehiculoModel(int idVehiculo, String placa, String color, String marca, String tipo, int valor, int idPersona) {
        this.idVehiculo = idVehiculo;
        this.placa = placa;
        this.color = color;
        this.marca = marca;
        this.tipo = tipo;
        this.valor = valor;
        this.idPersona = idPersona;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
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

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    @Override
    public String toString() {
        return "DATOS DE VEHÍCULO";
    }  
}

}
