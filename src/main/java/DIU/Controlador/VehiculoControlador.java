/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Controlador;

import DIU.modelo.VehiculoModelo;
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

    private VehiculoModelo vehiculo;
    ConexionBDD parametros = new ConexionBDD();
    Connection conectar = (Connection) parametros.conectar();
    PreparedStatement ejecutar;
    ResultSet res;

    public VehiculoModelo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(VehiculoModelo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void insertarVehiculo(VehiculoModelo v) {
        try {
            String sql = "call sp_CrearVehiculo(?, ?, ?, ?, ?, ?)";
            ejecutar = (PreparedStatement) conectar.prepareCall(sql);
            ejecutar.setString(1, v.getPlaca());
            ejecutar.setString(2, v.getColor());
            ejecutar.setString(3, v.getMarca());
            ejecutar.setString(4, v.getTipo());
            ejecutar.setInt(5, v.getValor());
            ejecutar.setInt(6, v.getIdPersona());
            int resultado = ejecutar.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Vehículo Creado con Éxito");
                System.out.println("VEHÍCULO CREADO CON ÉXITO");
                ejecutar.close();
            } else {
                JOptionPane.showMessageDialog(null, "Revise los Datos ingresados");
                System.out.println("REVISE LOS DATOS INGRESADOS");
            }
        } catch (SQLException e) {
            System.out.println("ERROR SQL");
        }
    }

    public ArrayList<Object[]> buscarVehiculo(String placa) {
        ArrayList<Object[]> listaObject = new ArrayList<>();
        try {
            String sql = "call sp_BuscarVehiculo(?)";
            ejecutar = (PreparedStatement) conectar.prepareCall(sql);
            ejecutar.setString(1, placa);
            res = ejecutar.executeQuery();
            int cont = 1;
            while (res.next()) {
                Object[] obvehiculo = new Object[7];
                for (int i = 0; i < 6; i++) {
                    obvehiculo[i] = res.getObject(i + 1);
                }
                obvehiculo[0] = cont;
                listaObject.add(obvehiculo);
                cont++;
            }
            ejecutar.close();
            return listaObject;
        } catch (SQLException e) {
            System.out.println("ERROR SQL" + e);
        }
        return null;
    }

    public ArrayList<Object[]> datosVehiculo() {
        ArrayList<Object[]> listaObject = new ArrayList<>();

        try {
            String sql = "call sp_listaVehiculos();";
            ejecutar = (PreparedStatement) conectar.prepareCall(sql);
            res = ejecutar.executeQuery();
            int cont = 1;
            while (res.next()) {
                Object[] obvehiculo = new Object[7];
                for (int i = 1; i < 6; i++) {
                    obvehiculo[i] = res.getObject(i + 1);
                }
                obvehiculo[0] = cont;
                listaObject.add(obvehiculo);
                cont++;
            }
            ejecutar.close();
            return listaObject;

        } catch (SQLException e) {
            System.out.println("ERROR SQL CARGA VEHÍCULOS");

        }

        return null;
    }

    public void actualizarVehiculo(VehiculoModelo v) {
        try {
            String sql = "call sp_ActualizarVehiculo(?, ?, ?, ?, ?, ?, ?)";
            ejecutar = (PreparedStatement) conectar.prepareCall(sql);
            ejecutar.setInt(1, v.getIdVehiculo());
            ejecutar.setString(2, v.getPlaca());
            ejecutar.setString(3, v.getColor());
            ejecutar.setString(4, v.getMarca());
            ejecutar.setString(5, v.getTipo());
            ejecutar.setInt(6, v.getValor());
            ejecutar.setInt(7, v.getIdPersona());
            int resultado = ejecutar.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Vehículo Actualizado con Éxito");
                System.out.println("VEHÍCULO ACTUALIZADO CON ÉXITO");
                ejecutar.close();
            } else {
                JOptionPane.showMessageDialog(null, "Revise los datos ingresados");
                System.out.println("REVISE LOS DATOS INGRESADOS");
            }
        } catch (SQLException e) {
            System.out.println("ERROR SQL");
        }
    }

    public void eliminarVehiculo(int idVehiculo) {
        try {
            String sql = "call sp_EliminarVehiculo(?)";
            ejecutar = (PreparedStatement) conectar.prepareCall(sql);
            ejecutar.setInt(1, idVehiculo);
            int resultado = ejecutar.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Vehículo Eliminado con éxito");
                System.out.println("VEHÍCULO ELIMINADO CON ÉXITO");
                ejecutar.close();
            } else {
                JOptionPane.showMessageDialog(null, "Revise los datos ingresados");
                System.out.println("REVISE LOS DATOS INGRESADOS");
            }
        } catch (SQLException e) {
            System.out.println("ERROR SQL" + e);
        }
    }
}
