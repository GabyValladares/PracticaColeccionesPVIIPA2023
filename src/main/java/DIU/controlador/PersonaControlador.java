/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.controlador;

import DIU.Modelo.PersonaModelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author carlo
 */
public class PersonaControlador {
    private PersonaModelo persona;
    ConexionBDD concetar = new ConexionBDD();
    Connection conectado = (Connection)concetar.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;

    public PersonaControlador() {
    }

    public PersonaModelo getPersona() {
        return persona;
    }

    public void setPersona(PersonaModelo persona) {
        this.persona = persona;
    }
    //Transaccionabilidad
    public void crearPersona(PersonaModelo p){
        try {
            String SQL="CALL SP_CrearPersona('"+p.getNombres()+"','"+p.getApellidos()+"','"+p.getCedula()+"','"+p.getUsuario()+"','"+p.getClave()+"')";
            ejecutar = (PreparedStatement)conectado.prepareCall(SQL);
            //Resultado de ejecucion, escribir sobre bdd retorna un valor entero. Si se busca es de tipo result set.
            int res=ejecutar.executeUpdate();
            if(res>0){
                System.out.println("Persona creada con exito");
            }else{
                System.out.println("No se agrego la persona");
            }
        } catch (Exception e) {
            System.out.println("ERROR EN LA CONESION");
        }
}
}
