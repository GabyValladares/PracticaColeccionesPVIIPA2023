/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Controlador;

import DIU.Modelo.Persona;
import DIU.controlador.ConexionBDD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class PersonaControlador {
    private Persona persona;
    ConexionBDD conectar =new ConexionBDD();
    Connection conectado = (Connection)conectar.conectar();
    PreparateStament ejecutar;
    ResultSet resultado;
    int res;//leer y obtener datos
    
    public PersonaControlador(){
        
    }
    
     public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    //TRASACCIONABILIDAD
    
    
    public void crearPersona (Persona p){
        try{
                        
            String SQL="call sp_CrearPersona('"+p.getNombres()+"',"
                    + "'"+p.getApellidos()+"',"
                    + "'"+p.getCedula()+"','"
                    +p.getUsuario()+"',"
                    + "'"+p.getClave()+"')";
            ejecutar = (PreparateStament)conectado.prepareCall(SQL);
            res= ejecutar.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null, "Persona creada con exito");
            }else{
                JOptionPane.showMessageDialog(null, "Revisar los datos ingresados");
            }      
            
        }catch(SQLException e){
            
        }
    }

    private static class PreparateStament {

        public PreparateStament() {
        }

        private int executeUpdate() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
    
}
