/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package DIU.vista;

import DIU.modelo.Persona;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class ListasDinámicasTabla extends javax.swing.JInternalFrame {

    /**
     * Creates new form ListasDinámicasTabla
     */
    // ESTRUCTURA INFORMACIÓN
    ArrayList<Persona> listaNombres = new ArrayList<>();
    DefaultTableModel modelo = new DefaultTableModel();
    
    public ListasDinámicasTabla() {
        initComponents();
        setModelo();
    }
    private void setModelo() {
        String[] cabecera = {"Cedula","Nombres"};
        modelo.setColumnIdentifiers(cabecera);
        tbNombres.setModel(modelo);
        
    }
    
    private void llenarTabla() {
        String nombre = txtNombres.getText();
        Persona persona = new Persona(nombre);
        listaNombres.add(persona);
    }
    
    private void setDatos(){
        // ESTRUCTUTA INFORMACIÓN TABLA
        Object[] informacion = new Object[modelo.getColumnCount()];
        int contador = 1;
        for (Persona persona : listaNombres) {
          informacion[0] = contador;
          informacion[1] = persona.getNombre();
          contador ++;
          
        }
        modelo.addRow(informacion);
        tbNombres.setModel(modelo);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombres = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        lblNombres = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNombres = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        txtNombres.setBackground(new java.awt.Color(204, 255, 204));
        txtNombres.setForeground(new java.awt.Color(0, 0, 0));
        txtNombres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombresMouseClicked(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 204, 102));
        lblTitulo.setText("Practica Lista Dinámicas");

        lblNombres.setForeground(new java.awt.Color(0, 0, 0));
        lblNombres.setText("Ingresar nombres:");

        tbNombres.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbNombres);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(lblTitulo)
                                .addGap(60, 60, 60))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNombres)
                                .addGap(40, 40, 40)
                                .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombres)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombresMouseClicked
        // TODO add your handling code here:
        this.llenarTabla();
        this.setDatos();
        txtNombres.setText("");
    }//GEN-LAST:event_txtNombresMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tbNombres;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
