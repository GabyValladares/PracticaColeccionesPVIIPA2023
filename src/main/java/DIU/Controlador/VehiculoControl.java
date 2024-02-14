/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Controlador;

/**
 *
 * @author guami
 */
import DIU.Modelo.VehiculoModelo;
import DIU.controlador.ConexionBDD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class VehiculoControl {
    private VehiculoModelo vehiculo;
    ConexionBDD conectar=new ConexionBDD();
    Connection conectado=conectar.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;

    public VehiculoControl() {
    }

    public VehiculoModelo getVehiculo(){
        return vehiculo;
    }
    public VehiculoControl(VehiculoModelo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    
    public void crearVehiculo(VehiculoModelo p){
        try {
            String SQL = "call sp_CrearVehiculo('"
        + p.getPlaca() + "', '"
        + p.getColor() + "', '"
        + p.getMarca() + "', '"
        + p.getTipo() + "', "
        + p.getValor() + ", '"
        + p.getIdPersona() + "')";
        ejecutar=(PreparedStatement)conectado.prepareCall(SQL);
        int res=ejecutar.executeUpdate();
        if(res>0){
            JOptionPane.showMessageDialog(null, "VEHICULO CREADO CON EXITO");
           
        }else{
            JOptionPane.showMessageDialog(null, "REVISAR LA INFORMACION INGRESADA");
            
        }
        ejecutar.close();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA");
            
        }
    }
    
}
