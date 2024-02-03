/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Controlador;

import DIU.Modelo.PersonaModel;
import DIU.controlador.ConexionBDD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jefe
 */
public class PersonaController {
    
  private PersonaModel persona;
    ConexionBDD conectar=new ConexionBDD();
    Connection conectado=(Connection)conectar.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;

    public PersonaController() {
    }

    public PersonaModel getPersona() {
        return persona;
    }

  public void setPersona (PersonaModel persona){
  this.persona=persona;
    }
    
  
  public void crearPersona(PersonaModel p){
        try {
            String SQL="call sp_CrearPersona('"+p.getNombres()+"',"
                    + "'"+p.getApellidos()+"',"
                    + "'"+p.getCedula()+"','"+p.getUsuario()+"',"
                    + "'"+p.getClave()+"')";
            ejecutar=(PreparedStatement)conectado.prepareCall(SQL);
            int res=ejecutar.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null, "PERSONA CREADA CON EXITO");
            }else {
                JOptionPane.showMessageDialog( null, "REVISAR LA INFORMACION INGRESADA");
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog( null, "COMUNICARSE CON EL ADMINISTRADOR");
    }  
}

    public ArrayList<Object[]> datosPersona() {
        ArrayList<Object[]> listaTotalObjetos=new ArrayList<>();
        
        try {
            String sql = "call sp_ListarPersonas();";
            ejecutar = (PreparedStatement) conectado.prepareCall(sql);
            resultado = ejecutar.executeQuery();
            int cont = 1;
            while (resultado.next()) {
                Object[] fila = new Object[6];
                for (int i = 1; i < 6; i++) {
                    fila[i] = resultado.getObject(i+1);
                }
                fila[0]=cont;
                listaTotalObjetos.add(fila);
                cont++;
            }
            ejecutar.close();
            return listaTotalObjetos;

        } catch (SQLException e) {
          JOptionPane.showMessageDialog( null, "COMINUQUESE CON EL ADMINISTRADOR");

        }

        return null;
    }    
}


