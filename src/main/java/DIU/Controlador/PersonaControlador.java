/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Controlador;

import DIU.Modelo.PersonaModel;
import DIU.controlador.ConexionBDD;
import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.PreparableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class PersonaControlador {
 private PersonaModel persona;
    ConexionBDD conectar=new ConexionBDD();
    Connection conectado=(Connection)conectar.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;

    public PersonaControlador() {
    }

    public PersonaModel getPersona() {
        return persona;
    }

    public void setPersona(PersonaModel persona) {
        this.persona = persona;
    }

    //transaccion
    
    public void crearPersona(PersonaModel p){
        try {
            String SQL="call sp_CrearPersona('"+p.getNombres()+"',"
                    + "'"+p.getApellidos()+"',"
                    + "'"+p.getCedula()+"')";
            ejecutar=(PreparedStatement)conectado.prepareCall(SQL);
            int res= ejecutar.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null, "PERSONA CREADA CON EXITO!!!!");
            }else{
               JOptionPane.showMessageDialog(null,"REVISE LA INFO!!!!");
            }
            ejecutar.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"CONTACTESE CON EL ADMINISTRADOR !!");
        }
    
    }
    
    public ArrayList<Object[]> datospersona(){
        ArrayList<Object[]> totalregistros=new ArrayList<>();
        try {
            String SQL= "call verPersonas()";
            ejecutar=(PreparedStatement)conectado.prepareCall(SQL);
            ResultSet res=ejecutar.executeQuery();
            int contador=1;
            while (res.next()){
                Object[] fila=new Object[4];
                for (int i=0;i<4;i++){
                    fila[i]=res.getObject(i+1);
                    
                }
                fila[0]=contador;
                totalregistros.add(fila);
                contador++;
            }
               ejecutar.close();
               return totalregistros;
        } catch (SQLException e) {
        }
     JOptionPane.showMessageDialog(null, "BDD");
     return null;
    }

     public ArrayList<Object[]> buscarPersona(int cedula) {
    ArrayList<Object[]> totalregistros = new ArrayList<>();

    try {
        String sql="call sp_BuscarPersona('"+cedula+"')";
            ejecutar=(PreparedStatement)conectado.prepareCall(sql);
            ResultSet resultado= ejecutar.executeQuery();

        int contador = 1;
        while (resultado.next()) {
            Object[] fila = new Object[6];
            fila[0] = contador;

            for (int i = 1; i <= 6; i++) {
                fila[i] = resultado.getObject(i);
            }

            totalregistros.add(fila);
            contador++;
        }
        ejecutar.close();
        return totalregistros;
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "BDD ");
    }

    return null;
}
     public void modificarPersona(PersonaModel p) {
    try {
        String SQL = "call sp_ModificarPersona('"
                + p.getNombres() + "', '"
                + p.getApellidos() + "', '"
                + p.getCedula() + "')";
        ejecutar = (PreparedStatement) conectado.prepareCall(SQL);
        int res = ejecutar.executeUpdate();
        if (res > 0) {
            JOptionPane.showMessageDialog(null, "Persona modificada con éxito.");
        } else {
            JOptionPane.showMessageDialog(null, "Error al modificar la persona. Revise la información.");
        }
        ejecutar.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al modificar la persona. Por favor, contacte al administrador.");
    }
}

public void eliminarPersona(String cedula) {
    try {
        String SQL = "call sp_EliminarPersona('" + cedula + "')";
        ejecutar = (PreparedStatement) conectado.prepareCall(SQL);
        int res = ejecutar.executeUpdate();
        if (res > 0) {
            JOptionPane.showMessageDialog(null, "Persona eliminada con éxito.");
        } else {
            JOptionPane.showMessageDialog(null, "Error al eliminar la persona. Revise la información.");
        }
        ejecutar.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al eliminar la persona. Por favor, contacte al administrador.");
    }
}

}