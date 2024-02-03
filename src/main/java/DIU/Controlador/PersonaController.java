/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Controlador;

import DIU.Modelo.PersonaModel;
import DIU.controlador.ConexionBDD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author jefe
 */
public class PersonaController {
    
  private PersonaModel persona;
    ConexionBDD conectar=new ConexionBDD();
    Connection conectado=(Connection)conectar.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;

    public PersonaController() {
    }

    public PersonaModel getPersona() {
        return persona;
    }

  public void setPersona (PersonaModel persona){
  this.persona=persona;
    }
    
  
  public void crearPersona(PersonaModel p){
        try {
            String SQL="call sp_CrearPersona('"+p.getNombres()+"',"
                    + "'"+p.getApellidos()+"',"
                    + "'"+p.getCedula()+"','"+p.getUsuario()+"',"
                    + "'"+p.getClave()+"')";
            ejecutar=(PreparedStatement)conectado.prepareCall(SQL);
            int res=ejecutar.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null, "PERSONA CREADA CON EXITO");
            }else {
                JOptionPane.showMessageDialog( null, "REVISAR LA INFORMACION INGRESADA");
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog( null, "COMUNICARSE CON EL ADMINISTRADOR");
    }  
}
    
}


