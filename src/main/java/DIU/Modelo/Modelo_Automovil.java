package DIU.Modelo;

import java.util.Date;

public class Modelo_Automovil {
    private String placa;
    private Date anoFabricacion;
    private String marca;
    private String color;
    private String tipo;
    private double valor;
    private String multas;

    public Modelo_Automovil() {
    }

    public Modelo_Automovil(String placa, Date anoFabricacion, String marca, String color, String tipo, double valor, String multas) {
        this.placa = placa;
        this.anoFabricacion = anoFabricacion;
        this.marca = marca;
        this.color = color;
        this.tipo = tipo;
        this.valor = valor;
        this.multas = multas;
    }

    public Date getAnoFabricacion() {
        return anoFabricacion;
    }

    public void setAnoFabricacion(Date anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
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

    public String getMultas() {
        return multas;
    }

    public void setMultas(String multas) {
        this.multas = multas;
    }
}
