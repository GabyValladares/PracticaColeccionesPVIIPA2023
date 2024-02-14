/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Controlador;

import DIU.Modelo.Persona;
import DIU.controlador.ConexionBDD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class PersonaControlador {
    private Persona persona;
    ConexionBDD conectar =new ConexionBDD();
    Connection conectado = (Connection)conectar.conectar();
    PreparateStament ejecutar;
    ResultSet resultado;
    int res;//leer y obtener datos
    
    public PersonaControlador(){
        
    }
    
     public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    //TRASACCIONABILIDAD
    
    //crear
    public void crearPersona (Persona p){
        try{
                        
            String SQL="call sp_CrearPersona('"+p.getNombres()+"',"
                    + "'"+p.getApellidos()+"',"
                    + "'"+p.getCedula()+"','"
                    +p.getUsuario()+"',"
                    + "'"+p.getClave()+"')";
            ejecutar = (PreparateStament)conectado.prepareCall(SQL);
            resultado= ejecutar.executeQuery();
            if(res>0){
                JOptionPane.showMessageDialog(null, "Persona creada con exito");
            }else{
                JOptionPane.showMessageDialog(null, "Revisar los datos ingresados");
            }      
           ejecutar.close(); 
        }catch(SQLException e){
            
        }
    }
    //consulta de toda la tabla
    public ArrayList< Object[]> DatosPersona(){
          //tabla no es una estructura linea
          //next() lee cada linea  y salta de fila por fila  
        ArrayList< Object[]>listaTotalRegistros=new ArrayList<>();
        try {
            String SQL="Call Lista_personas()";
            ejecutar=(PreparateStament) conectado.prepareCall(SQL);
            int cont=1;
            ResultSet ress= ejecutar.executeQuery();
            while(ress.next()){
               Object[] fila=new Object[6];
               for (int i = 0; i < 6; i++) {
                fila[1]=ress.getObject(i+1);
                
            }
               fila[0]=cont;               
               listaTotalRegistros.add(fila);
               cont++;
            }
            ejecutar.close(); 
            return listaTotalRegistros;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Comuniquese con el Administrador");
        }
        return null;
    }
    
    public ArrayList<Object[]> buscarPersona(int cedula){
        ArrayList<Object[]> listaTotalRegistros=new ArrayList<>();
        try {
            String sql = "call sp_BuscarPersona('" +cedula+ "');";
            ejecutar = (PreparateStament) conectado.prepareCall(sql);
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
    
        
    private static class PreparateStament {

        public PreparateStament() {
        }

        private void close() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private ResultSet executeQuery() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
    
}
