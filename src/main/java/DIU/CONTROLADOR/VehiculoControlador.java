/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.CONTROLADOR;

import DIU.controlador.ConexionBDD;
import DIU.modelo.Persona;
import DIU.modelo.Vehiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Belial
 */
public class VehiculoControlador {
  private Vehiculo vehiculo;
    ConexionBDD parametros = new ConexionBDD();
    Connection conectar = (Connection) parametros.conectar();
    PreparedStatement ejecutar;
    ResultSet res;

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    
    
    // Método para insertar un nuevo vehículo
    public void insertarVehiculo(Vehiculo v, int cedulaPersona) {
        try {
            String sql = "CALL CrearVehiculo(?, ?, ?, ?, ?, ?)";
            PreparedStatement ejecutar = conectar.prepareStatement(sql);
            
            // Establecer los parámetros del procedimiento almacenado
            ejecutar.setString(1, v.getPlaca());
            ejecutar.setString(2, v.getColor());
            ejecutar.setString(3, v.getMarca());
            ejecutar.setString(4, v.getTipo());
            ejecutar.setDouble(5, v.getValor());
            ejecutar.setInt(6, cedulaPersona); // Cédula de la persona asociada al vehículo

            int resultado = ejecutar.executeUpdate();
            
            if (resultado > 0) {
            JOptionPane.showMessageDialog(null, "Vehículo creado con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error al crear el vehículo", "Error", JOptionPane.ERROR_MESSAGE);
        }
            
            ejecutar.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error SQL: " + e.getMessage(), "Error SQL", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public ArrayList<Object[]> obtenerVehiculosPorPersona(Persona persona) {
        ArrayList<Object[]> listaVehiculos = new ArrayList<>();
        try {
            String sql = "CALL VehiculosPersonas(?)";
            PreparedStatement ejecutar = conectar.prepareStatement(sql);
            ejecutar.setInt(1, persona.getCedula()); // Suponiendo que el método getCedula devuelve la cédula de la persona
            ResultSet result = ejecutar.executeQuery();
            while (result.next()) {
                Object[] fila = new Object[7]; // Ajusta el tamaño según la cantidad de columnas devueltas por el procedimiento almacenado
                for (int i = 0; i < 7; i++) {
                    fila[i] = result.getObject(i + 1);
                }
                listaVehiculos.add(fila);
            }
            ejecutar.close();
            return listaVehiculos;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    
    
}
    
   
