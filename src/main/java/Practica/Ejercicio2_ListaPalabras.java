/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Practica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Ejercicio2_ListaPalabras extends javax.swing.JInternalFrame {
    private JTextField palabraTextField;
    private JTextArea listaPalabrasTextArea;
    private JTextArea resultadoTextArea;

    private List<String> listaPalabras;

    public Ejercicio2_ListaPalabras() {
        initComponents();
        listaPalabras = new ArrayList<>();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        lblPalabra = new javax.swing.JLabel();
        txtPalabra = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlistaPalabras = new javax.swing.JTextArea();
        btnContar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        lblTitulo.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lblTitulo.setText("Contador de Palabras");

        btnAgregar.setText("Agregar Palabra");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        lblPalabra.setText("Palabra:");

        txtAlistaPalabras.setColumns(20);
        txtAlistaPalabras.setRows(5);
        jScrollPane1.setViewportView(txtAlistaPalabras);

        btnContar.setText("Contar Palabras ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(lblPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnAgregar)
                        .addGap(32, 32, 32)
                        .addComponent(btnContar)))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo))
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPalabra)
                    .addComponent(txtPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnContar))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregarPalabra();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameActivated

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosed
     
    private void agregarPalabra(){
        String palabra = txtPalabra.getText().trim();
        if(!palabra.isEmpty()){
            listaPalabras.add(palabra);
            actualizarListaPalabras();
            
        }
    }
    private void actualizarListaPalabras(){
        StringBuilder listaPalabrasBuilder = new StringBuilder("Lista de Palabras:\n");
        for (String palabra : listaPalabras) {
            listaPalabrasBuilder.append(palabra).append("\n");
        }
        txtAlistaPalabras.setText(listaPalabrasBuilder.toString());
        txtPalabra.setText("");
    }
    private void contarPalabras() {
        String palabraBuscada = JOptionPane.showInputDialog(this, "Ingrese la palabra a buscar:");
        if (palabraBuscada != null) {
            int contador = contarOcurrencias(palabraBuscada);
            JOptionPane.showMessageDialog(this, "La palabra '" + palabraBuscada + "' aparece " + contador + " veces.");
        }
    }
    private int contarOcurrencias(String palabra) {
        int contador = 0;
        for (String p : listaPalabras) {
            if (p.equalsIgnoreCase(palabra)) {
                contador++;
            }
        }
        return contador;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnContar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPalabra;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txtAlistaPalabras;
    private javax.swing.JTextField txtPalabra;
    // End of variables declaration//GEN-END:variables
}