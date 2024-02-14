package DIU.modelo;

/**
 *
 * @author Belial
 */
public class Vehiculo {
    private String placa, marca, color, tipo, multas, añoFabricacion;
    private double valor;

    public Vehiculo() {
    }

    public Vehiculo(String placa, String marca, String color, String tipo, String multas, String añoFabricacion, double valor) {
        this.placa = placa;
        this.marca = marca;
        this.color = color;
        this.tipo = tipo;
        this.multas = multas;
        this.valor = valor;
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

    public String getMultas() {
        return multas;
    }

    public void setMultas(String multas) {
        this.multas = multas;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(String añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }
}
