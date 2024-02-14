/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.controlador;

import DIU.modelo.Persona;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class PersonaControlador {
    
    private Persona persona;
    
    ConexionBDD conectar = new ConexionBDD();
    Connection conectado = (Connection)conectar.conectar();
    
    PreparateStament ejecutar;
    //Mostrar
    ResultSet resultado;
    //escribir 
    int res;
    
    
    public PersonaControlador(){
        
    }
    
     public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    //TRASACCIONABILIDAD
    
    
    public void crearPersona (Persona p){
        try{
                        
            String SQL="call sp_CrearPersona('"+p.getNombres()+"',"
                    + "'"+p.getApellidos()+"',"
                    + "'"+p.getCedula()+"','"+p.getUsuario()+"',"
                    + "'"+p.getClave()+"')";
            
            ejecutar = (PreparateStament)conectado.prepareCall(SQL);
            int  res = ejecutar.executeUpdate();
            
            if(res > 0){
                System.out.println("Person creada");
            }
            
            ejecutar.close();
            
        }catch(SQLException e){
            System.out.println("Error en la conexion: para persona ");
        }
    }
    
    
    //SIEMPRE QUE ME RETORNA MAS DE UN CAMPO PARA ESCRIBIR EN  UNA TABLA UTILIZAMOS
    public ArrayList< Object[]> buscarPersona(int cedula){
        
        ArrayList< Object[]> listaTotalRegistros = new ArrayList<>();
        
        try{
        String SQL= "call sp_BuscarPersona('"+cedula+"')";
         ejecutar = (PreparateStament)conectado.prepareCall(SQL);
          ResultSet ressultado = ejecutar.executeQuery();
          
          int cont = 1;
          
           while(ressultado.next()){
              Object[] fila = new Object[6];
              for (int i = 0; i < 6; i++) {
                  fila[i] = ressultado.getObject(i+1);
              }
              
              fila[0] = cont;
              listaTotalRegistros.add(fila);
              cont++;
              
          }
          
          ejecutar.close();
          return listaTotalRegistros;
          
        }catch(SQLException e){
            
        } 
        
        return null;
    }
    
    // consultas a la tabla
    public  ArrayList< Object[]> datosPersonas(){
        
        ArrayList< Object[]> listaTotalRegistros = new ArrayList<>();
        
        try{
          String SQL= "call ver_persona()";
          ejecutar = (PreparateStament)conectado.prepareCall(SQL);
          ResultSet res = ejecutar.executeQuery();
          
          int cont = 1;
          
          while(res.next()){
              Object[] fila = new Object[6];
              for (int i = 0; i < 6; i++) {
                  fila[i] = res.getObject(i+1);
              }
              
              fila[0] = cont;
              listaTotalRegistros.add(fila);
              cont++;
              
          }

          ejecutar.close();
          return listaTotalRegistros;
          
        }catch(SQLException e){
            System.out.println("Comuniquense con el administrador del sistema. No se muestra la tabla");
            
        }
        return null;
    }
    
    
    
}
