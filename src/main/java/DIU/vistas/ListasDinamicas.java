/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package DIU.vistas;

import DIU.modelo.PersonaLD;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ListasDinamicas extends javax.swing.JInternalFrame {
    ArrayList<PersonaLD> listaNombres=new ArrayList<>();
   
    public ListasDinamicas() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombres = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAResultado = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("LISTAS DINÁMICAS");

        lblNombres.setText("INGRESAR NOMBRES:");

        txtNombres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombresMouseClicked(evt);
            }
        });

        txtAResultado.setColumns(20);
        txtAResultado.setRows(5);
        jScrollPane1.setViewportView(txtAResultado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombres)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(209, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombres)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(207, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombresMouseClicked
       String nombres=txtNombres.getText();
       //INSTANCIA DEL OBJETO PERSONA
       PersonaLD persona=new PersonaLD(nombres);
       listaNombres.add(persona);
       txtNombres.setText("");
       txtAResultado.setText("");
        for (PersonaLD listaNombre : listaNombres) {
            txtAResultado.append(listaNombre.getNombre()+"\n");
        }
       
    }//GEN-LAST:event_txtNombresMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JTextArea txtAResultado;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
