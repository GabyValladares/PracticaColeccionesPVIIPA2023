/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU_Controlador;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Sarita
 */
class ConexionBDD {
    java.sql.Connection conexion;
     public java.sql.Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/Geaturim","root","Leonardox_x2004");
            conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/conexxions","root","Sr1050454121@");
            System.out.println("CONECTADO A LA BASE DE DATOS"); 
        } catch (ClassNotFoundException | SQLException e)
        {
             System.out.println("ERROR DE CONEXION A LA BASE DE DATOS");
        }
        return conexion;
    }
    
}
