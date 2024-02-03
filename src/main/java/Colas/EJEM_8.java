/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Colas;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class EJEM_8 extends javax.swing.JInternalFrame {

    /**
     * Creates new form EJEM_8
     */
    public EJEM_8() {
        initComponents();
        modeloTabla();
        Tablacancelar();
        Tablasolicitud();
        atendidos();
    }     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrupo = new javax.swing.ButtonGroup();
        btngrupo2 = new javax.swing.ButtonGroup();
        btniniciar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RBconsulta = new javax.swing.JRadioButton();
        RBcancelar = new javax.swing.JRadioButton();
        RBsolicitudes = new javax.swing.JRadioButton();
        txtnumero = new javax.swing.JTextField();
        RBatencion = new javax.swing.JRadioButton();
        RBllegada = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBatendidos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TBcancelar = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TBconsulta = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TBsolicitud1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        btniniciar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btniniciar.setText("Enviar");
        btniniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniniciarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setText("Ingreso del pasiente");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setText("N° de atencion ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel3.setText("Atencion");

        btngrupo2.add(RBconsulta);
        RBconsulta.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        RBconsulta.setText("consultas");
        RBconsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBconsultaActionPerformed(evt);
            }
        });

        btngrupo2.add(RBcancelar);
        RBcancelar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        RBcancelar.setText("Cancelar");
        RBcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBcancelarActionPerformed(evt);
            }
        });

        btngrupo2.add(RBsolicitudes);
        RBsolicitudes.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        RBsolicitudes.setText("Solicitudes");

        txtnumero.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N

        btngrupo.add(RBatencion);
        RBatencion.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        RBatencion.setText("atencion");

        btngrupo.add(RBllegada);
        RBllegada.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        RBllegada.setText("llegada");

        TBatendidos.setBackground(new java.awt.Color(204, 255, 255));
        TBatendidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "usuarios atendidos"
            }
        ));
        jScrollPane1.setViewportView(TBatendidos);

        TBcancelar.setBackground(new java.awt.Color(204, 255, 255));
        TBcancelar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Cancelaciones"
            }
        ));
        jScrollPane2.setViewportView(TBcancelar);

        TBconsulta.setBackground(new java.awt.Color(204, 255, 255));
        TBconsulta.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        TBconsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Consultas"
            }
        ));
        jScrollPane3.setViewportView(TBconsulta);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel4.setText("Ingresar o despachar clientes :");

        TBsolicitud1.setBackground(new java.awt.Color(204, 255, 255));
        TBsolicitud1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Solicitudes"
            }
        ));
        jScrollPane4.setViewportView(TBsolicitud1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(34, 34, 34)
                                .addComponent(RBllegada))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel3)
                                .addGap(62, 62, 62)
                                .addComponent(RBatencion))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RBconsulta)
                                    .addComponent(RBcancelar)
                                    .addComponent(RBsolicitudes))
                                .addGap(146, 146, 146)
                                .addComponent(btniniciar))
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(RBllegada))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(RBatencion))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addComponent(jLabel4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(btniniciar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(RBconsulta)
                                .addGap(18, 18, 18)
                                .addComponent(RBcancelar)
                                .addGap(18, 18, 18)
                                .addComponent(RBsolicitudes)))))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     Queue<Integer> colaConsultas = new LinkedList<>();
    Queue<Integer> colaCancelaciones = new LinkedList<>();
    Queue<Integer> colaSolicitudes = new LinkedList<>();
    ArrayList<Integer> usuariosAtendidos = new ArrayList<>();
    DefaultTableModel modelo = new DefaultTableModel();

    public void modeloTabla() {
        String[] Consul = {"Consultas"};
        modelo.setColumnIdentifiers(Consul);
        TBconsulta.setModel(modelo);
    }
    DefaultTableModel modelo1 = new DefaultTableModel();

    public void Tablacancelar() {
        String[] Cancelar = {"Cancelaciones"};
        modelo1.setColumnIdentifiers(Cancelar);
        TBcancelar.setModel(modelo1);
    }
    DefaultTableModel modelo2 = new DefaultTableModel();

    public void Tablasolicitud() {
        String[] soli = {"Solicitudes"};
        modelo2.setColumnIdentifiers(soli);
        TBsolicitud1.setModel(modelo2);
    }
    DefaultTableModel modelo3 = new DefaultTableModel();

    public void atendidos() {
        String[] atender = {"Usuarios atendidos"};
        modelo3.setColumnIdentifiers(atender);
        TBatendidos.setModel(modelo3);
    }
    private void btniniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniniciarActionPerformed
            if (RBllegada.isSelected()) {
            // Simular llegada de un cliente
            int numeroAtencion = asignarNumeroAtencion();
            if (numeroAtencion != -1) {
                agregarNumeroATabla(numeroAtencion, obtenerTablaSeleccionada());
                actualizarTablas();
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, seleccione un servicio antes de la llegada.");
            }
        } else if (RBatencion.isSelected()) {
            // Atender a un cliente
            int numeroServicio = Integer.parseInt(txtnumero.getText());
            atenderCliente(numeroServicio);
            actualizarTablas();
        }
        txtnumero.setText("");
    }//GEN-LAST:event_btniniciarActionPerformed
   
     private int numeroConsulta = 1;
