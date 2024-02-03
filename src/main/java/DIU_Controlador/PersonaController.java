/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU_Controlador;

import MODELO.PersonaModelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Sarita
 */
public class PersonaController {
        
        private PersonaModelo persona;
        ConexionBDD conexion = new ConexionBDD ();
        Connection conectado = (Connection) conexion.conectar();
        PreparedStatement ejecutar;
        ResultSet resultado;

    public PersonaController() {
    }

    public PersonaController(PersonaModelo persona, PreparedStatement ejecutar, ResultSet resultado) {
        this.persona = persona;
        this.ejecutar = ejecutar;
        this.resultado = resultado;
    }

    public PersonaModelo getPersona() {
        return persona;
    }

    public void setPersona(PersonaModelo persona) {
        this.persona = persona;
    }

    public ConexionBDD getConexion() {
        return conexion;
    }

    public void setConexion(ConexionBDD conexion) {
        this.conexion = conexion;
    }

    public Connection getConectado() {
        return conectado;
    }

    public void setConectado(Connection conectado) {
        this.conectado = conectado;
    }

    public PreparedStatement getEjecutar() {
        return ejecutar;
    }

    public void setEjecutar(PreparedStatement ejecutar) {
        this.ejecutar = ejecutar;
    }

    public ResultSet getResultado() {
        return resultado;
    }

    public void setResultado(ResultSet resultado) {
        this.resultado = resultado;
    }
    
    public void crearPersona(PersonaModelo p){
        try {
            String SQL="call sp_CrearPersona('"+p.getNombres()+"',"
                    + "'"+p.getApellidos()+"',"
                    + "'"+p.getCedula()+"','"+p.getUsuario()+"',"
                    + "'"+p.getClave()+"')";
            ejecutar = (PreparedStatement) conectado.prepareCall(SQL);
            int res=ejecutar.executeUpdate();//cuando el resultado de la ejecucuion vamos a resivir un parametro de respuesta de tipo entero
            if(res>0){
                JOptionPane.showMessageDialog(null, "PERSONA CREADA CON EXITO");
            }else{
                System.out.println("REVISAR LA INFORMACION INGRESADA");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA");
        }
    }
        
       
    
}
