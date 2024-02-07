/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Practica;

import java.util.Stack;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 59399
 */
public class Ejercicio6_torresHanoi extends javax.swing.JInternalFrame {

    DefaultTableModel tabla1 = new DefaultTableModel();
    DefaultTableModel tabla2 = new DefaultTableModel();
    DefaultTableModel tabla3 = new DefaultTableModel();
    
    Stack<Integer> torre1 = new Stack<>();
    Stack<Integer> torre2 = new Stack<>();
    Stack<Integer> torre3 = new Stack<>();
    
    private final int n1 = 3;
    private final int n2 = 2;
    private final int n3 = 1;
    int cont = 0;
    
    public Ejercicio6_torresHanoi() {
        initComponents();
        String cabecera1 [] = {"TORRE 1"};
        String cabecera2 [] = {"TORRE 2"};
        String cabecera3 [] = {"TORRE 3"};
        
        tabla1.setColumnIdentifiers(cabecera1);
        tabla2.setColumnIdentifiers(cabecera2);
        tabla3.setColumnIdentifiers(cabecera3);
        tbTorre1.setModel(tabla1);
        tbTorre2.setModel(tabla2);
        tbTorre3.setModel(tabla3);
     
    }

    private void imprimirTorres() {
        for (Integer inte : torre1) {
            tabla1.addRow(new Object[]{inte});
        }

        for (Integer integer : torre2) {
            tabla2.addRow(new Object[]{integer});
        }

        for (Integer integer : torre3) {
            tabla3.addRow(new Object[]{integer});
        }

    }
    
     private void limpiarTabla() {

        int filas = tabla1.getRowCount();
        for (int i = 0; i < filas; i++) {
            tabla1.removeRow(0);

        }

        int filas2 = tabla2.getRowCount();
        for (int i = 0; i < filas2; i++) {
            tabla2.removeRow(0);

        }

        int filas3 = tabla3.getRowCount();
        for (int i = 0; i < filas3; i++) {
            tabla3.removeRow(0);

        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTorre2 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbTorre1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbTorre3 = new javax.swing.JTable();
        btnMover = new javax.swing.JButton();
        btnIniciar = new javax.swing.JButton();
        lblFin = new javax.swing.JLabel();

        tbTorre2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbTorre2);

        tbTorre1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tbTorre1);

        tbTorre3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tbTorre3);

        btnMover.setText("mover");
        btnMover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoverActionPerformed(evt);
            }
        });

        btnIniciar.setText("iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        lblFin.setText("FIN DEL JUEGO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIniciar)
                            .addComponent(btnMover)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(lblFin)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(btnIniciar)
                        .addGap(29, 29, 29)
                        .addComponent(btnMover)))
                .addGap(37, 37, 37)
                .addComponent(lblFin)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        torre1.push(n1);
        torre1.push(n2);
        torre1.push(n3);
        this.imprimirTorres();
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnMoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoverActionPerformed

        cont++;

        switch (cont) {
    case 1:
        torre3.push(torre1.pop());
        break;
    case 2:
        torre2.push(torre1.pop());
        break;
    case 3:
        torre2.push(torre3.pop());
        break;
    case 4:
        torre3.push(torre1.pop());
        break;
    case 5:
        torre1.push(torre2.pop());
        break;
    case 6:
        torre3.push(torre2.pop());
        break;
    case 7:
        torre3.push(torre1.pop());
        
        JOptionPane.showMessageDialog(this, "FIN DEL JUEGO");
        break;
    default:
        
        break;
}

limpiarTabla();
imprimirTorres();
                                   
    }//GEN-LAST:event_btnMoverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnMover;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblFin;
    private javax.swing.JTable tbTorre1;
    private javax.swing.JTable tbTorre2;
    private javax.swing.JTable tbTorre3;
    // End of variables declaration//GEN-END:variables
}
