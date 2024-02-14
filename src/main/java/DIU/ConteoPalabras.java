/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package DIU;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class ConteoPalabras extends javax.swing.JInternalFrame {
    
    DefaultTableModel tablaR = new DefaultTableModel();
    private ArrayList<String> listaPalabras = new ArrayList<>();

    /**
     * Creates new form ConteoPalabras
     */
    public ConteoPalabras() {
        initComponents();
        
        String identficadores [] = {"Lista","Conteo"};
        
        tablaR.setColumnIdentifiers(identficadores);
        jTable1.setModel(tablaR);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtListaP = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnContar = new javax.swing.JButton();
        lblMensaje = new javax.swing.JLabel();
        lblNumCantidad = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingresar lista:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnContar.setText("Contar");
        btnContar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtListaP)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnAgregar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                    .addComponent(btnContar))
                                .addComponent(lblMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(61, 61, 61)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtListaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnContar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNumCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        
        String nuevaP = txtListaP.getText();
        
        if(!nuevaP.isEmpty()){
          listaPalabras.add(nuevaP);
          tablaR.addRow(new Object[]{nuevaP});
          lblMensaje.setForeground(Color.GREEN);
          lblMensaje.setText("Palabra agregada correctamente");
          txtListaP.setText("");
        }else{
          lblMensaje.setText("Texto vacio, no se agrego la palabra");
        }
        
 
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnContarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContarActionPerformed
        // TODO add your handling code here:
       
       int cont = 0;
       DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
       
        int filaSeleccionada = jTable1.getSelectedRow();
        
        if (filaSeleccionada != -1) {
            Object valorCelda = modelo.getValueAt(filaSeleccionada, 0);
            String palabraSeleccionada = valorCelda.toString();
            
            for (String palabra : listaPalabras) {
                if (palabra.equalsIgnoreCase(palabraSeleccionada)) {
                    cont++;
                }
            }
        }
        
        
        tablaR.setValueAt(cont,jTable1.getSelectedRow(),1);
    }//GEN-LAST:event_btnContarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnContar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblNumCantidad;
    private javax.swing.JTextField txtListaP;
    // End of variables declaration//GEN-END:variables
}