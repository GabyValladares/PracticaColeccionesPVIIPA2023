/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package DIU.COLECCIONES;

import DIU.COLECCIONES.ListaEstaNumeros;
import DIU.Menu;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tutut
 */
public class NumerosLista extends javax.swing.JInternalFrame {

    /**
     * Creates new form NumerosLista
     */
    DefaultTableModel tablaN=new DefaultTableModel();
    public NumerosLista() {
        initComponents();
        String[] identificadores={"1","2","3","4","5","6","7","8","9","10"};
        tablaN.setColumnIdentifiers(identificadores);
        tblTabla1.setModel(tablaN);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblMenor = new javax.swing.JLabel();
        lblMayor = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
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

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        jLabel2.setText("Número Menor:");

        tblTabla1.setBackground(new java.awt.Color(204, 204, 255));
        tblTabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Posicion 1", "Posicion 2", "Posicion 3", "Posicion 4", "Posicion 5", "Posicion 6", "Posicion 7", "Posicion 8", "Posicion 9", "Posicion 10"
            }
        ));
        jScrollPane1.setViewportView(tblTabla1);

        jLabel1.setText("Número Mayor:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lblMayor, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMenor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(lblMenor, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMayor, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Integer[] numeros = new Integer[10];
    int numeroMax=0;
    int numeroMin=0;
    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
        tablaN.addRow(new Integer[]{numeros[0],numeros[1],numeros[2],numeros[3],numeros[4],numeros[5],numeros[6],numeros[7],numeros[8],numeros[9]});
        tablaN.addRow(new Integer[]{numeros[9],numeros[8],numeros[7],numeros[6],numeros[5],numeros[4],numeros[3],numeros[2],numeros[1],numeros[0]});
        lblMayor.setText(String.valueOf(numeroMax));
        lblMenor.setText(String.valueOf(numeroMin));
    }//GEN-LAST:event_formInternalFrameActivated

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=0;
        }
        ListaEstaNumeros retorno=new ListaEstaNumeros();
        Menu.escritorio.add(retorno);
        retorno.setVisible(true);
    }//GEN-LAST:event_formInternalFrameClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMayor;
    private javax.swing.JLabel lblMenor;
    private javax.swing.JTable tblTabla1;
    // End of variables declaration//GEN-END:variables
}