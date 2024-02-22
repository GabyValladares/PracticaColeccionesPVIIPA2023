/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.controlador;

import DIU.modelo.PersonaModel;
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
    ConexionBDD conectar = new ConexionBDD();
    Connection conectado = (Connection) conectar.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;//para leer u obtener datos
    int res;//para escribir

    public VehiculoControlador() {
    }

    public VehiculoModelo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(VehiculoModelo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    public void crearVehiculo(VehiculoModelo v,int id ) {
        try {

            String sql = "call sp_CrearVehiculo('" + v.getPlaca()+ "','" + v.getColor() + "','" + v.getMarca() + "','" +v.getTipo() + "','" +v.getValor()+ "','" +v.getAñoFabricacion()+ "','" +v.getMultas()+ "','"+id+"');";
            ejecutar = (PreparedStatement) conectado.prepareCall(sql);
            //executeUpdate cuando escribo la bdd
            //int res cuando escribo
            int res = ejecutar.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Vehiculo creada con éxito");
                System.out.println("VEHÍCULO CREADO CON ÉXITO");
                ejecutar.close();
            } else {
                JOptionPane.showMessageDialog(null, "Revisar los datos ingresados");
                System.out.println("REVISAR LA INFORMACIÓN INGRESADA");
            }
        } catch (SQLException e) {
            System.out.println("COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA"+e);
        }

    }
    
    public ArrayList<Object[]> buscarVehiculos(int cedula) {
        ArrayList<Object[]> listaTotalRegistros = new ArrayList<>();
        try {
            String sql = "call sp_VehiculosporPersona('" + cedula + "');";
            ejecutar = (PreparedStatement) conectado.prepareCall(sql);
            ResultSet resultado = ejecutar.executeQuery();
            int cont = 1;
            while (resultado.next()) {
                Object[] fila = new Object[9];
                for (int i = 0; i < 9; i++) {
                    fila[i] = resultado.getObject(i + 1);
                }
                fila[0] = cont;
                listaTotalRegistros.add(fila);
                cont++;
            }
            ejecutar.close();
            return listaTotalRegistros;

        } catch (SQLException e) {
            System.out.println("COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA");
        }
        return null;
    }
    
}
