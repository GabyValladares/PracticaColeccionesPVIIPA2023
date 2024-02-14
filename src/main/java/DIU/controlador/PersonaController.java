/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.controlador;

import DIU.EjercicioFichaVehicular.FichaVehicular;
import static DIU.EjercicioFichaVehicular.FichaVehicular.txtColor;
import static DIU.EjercicioFichaVehicular.FichaVehicular.txtPlaca;
import DIU.modelo.PersonaModelo;
import DIU.modelo.Vehiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 59399
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
        
    public void crearPersona (PersonaModelo p){
        try {
                  String SQL="call sp_CrearPersona('"+p.getNombres()+"',"
                    + "'"+p.getApellidos()+"',"
                    + "'"+p.getCedula()+"','"+p.getUsuario()+"',"
                    + "'"+p.getClave()+"')";
        ejecutar = (PreparedStatement) conectado.prepareCall(SQL);
        int res = ejecutar.executeUpdate(); //Resultado de la ejecución es un execute, si es una consulta es del tipo resulset
        if(res>0){
            JOptionPane.showMessageDialog(null, "PERSONA CREADA CON ÉXITO");
            
        }else{
            JOptionPane.showMessageDialog(null, "REVIDAR LA INFORMACIÓN INGRESADA");
            
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "COMUNICARCE CON EL ADMINISTRADOR DEL SISTEMA");
         
        }
        
    }
   public ArrayList <Object[]> DatosPersona(){
       ArrayList <Object[]> ListaTotalRegistros = new ArrayList();
       try {
           String SQL = "call sp_ListaPersonas()";
           ejecutar = (PreparedStatement) conectado.prepareCall (SQL);
           ResultSet res = ejecutar.executeQuery();
           int cont=1;
           while (res.next()){
               Object[] fila = new Object[6];
               for (int i = 0; i < 6; i++) {
                   fila [i] = res.getObject(i+1);
                  
               }
               fila[0]= cont;
              ListaTotalRegistros.add(fila);
              cont++;
           }
            ejecutar.close();
           return ListaTotalRegistros;
           
       } catch (Exception e) {
           System.out.println("COMUNIQUESE CON EL ADMINISTRADOR DEL SISTEMA"+e);
       }
       return null;
   }
    public ArrayList <Object[]> buscarPersona (int cedula){
        
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
            
                 
            } catch (Exception e) {
                System.out.println("COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA");
        }
            return null;

}
    public String obtenerNombresCompletosCedula (int cedula){
        try{
            String SQL = "call obtenerNombresCompletos("+cedula+")";
            ejecutar = (PreparedStatement) conectado.prepareCall(SQL);
            ResultSet rs=ejecutar.executeQuery();
            String nombresCompletos = "";
            if(rs.next()){
                nombresCompletos = rs.getString("Nombres_Completos");          
            }
            ejecutar.close();
            return nombresCompletos;
        }catch (Exception e){
            System.out.println("Cominicarse con el administrador del sistema");
        }
        return null;
    }
    
    public void insertarVehiculo(Vehiculo v){
        //try{
            String placa = txtPlaca.getText();
            String color = txtColor.getText();
        //    String marca = (String) cmbMarcas.getSelectedItem();
             String tipo;
        // if (rbtAutomovil.isSelected()) {
            tipo = "Automovil";
        }
       //  else if (rbtJeep.isSelected()) {
         //   tipo = "Jeep";
        //} 
         //else if (rbtCamioneta.isSelected()) {
            //tipo = "Camioneta";
        //} 
         //else if (rbtVitara.isSelected()) {
           // tipo = "Vitara";
        //}
        //int valor = Integer.parseInt(txtValor.getText());
        //int idPersona = obtenerIdPersonaSeleccionada();

         String SQL = "INSERT INTO ejemplopoo_vehiculos(placa, color, marca, tipo, valor, idpersona) VALUES (?, ?, ?, ?, ?, ?)";
      //   PreparedStatement statement = conectado.prepareStatement(SQL);
       //  statement.setString(1, placa);
        // statement.setString(2, color);
     //    statement.setString(3, marca);   
      //   statement.setString(4, tipo);   
     //    statement.setInt(5, valor);
       //  statement.setInt(6, idPersona);
         
       //  int filasInsertadas = statement.executeUpdate();
        // if(filasInsertadas > 0){
         //    System.out.println("Vehiculo insertado correctamente");
         //}else{
            // System.out.println("No se inserto correctamente el vehículo en la base de datos");
        // }
        // statement.close();
       // }catch(Exception e){
           // System.out.println("Error al insertar el vehiculo en la base de datos");
        }
        
    //}
    
    
    
    
    
    
//}

   
