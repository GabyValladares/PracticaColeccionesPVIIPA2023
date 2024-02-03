/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU;

import DIU.controlador.ConexionBDD;

/**
 *
 * @author Belial
 */
public class PruebaBDD {
    
     public static void main(String[] args) {
        ConexionBDD conectar=new ConexionBDD();
        conectar.conectar();
    }
    
}
