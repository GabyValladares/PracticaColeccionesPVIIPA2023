package DIU.controlador;

import DIU.Modelo.Modelo_Automovil;
import DIU.Modelo.Modelo_Persona;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class Controlador_Automovil {
    ConexionBDD conectar = new ConexionBDD();
    Connection conectado = conectar.conectar();
    CallableStatement ejecutar;
    
    public void agregarAutomovil(Modelo_Automovil moAuto, Modelo_Persona per) {
        try {
            ejecutar = conectado.prepareCall("{call sp_AgregarVehiculo(?, ?, ?, ?, ?, ?, ?, ?)}");
            ejecutar.setString(1, moAuto.getPlaca());
            ejecutar.setDate(2, new java.sql.Date(moAuto.getAnoFabricacion().getTime()));
            ejecutar.setString(3, moAuto.getMarca());
            ejecutar.setString(4, moAuto.getColor());
            ejecutar.setString(5, moAuto.getTipo());
            ejecutar.setDouble(6, moAuto.getValor());
            ejecutar.setString(7, moAuto.getMultas());
            ejecutar.setString(8, per.getCedula());

            ejecutar.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
     public DefaultTableModel obtenerVehiculosPorPersona(String cedulaPersona) {
        Vector<String> columnas = new Vector<>();
        columnas.add("Placa");
        columnas.add("Año de Fabricación");
        columnas.add("Marca");
        columnas.add("Color");
        columnas.add("Tipo");
        columnas.add("Valor");
        columnas.add("Multas");

        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

        try {
            ejecutar = conectado.prepareCall("{call sp_ObtenerVehiculosPorPersona(?)}");
            ejecutar.setString(1, cedulaPersona);

            ResultSet resultSet = ejecutar.executeQuery();

            while (resultSet.next()) {
                Vector<String> fila = new Vector<>();
                fila.add(resultSet.getString("placa"));
                fila.add(resultSet.getString("anoFabricacion"));
                fila.add(resultSet.getString("marca"));
                fila.add(resultSet.getString("color"));
                fila.add(resultSet.getString("tipo"));
                fila.add(resultSet.getString("valor"));
                fila.add(resultSet.getString("multas"));

                modelo.addRow(fila);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return modelo;
    }
}

