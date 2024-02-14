/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package DIU.vistas;

import DIU.controlador.ConexionBDD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER-HP
 */
public class TablaFichaVehicular extends javax.swing.JInternalFrame {

    public TablaFichaVehicular() {
        initComponents();
        mostrarTablaFichaVehcicular("");
    }
    ConexionBDD conexion = new ConexionBDD();
    //OBJETO 
    Connection conectado = (Connection) conexion.conectar();
    //DOWNCASTING
    PreparedStatement sesion;
    ResultSet res;
    Statement stmt;
    

    public void mostrarTablaFichaVehcicular(String cedula) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("NRO");
        modelo.addColumn("CÉDULA");
        modelo.addColumn("NOMBRE COMPLETO");
        modelo.addColumn("PLACA");
        modelo.addColumn("COLOR");
        modelo.addColumn("MARCA");
        modelo.addColumn("TIPO VEHÍCULO");
        modelo.addColumn("VALOR");

        PreparedStatement ps = null;
        ResultSet rs = null;

        String consulta;

        try {
            // Modificamos la consulta para filtrar por cédula usando la vistaDetalleVehiculos
            if (cedula.isEmpty()) {
                consulta = "SELECT * FROM vistaDetalleVehiculos";
                ps = conectado.prepareStatement(consulta);
            } else {
                consulta = "SELECT * FROM vistaDetalleVehiculos WHERE cedula LIKE ?";
                ps = conectado.prepareStatement(consulta);
                ps.setString(1, "%" + cedula + "%");
            }

            rs = ps.executeQuery();

            int cont = 0;
            while (rs.next()) {
                cont++;
                Object[] fila = new Object[8];
                fila[0] = cont;
                fila[1] = rs.getString("cedula");
                fila[2] = rs.getString("nombre_completo");
                fila[3] = rs.getString("placa");
                fila[4] = rs.getString("color");
                fila[5] = rs.getString("marca");
                fila[6] = rs.getString("tipoVehiculo");
                fila[7] = rs.getString("valor");
                modelo.addRow(fila);
            }

            // Asume que jtbVehiculos es tu JTable donde quieres mostrar los datos
            jtblVehiculo.setModel(modelo);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener datos de vehículos: " + e.getMessage());
        } finally {
            // Cierra los recursos
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar conexiones: " + e.getMessage());
            }
        }
    
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtblVehiculo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("TABLA FICHA VEHICULAR");
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
                formInternalFrameOpened(evt);
            }
        });

        jtblVehiculo.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtblVehiculo);

        jLabel1.setText("ingrese una cedula: ");

        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addGap(59, 59, 59)
                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated

    }//GEN-LAST:event_formInternalFrameActivated

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

    }//GEN-LAST:event_formInternalFrameOpened

    private void txtCedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyReleased
        mostrarTablaFichaVehcicular(txtCedula.getText());
    }//GEN-LAST:event_txtCedulaKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jtblVehiculo;
    public static javax.swing.JTextField txtCedula;
    // End of variables declaration//GEN-END:variables
}
