/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Controlador;

import DIU.Modelo.PersonaModel;
import DIU.controlador.ConexionBDD;
import com.mysql.cj.xdevapi.PreparableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author kevin
 */
public class PersonaControlador {

    private PersonaModel persona;
    ConexionBDD conectar = new ConexionBDD();
    Connection conectado = (Connection) conectar.conectar();
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

    //TRANSACCIONABILIDAD
    public void crearPersona(PersonaModel p) {
        try {

            String sql = "CALL sp_CrearPersona('" + p.getNombres() + "','"
                    + p.getApellidos() + "',"
                    + p.getCedula() + ",'"
                    + p.getUsuario()
                    + "','" + p.getClave() + "')";
            ejecutar = (PreparedStatement) conectado.prepareCall(sql);

            // LEER ejecutar.executeQuery()
            int res = ejecutar.executeUpdate();
            if (res > 0) {
                System.out.println("Persona Creada con Exito");

            }else{
            
                System.out.println("Revise la informacion ingresada");
            }

        } catch (Exception e) {
            
            System.out.println("COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA");
        }

    }
}
