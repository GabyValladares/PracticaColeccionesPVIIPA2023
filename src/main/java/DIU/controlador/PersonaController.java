/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.controlador;

import DIU.modelo.PersonaModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
}
