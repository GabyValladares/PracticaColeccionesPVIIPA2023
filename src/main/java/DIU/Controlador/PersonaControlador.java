package DIU.controlador;

import DIU.modelo.PersonaModelo;
import com.mysql.cj.jdbc.PreparedStatementWrapper;
import java.awt.Component;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PersonaControlador {

    private PersonaModelo persona;
    ConexionBDD conectar = new ConexionBDD();
    Connection conectado = (Connection) conectar.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;
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
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "PERSONA CREADA CON ÉXITO");
            } else {
                JOptionPane.showMessageDialog(null, "REVISAR LA INFORMACIÓN INGRESADA");
            }
            ejecutar.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA");
        }

    }

    //LLENADO DE LA TABLA
    public ArrayList<Object[]> datosPersonas() {
        ArrayList<Object[]> listaTotalRegistros = new ArrayList<>();
        try {
            String SQL = "call sp_listaPersona()";
            ejecutar = (PreparedStatementWrapper) conectado.prepareCall(SQL);
            ResultSet res = ejecutar.executeQuery();
            int contador = 1;
            while (res.next()) {
                Object[] fila = new Object[6];
                for (int i = 0; i < 6; i++) {
                    fila[i] = res.getInt(i + 1);
                }
                fila[0] = contador;
                listaTotalRegistros.add(fila);
                contador++;
            }
            ejecutar.close();
            return listaTotalRegistros;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA");
        }
        return null;
    }
     public String obtenerNombrePorCedula(int cedula) {
    String nombre = null;
    CallableStatement statement = null;

    try {
        // Llamar al procedimiento almacenado
        String query = "CALL sp_ObtenerNombrePorCedula(?, ?)";
        statement = conectado.prepareCall(query);
        statement.setInt(1, cedula);
        statement.registerOutParameter(2, java.sql.Types.VARCHAR);
        statement.execute();
        nombre = statement.getString(2);
    } catch (SQLException e) {           
        e.printStackTrace();
    } finally {
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    return nombre;
}
}
