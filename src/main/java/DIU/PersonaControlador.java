/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU;

import DIU.controlador.ConexionBDD;
import DIU.modelo.PersonaModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Belial
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
    
    
   public void crearPersona(PersonaModel p){
        try {
            String SQL="call sp_CrearPersona('"+p.getNombres()+"',"
                    + "'"+p.getApellidos()+"',"
                    + "'"+p.getCedula()+"','"+p.getUsuario()+"',"
                    + "'"+p.getClave()+"')";
             
                     
                   ejecutar= (PreparedStatement) conectado.prepareCall(SQL);
                   int res=ejecutar.executeUpdate();
                   if(res>0){
                       System.out.println("Persona creada con exito causa");
                   }else{
                       System.out.println("Revisar la informacion Ingresada"); 
                      
                   }
                   
              
                   
//                   ejecutar = conectado.prepareStatement(SQL);
//                  
//                   // Establece los parámetros
//                 ejecutar.setString(1, p.getNombres());
//                 ejecutar.setString(2, p.getApellidos());
//                 ejecutar.setString(3, p.getCedula());
//                 ejecutar.setString(4, p.getUsuario());
//                 ejecutar.setString(5, p.getClave());
//
//                  // Ejecuta la consulta
//                 ejecutar.executeUpdate();
//                  
//                 // Cierra el PreparedStatement
//                 ejecutar.close();
        
            
        } catch (Exception e) {
            System.out.println("Error");
        }
    
    }
    
   
   public ArrayList<Object[]> datosPersonas() throws SQLException{
       ArrayList<Object[]> ListaTotalRegistros=new ArrayList<>();
       try {
            String sql = "call sp_listaPersonas();";
           ejecutar = (PreparedStatement) conectado.prepareCall(sql);
           
           ResultSet res=ejecutar.executeQuery();
           while(res.next()){
               Object[]fila=new Object[6];
               for (int i = 0; i < 6; i++) {
                   fila[0]=res.getObject(i+1);
                   
                   
               }
           }
           ejecutar.close();
           return ListaTotalRegistros;
           
       } catch (Exception e) {
       }
 {
    
}
