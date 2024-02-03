/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Controlador;

import DIU.controlador.ConexionBDD;
import DIU.modelo.PersonaModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Dilan Lara
 */
public class PersonaControlador {
private PersonaModel persona;
    ConexionBDD conectar=new ConexionBDD();
    Connection conectado=(Connection)conectar.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;

    public PersonaControlador() {
    }

    public PersonaModel getPersona() {
        return persona;
    }

    public void setPersona(PersonaModel persona) {
        this.persona = persona;
    }

    public void CrearPersona(PersonaModel p){
    try{ 
    String SQL="call sp_CrearPersona('"+p.getNombres()+"',"
                    + "'"+p.getApellidos()+"',"
                    + "'"+p.getCedula()+"','"+p.getUsuario()+"',"
                    + "'"+p.getClave()+"')";
    
    
    ejecutar=(PreparedStatement)conectado.prepareCall(SQL);
    int res=ejecutar.executeUpdate();
    if(res>0){
        System.out.println("Persona Creada con Exito");
    }else{
        System.out.println("Revisar por favor si no le pego >:v");
        
    }
   // ejecutar.setString(1,p.getNombres());
    //ejecutar.setString(2,p.getApellidos());
   // ejecutar.setString(3,p.getCedula());
   // ejecutar.setString(4,p.getUsuario());
   // ejecutar.setString(5,p.getClave());
   // ejecutar.execute();
   // ejecutar.close();
    
        } catch (SQLException e) {
            
        }
    
    
    
}
    
    
}
