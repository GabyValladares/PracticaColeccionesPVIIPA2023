/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Controlador;

import DIU.Modelo.Auto;
import DIU.Modelo.Persona;
import DIU.controlador.ConexionBDD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class VehiculoControlador {
     private Auto auto;
     private Persona persona;
    ConexionBDD conectar =new ConexionBDD();
    Connection conectado = (Connection)conectar.conectar();
    PreparateStament ejecutar;
    ResultSet resultado;
    int res;//leer y obtener datos

    public VehiculoControlador() {
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }


    public VehiculoControlador(Auto auto, Persona persona) {
        this.auto = auto;
        this.persona = persona;
    }
    
    public void crearAuto (Auto a){
        try{
                        
            String SQL="call Sp_insertar_vehiculo('"+a.getPlaca()+"',"
                    + "'"+a.getColor()+"',"
                    + "'"+a.getMarca()+"','"
                    +a.getTipoV()+"',"
                    + "'"+a.getValorV()+"')";
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
     public ArrayList<Object[]> buscarVehiculoCedula(int cedula){
        ArrayList<Object[]> listaTotalVehiculos=new ArrayList<>();
        try {
            String sql = "call ObtenerAutosPorCedula('" +cedula+ "');";
            ejecutar = (PreparateStament) conectado.prepareCall(sql);
            ResultSet resultados=ejecutar.executeQuery();
            int cont=1;
            while(resultados.next()){ 
                Object[]fila=new Object[7];
                for (int i = 0; i < 7; i++) {
                    fila[i]=resultados.getObject(i+1);
               }
                fila[0]=cont;
                listaTotalVehiculos.add(fila);
                cont++;
            }
            ejecutar.close();
            return listaTotalVehiculos;         
            
                 
            } catch (SQLException e) {
                System.out.println("COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA");
        }
            return null;
    }

    private static class PreparateStament {

        public PreparateStament() {
        }

        private ResultSet executeQuery() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void close() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
