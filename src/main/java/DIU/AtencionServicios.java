/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package DIU;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class AtencionServicios extends javax.swing.JInternalFrame {

    
    private Queue<Integer> colaConsultas = new LinkedList<>();
    private Queue<Integer> colaCancelaciones = new LinkedList<>();
    private Queue<Integer> colaSolicitudSeguro = new LinkedList<>();
    private LinkedList<Integer> usuariosAtendidos = new LinkedList<>();
    private int numeroAtencion = 1;
    
    /**
     * Creates new form AtencionServicios
     */
    public AtencionServicios() {
        initComponents();
        initTableModels();
    }

    private void initTableModels() {
        tlbConsultar.setModel(new DefaultTableModel(new Object[][]{}, new String[]{"Número de atención"}));
        tblSolicitar.setModel(new DefaultTableModel(new Object[][]{}, new String[]{"Número de atención"}));
        tblCancelar.setModel(new DefaultTableModel(new Object[][]{}, new String[]{"Número de atención"}));
    }
    
      private void manejarAtencion(int tipoServicio, JTable jTable) {
        Queue<Integer> colaActual = seleccionarCola(tipoServicio);

        if (!colaActual.isEmpty()) {
            int numeroCliente = colaActual.poll();
            usuariosAtendidos.add(numeroCliente);
            actualizarTabla(jTable, numeroCliente);
        } else {
            lblIndicaciones.setText("No hay clientes en la cola de este servicio.");
        }
    }
      
       private void manejarLlegada(int tipoServicio) {
        switch (tipoServicio) {
            case 1:
                colaConsultas.offer(numeroAtencion);
                break;
            case 2:
                colaCancelaciones.offer(numeroAtencion);
                break;
            case 3:
                colaSolicitudSeguro.offer(numeroAtencion);
                break;
            default:
                lblIndicaciones.setText("Tipo de servicio no válido.");
                return;
        }

        lblIndicaciones.setText("Cliente llegado. Número de atención: " + numeroAtencion);
        numeroAtencion++;
    }

    private Queue<Integer> seleccionarCola(int tipoServicio) {
        switch (tipoServicio) {
            case 1 -> {
                return colaConsultas;
            }
            case 2 -> {
                return colaCancelaciones;
            }
            case 3 -> {
                return colaSolicitudSeguro;
            }
            default -> throw new IllegalArgumentException("Tipo de servicio no válido.");
        }
    }

    private void actualizarTabla(JTable jTable, int numeroCliente) {
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.addRow(new Object[]{numeroCliente});
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
        tlbConsultar = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSolicitar = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCancelar = new javax.swing.JTable();
        btnConsultar = new javax.swing.JButton();
        btnSolicitud = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblIndicaciones = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        tlbConsultar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane1.setViewportView(tlbConsultar);

        tblSolicitar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane2.setViewportView(tblSolicitar);

        tblCancelar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane3.setViewportView(tblCancelar);

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnSolicitud.setText("Solicitar ");
        btnSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitudActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel1.setText("Indicaciones ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(124, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnConsultar)
                        .addGap(134, 134, 134)
                        .addComponent(btnSolicitud)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addGap(138, 138, 138))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(lblIndicaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsultar)
                    .addComponent(btnSolicitud)
                    .addComponent(btnCancelar))
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblIndicaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitudActionPerformed
        // TODO add your handling code here:
        manejarLlegada(3);
    manejarAtencion(3, tblSolicitar);
    }//GEN-LAST:event_btnSolicitudActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        manejarLlegada(1); 
    manejarAtencion(1, tlbConsultar);
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        manejarLlegada(2);
        manejarAtencion(2, tblCancelar);
        
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnSolicitud;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblIndicaciones;
    private javax.swing.JTable tblCancelar;
    private javax.swing.JTable tblSolicitar;
    private javax.swing.JTable tlbConsultar;
    // End of variables declaration//GEN-END:variables
}
