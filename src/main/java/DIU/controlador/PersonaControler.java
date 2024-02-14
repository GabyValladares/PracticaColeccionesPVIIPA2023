/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.controlador;

import DIU.modelo.PersonaModelo;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author pablo
 */
public class PersonaControler {
    private PersonaModelo persona;
    ConexionBDD conectar = new ConexionBDD();
    Connection conectado = (Connection) conectar.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;//para leer u obtener un dato
    int res;//para escribir

    public PersonaModelo getPersona() {
        return persona;
    }

    public void setPersona(PersonaModelo persona) {
        this.persona = persona;
    }
    
    //TRANSACCIONABILIDAD
    public void crearPersona(PersonaModelo p) {
        try {
            String SQL = "call CrearPersona('" + p.getNombre() + "',"
                    + "'" + p.getApellido()+ "',"
                    + "'" + p.getCedula() + "',"
                    + "'" + p.getUsuario() + "',"
                    + "'" + p.getClave() + "')";
            ejecutar = (PreparedStatement) conectado.prepareCall(SQL);
            int resultado = ejecutar.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "PERSONA CREADA CON ÉXITO");
            ejecutar.close();
            } else {
                JOptionPane.showMessageDialog(null, "REVISAR LA INFORMACIÓN INGRESADA");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA");
        }
    }

    public ArrayList<Object[]> datosPersona() {
        ArrayList<Object[]> listaObject = new ArrayList<>();

        try {
            String sql = "call sp_listaPersonas();";
            ejecutar = (PreparedStatement) conectado.prepareCall(sql);
            resultado = ejecutar.executeQuery();
            int cont = 1;
            while (resultado.next()) {
                Object[] obpersona = new Object[7];
                for (int i = 1; i < 7; i++) {
                    obpersona[i] = resultado.getObject(i + 1);
                }
                obpersona[0] = cont;
                listaObject.add(obpersona);
                cont++;
            }
            ejecutar.close();
            return listaObject;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null  , "COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA");
            //System.out.println("ERROR SQL CARGA PERSONAS");
        }

        return null;
    }

    /*public PersonaModelo recuperarDatosPersona(String cedula) {
        PersonaModelo persona = new PersonaModelo();
        try {
            String sql = "CALL sp_RecuperarDatosPersona(?)";
            CallableStatement statement = conectado.prepareCall(sql);
            statement.setString(1, cedula);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                // Obtener los datos de la persona
                persona.setNombre(rs.getString("nombres_res"));
                persona.setApellido(rs.getString("apellidos_res"));
                persona.setCorreo(rs.getString("correo_res"));
               
                persona.setFechaN(rs.getDate("fechaNacimiento_res"));
            } else {
                System.out.println("No se encontraron datos para la cédula proporcionada.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA");
        }
        return persona;
    }

}*/

}
