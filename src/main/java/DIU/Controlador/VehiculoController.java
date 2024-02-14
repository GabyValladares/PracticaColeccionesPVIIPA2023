/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Controlador;

import DIU.modelo.VehiculoModel;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class VehiculoController {
    private VehiculoModel vehiculo;
    ConexionBDD conectar=new ConexionBDD();
    Connection conectado=(Connection)conectar.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;//para leer u obtener datos
    int res;//para escribir
    public VehiculoController() {
    }

    public VehiculoModel getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(VehiculoModel vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    //CREAR VEHÍCULO
    public void crearVehiculo(VehiculoModel v){
        try {
            String sql = "call sp_CrearVehiculo(?, ?, ?, ?, ?, ?)";
            ejecutar = (PreparedStatement) conectado.prepareCall(sql);
            ejecutar.setString(1, v.getPlaca());
            ejecutar.setString(2, v.getColor());
            ejecutar.setString(3, v.getMarca());
            ejecutar.setString(4, v.getTipo());
            ejecutar.setInt(5, v.getValor());
            ejecutar.setInt(6, v.getIdPersona());
            int res=ejecutar.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null, "Vehículo creado con éxito");
                System.out.println("Vehículo creado con éxito");
                ejecutar.close();
            }else{
                JOptionPane.showMessageDialog(null, "Error al crear el vehículo");
                System.out.println("Error al crear el vehículo");
            }
        } catch (SQLException e) {
            System.out.println("Error de comunicación con la base de datos: " + e.getMessage());
        }
    }
    
    //CONSULTAR VEHÍCULOS
    public ArrayList<Object[]> consultarVehiculos(){
        ArrayList<Object[]> listaVehiculos = new ArrayList<>();
        try {
            String sql = "call sp_ListarVehiculos()";
            ejecutar = (PreparedStatement) conectado.prepareCall(sql);
            ResultSet resultado = ejecutar.executeQuery();
            int cont = 1;
            while(resultado.next()){
                Object[] fila = new Object[7];
                for (int i = 0; i < 6; i++) {
                    fila[i] = resultado.getObject(i + 1);
                }
                fila[0] = cont;
                listaVehiculos.add(fila);
                cont++;
            }
            ejecutar.close();
            return listaVehiculos;
        } catch (SQLException e) {
            System.out.println("Error de comunicación con la base de datos: " + e.getMessage());
        }
        return null;
    }
    
    //BUSCAR VEHÍCULO POR PLACA
    public ArrayList<Object[]> buscarVehiculo(String placa){
        ArrayList<Object[]> listaVehiculos = new ArrayList<>();
        try {
            String sql = "call sp_BuscarVehiculo(?)";
            ejecutar = (PreparedStatement) conectado.prepareCall(sql);
            ejecutar.setString(1, placa);
            ResultSet resultado = ejecutar.executeQuery();
            int cont = 1;
            while(resultado.next()){
                Object[] fila = new Object[7];
                for (int i = 0; i < 6; i++) {
                    fila[i] = resultado.getObject(i + 1);
                }
                fila[0] = cont;
                listaVehiculos.add(fila);
                cont++;
            }
            ejecutar.close();
            return listaVehiculos;
        } catch (SQLException e) {
            System.out.println("Error de comunicación con la base de datos: " + e.getMessage());
        }
        return null;
    }
    
    //ACTUALIZAR VEHÍCULO
    public void actualizarVehiculo(VehiculoModel v){
        try {
            String sql = "call sp_ActualizarVehiculo(?, ?, ?, ?, ?, ?, ?)";
            ejecutar = (PreparedStatement) conectado.prepareCall(sql);
            ejecutar.setInt(1, v.getIdVehiculo());
            ejecutar.setString(2, v.getPlaca());
            ejecutar.setString(3, v.getColor());
            ejecutar.setString(4, v.getMarca());
            ejecutar.setString(5, v.getTipo());
            ejecutar.setInt(6, v.getValor());
            ejecutar.setInt(7, v.getIdPersona());
            int res=ejecutar.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null, "Vehículo actualizado con éxito");
                System.out.println("Vehículo actualizado con éxito");
                ejecutar.close();
            }else{
                JOptionPane.showMessageDialog(null, "Error al actualizar el vehículo");
                System.out.println("Error al actualizar el vehículo");
            }
        } catch (SQLException e) {
            System.out.println("Error de comunicación con la base de datos: " + e.getMessage());
        }
    }
    
    //ELIMINAR VEHÍCULO
    public void eliminarVehiculo(int idVehiculo){
        try {
            String sql = "call sp_EliminarVehiculo(?)";
            ejecutar = (PreparedStatement) conectado.prepareCall(sql);
            ejecutar.setInt(1, idVehiculo);
            int res=ejecutar.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null, "Vehículo eliminado con éxito");
                System.out.println("Vehículo eliminado con éxito");
                ejecutar.close();
            }else{
                JOptionPane.showMessageDialog(null, "Error al eliminar el vehículo");
                System.out.println("Error al eliminar el vehículo");
            }
        } catch (SQLException e) {
            System.out.println("Error de comunicación con la base de datos: " + e.getMessage());
        }
    }
}
