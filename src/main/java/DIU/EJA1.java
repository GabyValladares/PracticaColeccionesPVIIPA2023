/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package DIU;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 59398
 */
public class EJA1 extends javax.swing.JInternalFrame {

    /**
     */
    public EJA1() {
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

        jLabel1 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTablaNMA = new javax.swing.JTable();
        btnAgregarN = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTablaNLe = new javax.swing.JTable();
        btnLimpiarT = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        JTablaProm = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        JTablaSumT = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Arraylist 1");
        setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel1.setText("INGRESE UN NUMERO ");

        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });

        JTablaNMA.setBackground(new java.awt.Color(255, 0, 153));
        JTablaNMA.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        JTablaNMA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "# MAYORES"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTablaNMA);

        btnAgregarN.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        btnAgregarN.setText("Agregar Número");
        btnAgregarN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarNActionPerformed(evt);
            }
        });

        JTablaNLe.setBackground(new java.awt.Color(255, 102, 255));
        JTablaNLe.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        JTablaNLe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(JTablaNLe);

        btnLimpiarT.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        btnLimpiarT.setText("Limpiar tablas");
        btnLimpiarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarTActionPerformed(evt);
            }
        });

        JTablaProm.setBackground(new java.awt.Color(255, 0, 0));
        JTablaProm.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        JTablaProm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PROM"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(JTablaProm);

        JTablaSumT.setAutoCreateRowSorter(true);
        JTablaSumT.setBackground(new java.awt.Color(255, 0, 102));
        JTablaSumT.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        JTablaSumT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TOTAL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(JTablaSumT);

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel2.setText("OJO: Cuando se ingresa el numero -99 , se sumaran todos los numeros agregados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(124, 124, 124)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLimpiarT, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAgregarN, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(442, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(417, 417, 417)
                                .addComponent(txtNumero)))))
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnAgregarN, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnLimpiarT, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141)))
                .addComponent(jLabel2)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private ArrayList<Integer> lisnum = new ArrayList<>();
    int sum = 0;
    int prom = 0;
    private Object[] datos = new Object[1];
    private Object[] datos2 = new Object[1];
    private Object[] datos3 = new Object[1];
    private Object[] datos4 = new Object[1];
    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        
    }//GEN-LAST:event_txtNumeroActionPerformed
    
    private void btnAgregarNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarNActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) JTablaNMA.getModel();
        DefaultTableModel modelo2 = (DefaultTableModel) JTablaNLe.getModel();
        DefaultTableModel modelo3 = (DefaultTableModel) JTablaSumT.getModel();
        DefaultTableModel modelo4 = (DefaultTableModel) JTablaProm.getModel();

        try {
            int num = Integer.parseInt(txtNumero.getText());

            if (num == -99 && !lisnum.isEmpty()) {
                for (int numAc : lisnum) {
                    sum += numAc;
                }
                datos3[0] = String.valueOf(sum);
                modelo3.addRow(datos3);
                prom = sum / lisnum.size();
                datos4[0] = String.valueOf(prom);
                modelo4.addRow(datos4);
    
                for (int numAc : lisnum) {
                    datos[0] = numAc;
                    modelo2.addRow(datos);

                    if (numAc > prom) {
                        datos2[0] = numAc;
                        modelo.addRow(datos2);
                    }
                }

               lisnum.clear();
                sum = 0;
                prom = 0;
            } else {
                lisnum.add(num);
            }
        } catch (NumberFormatException e) {
            System.out.println("Por favor, ingrese un número válido.");
        }
        txtNumero.setText("");
    }//GEN-LAST:event_btnAgregarNActionPerformed

    private void btnLimpiarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarTActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) JTablaNLe.getModel();
        DefaultTableModel modelo2 = (DefaultTableModel) JTablaNMA.getModel();
        DefaultTableModel modelo3 = (DefaultTableModel) JTablaSumT.getModel();
        DefaultTableModel modelo4 = (DefaultTableModel) JTablaProm.getModel();
        modelo.setRowCount(0);
        modelo2.setRowCount(0);
        modelo3.setRowCount(0);
        modelo4.setRowCount(0);
        
    }//GEN-LAST:event_btnLimpiarTActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTablaNLe;
    private javax.swing.JTable JTablaNMA;
    private javax.swing.JTable JTablaProm;
    private javax.swing.JTable JTablaSumT;
    private javax.swing.JButton btnAgregarN;
    private javax.swing.JButton btnLimpiarT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
