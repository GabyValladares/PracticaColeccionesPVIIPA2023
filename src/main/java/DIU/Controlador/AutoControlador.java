/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Controlador;

import DIU.Modelo.Auto;
import DIU.controlador.ConexionBDD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class AutoControlador {
    private Auto auto;
    ConexionBDD conectar=new ConexionBDD();
    Connection conectado=(Connection)conectar.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;
public void crearVehiculo(Auto v) {
    try {
        String SQL = "CALL sp_CrearVehiculo('"
                + v.getPlaca() + "', '"
                + v.getColor() + "', '"
                + v.getMarca() + "', '"
                + v.getTipo() + "', "
                + v.getValor() + ", "
                + v.getIDpersona()+ ")";
        ejecutar = (PreparedStatement) conectado.prepareCall(SQL);
        int res = ejecutar.executeUpdate();
        if (res > 0) {
            JOptionPane.showMessageDialog(null, "Vehículo creado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Error al crear el vehículo. Revise la información.");
        }
        ejecutar.close();
    } catch (Exception e) {
        System.out.println( "Contacte al administrador."+e);
    }
}

public ArrayList<Object[]> datosVehiculo() {
    ArrayList<Object[]> totalRegistros = new ArrayList<>();
    try {
        String SQL = "CALL verVehiculos()";
        ejecutar = (PreparedStatement) conectado.prepareCall(SQL);
        ResultSet res = ejecutar.executeQuery();
        int contador = 1;
        while (res.next()) {
            Object[] fila = new Object[7];
            for (int i = 0; i < 6; i++) {
                fila[i] = res.getObject(i + 1);
            }
            fila[0] = contador;
            totalRegistros.add(fila);
            contador++;
        }
        ejecutar.close();
        return totalRegistros;
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
    }
    return null;
}

public ArrayList<Object[]> buscarVehiculo(String placa) {
    ArrayList<Object[]> totalRegistros = new ArrayList<>();
    try {
        String sql = "CALL BuscarVehiculo('" + placa + "')";
        ejecutar = (PreparedStatement) conectado.prepareCall(sql);
        ResultSet resultado = ejecutar.executeQuery();
        int contador = 1;
        while (resultado.next()) {
            Object[] fila = new Object[7];
            fila[0] = contador;
            for (int i = 1; i <= 6; i++) {
                fila[i] = resultado.getObject(i);
            }
            totalRegistros.add(fila);
            contador++;
        }
        ejecutar.close();
        return totalRegistros;
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al buscar el vehículo.");
    }
    return null;
}
public void modificarVehiculo(Auto v) {
    try {
        String SQL = "CALL ModificarVehiculo('" 
                + v.getPlaca() + "', '" 
                + v.getColor() + "', '" 
                + v.getMarca() + "', '" 
                + v.getTipo() + "', " 
                + v.getValor() + ", " 
                + v.getIDpersona() + ")";
        ejecutar = (PreparedStatement) conectado.prepareCall(SQL);
        int res = ejecutar.executeUpdate();
        if (res > 0) {
            JOptionPane.showMessageDialog(null, "Vehículo modificado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Error al modificar el vehículo. Revise la información.");
        }
        ejecutar.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al modificar el vehículo. Por favor, contacte al administrador.");
    }
}

public void eliminarVehiculo(String placa) {
    try {
        String SQL = "CALL EliminarVehiculo('" + placa + "')";
        ejecutar = (PreparedStatement) conectado.prepareCall(SQL);
        int res = ejecutar.executeUpdate();
        if (res > 0) {
            JOptionPane.showMessageDialog(null, "Vehículo eliminado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Error al eliminar el vehículo. Revise la información.");
        }
        ejecutar.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al eliminar el vehículo. Por favor, contacte al administrador.");
    }
}

}
