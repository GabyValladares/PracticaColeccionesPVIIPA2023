/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package DIU;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class ListasEstaticas extends javax.swing.JInternalFrame {

    ArrayList<Cadenas> listaCadenas=new ArrayList<>();
    DefaultTableModel modelo = new DefaultTableModel();            
    /**
     * Creates new form ListasEstaticas
     */
    public ListasEstaticas() {
        initComponents();
        setModelo();
    }

    private void setModelo(){
        String cabecera[]={"Nro.","Cadena"};
        modelo.setColumnIdentifiers(cabecera);
        tblCadenas.setModel(modelo);
    }
    
    private void llenarCadenas(){
        String cadena=txtValor.getText();
        Cadenas c1=new Cadenas(cadena);
        listaCadenas.add(c1);
        for (Cadenas listaCadena : listaCadenas) {
            System.out.println("----"+listaCadena.getCadena());
        }
    }
    
    private void setDatos(){
        Object[]datos=new Object[modelo.getColumnCount()];
        int i=1;
        modelo.setRowCount(0);
        for (Cadenas cadena : listaCadenas) {
            datos[0]=i;
            datos[1]=cadena.getCadena();
            modelo.addRow(datos);
            txtValor.setText("");
            i++;
        }
         tblCadenas.setModel(modelo);}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblValor = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        btnAEj1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCadenas = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("EJERCICIOS CON ARRAYS []");

        lblValor.setText("Ingrese un valor:");

        txtValor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtValorMouseClicked(evt);
            }
        });
        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtValorKeyPressed(evt);
            }
        });

        btnAEj1.setText("Ejercicio1");
        btnAEj1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAEj1ActionPerformed(evt);
            }
        });

        jLabel1.setText("PRÁCTICA COLECCIONES");

        tblCadenas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Cadenas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblCadenas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(166, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(160, 160, 160)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(lblValor)
                            .addGap(18, 18, 18)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnAEj1))
                    .addContainerGap(188, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(103, 103, 103)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblValor)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(btnAEj1)
                    .addContainerGap(338, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtValorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtValorMouseClicked
       
    }//GEN-LAST:event_txtValorMouseClicked

    private void txtValorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtValorKeyPressed

    private void btnAEj1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAEj1ActionPerformed
           this.llenarCadenas();
           this.setDatos();

    }//GEN-LAST:event_btnAEj1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAEj1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTable tblCadenas;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
