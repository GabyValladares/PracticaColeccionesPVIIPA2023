/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package DIU;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class SistemaAtencionClientes extends javax.swing.JInternalFrame {

    /**
     * Creates new form SistemaAtencionClientes
     */
    private Queue<Cliente> colaConsultas;
    private Queue<Cliente> colaCancelaciones;
    private Queue<Cliente> colaNuevoSeguro;
    private LinkedList<Cliente> clientesAtendidos;

    public SistemaAtencionClientes() {
        initComponents();
        colaConsultas = new LinkedList<>();
        colaCancelaciones = new LinkedList<>();
        colaNuevoSeguro = new LinkedList<>();
        clientesAtendidos = new LinkedList<>();
    }

    private void generarNumeroAtencion(String tipoAtencion) {
        int numeroAtencion = 0;

        switch (tipoAtencion) {
            case "Consultas":
                numeroAtencion = colaConsultas.size() + 1;
                colaConsultas.offer(new Cliente(numeroAtencion, tipoAtencion));
                break;
            case "Cancelaciones":
                numeroAtencion = colaCancelaciones.size() + 1;
                colaCancelaciones.offer(new Cliente(numeroAtencion, tipoAtencion));
                break;
            case "Solicitar seguro":
                numeroAtencion = colaNuevoSeguro.size() + 1;
                colaNuevoSeguro.offer(new Cliente(numeroAtencion, tipoAtencion));
                break;
            default:
                break;
        }

        // Actualizar las tablas en la GUI
        actualizarTablas();
    }

    private void actualizarTablas() {
        // Actualizar tblConsultas
        DefaultTableModel modeloConsultas = (DefaultTableModel) tblConsultas.getModel();
        modeloConsultas.setRowCount(0); // Limpiar la tabla

        for (Cliente cliente : colaConsultas) {
            modeloConsultas.addRow(new Object[]{cliente.getNumeroAtencion()});
        }

        // Actualizar tblCancelaciones
        DefaultTableModel modeloCancelaciones = (DefaultTableModel) tblCancelaciones.getModel();
        modeloCancelaciones.setRowCount(0);

        for (Cliente cliente : colaCancelaciones) {
            modeloCancelaciones.addRow(new Object[]{cliente.getNumeroAtencion()});
        }

        // Actualizar tblNuevoSeguro
        DefaultTableModel modeloNuevoSeguro = (DefaultTableModel) tblNuevoSeguro.getModel();
        modeloNuevoSeguro.setRowCount(0);

        for (Cliente cliente : colaNuevoSeguro) {
            modeloNuevoSeguro.addRow(new Object[]{cliente.getNumeroAtencion()});
        }
    }

    private void actualizarClientesAtendidos() {
        // Actualizar tblClientesAtendidos
        DefaultTableModel modeloClientesAtendidos = (DefaultTableModel) tblClientesAtendidos.getModel();
        modeloClientesAtendidos.setRowCount(0);

        for (Cliente cliente : clientesAtendidos) {
            modeloClientesAtendidos.addRow(new Object[]{cliente.getNumeroAtencion(), cliente.getTipoAtencion()});
        }
    }

    private void atenderCliente(String numeroAtencion) {
    // Validar el formato de la entrada
    if (!numeroAtencion.matches("^Atención \\d+$")) {
        // Manejar el formato incorrecto, mostrar un mensaje, etc.
        JOptionPane.showMessageDialog(this, "Formato de atención incorrecto. Debe ser 'Atención [número]'.", "Error de formato", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Extraer el tipo y el número del texto ingresado
    String[] partes = numeroAtencion.split(" ");

    if (partes.length != 2) {
        // Manejar el formato incorrecto, mostrar un mensaje, etc.
        JOptionPane.showMessageDialog(this, "Formato de atención incorrecto. Debe ser 'Atención [número]'.", "Error de formato", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String tipo = partes[0];
    int numero;

    try {
        numero = Integer.parseInt(partes[1]);
    } catch (NumberFormatException e) {
        // Manejar el error de conversión a número, mostrar un mensaje, etc.
        JOptionPane.showMessageDialog(this, "Número de atención no válido.", "Error de número", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Atender al cliente según el tipo
    if (tipo.equals("Atención")) {
        Cliente cliente = null;

        switch (cbxTipoAtencion.getSelectedItem().toString()) {
            case "Consultas":
                cliente = atenderClienteEnCola(colaConsultas, numero);
                break;
            case "Cancelaciones":
                cliente = atenderClienteEnCola(colaCancelaciones, numero);
                break;
            case "Solicitar seguro":
                cliente = atenderClienteEnCola(colaNuevoSeguro, numero);
                break;
            default:
                break;
        }

        if (cliente != null) {
            // Mostrar el cliente con su tipo en la tabla de clientes atendidos
            DefaultTableModel modeloClientesAtendidos = (DefaultTableModel) tblClientesAtendidos.getModel();
            modeloClientesAtendidos.addRow(new Object[]{cliente.getNumeroAtencion(), cliente.getTipoAtencion()});

            // Actualizar la lista de clientes atendidos en el GUI
            clientesAtendidos.add(cliente);
            actualizarClientesAtendidos();
        }
    }
}


    private Cliente atenderClienteEnCola(Queue<Cliente> cola, int numero) {
        for (Cliente cliente : cola) {
            if (cliente.getNumeroAtencion() == numero) {
                cola.remove(cliente);
                return cliente;
            }
        }
        return null;
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
        lblTipoAtencion = new javax.swing.JLabel();
        cbxTipoAtencion = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblConsultas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCancelaciones = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblNuevoSeguro = new javax.swing.JTable();
        lblConsultas = new javax.swing.JLabel();
        lblCancelaciones = new javax.swing.JLabel();
        lblSolicitud = new javax.swing.JLabel();
        lblGenerarNumeroAtencion = new javax.swing.JLabel();
        txtGenerarNumeroAtencion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAtenderCliente = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblClientesAtendidos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("EJERCICIO 8 COLAS");

        jLabel1.setText("SISTEMA DE ATENCIÓN AL CLIENTE");

        lblTipoAtencion.setText("Ingrese el tipo de atencion a tratar:");

        cbxTipoAtencion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Consultas", "Cancelaciones", "Solicitar seguro" }));

        tblConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CONSULTAS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblConsultas);
        if (tblConsultas.getColumnModel().getColumnCount() > 0) {
            tblConsultas.getColumnModel().getColumn(0).setResizable(false);
        }

        tblCancelaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CANCELACIONES"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblCancelaciones);
        if (tblCancelaciones.getColumnModel().getColumnCount() > 0) {
            tblCancelaciones.getColumnModel().getColumn(0).setResizable(false);
        }

        tblNuevoSeguro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SOLICITUD DE  UN NUEVO SEGURO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblNuevoSeguro);
        if (tblNuevoSeguro.getColumnModel().getColumnCount() > 0) {
            tblNuevoSeguro.getColumnModel().getColumn(0).setResizable(false);
        }

        lblConsultas.setText("CONSULTAS");

        lblCancelaciones.setText("CANCELACIONES");

        lblSolicitud.setText("SOLICITUD DE  UN NUEVO SEGURO");

        lblGenerarNumeroAtencion.setText("Generar número atención ingrese la palabea LLEGADA:");

        txtGenerarNumeroAtencion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenerarNumeroAtencionActionPerformed(evt);
            }
        });

        jLabel2.setText("Para atender a un cliente ingrese con la palabra ATENCIÓN y el número de servicio:");

        txtAtenderCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAtenderClienteActionPerformed(evt);
            }
        });

        tblClientesAtendidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane4.setViewportView(tblClientesAtendidos);

        jLabel3.setText("Registro de clientes atendidos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(lblTipoAtencion)
                                .addGap(18, 18, 18)
                                .addComponent(cbxTipoAtencion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(66, 66, 66)
                                                .addComponent(lblConsultas)
                                                .addGap(156, 156, 156))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(93, 93, 93)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(lblCancelaciones)
                                                .addGap(105, 105, 105)
                                                .addComponent(lblSolicitud)
                                                .addGap(21, 21, 21))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(40, 40, 40)
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(lblGenerarNumeroAtencion)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtGenerarNumeroAtencion, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(269, 269, 269))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtAtenderCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addGap(106, 106, 106))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel3)
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTipoAtencion)
                            .addComponent(cbxTipoAtencion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGenerarNumeroAtencion)
                            .addComponent(txtGenerarNumeroAtencion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblConsultas)
                            .addComponent(lblCancelaciones)
                            .addComponent(lblSolicitud))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtAtenderCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtGenerarNumeroAtencionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenerarNumeroAtencionActionPerformed
        // TODO add your handling code here:
        String tipoAtencion = cbxTipoAtencion.getSelectedItem().toString();
        generarNumeroAtencion(tipoAtencion);
    }//GEN-LAST:event_txtGenerarNumeroAtencionActionPerformed

    private void txtAtenderClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAtenderClienteActionPerformed
        // TODO add your handling code here:
        String numeroAtencion = txtAtenderCliente.getText();
        atenderCliente(numeroAtencion);
    }//GEN-LAST:event_txtAtenderClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxTipoAtencion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblCancelaciones;
    private javax.swing.JLabel lblConsultas;
    private javax.swing.JLabel lblGenerarNumeroAtencion;
    private javax.swing.JLabel lblSolicitud;
    private javax.swing.JLabel lblTipoAtencion;
    private javax.swing.JTable tblCancelaciones;
    private javax.swing.JTable tblClientesAtendidos;
    private javax.swing.JTable tblConsultas;
    private javax.swing.JTable tblNuevoSeguro;
    private javax.swing.JTextField txtAtenderCliente;
    private javax.swing.JTextField txtGenerarNumeroAtencion;
    // End of variables declaration//GEN-END:variables
}
