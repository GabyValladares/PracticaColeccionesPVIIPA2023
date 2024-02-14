/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.controlador;

import DIU.modelo.PersonaModelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class PersonaControlador {

    private PersonaModelo persona;
    ConexionBDD conectar = new ConexionBDD();
    Connection conectado = (Connection) conectar.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;

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
                    + "'" + p.getCedula() + "',"
                    + "'" + p.getUsuario() + "',"
                    + "'" + p.getClave() + "')";
            ejecutar = (PreparedStatement) conectado.prepareCall(SQL);
            int res = ejecutar.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "PERSONA CREADA CON ÉXITO");
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
                Object[] obpersona = new Object[6];
                for (int i = 1; i < 6; i++) {
                    obpersona[i] = resultado.getObject(i + 1);
                }
                obpersona[0] = cont;
                listaObject.add(obpersona);
                cont++;
            }
            ejecutar.close();
            return listaObject;

        } catch (SQLException e) {
            System.out.println("ERROR SQL CARGA PERSONAS");
        }

        return null;
    }

    
    public void recuperarDatosPersona(PersonaModelo c) {
    try {
        String sql = "call sp_RecuperarNombrePersona(?)";
        ejecutar = (PreparedStatement) conectado.prepareCall(sql);
        ejecutar.setInt(1, Integer.parseInt(c.getCedula()));
        resultado = ejecutar.executeQuery();

        // Comprobar si hay resultados
        if (resultado.next()) {
            // Asignar los valores recuperados al objeto PersonaModelo
            c.setNombres(resultado.getString(1));
        } else {
            System.out.println("No se encontraron datos para la cédula proporcionada.");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA");
    }
}


}
