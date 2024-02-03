/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.Controlador;

import DIU.controlador.ConexionBDD;

/**
 *
 * @author kevin
 */
public class pruebaBDD {
    public static void main(String[] args) {
        ConexionBDD conector = new ConexionBDD();
        conector.conectar();
    }
}
