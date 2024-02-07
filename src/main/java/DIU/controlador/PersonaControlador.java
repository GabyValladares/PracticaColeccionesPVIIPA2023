/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.controlador;

import DIU.modelo.PersonaModelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author oli
 */
public class PersonaControlador {
    private PersonaModelo persona;
    conexionDB conectar=new conexionDB();
    Connection conectado=(Connection)conectar.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;

    public PersonaControlador() {
    }

    public PersonaControlador(PersonaModelo persona, PreparedStatement ejecutar, ResultSet resultado) {
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
   
    
    
    public void crearPersona(PersonaModelo p){
        try {
            String SQL="call sp_CrearPersona('"+persona.getNombres()+"','"+persona.getApellidos()+"',"+persona.getCedula()
                    +",'"+persona.getUsuario()+"','"+persona.getClave()+"')";
            ejecutar=(PreparedStatement)conectado.prepareCall(SQL);
            int res=ejecutar.executeUpdate();
            //executeUpdate cuando esxribo la base de datos
            //int res cuando escribo
            if(res>0){
                JOptionPane.showMessageDialog(null, "Usuario creado");
            }else{
                JOptionPane.showMessageDialog(null, "Resvise la información ingresada");
            }
            ejecutar.close();
        } catch (SQLException e) {
            System.out.println("ERROR EN LA CONEXIÓN"+e);
        }
    }
    
    public ArrayList<Object[]> datosPersonas(){
        ArrayList<Object[]> listaTotalRegistros=new ArrayList<>();
        try {
            String SQL="call sp_listaPersona()";
            ejecutar=(PreparedStatement)conectado.prepareCall(SQL);
            resultado=ejecutar.executeQuery();
            //executeQuery cuando consulto la base de datos
            //ResultSet cuando recibo datos
            int cont=1;
            while (resultado.next()) {
                
                Object[]fila=new  Object[6];
                for (int i = 0; i < 6; i++) {
                    fila[i]=resultado.getObject(i+1);
                    
                }
                fila[0]=cont;
                cont++;
                listaTotalRegistros.add(fila);
            }
            ejecutar.close();
            return listaTotalRegistros;
        } catch (Exception e) {
            System.out.println("BDD"+e);
        }
        return null;
    }
    
    public ArrayList<Object[]> buscarPersona(int cedula){
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
}
