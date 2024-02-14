/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.CONTROLADOR;

import DIU.controlador.ConexionBDD;
import DIU.modelo.PersonaModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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
    
    
public void crearPersona(PersonaModel p) {
    try {
        // Usar PreparedStatement y consulta parametrizada
        String sql = "call sp_Crearpersona(?, ?, ?, ?, ?)";
        try (PreparedStatement statement = conectado.prepareStatement(sql)) {
            // Establecer los parámetros
            statement.setString(1, p.getNombres());
            statement.setString(2, p.getApellidos());
            statement.setInt(   3, p.getCedula());
            statement.setString(4, p.getUsuario());
            statement.setString(5, p.getClave());

            // Ejecutar la consulta
            int res = statement.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Persona creada con éxito");
                System.out.println("PERSONA CREADA CON ÉXITO");
            } else {
                JOptionPane.showMessageDialog(null, "Revisar los datos ingresados");
                System.out.println("REVISAR LA INFORMACIÓN INGRESADA");
            }
        }
    } catch (SQLException e) {
        // Manejar excepciones
        e.printStackTrace();
        System.out.println("COMUNICARSE CON EL ADMINISTRADOR DEL SISTEMA");
    }
}

    
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
}




       
  