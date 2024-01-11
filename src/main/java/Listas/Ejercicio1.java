/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Listas;

/**
 *
 * @author Usuario
 */
public class Ejercicio1 extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio1
     */
    public Ejercicio1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtResultado = new javax.swing.JTextField();
        lbnImprimir = new javax.swing.JButton();
        lblTamanio = new javax.swing.JLabel();
        lblPalabra = new javax.swing.JLabel();
        txtTamanio = new javax.swing.JTextField();
        txtPalabra = new javax.swing.JTextField();
        lbnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbnImprimir.setText("IMPRIMIR");
        lbnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbnImprimirActionPerformed(evt);
            }
        });

        lblTamanio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTamanio.setForeground(new java.awt.Color(204, 0, 51));
        lblTamanio.setText("Ingrese un tamaño");

        lblPalabra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPalabra.setForeground(new java.awt.Color(204, 0, 51));
        lblPalabra.setText("Ingrese una palabra");

        txtTamanio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTamanioActionPerformed(evt);
            }
        });

        lbnLimpiar.setText("LIMPIAR");
        lbnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPalabra)
                            .addComponent(lblTamanio))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTamanio, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(txtPalabra)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(lbnImprimir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(lbnLimpiar)
                .addGap(101, 101, 101))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(lblTamanio))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(txtTamanio, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPalabra)
                    .addComponent(txtPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbnImprimir)
                    .addComponent(lbnLimpiar))
                .addGap(72, 72, 72))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbnImprimirActionPerformed
        // TODO add your handling code here:
     // Parsear el tamaño del array
    int tamanio = Integer.parseInt(txtTamanio.getText());

    // Obtener la palabra ingresada
    String palabra = txtPalabra.getText();
  // Separar la palabra en palabras individuales
    String[] palabras = palabra.split(" ");

    // Crear un solo objeto lógico que almacene posiciones pares e impares
    StringBuilder resultado = new StringBuilder(" \n ");

    for (int i = 0; i < tamanio; i++) {
        if (i % 2 == 0) {
            // Posiciones pares
            resultado.append(" ").append(palabras[0]);
        } else {
            // Posiciones impares
            resultado.append(" ").append(palabras[1]);
        }
    }

    // Asignar el resultado al componente txtResultado
    txtResultado.setText(resultado.toString().trim());
    }//GEN-LAST:event_lbnImprimirActionPerformed

    private void txtTamanioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTamanioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTamanioActionPerformed

    private void lbnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbnLimpiarActionPerformed
        // TODO add your handling code here:
        txtPalabra.setText("");
       txtTamanio.setText("");
       txtResultado.setText("");
    }//GEN-LAST:event_lbnLimpiarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Ejercicio1().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblPalabra;
    private javax.swing.JLabel lblTamanio;
    private javax.swing.JButton lbnImprimir;
    private javax.swing.JButton lbnLimpiar;
    private javax.swing.JTextField txtPalabra;
    private javax.swing.JTextField txtResultado;
    private javax.swing.JTextField txtTamanio;
    // End of variables declaration//GEN-END:variables
}
