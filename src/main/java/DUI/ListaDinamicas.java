/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package DUI;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pablo
 */
public class ListaDinamicas extends javax.swing.JInternalFrame {

    /**
     * Creates new form ListaDinamicas
     */
    public ListaDinamicas() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaPala = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPalabra1 = new javax.swing.JTextField();
        lblEstadoL = new javax.swing.JLabel();
        btnBuscarP = new javax.swing.JButton();
        txtVecesRepP = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnLimpiarTLis = new javax.swing.JButton();
        txtTamanioLista1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnAgregarAL = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
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

        tblListaPala.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lista Palabras"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblListaPala);

        jLabel2.setText("Veces que se repite la palabra:");

        jLabel3.setText("Tamaño de lista:");

        btnBuscarP.setText("Buscar Palabra");
        btnBuscarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingrese palabras separadas por coma.");

        btnLimpiarTLis.setText("Limpiar Tabla");
        btnLimpiarTLis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarTLisActionPerformed(evt);
            }
        });

        jLabel4.setText("La cantidad de palabras debe ser igual al tamanio de la lista. Utilizar el mismo tesxto para buscar");

        btnAgregarAL.setText("Agregar");
        btnAgregarAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarALActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(32, 32, 32)
                                .addComponent(txtTamanioLista1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(txtPalabra1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarAL)
                            .addComponent(btnBuscarP)
                            .addComponent(btnLimpiarTLis))
                        .addGap(87, 87, 87))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtVecesRepP, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                                .addComponent(lblEstadoL, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTamanioLista1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarAL))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnBuscarP))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPalabra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiarTLis))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(lblEstadoL, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtVecesRepP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(130, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formInternalFrameActivated

    private void btnBuscarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPActionPerformed
        String palabraBuscar = txtPalabra1.getText();
        int contRep = 0;

        DefaultTableModel modelo = (DefaultTableModel) tblListaPala.getModel();
        for (int i = 0; i < modelo.getRowCount(); i++) {
            String palabraTabla = modelo.getValueAt(i, 0).toString();
            if (palabraBuscar.equals(palabraTabla)) {
                contRep++;
            }
        }

        if (contRep > 0) {
            txtVecesRepP.setText("La palabra '" + palabraBuscar + "' se repite " + contRep + " veces.");
        } else {
            txtVecesRepP.setText("La palabra '" + palabraBuscar + "' no se encuentra en la tabla.");
        }
        txtPalabra1.setText("");
    }//GEN-LAST:event_btnBuscarPActionPerformed

    private void btnLimpiarTLisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarTLisActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tblListaPala.getModel();
        modelo.setRowCount(0);
        lblEstadoL.setText("");
    }//GEN-LAST:event_btnLimpiarTLisActionPerformed

    private void btnAgregarALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarALActionPerformed
      /*  DefaultTableModel modelo = (DefaultTableModel) tblListaPala.getModel();
        String palabra = txtPalabra1.getText();

        try {
            int tamanio = Integer.parseInt(txtTamanioLista1.getText());

            if (tamanio > 0) {
                if (!palabrasAcumuladas.contains(palabra)) {
                    palabrasAcumuladas += palabra + ",";

                    if (palabrasAcumuladas.split(",").length == tamanio) {
                        lblEstadoL.setText("La lista está llena");

                        String[] palabrasArray = palabrasAcumuladas.split(",");
                        for (String palabraActual : palabrasArray) {
                            modelo.addRow(new Object[]{palabraActual});
                        }

                        palabrasAcumuladas = "";
                        txtTamanioLista1.setText("");
                        txtPalabra1.setText("");
                    } else {
                        lblEstadoL.setText("Agregada palabra: " + palabra);
                    }
                } else {
                    lblEstadoL.setText("La palabra '" + palabra + "' ya está en la lista");
                }
            } else {
                lblEstadoL.setText("El tamaño de la lista debe ser mayor que 0");
            }
        } catch (NumberFormatException e) {
            lblEstadoL.setText("Ingrese un número válido para el tamaño");
        }
        txtPalabra1.setText("");*/
    }//GEN-LAST:event_btnAgregarALActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarAL;
    private javax.swing.JButton btnBuscarP;
    private javax.swing.JButton btnLimpiarTLis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEstadoL;
    private javax.swing.JTable tblListaPala;
    private javax.swing.JTextField txtPalabra1;
    private javax.swing.JTextField txtTamanioLista1;
    private javax.swing.JTextField txtVecesRepP;
    // End of variables declaration//GEN-END:variables
}
