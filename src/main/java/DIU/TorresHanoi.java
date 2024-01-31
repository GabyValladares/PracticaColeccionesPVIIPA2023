/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package DIU;

import java.util.Stack;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kevin
 */
public class TorresHanoi extends javax.swing.JInternalFrame {

    int objetivo = 3;
    int contarM = 0;
    Stack<String> PilaA;
    Stack<String> PilaB;
    Stack<String> PilaC;
    Stack<String> Pila;

    public TorresHanoi() {
        initComponents();

        PilaA = new Stack<>();
        PilaB = new Stack<>();
        PilaC = new Stack<>();
        Pila = new Stack<>();
    }

    public void contarMovimientos() {
        contarM++;
        jblMovimientos.setText(String.valueOf(contarM));
    }

    public void agregarPila() {

        PilaA.push("3");
        PilaA.push("2");
        PilaA.push("1");
        jblPila1.setText(PilaA.toString());
    }

    public void verificar() {

        Pila.push("3");
        Pila.push("2");
        Pila.push("1");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jblPila1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jblPila2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jblPila3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jblMovimientos = new javax.swing.JLabel();
        btnJugar = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        A2 = new javax.swing.JButton();
        C1 = new javax.swing.JButton();
        C2 = new javax.swing.JButton();
        A3 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Torres de Hanoi");

        jLabel2.setText("Torre A: ");

        jLabel3.setText("Torre B: ");

        jLabel4.setText("Torre C: ");

        jLabel1.setText("Movimientos:");

        btnJugar.setText("Jugar");
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });

        B1.setText("B");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        A2.setText("A");
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });

        C1.setText("C");
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });

        C2.setText("C");
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });

        A3.setText("A");
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });

        B3.setText("B");
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jblPila3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(111, 111, 111)
                                        .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45))
                                    .addComponent(jblPila1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jblPila2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(20, 20, 20)
                                .addComponent(jblMovimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(238, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jblPila1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B1)
                    .addComponent(C1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jblPila2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C2)
                    .addComponent(A2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jblPila3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A3)
                    .addComponent(B3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jblMovimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(btnJugar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        this.agregarPila();
    }//GEN-LAST:event_btnJugarActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        if (!PilaA.isEmpty()) {
            String disco = PilaA.peek();
            if (PilaB.isEmpty() || Integer.parseInt(disco) < Integer.parseInt(PilaB.peek())) {
                String ultimoElemento = PilaA.pop();
                PilaB.push(ultimoElemento);
                jblPila2.setText(PilaB.toString());
                jblPila1.setText(PilaA.toString());
                jblPila3.setText(PilaC.toString());
            } else {
                JOptionPane.showMessageDialog(rootPane, "Movimiento no permitido. El disco origen es más grande.");
            }
        }
        this.contarMovimientos();
    }//GEN-LAST:event_B1ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        if (!PilaA.isEmpty()) {
            String disco = PilaA.peek();
            if (PilaC.isEmpty() || Integer.parseInt(disco) < Integer.parseInt(PilaC.peek())) {
                String ultimoElemento = PilaA.pop();
                PilaC.push(ultimoElemento);
                jblPila3.setText(PilaC.toString());
                jblPila1.setText(PilaA.toString());
                jblPila2.setText(PilaB.toString());

                if (PilaA.isEmpty() && PilaB.isEmpty()) {
                    JOptionPane.showMessageDialog(rootPane, "¡Felicidades, ganaste el juego!");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Movimiento no permitido. El disco origen es más grande.");
            }
        }
        this.contarMovimientos();
    }//GEN-LAST:event_C1ActionPerformed

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed
        if (!PilaB.isEmpty()) {
            String disco = PilaB.peek();
            if (PilaA.isEmpty() || Integer.parseInt(disco) < Integer.parseInt(PilaA.peek())) {
                String ultimoElemento = PilaB.pop();
                PilaA.push(ultimoElemento);
                jblPila2.setText(PilaB.toString());
                jblPila1.setText(PilaA.toString());
                jblPila3.setText(PilaC.toString());
            } else {
                JOptionPane.showMessageDialog(rootPane, "Movimiento no permitido. El disco origen es más grande.");
            }
        }
        this.contarMovimientos();
    }//GEN-LAST:event_A2ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        if (!PilaB.isEmpty()) {
            String disco = PilaB.peek();
            if (PilaC.isEmpty() || Integer.parseInt(disco) < Integer.parseInt(PilaC.peek())) {
                String ultimoElemento = PilaB.pop();
                PilaC.push(ultimoElemento);
                jblPila3.setText(PilaC.toString());
                jblPila2.setText(PilaB.toString());
                jblPila1.setText(PilaA.toString());

                if (PilaA.isEmpty() && PilaB.isEmpty()) {
                    JOptionPane.showMessageDialog(rootPane, "¡Felicidades, ganaste el juego!");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Movimiento no permitido. El disco origen es más grande.");
            }
        }
        this.contarMovimientos();
    }//GEN-LAST:event_C2ActionPerformed

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
        if (!PilaC.isEmpty()) {
            String disco = PilaC.peek();
            if (PilaA.isEmpty() || Integer.parseInt(disco) < Integer.parseInt(PilaA.peek())) {
                String ultimoElemento = PilaC.pop();
                PilaA.push(ultimoElemento);
                jblPila1.setText(PilaA.toString());
                jblPila3.setText(PilaC.toString());
                jblPila2.setText(PilaB.toString());
            } else {
                JOptionPane.showMessageDialog(rootPane, "Movimiento no permitido. El disco origen es más grande.");
            }
        }
        this.contarMovimientos();
    }//GEN-LAST:event_A3ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        if (!PilaC.isEmpty()) {
            String disco = PilaC.peek();
            if ((PilaB.isEmpty() || Integer.parseInt(disco) < Integer.parseInt(PilaB.peek()))) {
                String ultimoElemento = PilaC.pop();
                PilaB.push(ultimoElemento);
                jblPila2.setText(PilaB.toString());
                jblPila3.setText(PilaC.toString());
                jblPila1.setText(PilaA.toString());
            } else {
                JOptionPane.showMessageDialog(rootPane, "Movimiento no permitido. El disco origen es más grande.");
            }
        }
        this.contarMovimientos();
    }//GEN-LAST:event_B3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A2;
    private javax.swing.JButton A3;
    private javax.swing.JButton B1;
    private javax.swing.JButton B3;
    private javax.swing.JButton C1;
    private javax.swing.JButton C2;
    private javax.swing.JButton btnJugar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jblMovimientos;
    private javax.swing.JLabel jblPila1;
    private javax.swing.JLabel jblPila2;
    private javax.swing.JLabel jblPila3;
    // End of variables declaration//GEN-END:variables
}
