/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Controlador;

import DIU.modelo.VehiculoLD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ConexionBDD {

    public static PreparedStatement prepareStatement(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static Connection conectar() {
        Connection conexion = null;
        try {
            //Manera de Conexión a la Base de Datos
            Class.forName("com.mysql.jdbc.Driver");
            //Parámetros de conexión url/usuario/clave en mysql
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/examenpvv?autoReconnect=true&useSSL=false", "root", "erick");
            System.out.println("CONECTADO");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("ERROR DE CONEXION A LA BASE DE DATOS");
        }
        return conexion;
    }

    public static void insertarVehiculo(VehiculoLD vehiculo, int idPersona) {
        try (Connection conexion = conectar()) {
            String sql = "INSERT INTO vehiculos (placa, color, marca, tipo, valor, idpersona) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, vehiculo.getPlaca());
            statement.setString(2, vehiculo.getColor());
            statement.setString(3, vehiculo.getMarca());
            statement.setString(4, vehiculo.getTipo());
            statement.setDouble(5, vehiculo.getValor());
            statement.setInt(6, idPersona);

            int filasInsertadas = statement.executeUpdate();
            if (filasInsertadas > 0) {
                JOptionPane.showMessageDialog(null, "Vehículo insertado correctamente en la base de datos");
            } else {
                JOptionPane.showMessageDialog(null, "Error al insertar el vehículo en la base de datos");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexión o al insertar el vehículo en la base de datos: " + ex.getMessage());
        }
    }
}

     
     

