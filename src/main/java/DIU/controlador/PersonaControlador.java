package DIU.controlador;

import DIU.modelo.PersonaModelo;
import com.mysql.cj.jdbc.PreparedStatementWrapper;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PersonaControlador {

//    private PersonaModelo persona;
//    ConexionBDD conectar = new ConexionBDD();
//    Connection conectado = (Connection) conectar.conectar();
//    PreparedStatement ejecutar;
//    ResultSet resultado;
//    int res;
//
//    public PersonaControlador() {
//    }
//
//    public PersonaModelo getPersona() {
//        return persona;
//    }
//
//    public void setPersona(PersonaModelo persona) {
//        this.persona = persona;
//    }
//
//    //TRANSACCIONABILIDAD
//    public void crearPersona(PersonaModelo p) {
//
//        try {
//            String SQL = "call sp_CrearPersona('" + p.getNombres() + "',"
//                    + "'" + p.getApellidos() + "',"
//                    + "'" + p.getCedula() + "','" + p.getUsuario() + "',"
//                    + "'" + p.getClave() + "')";
//            ejecutar = (PreparedStatementWrapper) conectado.prepareCall(SQL);
//            if (res > 0) {
//                JOptionPane.showMessageDialog(null, "PERSONA CREADA CON ÉXITO");
//            } else {
//                JOptionPane.showMessageDialog(null, "REVISAR LA INFORMACIÓN INGRESADA");
//            }
//            ejecutar.close();
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA");
//        }
//    }
//
//    //LLENADO DE LA TABLA
//    public ArrayList<Object[]> datosPersonas() {
//        ArrayList<Object[]> listaTotalRegistros = new ArrayList<>();
//        try {
//            String SQL = "call sp_listaPersona()";
//            ejecutar = (PreparedStatementWrapper) conectado.prepareCall(SQL);
//            ResultSet res = ejecutar.executeQuery();
//            int contador = 1;
//            while (res.next()) {
//                Object[] fila = new Object[6];
//                for (int i = 0; i < 6; i++) {
//                    fila[i] = res.getInt(i + 1);
//                }
//                fila[0] = contador;
//                listaTotalRegistros.add(fila);
//                contador++;
//            }
//            ejecutar.close();
//            return listaTotalRegistros;
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA");
//        }
//        return null;
//    }
//    
//    public ArrayList<Object[]> buscarPersona(int cedula){
//        ArrayList<Object[]> listaTotalRegistros=new ArrayList<>();
//        try {
//            String sql = "call sp_BuscarPersona('" +cedula+ "');";
//            ejecutar = (PreparedStatement) conectado.prepareCall(sql);
//            ResultSet resultado=ejecutar.executeQuery();
//            int cont=1;
//            while(resultado.next()){
//                Object[]fila=new Object[6];
//                for (int i = 0; i < 6; i++) {
//                    fila[i]=resultado.getObject(i+1);
//               }
//                fila[0]=cont;
//                listaTotalRegistros.add(fila);
//                cont++;
//            }
//            ejecutar.close();
//            return listaTotalRegistros;         
//            
//                 
//            } catch (SQLException e) {
//                System.out.println("COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA");
//        }
//            return null;
//    }
// EVALUACIÓN
    // 1. INSERTAR NOMBRES COMPLETOS DE UNA PERSONA POR MEDIO DE SU CÉDULA
    private static final String URL = "jdbc:mysql://localhost:3306/conexión";
    private static final String USUARIO = "root";
    private static final String CLAVE = "3antiserver3";

    public static String completarNombresPorCedula(String cedula) {
        String nombresCompletos = null;

        try (Connection conn = DriverManager.getConnection(URL, USUARIO, CLAVE); CallableStatement stmt = conn.prepareCall("{CALL completar_nombres_por_cedula(?, ?)}")) {

            stmt.setString(1, cedula);
            stmt.registerOutParameter(2, java.sql.Types.VARCHAR);
            stmt.execute();

            nombresCompletos = stmt.getString(2);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return nombresCompletos;
    }

    // 2. INSERT DATOS DEL VEHÍCULO INGRESADOS POR EL USUARIO, DIRECTO A LA BDD
    public static void insertarVehiculo(String cedula, String placa, String color, String anioFabricacion, String valor, String marca, String tipo, String multas) {
        Connection conexion = null;
        CallableStatement llamada = null;

        try {
            conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);

            llamada = conexion.prepareCall("{CALL insertar_vehiculo(?, ?, ?, ?, ?, ?, ?, ?)}");
            llamada.setString(1, cedula);
            llamada.setString(2, placa);
            llamada.setString(3, color);
            llamada.setString(4, anioFabricacion);
            llamada.setInt(5, Integer.parseInt(valor));
            llamada.setString(6, marca);
            llamada.setString(7, tipo);
            llamada.setString(8, multas);

            llamada.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (llamada != null) {
                    llamada.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

/**
 *
 * @author Criss
 */
