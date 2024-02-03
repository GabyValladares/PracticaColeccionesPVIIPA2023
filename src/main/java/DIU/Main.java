/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU;

import DIU.controlador.ConexionBDD;


/**
 *
 * @author 59399
 */
public class Main {
    public static void main (String[]args){
        //Menu p = new Menu();
        //p.setVisible(true);
        ConexionBDD cbb = new ConexionBDD ();
        cbb.conectar();
        
    }
}
