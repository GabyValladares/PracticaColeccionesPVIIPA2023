/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.vista;

import DIU.controlador.ConexionBDD;

/**
 *
 * @author Dilan Lara
 */
public class PruebaBDD {
    
     public static void main(String[] args) {
        // TODO code application logic here
        ConexionBDD conectar =new ConexionBDD();
        conectar.conectar();
    }

    
}
