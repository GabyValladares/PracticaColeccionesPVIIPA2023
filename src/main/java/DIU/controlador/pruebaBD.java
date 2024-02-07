/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIU.controlador;

/**
 *
 * @author oli
 */
public class pruebaBD {
    public static void main(String[] args) {
        conexionDB conectar=new conexionDB();
        conectar.conectar();
    }
}
