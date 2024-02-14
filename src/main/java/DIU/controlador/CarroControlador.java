/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.controlador;

import DIU.Carro;
import DIU.modelo.PersonaReport;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author oli
 */
public class CarroControlador {

    private Carro vehiculo;
    conexionDB conectar = new conexionDB();
    Connection conectado = (Connection) conectar.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;

    public CarroControlador() {
    }

    public Carro getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Carro vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void insertarCarro(Carro car, PersonaReport persona) {
        String sql = "call InsertarCarro('" + car.getPlaca() + "'," + car.getAnioFab() + ",'" + car.getMarca() + "','" + car.getColor()
                + "','" + car.getTipo() + "'," + car.getValor() + "," + car.getMulta() + "," +persona.getIdpersona() + ")";
        
        try {
            
            ejecutar = (PreparedStatement) conectado.prepareCall(sql);
            int res = ejecutar.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Vehículo Registrado");
            } else {
                JOptionPane.showMessageDialog(null, "Resvise la información ingresada");
            }
            ejecutar.close();
        } catch (SQLException e) {
            System.out.println("Error en la base de datos"+e);
        }
    }
}
