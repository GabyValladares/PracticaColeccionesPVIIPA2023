/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Controlador;

import DIU.Modelo.PersonaModelo;
import DIU.controlador.ConexionBDD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author guami
 */
public class PersonaControl {
    private PersonaModelo persona;
    ConexionBDD conectar=new ConexionBDD();
    Connection conectado=conectar.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;

    public PersonaControl() {
    }

    public PersonaModelo getPersona() {
        return persona;
    }

    public void setPersona(PersonaModelo persona) {
        this.persona = persona;
    }
    
    
    
    public void crearPersona(PersonaModelo p){
        try {
            String SQL="call sp_CrearPersona('"+p.getNombres()+"',"
                    + "'"+p.getApellidos()+"',"
                    + "'"+p.getCedula()+"','"+p.getUsuario()+"',"
                    + "'"+p.getClave()+"')";
        ejecutar=(PreparedStatement)conectado.prepareCall(SQL);
        int res=ejecutar.executeUpdate();
        if(res>0){
            JOptionPane.showMessageDialog(null, "PERSONA CREADA CON EXITO");
           
        }else{
            JOptionPane.showMessageDialog(null, "REVISAR LA INFORMACION INGRESADA");
            
        }
        ejecutar.close();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA");
            
        }
    }
    
    public ArrayList<Object[]> datosPersonas(){
        ArrayList<Object[]> listaTotalRegistros=new ArrayList<>();
        try{
            String SQL= "call verPersonas()";
            ejecutar=(PreparedStatement)conectado.prepareCall(SQL);
            ResultSet res= ejecutar.executeQuery();
            int cont=1;
            while(res.next()){
                Object[]fila=new Object[6];
                for(int i=0; i<6; i++){
                    fila[i]=res.getObject(i+1);
                    
                }
                fila[0]=cont;
                listaTotalRegistros.add(fila);
                cont++;
            }
            ejecutar.close();
            return listaTotalRegistros;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "BDD"+e);
        }
        return null;
    }
}
