package DIU.controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VehiculoController {
    ConexionBDD conexionBDD = new ConexionBDD();
    Connection conexion = conexionBDD.conectar();

    public void insertarVehiculoConPropietario(String placa, String marca, String color, String tipo, boolean multas, int anioFabricacion, double valor, int idPersona) {
        try {
            String sql = "INSERT INTO vehiculo (placa, marca, color, tipo, multas, anio, valor, persona_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, placa);
            statement.setString(2, marca);
            statement.setString(3, color);
            statement.setString(4, tipo);
            statement.setBoolean(5, multas);
            statement.setInt(6, anioFabricacion);
            statement.setDouble(7, valor);
            statement.setInt(8, idPersona);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public VehiculoController() {
    }
}
