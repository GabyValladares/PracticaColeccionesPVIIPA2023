/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.controlador;

import DIU.Moldelos.PersonaModel;
import java.awt.Component;
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
public class PersonaController {

    private PersonaModel persona;
    ConexionBDD conectar = new ConexionBDD();
    Connection conectado = (Connection) conectar.conectar();
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
    public void crearPersona(PersonaModel p) {
        try {

            String sql = "call InsertarPersona('" + p.getNombre() + "','" + p.getApellidos() + "','" + p.getCedula() + "','" + p.getUsuario() + "','" + p.getClave() + "');";
            ejecutar = (PreparedStatement) conectado.prepareCall(sql);
            int res = ejecutar.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "PERSONA GUARDADA CON ÉXITO");
            } else {

                JOptionPane.showMessageDialog(null, "REVISAR LA INFORMACIÓN INGRESADA");
            }
        } catch (SQLException e) {
            System.out.println("COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA");
        }

    }

    public ArrayList<Object[]> datosPersona() {

        ArrayList<Object[]> listaTotalRegistros = new ArrayList<>();
        try {
            String SQL = "SELECT * FROM VistaListaPersonas;";
            ejecutar = (PreparedStatement) conectado.prepareStatement(SQL);
            int res = ejecutar.executeUpdate();
            int cont = 0;
            while (resultado.next()) {
                Object[] obPersona = new Object[6];
                for (int i = 0; i < 6; i++) {
                    obPersona[i] = resultado.getObject(i + 1);
                }

                obPersona[0] = cont;
                listaTotalRegistros.add(obPersona);

                cont++;
            }
            ejecutar.close();
            return listaTotalRegistros;

        } catch (SQLException e) {
            System.out.println("" + e);
        }
        return null;

    }

    public String obtenerNombre(String cedula) throws SQLException {
        String consulta = "select  nombres from persona where  cedula = '" + cedula + "'";
        //INICIAR SESIÓN A NIVEL DE MYSQL
        String nombre = "";
        try {
            ejecutar = (PreparedStatement) conectado.prepareStatement(consulta);

            ResultSet resul = ejecutar.executeQuery();
            if (resul.next()) {
                nombre = resul.getString(1);
                Component rootPane = null;
                JOptionPane.showMessageDialog(rootPane, "ENCONTRADO");
                ejecutar.close();
            }
        } catch (SQLException e) {
            Component rootPane = null;
            JOptionPane.showMessageDialog(rootPane, "NO EXISTE");
        }
        return nombre;
    }
        public String obtenerapellido(String cedula) throws SQLException {
        String consulta = "select apellidos from persona where cedula = '" + cedula + "'";
        //INICIAR SESIÓN A NIVEL DE MYSQL
        String nombre = "";
        try {
            ejecutar = (PreparedStatement) conectado.prepareStatement(consulta);

            ResultSet resul = ejecutar.executeQuery();
            if (resul.next()) {
                nombre = resul.getString(1);
                Component rootPane = null;
                JOptionPane.showMessageDialog(rootPane, "ENCONTRADO");
                ejecutar.close();
            }
        } catch (SQLException e) {
            Component rootPane = null;
            JOptionPane.showMessageDialog(rootPane, "NO EXISTE");
        }
        return nombre;
    }
        
}
