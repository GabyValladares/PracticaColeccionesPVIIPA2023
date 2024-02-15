/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.controlador;

import DIUmodelo.VehiculoM;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class VehiculoController {
    
    
     private VehiculoM Vehiculo;
   ConexionBDD conectar =new ConexionBDD() ;
   Connection conectado=(Connection)conectar.conectar();
   PreparedStatement ejecutar;
   ResultSet resultado;
   int res;

    public VehiculoM getVehiculo() {
        return Vehiculo;
    }

    public void setVehiculo(VehiculoM Vehiculo) {
        this.Vehiculo = Vehiculo;
    }

  
   
     public void CrearVehiculo (VehiculoM v) {
    try {
        String sql = "CALL InsertarVehiculo(?,?,?,?,?,?,?)";
        
        try (PreparedStatement ejecutar = conectado.prepareCall(sql)) {
            ejecutar.setString(1,v.getPlaca() );
            ejecutar.setString(2,v.getColor());
            ejecutar.setString(3,v.getMarca());
            ejecutar.setString(4,v.getTipo());
            ejecutar.setInt(5,v.getValor());
            ejecutar.setInt(6,v.getPersona());
            ejecutar.setInt(7,v.getAnio());
            
            
            
            
            res = ejecutar.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "EL VEHICULO A SIDO CREADO CON EXITO");
            ejecutar.close();
            
            } else {
                JOptionPane.showMessageDialog(null, "REVISAR LA INFORMACION INGRESADA");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "COMUNICARSE CON EL ADMINISTRADOR"+e);
            
            System.out.println("hiewfhue"+e);
        }
    } catch (HeadlessException ex) {
    }
}
    
    
    
    
    public ArrayList<Object[]>  ObtenerVehiculos() {
    ArrayList<Object[]> listaUsuario= new ArrayList<>();

    try {
        String sql = "CALL ObtenerTodosVehiculos()"; 
        
        ejecutar=(PreparedStatement)conectado.prepareCall(sql);
         ResultSet res = ejecutar.executeQuery();

       
            ResultSetMetaData metaData = res.getMetaData();
            int cont =1;

           while (res.next()) {
                Object[] fila = new Object[7]; 
                for (int i = 1; i <7; i++) {
                    fila[i] = res.getObject(i+1);
                                
                }
                fila[0]=cont;
                
                listaUsuario.add(fila);
                cont++;
            
        }
            ejecutar.close();
            return  listaUsuario;
            
    } catch (SQLException e) {
        
       JOptionPane.showMessageDialog(null,"COMUNICARSE CON EL ADMINISTRADOR: " + e.getMessage());
       
    }
    
return null;
    }
    
}
