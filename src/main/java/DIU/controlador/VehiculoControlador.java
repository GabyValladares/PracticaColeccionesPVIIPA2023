/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.controlador;

import DIU.modelo.Vehiculo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class VehiculoControlador {
    
    private Vehiculo vehiculo;
    
    ConexionBDD conectar = new ConexionBDD();
    Connection conectado = (Connection)conectar.conectar();
    
    PreparateStament ejecutar;
    //Mostrar
    ResultSet resultado;
    //escribir 
    int res;
    
    
    public VehiculoControlador(){
        
    }
    
     public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    //TRASACCIONABILIDAD
    
    
    public void crearVehiculo (Vehiculo v){
        try{
                        
            String SQL="call sp_crear_vehiculo('"+v.getPlaca()+"',"
                    + "'"+v.getColor()+"',"
                    + "'"+v.getMarca()+"','"+v.getTipo()+"',"
                    + "'"+v.getValorAuto()+"')"
                    + "'"+v.getIdPersona()+"')";
            
            ejecutar = (PreparateStament)conectado.prepareCall(SQL);
            int  res = ejecutar.executeUpdate();
            
            if(res > 0){
                System.out.println("Vehiculo creado");
            }
            
            ejecutar.close();
            
        }catch(SQLException e){
            System.out.println("Error en la conexion: para Vehiculo ");
        }
    }
    
    
    public void listadoVehiculos (Vehiculo v){
        //try{
             String SQL="call ListarVehiculosPorCedula('"+v.getPlaca()+"',"
                    + "'"+v.getColor()+"',"
                    + "'"+v.getMarca()+"','"+v.getTipo()+"',"
                    + "'"+v.getValorAuto()+"')"
                    + "'"+v.getIdPersona()+"')";
            
        //}catch(SQLException e){
            System.out.println("Error en la conexion: para Vehiculo ");
        //}
    }
    
    
}
