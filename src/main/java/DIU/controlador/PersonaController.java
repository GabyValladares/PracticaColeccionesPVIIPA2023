/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.controlador;

import DIU.modelo.PersonaModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Usuario
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

    public void setPersona(PersonaModel persona) {
        this.persona = persona;
    }
    
    //TRANSACCIONABILIDAD
    
    public void crearPersona(PersonaModel p){
        try {
            
            String sql = "call sp_Crearpersona('" + p.getNombres() + "','" + p.getApellidos() + "','" + p.getCedula() + "','" + p.getUsuario() + "','" + p.getClave() + "');";
            ejecutar = (PreparedStatement) conectado.prepareCall(sql);
            int res=ejecutar.executeUpdate();
            if(res>0){
                System.out.println("PERSONA CREADA CON ÉXITO");
            }else{
                System.out.println("REVISAR LA INFORMACIÓN INGRESADA");
            }
            } catch (SQLException e) {
                System.out.println("COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA");
        }
    
    }
    


}
