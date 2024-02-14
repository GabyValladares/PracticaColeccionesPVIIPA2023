/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DiuControlador;

import DIU.vehiculo;
import DiuModelo.Vehiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author DELL
 */
public class vehiculoControlador {
    private Vehiculo Vehiculo;
    ConexionBDD conectar = new ConexionBDD();
    Connection conectado = (Connection) conectar.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;
    int res;

    public vehiculoControlador(Vehiculo Vehiculo) {
        this.Vehiculo = Vehiculo;
    }

    public Vehiculo getVehiculo() {
        return Vehiculo;
    }

    public void setVehiculo(Vehiculo Vehiculo) {
        this.Vehiculo = Vehiculo;
    }

    
    
    public void insertarVehiculo(){
        try {
            String sql = " INSERT INTO vehiculos(placa, marca, color, anio_fabricacion, "
                    + "tipo_vehiculo, valor) VALUES (?,?,?,?,?,?)";
            ejecutar = (PreparedStatement) conectado.prepareCall(sql);
            ejecutar.setString(1, Vehiculo.getPlaca());
            ejecutar.setString(2, Vehiculo.getMarca());
            ejecutar.setString(3, Vehiculo.getColor());
            ejecutar.setInt(4, Vehiculo.getAnoFabricacion().getYear());
            ejecutar.setString(5, Vehiculo.getTipo());
            ejecutar.setString(6, Vehiculo.getValor());
            ejecutar.executeQuery();
        } catch (Exception e) {
            System.err.println("ERROR AL INGRESAR VEHICULO A LA BASE DE DATOS:"+e.getMessage());
        }
    }
    
}
