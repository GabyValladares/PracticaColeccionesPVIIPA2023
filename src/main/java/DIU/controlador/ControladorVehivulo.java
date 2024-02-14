/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DIU.controlador;

import DIU.Moldelos.VehiculoModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author USER-HP
 */
public class ControladorVehivulo {
   private VehiculoModel vehiculo;
    ConexionBDD conectar = new ConexionBDD();
    Connection conectado = (Connection) conectar.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;

    public ControladorVehivulo() {
    }

    public ControladorVehivulo(VehiculoModel vehiculo) {
        this.vehiculo = vehiculo;
    }

    public VehiculoModel getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(VehiculoModel vehiculo) {
        this.vehiculo = vehiculo;
    }
   
    
    
    public void crearVehiculo(VehiculoModel v) {
        try {
            // Preparando la llamada al procedimiento almacenado
            String sql = "CALL agregarVehiculo(?, ?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement ejecutar = conectado.prepareStatement(sql);
            
            // Estableciendo los parámetros basados en el modelo VehiculoModel
            ejecutar.setString(1, v.getPlaca());
            ejecutar.setString(2, v.getAnioFabricacion());
            ejecutar.setString(3, v.getMarca());
            ejecutar.setString(4, v.getColor());
            ejecutar.setString(5, v.getTipo());
            ejecutar.setString(6, v.getValor());
            ejecutar.setString(7, v.getMultas());
            ejecutar.setString(8, v.getCedula()); // Asume que VehiculoModel tiene un campo para la cédula del propietario
            
            // Ejecutando la llamada al procedimiento almacenado
            int res = ejecutar.executeUpdate();
            
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "VEHÍCULO GUARDADO CON ÉXITO");
            } else {
                JOptionPane.showMessageDialog(null, "REVISAR LA INFORMACIÓN INGRESADA");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
            System.out.println("COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA");
        }
    }

   


    
}
