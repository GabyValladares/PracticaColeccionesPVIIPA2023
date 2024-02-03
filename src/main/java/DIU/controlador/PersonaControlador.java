/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.controlador;

import DIU.modelo.Persona;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author USUARIO
 */
public class PersonaControlador {
    
    private Persona persona;
    
    ConexionBDD conectar = new ConexionBDD();
    Connection conectado = (Connection)conectar.conectar();
    
    PreparateStament ejecutar;
    //Mostrar
    ResultSet resultado;
    //escribir 
    int res;
    
    
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
                    + "'"+p.getCedula()+"','"+p.getUsuario()+"',"
                    + "'"+p.getClave()+"')";
            ejecutar = (PreparateStament)conectado.prepareCall(SQL);
            int  res = ejecutar.executeUpdate();
            
            if(res > 0){
                System.out.println("Person creada");
            }
            
        }catch(SQLException e){
            System.out.println("Error en la conexion");
        }
    }
    
    
    
}
