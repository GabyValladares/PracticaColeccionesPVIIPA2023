/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DiuControlador;

import DiuModelo.persona;
import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author DELL
 */
public class personaControlador {
    private persona persona;
    ConexionBDD conectar = new ConexionBDD();
    Connection conectado = (Connection) conectar.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;
    int res;
     public personaControlador() {
    }

    public persona getPersona() {
        return persona;
    }

    public void setPersona(persona persona) {
        this.persona = persona;
    }
    
    
    //transaccionabilidad
    public void crearPersona(persona p){
        try{
            String SQL = "call sp_CrearPersona('"+p.getNombres()+"','"
                    +p.getApellidos()+"','"
                    +p.getCedula()+"','"
                    +p.getUsuario()+"','"+p.getClave()+"')";
            ejecutar = (PreparedStatement) conectado.prepareCall(SQL);
            int res=ejecutar.executeUpdate();
            if(res>0){
                System.out.println("USUARIO CREADO");
            }else{
                System.out.println("REVISAR LA INFORMACION INGRESA");
            }
        }catch(Exception e){
            System.out.println("COMUNICARSE CON EL ADMINISTRADOR");
        }
    }
  public void datosPersonas(){
      try {
          String SQL="call sp_listaPersonas()";
          ejecutar= (PreparedStatement) conectado.prepareCall(SQL);
          ResultSet res = ejecutar.executeQuery();
          while (resultado.next()){
              Object[]fila =new Object[6];
              for (int i = 0; i < 10; i++) {
                  fila [0]=res.getInt("idpersona");
              }
          }
      } catch (Exception e) {
      }
  }
  public String obtenerNombresCompletosPorCedula(String cedula){
      String nombresCompletos = "";
      try {
         String sql = "SELECT nombres, apellidos FROM persona Where cedula =?";
         ejecutar = (PreparedStatement) conectado.prepareCall(sql);
         ejecutar.setString(1, cedula);
         ResultSet res = ejecutar.executeQuery();
         if(resultado.next()){
             String nombres = resultado.getString("nombres");
             String apellidos = resultado.getString("apellidos");
             nombresCompletos = nombres + " " + apellidos;
         }
      } catch (Exception e) {
          e.printStackTrace();
      }
      return nombresCompletos;
  }
}
