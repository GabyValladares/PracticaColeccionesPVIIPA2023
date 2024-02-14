/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Controlador;

import DIU.controlador.ConexionBDD;
import DIU.modelo.PersonaModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Dilan Lara
 */
public class PersonaControlador {
private PersonaModel persona;
    ConexionBDD conectar=new ConexionBDD();
    Connection conectado=(Connection)conectar.conectar();
    PreparedStatement ejecutar;
  ResultSet res;

    public PersonaControlador() {
    }

    public PersonaModel getPersona() {
        return persona;
    }

    public void setPersona(PersonaModel persona) {
        this.persona = persona;
    }

    public void crearPersona(PersonaModel p) {
    try {
        // Usar PreparedStatement y consulta parametrizada
        String sql = "call sp_Crearpersona(?, ?, ?, ?, ?)";
        try (PreparedStatement statement = conectado.prepareStatement(sql)) {
            // Establecer los parámetros
            statement.setString(1, p.getNombres());
            statement.setString(2, p.getApellidos());
            statement.setInt(3, p.getCedula());
            statement.setString(4, p.getUsuario());
            statement.setString(5, p.getClave());

            // Ejecutar la consulta
            int res = statement.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Persona creada con éxito");
                System.out.println("PERSONA CREADA CON ÉXITO");
            } else {
                JOptionPane.showMessageDialog(null, "Revisar los datos ingresados");
                System.out.println("REVISAR LA INFORMACIÓN INGRESADA");
            }
        }
    } catch (SQLException e) {
        // Manejar excepciones
        e.printStackTrace();
        System.out.println("COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA");
    }
}

    
    public ArrayList<Object[]> buscarPersona(int cedula) {
    ArrayList<Object[]> listaObject = new ArrayList<>();
    try {
        String sql = "call sp_BuscarPersona(?);";
        ejecutar = (PreparedStatement) conectado.prepareCall(sql);
        ejecutar.setInt(1, cedula);
        res = ejecutar.executeQuery();
        
        int cont = 1;
        while (res.next()) {
            Object[] obpersona = new Object[6];
            for (int i = 0; i < 6; i++) {
                obpersona[i] = res.getObject(i + 1);
            }
            obpersona[0] = cont;
            listaObject.add(obpersona);
            cont++;
        }
        ejecutar.close();
        return listaObject;

    } catch (SQLException e) {
        System.out.println("ERROR SQL: " + e);
    }
    return null;
}
 
 public void actualizarPersona(PersonaModel p) {
        try {
            String sql = "call sp_ActualizarPersona('" + p.getNombres() + "','" + p.getApellidos() + "','" + p.getCedula() + "','" + p.getUsuario() + "','" + p.getClave() + "');";
            ejecutar = (PreparedStatement) conectado.prepareCall(sql);
            int resultado = ejecutar.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Persona Actualizada con Éxito");
                System.out.println("PERSONA ACTUALIZADA CON ÉXITO");
                ejecutar.close();
            } else {
                JOptionPane.showMessageDialog(null, "Revise los datos ingresados");
                System.out.println("REVISE LOS DATOS INGRESADOS");
            }
        } catch (SQLException e) {
            System.out.println("ERROR SQL");
        }
    }

 
@SuppressWarnings("empty-statement")
 
public  ArrayList<Object[]> datosPersonas(){
      ArrayList<Object[]> listaObject=new ArrayList<>() ;
    
      try {
       String SQL="call sp_listaPersonas()";
       ejecutar=(PreparedStatement)conectado.prepareCall(SQL);
       res=ejecutar.executeQuery();
       int cont=1;
       while(res.next());
       Object[] obpersona = new Object[6];
                for (int i = 1; i < 6; i++) {
                    obpersona[i] = res.getObject(i+1);
                }
                obpersona[0]=cont;
                listaObject.add(obpersona);
                cont++;
            
            ejecutar.close();
            return listaObject;
      
   }catch (SQLException e){
        System.out.println("ERROR SQL CARGA PERSONAS");
   }   
    return null;
    
    
   
  }
public void eliminarPersona(int cedula) {
        try {
            String sql = "call sp_EliminarPersona(" + cedula + ");";
            ejecutar = (PreparedStatement) conectado.prepareCall(sql);
            int resultado = ejecutar.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Persona Eliminada con éxito");
                System.out.println("PERSONA ELIMINADA CON ÉXITO");
                ejecutar.close();
            } else {
                JOptionPane.showMessageDialog(null, "Revise los datos ingresados");
                System.out.println("REVISE LOS DATOS INGRESADOS");
            }
        } catch (SQLException e) {
            System.out.println("ERROR SQL"+e);
        }
    }
}

