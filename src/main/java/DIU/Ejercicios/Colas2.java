/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package DIU.Ejercicios;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author carlo
 */
public class Colas2 extends javax.swing.JInternalFrame {

    private Queue<Integer> consultasQueue = new LinkedList<>();
    private Queue<Integer> cancelacionesQueue = new LinkedList<>();
    private Queue<Integer> solicitudesQueue = new LinkedList<>();
    private ArrayList usuAtend = new ArrayList();
    private int numeroAtencionConsultas = 1;
    private int numeroAtencionCancelaciones = 1;
    private int numeroAtencionSolicitudes = 1;
    public Colas2() {
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

        bgIngresoDatos = new javax.swing.ButtonGroup();
        bgColas = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblConsul = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCanselaciones = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblSolicitudes = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblUsuAtendidos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rbtAtencion = new javax.swing.JRadioButton();
        rbtLlegada = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        txtNumeroA = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        rbtConsulta = new javax.swing.JRadioButton();
        rbtSolicitudes = new javax.swing.JRadioButton();
        rbtCancelacion = new javax.swing.JRadioButton();
        btnEnviar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Colas 2");
        setToolTipText("");

        tblConsul.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Consultas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblConsul);

        tblCanselaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cancelaciones"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblCanselaciones);

        tblSolicitudes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Solicitudes"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblSolicitudes);

        tblUsuAtendidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuarios Atendidos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblUsuAtendidos);

        jLabel1.setText("Llegada de pasiente:");

        jLabel3.setText("Atención:");

        bgIngresoDatos.add(rbtAtencion);
        rbtAtencion.setText("ATENCIÓN");

        bgIngresoDatos.add(rbtLlegada);
        rbtLlegada.setText("LLEGADA");

        jLabel4.setText("N° de atención:");

        jLabel2.setText("Colas (Ingresar clientes o despachar cientes de colas):");

        bgColas.add(rbtConsulta);
        rbtConsulta.setText("Consultas");

        bgColas.add(rbtSolicitudes);
        rbtSolicitudes.setText("Solicitudes");

        bgColas.add(rbtCancelacion);
        rbtCancelacion.setText("Cancelaciones");

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(rbtSolicitudes)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(rbtLlegada)
                            .addComponent(rbtConsulta)
                            .addComponent(rbtCancelacion))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEnviar)
                            .addComponent(jLabel3)
                            .addComponent(rbtAtencion)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtNumeroA, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtAtencion)
                            .addComponent(rbtLlegada))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumeroA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(rbtConsulta)
                                .addGap(9, 9, 9)
                                .addComponent(rbtCancelacion))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(btnEnviar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtSolicitudes))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        if (rbtLlegada.isSelected()) {
            if (rbtConsulta.isSelected() || rbtCancelacion.isSelected() || rbtSolicitudes.isSelected()) {
                int numeroCliente = 0;

                if (rbtConsulta.isSelected()) {
                    numeroCliente = numeroAtencionConsultas++;
                    consultasQueue.add(numeroCliente);
                } else if (rbtCancelacion.isSelected()) {
                    numeroCliente = numeroAtencionCancelaciones++;
                    cancelacionesQueue.add(numeroCliente);
                } else if (rbtSolicitudes.isSelected()) {
                    numeroCliente = numeroAtencionSolicitudes++;
                    solicitudesQueue.add(numeroCliente);
                }

            } else {
                JOptionPane.showMessageDialog(this, "Debe seleccionar una cola para la llegada del cliente.");
            }
        } else if (rbtAtencion.isSelected()) {
            if (rbtConsulta.isSelected() || rbtCancelacion.isSelected() || rbtSolicitudes.isSelected()) {
                try {
                    int numeroAtendido = Integer.parseInt(txtNumeroA.getText());

                    if (rbtConsulta.isSelected() && consultasQueue.peek() != null && consultasQueue.peek() == numeroAtendido) {
                        consultasQueue.poll();
                        usuAtend.add(numeroAtendido);
                    } else if (rbtCancelacion.isSelected() && cancelacionesQueue.peek() != null && cancelacionesQueue.peek() == numeroAtendido) {
                        cancelacionesQueue.poll();
                        usuAtend.add(numeroAtendido);
                    } else if (rbtSolicitudes.isSelected() && solicitudesQueue.peek() != null && solicitudesQueue.peek() == numeroAtendido) {
                        solicitudesQueue.poll();
                        usuAtend.add(numeroAtendido);
                    } else {
                        JOptionPane.showMessageDialog(this, "El número de atención no coincide con el primero de la cola seleccionada.");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Debe ingresar un número de atención válido.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Debe seleccionar una cola para la atención del cliente.");
            }
        }

        actualizarTabla(tblConsul, consultasQueue);
        actualizarTabla(tblCanselaciones, cancelacionesQueue);
        actualizarTabla(tblSolicitudes, solicitudesQueue);
        actualizarTablaUsuariosAtendidos();
    }//GEN-LAST:event_btnEnviarActionPerformed
    private void actualizarTabla(javax.swing.JTable tabla, Queue<Integer> cola) {
        
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        model.setRowCount(0);

        
        for (Integer numero : cola) {
            model.addRow(new Object[]{numero});
        }
    }
    private void actualizarTablaUsuariosAtendidos() {
        DefaultTableModel model = (DefaultTableModel) tblUsuAtendidos.getModel();
        model.setRowCount(0);

        for (Object numero : usuAtend) {
            model.addRow(new Object[]{numero});
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgColas;
    private javax.swing.ButtonGroup bgIngresoDatos;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JRadioButton rbtAtencion;
    private javax.swing.JRadioButton rbtCancelacion;
    private javax.swing.JRadioButton rbtConsulta;
    private javax.swing.JRadioButton rbtLlegada;
    private javax.swing.JRadioButton rbtSolicitudes;
    private javax.swing.JTable tblCanselaciones;
    private javax.swing.JTable tblConsul;
    private javax.swing.JTable tblSolicitudes;
    private javax.swing.JTable tblUsuAtendidos;
    private javax.swing.JTextField txtNumeroA;
    // End of variables declaration//GEN-END:variables
}
