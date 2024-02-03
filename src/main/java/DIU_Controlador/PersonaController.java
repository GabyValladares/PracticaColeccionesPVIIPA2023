/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU_Controlador;

import MODELO.PersonaModelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
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
            //cuando escribo la base de datos.
            //res= cuando escribo
            int res=ejecutar.executeUpdate();//cuando el resultado de la ejecucuion vamos a resivir un parametro de respuesta de tipo entero
            if(res>0){
                JOptionPane.showMessageDialog(null, "PERSONA CREADA CON EXITO");
            }else{
                System.out.println("REVISAR LA INFORMACION INGRESADA");
            }
            ejecutar.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA");
        }
    }
        //cuando voy a escribir a la base de datos
    //exequiut  queri cuando voy a traer informacion de la base de datos
    public ArrayList<Object[]> datosPersonas(){  
        ArrayList<Object[]> listaTotalRegistros = new ArrayList<>();
        try {
            String SQL = "call sp_listaPersonas()";
            ejecutar = (PreparedStatement) conectado.prepareCall(SQL);
            ResultSet res = ejecutar.executeQuery();
            while(res.next()){//sata de fila en fila cada registro el = next()
              Object[]fila =new Object[6];  
                for (int i = 0; i < 6; i++) {
                fila[i]=res.getObject(i+1);
                }
                 listaTotalRegistros.add(fila);
            }
            ejecutar.close();
            return  listaTotalRegistros;
        } catch (Exception e) {
            System.out.println("BDD" +e);   
        }
        
        return null;
   }
    }
    

