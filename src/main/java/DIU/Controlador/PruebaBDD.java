/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DIU.Controlador;

import DIU.controlador.ConexionBDD;

/**
 *
 * @author jefe
 */
public class PruebaBDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 ConexionBDD Conexion=new ConexionBDD();
 Conexion.conectar();
    }



    
}