private int numeroCancelacion = 1;
private int numeroSolicitud = 1;

private int asignarNumeroAtencion() {
    if (RBconsulta.isSelected() || RBcancelar.isSelected() || RBsolicitudes.isSelected()) {
        int numeroAtencion;

        if (RBconsulta.isSelected()) {
            numeroAtencion = numeroConsulta++;
            colaConsultas.offer(numeroAtencion);
        } else if (RBcancelar.isSelected()) {
            numeroAtencion = numeroCancelacion++;
            colaCancelaciones.offer(numeroAtencion);
            System.out.println("Cola de cancelaciones: " + colaCancelaciones);
        } else if (RBsolicitudes.isSelected()) {
            numeroAtencion = numeroSolicitud++;
            colaSolicitudes.offer(numeroAtencion);
            System.out.println("Cola de solicitudes: " + colaSolicitudes);
        } else {
            return -1; // Manejar caso no seleccionado
        }

        usuariosAtendidos.add(numeroAtencion);
        return numeroAtencion;
    }
    return -1; // Manejar caso no seleccionado
}


    private void atenderCliente(int numeroServicio) {
        // Lógica para atender a un cliente y agregarlo a la lista de usuarios atendidos
        if (colaConsultas.contains(numeroServicio)) {
            usuariosAtendidos.add(numeroServicio);
            colaConsultas.remove(numeroServicio);
            JOptionPane.showMessageDialog(this, "Atendiendo consulta: " + numeroServicio);
        } else if (colaCancelaciones.contains(numeroServicio)) {
            usuariosAtendidos.add(numeroServicio);
            colaCancelaciones.remove(numeroServicio);
            JOptionPane.showMessageDialog(this, "Cancelando...: " + numeroServicio);
        } else if (colaSolicitudes.contains(numeroServicio)) {
            usuariosAtendidos.add(numeroServicio);
            colaSolicitudes.remove(numeroServicio);
            JOptionPane.showMessageDialog(this, "Atendiendo solicitud: " + numeroServicio);
        } else {
            JOptionPane.showMessageDialog(this, "El número de servicio no existe en ninguna cola.");
        }
    }

    private void agregarNumeroATabla(int numero, JTable tabla) {
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        // Agregar el número de atención al principio de la tabla
        model.insertRow(0, new Object[]{numero});
    }

    private void actualizarTablas() {
        // Actualizar las tablas con los datos de las colas y usuarios atendidos
        actualizarTablaDesdeCola(colaConsultas, TBconsulta);
        actualizarTablaDesdeCola(colaCancelaciones, TBcancelar);
        actualizarTablaDesdeCola(colaSolicitudes, TBsolicitud1);
        actualizarTablaDesdeLista(usuariosAtendidos, TBatendidos);
    }

    private void actualizarTablaDesdeCola(Queue<Integer> cola, JTable tabla) {
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        model.setRowCount(0); // Limpiar la tabla antes de actualizar
        for (Integer numero : cola) {
            model.addRow(new Object[]{numero});
        }
    }
    private void actualizarTablaDesdeLista(ArrayList<Integer> lista, JTable tabla) {
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        model.setRowCount(0); // Limpiar la tabla antes de actualizar
        // Agregar la lista completa de usuarios atendidos
        for (Integer numero : usuariosAtendidos) {
            model.addRow(new Object[]{numero});
        }
    }
    private JTable obtenerTablaSeleccionada() {
        if (RBconsulta.isSelected()) {
            return TBconsulta;
        } else if (RBcancelar.isSelected()) {
            return TBcancelar;
        } else if (RBsolicitudes.isSelected()) {
            return TBsolicitud1;
        } else {
            return TBatendidos;
        }
    }


    private void RBconsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBconsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBconsultaActionPerformed

    private void RBcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBcancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBcancelarActionPerformed
// Método para simular la llegada de un cliente y asignarle un número de atención
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RBatencion;
    private javax.swing.JRadioButton RBcancelar;
    private javax.swing.JRadioButton RBconsulta;
    private javax.swing.JRadioButton RBllegada;
    private javax.swing.JRadioButton RBsolicitudes;
    private javax.swing.JTable TBatendidos;
    private javax.swing.JTable TBcancelar;
    private javax.swing.JTable TBconsulta;
    private javax.swing.JTable TBsolicitud1;
    private javax.swing.ButtonGroup btngrupo;
    private javax.swing.ButtonGroup btngrupo2;
    private javax.swing.JButton btniniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField txtnumero;
    // End of variables declaration//GEN-END:variables
}
