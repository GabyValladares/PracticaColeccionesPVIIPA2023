/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import view.modelo.perosnamodel;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author Andy Moya
 */
public class perosnacontrol {
    
   
    
    
   private perosnamodel persona;
   
   
   ConexionBDD conectar = new ConexionBDD();
   Connection conectado = (Connection) conectar.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;

    public perosnacontrol() {
    }

    public perosnamodel getPersona() {
        return persona;
    }

    public void setPersona(perosnamodel persona) {
        this.persona = persona;
    }
public void crearPersona(perosnamodel p){
    try {
        String SQL = "call sp_CrearPersona('"+p.getNombres()+"','"+p.getApellidos()+"','"+p.getCedula()+"','"+p.getUsuario()+"','"+p.getClave()+"')";
        ejecutar = (PreparedStatement)conectado.prepareCall(SQL);
        int res = ejecutar.executeUpdate();
        
        if(res>0){
            JOptionPane.showMessageDialog(null, "persona creada con exito");
        System.out.print("persona creada con exito" );      
        }
        else{
        System.out.print("persona creada con exito" );
        }
    } catch (Exception e) {
    }

}



}
