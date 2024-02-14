/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU_Controlador;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Sarita
 */
public class FichaControlador {
    
     private FichaControlador  fichaControlador;
    ConexionBDD parametros = new ConexionBDD();
    Connection conectar = (Connection) parametros.conectar();
    PreparedStatement ejecutar;
    ResultSet res;

    public Connection getConectar() {
        return conectar;
    }

    public void setConectar(Connection conectar) {
        this.conectar = conectar;
    }
     
    
    public String obtenerNombresPersona(int cedula) {
        String nombresCompletos = "";

        try {
            // Llamar al procedimiento almacenado
            String sql = "{call ObtenerNombresPersona(?)}";
            try (CallableStatement statement = conectar.prepareCall(sql)) {
                statement.setInt(1, cedula);
                try (ResultSet rs = statement.executeQuery()) {
                    if (rs.next()) {
                        nombresCompletos = rs.getString(1);
                    } else {
                        nombresCompletos = "No se encontró ningún propietario con la cédula proporcionada.";
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener nombres: " + e.getMessage());
        }

        return nombresCompletos;
    }
    
    
   public void insertarDatosVehiculo(int cedula, String placa, String color, String marca, String tipo, int valor) {
    try {
        String sql = "CALL InsertarDatosVehiculo(?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = conectar.prepareStatement(sql)) {
            statement.setInt(1, cedula);
            statement.setString(2, placa);
            statement.setString(3, color);
            statement.setString(4, marca);
            statement.setString(5, tipo);
            statement.setInt(6, valor);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                System.out.println(rs.getString(1));
            }
        }
    } catch (SQLException e) {
        System.out.println("Error al insertar datos del vehículo: " + e.getMessage());
    }
}
}
    

