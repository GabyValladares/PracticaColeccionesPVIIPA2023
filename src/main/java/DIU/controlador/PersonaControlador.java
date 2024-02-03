/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.controlador;

import DIU.modelo.PersonaModelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class PersonaControlador {
   private PersonaModelo persona;
    ConexionBDD conectar = new ConexionBDD();
    Connection conectado = (Connection)conectar.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;
    
    public PersonaControlador() {
        
    }
    
    public PersonaModelo getPersona() {
        return persona;
    }

    public void setPersona(PersonaModelo persona) {
        
    }
        
    //TRANSACCIONABILIDAD
    public void crearPersona(PersonaModelo p){
        try {
            String SQL = "sp_CrearPersona('"+p.getNombres()+"',"
                    + "'"+p.getApellidos()+"',"
                    + "'"+p.getCedula()+"',"
                    + "'"+p.getUsuario()+"',"
                    + "'"+p.getClave()+"')";
            ejecutar = (PreparedStatement)conectado.prepareCall(SQL);
            int res = ejecutar.executeUpdate();
            if (res > 0){
                JOptionPane.showMessageDialog(null, "PERSONA CREADA CON ÉXITO");
            } else {
                JOptionPane.showMessageDialog(null, "REVISAR LA INFORMACIÓN INGRESADA");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA");
        }
    }
    
    
}
