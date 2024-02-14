/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Controlador;

import DIU.Modelo.Persona;
import DIU.Modelo.VEHICULO;
import DIU.controlador.ConexionBDD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jefe
 */
public class Persona_controlador {
    
     private Persona persona;
 ConexionBDD Conexion=new ConexionBDD();
    Connection conectado=(Connection)Conexion.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;
    
    
    
    public String obtenerNombrePorCedula(String cedula) {
    try {
        String sql = "{CALL ObtenerNombrePorCedula(?)}";
        ejecutar = (PreparedStatement) conectado.prepareCall(sql);
        ejecutar.setString(1, cedula);
        resultado = ejecutar.executeQuery();

        if (resultado.next()) {
            return resultado.getString("nombre_completo");
        } else {
            return null; // No se encontró un nombre para la cédula proporcionada
        }
    } catch (SQLException e) {
        System.out.println("Error al obtener nombre por cédula: " + e.getMessage());
        return null;
    }
}
     
public void insertarVehiculo(VEHICULO v) {
        try {
            // Verificar que la placa no sea nula antes de insertar
            if (v.getPlaca() == null) {
                System.out.println("Error: La placa del vehículo no puede ser nula.");
                return;
            }

            // Call the stored procedure to insert a vehicle
            String sql = "{CALL InsertarVehiculo(?, ?, ?, ?, ?, ?, ?, ?)}";
            ejecutar = conectado.prepareCall(sql);

            // Asignar valores al procedimiento almacenado
            ejecutar.setString(1, v.getPlaca());
            ejecutar.setString(2, v.getColor());
            ejecutar.setString(3, v.getAnioFa());
            ejecutar.setString(4, v.getMarca());
            ejecutar.setString(5, v.getTipo());
            ejecutar.setString(6, v.getValor());
            ejecutar.setString(7, v.getMultas());
            ejecutar.setString(8, v.getCedula());

            // Ejecutar el procedimiento almacenado para insertar un vehículo
            int resultadoVehiculo = ejecutar.executeUpdate();

            if (resultadoVehiculo > 0) {
                System.out.println("Vehículo insertado con éxito");
            } else {
                System.out.println("Revise los Datos del Vehículo ingresados");
            }

            ejecutar.close();
        } catch (SQLException e) {
            System.out.println("Error al insertar Vehículo: " + e.getMessage());
        }
    }

public void verVehiculos() {
        try {
            // Call the stored procedure to view vehicles
            String sql = "{CALL VerVehiculos()}";
            ejecutar = conectado.prepareCall(sql);
            resultado = ejecutar.executeQuery();

            // Process the result set (you can adjust this based on your requirements)
            while (resultado.next()) {
                System.out.println("Cedula: " + resultado.getString("cedula") +
                        ", Nombre: " + resultado.getString("nombre_completo") +
                        ", Marca: " + resultado.getString("marca") +
                        ", Color: " + resultado.getString("color") +
                        ", Tipo: " + resultado.getString("tipo"));
            }

            ejecutar.close();
        } catch (SQLException e) {
            System.out.println("Error al ver vehículos: " + e.getMessage());
        }
    }

}
