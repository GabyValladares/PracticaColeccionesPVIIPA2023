/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package DIU.Vista;

import DIU.Controlador.PersonaControlador;
import DIU.Controlador.VehiculoControlador;
import DIU.Modelo.PersonaModel;
import DIU.Modelo.Vehiculo;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kevin
 */
public class VehiculosPropietario extends javax.swing.JInternalFrame {

    public String Cedula;
    ArrayList<Vehiculo> ListaPersonaModelo = new ArrayList<>();
    DefaultTableModel modelo = new DefaultTableModel();

    public VehiculosPropietario() {
        initComponents();
        setModelo();
    }

    public void setModelo() {
        String[] cabecera = {"Nro.", "Placa", "Color", "Marca", "Tipo", "Valor"};
        modelo.setColumnIdentifiers(cabecera);
        tbVehiculo.setModel(modelo);
    }

    private void setDatos() {
        // ESTRUCTURA INFORMACIÓN TABLA
        Object[] filas = new Object[modelo.getColumnCount()];
        int contador = 1;
        for (Vehiculo datos : ListaPersonaModelo) {
            filas[0] = contador;
            filas[1] = datos.getPlacas();
            filas[2] = datos.getColor();
            filas[3] = datos.getMarca();
            filas[4] = datos.getTipo();
            filas[5] = datos.getValor();
            modelo.addRow(filas);

            contador++;
        }
        tbVehiculo.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbVehiculo = new javax.swing.JTable();
        jblCedula = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
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

        tbVehiculo.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbVehiculo);

        jblCedula.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N

        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jblCedula, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jblCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(239, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jblCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void limpiarTabla() {
        modelo.setDataVector(null, new Object[]{"Nro.", "Placa", "Color", "Marca", "Tipo", "Valor"});
    }
    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        this.limpiarTabla();
        VehiculoControlador pC = new VehiculoControlador();
        ArrayList<Object[]> lista = pC.datosVehiculo(Cedula);
        for (Object[] filas : lista) {
            modelo.addRow(filas);
        }
        jblCedula.setText(Cedula);
    }//GEN-LAST:event_formInternalFrameActivated


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jblCedula;
    private javax.swing.JTable tbVehiculo;
    // End of variables declaration//GEN-END:variables
}
