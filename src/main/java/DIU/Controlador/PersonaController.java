/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.controlador;


import static DIU.FichaVehicular.txtNombres;
import DIU.modelo.PersonaModel;
import DIU.modelo.VehiculoModel;
import java.security.spec.PSSParameterSpec;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class PersonaController {
    private PersonaModel persona;
    ConexionBDD conectar=new ConexionBDD();
    Connection conectado=(Connection)conectar.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;//para leer u obtener datos
    int res;//para escribir
    public PersonaController() {
    }

    public PersonaModel getPersona() {
        return persona;
    }

    public void setPersona(PersonaModel persona) {
        this.persona = persona;
    }
    
    //TRANSACCIONABILIDAD
    //CREAR 
    public void crearPersona(PersonaModel p){
        try {
            
            String sql = "call sp_Crearpersona('" + p.getNombres() + "','" + p.getApellidos() + "','" + p.getCedula() + "','" + p.getUsuario() + "','" + p.getClave() + "');";
            ejecutar = (PreparedStatement) conectado.prepareCall(sql);
            //executeUpdate cuando escribo la bdd
            //int res cuando escribo
            int res=ejecutar.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog
        (null, "Persona creada con éxito");
                System.out.println("PERSONA CREADA CON ÉXITO");
                ejecutar.close();
            }else{
                JOptionPane.showMessageDialog
        (null, "Revisar los datos ingresados");
                System.out.println("REVISAR LA INFORMACIÓN INGRESADA");
            }
            } catch (SQLException e) {
                System.out.println("COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA");
        }
    
    }
    
    //CONSULTA DE TODA LA TABLA
    
    public  ArrayList<Object[]> datosPersonas(){
        ArrayList<Object[]> listaTotalRegistros=new ArrayList<>();
        try {
            String SQL="call sp_listaPersonas()";
            ejecutar=(PreparedStatement)conectado.prepareCall(SQL);
            //excuteQuery cuando consulto la bdd
            //Recibo un result set cuando consulto
            ResultSet res=ejecutar.executeQuery();
            int cont=1;
            while(res.next()){
                Object[]fila=new Object[6];
                for (int i = 0; i < 6; i++) {
                    fila[i]=res.getObject(i+1);
               }
                fila[0]=cont;
                listaTotalRegistros.add(fila);
                cont++;
            }
            ejecutar.close();
            return listaTotalRegistros;
        } catch (Exception e) {
            System.out.println("BDD"+e);
        }
    
        return null;
    }
    
    public  ArrayList<Object[]>buscarPersona(int cedula){
        ArrayList<Object[]> listaTotalRegistros=new ArrayList<>();
        try {
            String sql = "call sp_BuscarPersona('" +cedula+ "');";
            ejecutar = (PreparedStatement) conectado.prepareCall(sql);
            ResultSet resultado=ejecutar.executeQuery();
            int cont=1;
            while(resultado.next()){
                Object[]fila=new Object[6];
                for (int i = 0; i < 6; i++) {
                    fila[i]=resultado.getObject(i+1);
               }
                fila[0]=cont;
                listaTotalRegistros.add(fila);
                cont++;
            }
            ejecutar.close();
            return listaTotalRegistros;         
            
                 
            } catch (SQLException e) {
                System.out.println("COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA");
        }
            return null;
    }
    
    public void actualizarPersona(PersonaModel p){
        try {
            
            String sql = "call sp_ActualizarPersona('" + p.getNombres() + "','" + p.getApellidos() + "','" + p.getCedula() + "','" + p.getUsuario() + "','" + p.getClave() + "');";
            ejecutar = (PreparedStatement) conectado.prepareCall(sql);
            //executeUpdate cuando escribo la bdd
            //int res cuando escribo
            int res=ejecutar.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog
        (null, "Persona actualizada con éxito");
                System.out.println("PERSONA CREADA CON ÉXITO");
                ejecutar.close();
            }else{
                JOptionPane.showMessageDialog
        (null, "Revisar los datos ingresados al momento de querer actualizar");
                System.out.println("REVISAR LA INFORMACIÓN INGRESADA");
            }
            } catch (SQLException e) {
                System.out.println("COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA");
        }
    
    }
    
    public void eliminarPersona(int cedula){
        try {
            
            String sql = "call sp_EliminarPersona('"+cedula+"');";
            ejecutar = (PreparedStatement) conectado.prepareCall(sql);
            //executeUpdate cuando escribo la bdd
            //int res cuando escribo
            int res=ejecutar.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog
        (null, "Persona eliminada con éxito");
                System.out.println("PERSONA CREADA CON ÉXITO");
                ejecutar.close();
            }else{
                JOptionPane.showMessageDialog
        (null, "Revisar los datos ingresados al momento de querer eliminar");
                System.out.println("REVISAR LA INFORMACIÓN INGRESADA");
            }
            } catch (SQLException e) {
                System.out.println("COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA");
        }
    
    }
    
    public int verificarCredenciales(String usuario, String clave){
        int estado=0;
        try {
            CallableStatement ejecutar = conectado.prepareCall("{call sp_InicioSesion('"+usuario+"','"+clave+"',?)}");
            ejecutar.registerOutParameter(1,Types.INTEGER);
            ejecutar.execute();
            estado = ejecutar.getInt(1);
            ejecutar.close();
           return estado;
        } catch (SQLException e) {
            System.out.println("ERROR BDD"+e);
        }
        return estado;
    }
    
  public void buscarCedula(int cedula) {
    // Conectar a la base de datos y realizar la consulta
    try {
        // Aquí deberías construir tu consulta SQL para obtener la información de la tabla persona
        String sql = "SELECT * FROM persona WHERE cedula = ?";
        
        try (PreparedStatement preparedStatement = conectado.prepareStatement(sql)) {
            // Establecer el valor del parámetro de cédula en la consulta
            preparedStatement.setInt(1, cedula);

            try (ResultSet resultado = preparedStatement.executeQuery()) {
                if (resultado.next()) {
                    // Obtener los datos necesarios y realizar acciones
                    String nombres = resultado.getString("nombres");
                    txtNombres.setText(nombres);
                 
                } else {
                    // Manejar el caso de que no se encuentre la cédula en la base de datos
                    JOptionPane.showMessageDialog(null, "Cédula no encontrada");
                }
            }
        }

    } catch (SQLException e) {
        // Manejar errores de conexión o consulta

    }
}

  public void insertarVehiculo(VehiculoModel v1) {
    try {
        // Llamar al procedimiento almacenado sp_InsertarVehiculo
        String sql = "{CALL sp_InsertarVehiculo(?, ?, ?, ?, ?, ?)}";
        try (CallableStatement callableStatement = conectado.prepareCall(sql)) {
            callableStatement.setString(1, v1.getPlaca());
            callableStatement.setString(2, v1.getColor());
            callableStatement.setString(3, v1.getMarca());
            callableStatement.setString(4, v1.getTipo());
            callableStatement.setInt(5, v1.getValor());
            callableStatement.setInt(6, v1.getIdpersona());

            // Ejecutar la llamada al procedimiento almacenado
            callableStatement.execute();
        }
    } catch (SQLException e) {
    }
}



}
