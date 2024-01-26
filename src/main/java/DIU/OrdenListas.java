/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package DIU;

import java.util.Arrays;
import java.util.Collections;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author USUARIO
 */
public class OrdenListas extends javax.swing.JInternalFrame {
    
    DefaultTableModel tablaO = new DefaultTableModel();
    private int[] lista1 = {19, 2, 3, 1, 6, 5, 7, 92, 0, 4};
    private int[] lista2 = new int[10];
    /**
     * Creates new form OrdenListas
     */
    public OrdenListas() {
        initComponents();
        
        String identficadores [] = {"Lista 1","Lista 2"};
        
        tablaO.setColumnIdentifiers(identficadores);
        jTable2.setModel(tablaO);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblResultado = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnOrdenLista = new javax.swing.JButton();
        btnNumMayor = new javax.swing.JButton();
        btnNumMenor = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setAutoscrolls(true);

        lblResultado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        btnOrdenLista.setText("Ordenar Lista");
        btnOrdenLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenListaActionPerformed(evt);
            }
        });

        btnNumMayor.setText("Numero Mayor");
        btnNumMayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumMayorActionPerformed(evt);
            }
        });

        btnNumMenor.setText("Numero Menor");
        btnNumMenor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumMenorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnNumMenor)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnOrdenLista, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNumMayor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(btnOrdenLista)
                        .addGap(18, 18, 18)
                        .addComponent(btnNumMayor)
                        .addGap(27, 27, 27)
                        .addComponent(btnNumMenor)))
                .addGap(18, 18, 18)
                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrdenListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenListaActionPerformed
        // TODO add your handling code here:
        obtenerLista1();
        obtenerLista2();
    }//GEN-LAST:event_btnOrdenListaActionPerformed

    private void btnNumMayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumMayorActionPerformed
        // TODO add your handling code here:
        int mayor = obtenerNumMayor();
        lblResultado.setText("El número mayor es: "+mayor);
    }//GEN-LAST:event_btnNumMayorActionPerformed

    private void btnNumMenorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumMenorActionPerformed
        // TODO add your handling code here:
        int menor = obtenerNumMenor();
        lblResultado.setText("El número menor es: "+menor);
    }//GEN-LAST:event_btnNumMenorActionPerformed
 
 private int obtenerNumMayor(){
     int mayor = lista1[0];
    for (int i = 1; i < lista1.length; i++) {
        if (lista1[i] > mayor) {
            mayor = lista1[i];
        }
    }
     return mayor;
 }
 
 private int obtenerNumMenor(){
     int menor = lista1[0];
    for (int i = 1; i < lista1.length; i++) {
        if (lista1[i] < menor) {
            menor = lista1[i];
        }
    }
     return menor;
 }
     
 private void obtenerLista1(){
     
  for (Object valor : lista1){
        tablaO.addRow(new Object[]{valor}); 
     }
     
 }

 private void obtenerLista2(){
     //tablaO.setRowCount(0);
     for (int i = lista1.length - 1; i >= 0; i--) {
        tablaO.addRow(new Object[]{lista1[i], null});
        tablaO.setValueAt(lista1[i], lista1.length - 1 - i, 1);
    }
  
 }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNumMayor;
    private javax.swing.JButton btnNumMenor;
    private javax.swing.JButton btnOrdenLista;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblResultado;
    // End of variables declaration//GEN-END:variables
}