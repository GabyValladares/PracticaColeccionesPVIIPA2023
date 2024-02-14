/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Controlador;

import DIU.Modelo.VehiculoModelo;
import DIU.controlador.ConexionBDD;
import com.mysql.cj.jdbc.PreparedStatementWrapper;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author tutut
 */
public class VehiculoControlador {
     private VehiculoModelo vehiculo;
    ConexionBDD conectar = new ConexionBDD();
    Connection conectado = conectar.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;
    int res;

    public VehiculoControlador() {
    }

    public VehiculoModelo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(VehiculoModelo vehiculo) {
        this.vehiculo = vehiculo;
    }

     public void insertarVehiculo(int cedula, String placa, String color, String marca, String tipo, int valor) {
        try {
            // Llamar al procedimiento almacenado
            String procedimientoAlmacenado = "{CALL sp_InsertarVehiculo(?, ?, ?, ?, ?, ?)}";
            CallableStatement statement = conectado.prepareCall(procedimientoAlmacenado);
            
            
            statement.setInt(1, cedula);
            statement.setString(2, placa);
            statement.setString(3, color);
            statement.setString(4, marca);
            statement.setString(5, tipo);
            statement.setInt(6, valor);

            
            statement.execute();

           
            JOptionPane.showMessageDialog(null, "Vehículo guardado exitosamente.");

           
            statement.close();
        } catch (SQLException e) {
           
            JOptionPane.showMessageDialog(null, "Error al guardar el vehículo en la base de datos.");
            e.printStackTrace();
        }
    }
    
}
