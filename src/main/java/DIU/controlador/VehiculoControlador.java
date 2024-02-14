/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.controlador;

import DIU.modelo.Vehiculo;

import DIU.modelo.PersonaModelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario
 */
public class VehiculoControlador {
    private Vehiculo vehiculo;
    ConexionBDD conectar = new ConexionBDD();
    Connection conectado = (Connection) conectar.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;

    public VehiculoControlador() {

    }

    public Vehiculo getPersona() {
        return vehiculo;
    }

    public void setPersona(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    public void insertarVehiculoDePersona(Vehiculo v, PersonaModelo p) {
    try {
        String SQL = "call sp_InsertarVehiculoDePersona('" + v.getPlaca() + "',"
                + "'" + v.getColor() + "',"
                + "'" + v.getMarca() + "',"
                + "'" + v.getTipo() + "',"
                + v.getValor() + ","
                + p.getCedula() + "')";
        ejecutar = (PreparedStatement) conectado.prepareCall(SQL);
        int resultado = ejecutar.executeUpdate();
        if (resultado > 0) {
            JOptionPane.showMessageDialog(null, "VEHÍCULO CREADO CON ÉXITO");
        } else {
            JOptionPane.showMessageDialog(null, "REVISAR LA INFORMACIÓN INGRESADA");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA");
    }
}

    
}
