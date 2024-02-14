/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.controlador;

import view.controlador.ConexionBDD;

/**
 *
 * @author Andy Moya
 */
public class pruebabd {
    public static void main(String[] args) {
        ConexionBDD conectar = new ConexionBDD();
        conectar.conectar();
    }
  
}
