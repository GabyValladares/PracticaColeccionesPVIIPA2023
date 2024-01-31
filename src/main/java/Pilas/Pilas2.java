/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Pilas;

import java.util.Stack;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author  Leo
 */
public class Pilas2 extends javax.swing.JInternalFrame {
    private Stack<Integer> torre1, torre2, torre3;
    private DefaultTableModel modelTorre1, modelTorre2, modelTorre3;
    private int contadorPasos;

    public Pilas2() {
        initComponents();
        inicializarPilas();
        actualizarTablas();
    }
    private void inicializarPilas() {
        torre1 = new Stack<>();
        torre2 = new Stack<>();
        torre3 = new Stack<>();
        modelTorre1 = (DefaultTableModel) jTorre1.getModel();
        modelTorre2 = (DefaultTableModel) JTorre2.getModel();
        modelTorre3 = (DefaultTableModel) JTorre3.getModel();
        contadorPasos = 0;

        torre1.push(3);
        torre1.push(2);
        torre1.push(1);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTorre2 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTorre1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        JTorre3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnResolver = new javax.swing.JButton();

        setClosable(true);
        setForeground(java.awt.Color.white);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Juego de Hanoi");
        setToolTipText("");

        JTorre2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Torre 2"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTorre2);

        jTorre1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Torre 1"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTorre1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTorre1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(jTorre1);

        JTorre3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Torre 3"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(JTorre3);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText(" las Torres de Hanoi");

        btnLimpiar.setText("Reiniciar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnResolver.setText("Saltar");
        btnResolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnResolver)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnLimpiar))
                .addGap(76, 76, 76))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(258, 258, 258))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResolver)
                    .addComponent(btnLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResolverActionPerformed
        resolverHanoi();
        actualizarTablas();
        
    }//GEN-LAST:event_btnResolverActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        inicializarPilas();
        contadorPasos = 0;
        actualizarTablas();
    }//GEN-LAST:event_btnLimpiarActionPerformed
    private void resolverHanoi() {
        switch (contadorPasos) {
            case 0:
                moverDisco(torre1, torre3); // Paso 1: Mover disco 1 de A a C
                break;
            case 1:
                moverDisco(torre1, torre2); // Paso 2: Mover disco 2 de A a B
                break;
            case 2:
                moverDisco(torre3, torre2); // Paso 3: Mover disco 1 de C a B
                break;
            case 3:
                moverDisco(torre1, torre3); // Paso 4: Mover disco 3 de A a C
                break;
            case 4:
                moverDisco(torre2, torre1); // Paso 5: Mover disco 1 de B a A
                break;
            case 5:
                moverDisco(torre2, torre3); // Paso 6: Mover disco 2 de B a C
                break;
            case 6:
                moverDisco(torre1, torre3); // Paso 7: Mover disco 1 de A a C
                break;
            default:
                contadorPasos = -1;
                break;
        }

        contadorPasos++;
        actualizarTablas();
    }

    private void moverDisco(Stack<Integer> origen, Stack<Integer> destino) {
        if (!origen.isEmpty()) {
            int disco = origen.pop();
            destino.push(disco);
        }
    }

    private void actualizarTablas() {
        actualizarTabla(modelTorre1, torre1);
        actualizarTabla(modelTorre2, torre2);
        actualizarTabla(modelTorre3, torre3);
    }

    private void actualizarTabla(DefaultTableModel model, Stack<Integer> torre) {
        model.setRowCount(0);
        for (int i = torre.size() - 1; i >= 0; i--) {
            model.addRow(new Object[]{torre.get(i)});
        }
    }


    private void jTorre1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTorre1AncestorAdded
        
    }//GEN-LAST:event_jTorre1AncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTorre2;
    private javax.swing.JTable JTorre3;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnResolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTorre1;
    // End of variables declaration//GEN-END:variables
}
