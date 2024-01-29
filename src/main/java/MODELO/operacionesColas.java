/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

/**
 *
 * @author Sarita
 */
public class operacionesColas {
     public static Queue<Integer> sumarColas(Queue<Integer> cola1, Queue<Integer> cola2) {
        Queue<Integer> resultado = new LinkedList<>();

        // Comprueba que ambas colas tengan la misma cantidad de elementos
        if (cola1.size() != cola2.size()) {
            JOptionPane.showMessageDialog(null, "Las colas no tienen la misma cantidad de elementos");
            return resultado;
        }

        // Suma los elementos de las colas uno a uno
        while (!cola1.isEmpty() && !cola2.isEmpty()) {
            int suma = cola1.poll() + cola2.poll();
            resultado.offer(suma);
        }

        return resultado;
    }
}
    

