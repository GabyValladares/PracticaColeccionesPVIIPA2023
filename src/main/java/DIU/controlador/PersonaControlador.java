/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.controlador;

import DIU.Persona;
import DIU.modelo.PersonaModelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class PersonaControlador {

    private PersonaModelo persona;
    ConexionBDD parametros = new ConexionBDD();
    Connection conectar = (Connection) parametros.conectar();
    PreparedStatement ejecutar;
    ResultSet res;

    public PersonaModelo getPersona() {
        return persona;
    }

    public void setPersona(PersonaModelo persona) {
        this.persona = persona;
    }

    public void insertarPersona(PersonaModelo p) {
        try {
            String sql = "call sp_Crearpersona('" + p.getNombres() + "','" + p.getApellidos() + "','" + p.getCedula() + "','" + p.getUsuario() + "','" + p.getClave() + "');";
            ejecutar = (PreparedStatement) conectar.prepareCall(sql);
            var resultado = ejecutar.executeUpdate();
            if (resultado > 0) {
                System.out.println("PERSONA CREADA CON ÉXITO");
                ejecutar.close();
            } else {
                System.out.println("REVISE LOS DATOS INGRESADOS");
            }
        } catch (SQLException e) {
            System.out.println("ERROR SQL");
        }
    }
    
        public ArrayList<Object[]> buscarPersona(int cedula) {
            ArrayList<Object[]> listaObject=new ArrayList<>();
        try {
            String sql = "call sp_BuscarPersona("+cedula+");";
            ejecutar = (PreparedStatement) conectar.prepareCall(sql);
            res = ejecutar.executeQuery();
            int cont = 1;
            while (res.next()) {
                Object[] obpersona = new Object[6];
                for (int i = 0; i < 6; i++) {
                    obpersona[i] = res.getObject(i+1);
                }
                obpersona[0]=cont;
                listaObject.add(obpersona);
                cont++;
            }
            ejecutar.close();
            return listaObject;
           
        } catch (SQLException e) {
            System.out.println("ERROR SQL"+e);
        }
        return null;
    }

    public ArrayList<Object[]> datosPersona() {
        ArrayList<Object[]> listaObject=new ArrayList<>();
        
        try {
            String sql = "call sp_listaPersonas();";
            ejecutar = (PreparedStatement) conectar.prepareCall(sql);
            res = ejecutar.executeQuery();
            int cont = 1;
            while (res.next()) {
                Object[] obpersona = new Object[6];
                for (int i = 1; i < 6; i++) {
                    obpersona[i] = res.getObject(i+1);
                }
                obpersona[0]=cont;
                listaObject.add(obpersona);
                cont++;
            }
            ejecutar.close();
            return listaObject;

        } catch (SQLException e) {
            System.out.println("ERROR SQL CARGA PERSONAS");

        }

        return null;
    }

}
