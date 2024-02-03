package DIU.controlador;

import DIU.modelo.PersonaModelo;
import com.mysql.cj.jdbc.PreparedStatementWrapper;
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class PersonaControlador {

    private PersonaModelo persona;
    ConexionBDD conectar = new ConexionBDD();
    Connection conectado = (Connection) conectar.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado; //leer y obtener datos
    int res;

    public PersonaControlador() {
    }

    public PersonaModelo getPersona() {
        return persona;
    }

    public void setPersona(PersonaModelo persona) {
        this.persona = persona;
    }

    //TRANSACCIONABILIDAD
    public void crearPersona(PersonaModelo p) {
        try {
            String SQL = "call sp_CrearPersona('" + p.getNombres() + "',"
                    + "'" + p.getApellidos() + "',"
                    + "'" + p.getCedula() + "','" + p.getUsuario() + "',"
                    + "'" + p.getClave() + "')";
            ejecutar = (PreparedStatementWrapper) conectado.prepareCall(SQL);
            int res = ejecutar.executeUpdate();
            if (res>0) {
                
                //JOptionPane.showMessageDialog(parentComponent, "PERSONA CREADA CON ÉXITO");
                System.out.println("PERSONA CREADA CON ÉXITO"); 
            }else{
                //JOptionPane.showMessageDialog(parentComponent, "REVISAR LA INOFRMACIÓN INGRESADA");
                System.out.println("REVISAR LA INOFRMACIÓN INGRESADA");
            }

        } catch (Exception e) {
            //JOptionPane.showMessageDialog(parentComponent, "COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA");
            System.out.println("COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA");
        }

    }

}

/**
 *
 * @author Criss
 */
