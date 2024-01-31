package modelo;

import java.util.Date;

public class Vehiculo {
    private String placa;
    private Date anoFabricacion;
    private String marca;
    private String color;
    private String tipo;
    private String valor;
    private String multas;

    public Vehiculo() {
    }

    public Vehiculo(String placa, Date anoFabricacion, String marca, String color, String tipo, String valor, String multas) {
        this.placa = placa;
        this.anoFabricacion = anoFabricacion;
        this.marca = marca;
        this.color = color;
        this.tipo = tipo;
        this.valor = valor;
        this.multas = multas;
    }
    
   

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Date getAnoFabricacion() {
        return anoFabricacion;
    }

    public void setAnoFabricacion(Date anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
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
}
