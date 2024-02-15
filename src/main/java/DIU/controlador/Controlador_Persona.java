package DIU.controlador;

import DIU.Modelo.Modelo_Automovil;
import DIU.Modelo.Modelo_Persona;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Controlador_Persona {
    ConexionBDD conectar = new ConexionBDD();
    Connection conectado = conectar.conectar();
    CallableStatement ejecutar;
    
    public String obtenerNombrePorCedula(String cedula) {
        String nombre = null;
        try {
            ejecutar = conectado.prepareCall("{call ObtenerNombrePersonaPorCedula(?)}");
            ejecutar.setString(1, cedula);
            ResultSet resultado = ejecutar.executeQuery();
            
            if (resultado.next()) {
                nombre = resultado.getString("nombre");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ejecutar != null) {
                    ejecutar.close();
                }
                if (conectado != null) {
                    conectado.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return nombre;
    }
    public void agregarPersona(Modelo_Persona per) {
        try {
            ejecutar = conectado.prepareCall("{call sp_AgregarPersona(?, ?)}");
            ejecutar.setString(1, per.getNombre());
            ejecutar.setString(2, per.getCedula());

            ejecutar.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ejecutar != null) {
                    ejecutar.close();
                }
                if (conectado != null) {
                    conectado.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
