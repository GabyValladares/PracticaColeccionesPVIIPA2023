/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package DIU;

import DIU.controlador.VehiculoController;
import DIUmodelo.VehiculoM;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 *  @author HP
 */
public class ReporteValorPagar extends javax.swing.JInternalFrame {
public String nombre,cedula,placa,marca,color,valor,multas,tipo,añoFabricacion;
    /**
     * Creates new form ReporteValorPagar
     */
 ArrayList<VehiculoM> lista=new ArrayList<>();
       DefaultTableModel modelo=new DefaultTableModel();
     
    public ReporteValorPagar() {
        initComponents();
        setModelo();
    }
    
    public void setModelo(){
    String cabecera[]={"Nro.","Placa","Marca","Color","Tipo","Valor","Multas","Año Fabricación"};
    modelo.setColumnIdentifiers(cabecera);
    tblFichaVehicular.setModel(modelo);
    }
    
    
    private void setDatos(){
        Object[]datos=new Object[modelo.getColumnCount()];
        int i=1;
        modelo.setRowCount(0);
        for (VehiculoM vehiculo :lista) {
            datos[0]=i;
            datos[1]=vehiculo.getPlaca();
            datos[2]=vehiculo.getMarca();
            datos[3]=vehiculo.getColor();
            datos[4]=vehiculo.getTipo();
            datos[5]=vehiculo.getValor();
            datos[6]=vehiculo.getPersona();
            datos[7]=vehiculo.getAnio();
            modelo.addRow(datos);
                        i++;
        }
         tblFichaVehicular.setModel(modelo);}
    
    
       

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtADatos = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFichaVehicular = new javax.swing.JTable();
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
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        txtADatos.setColumns(20);
        txtADatos.setRows(5);
        jScrollPane1.setViewportView(txtADatos);

        tblFichaVehicular.setModel(new javax.swing.table.DefaultTableModel(
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
        tblFichaVehicular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFichaVehicularMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblFichaVehicularMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(tblFichaVehicular);

        jLabel1.setText("RESUMEN DE PAGO FICHA VEHICULAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(385, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(357, 357, 357))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(161, 161, 161))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
        String datos="Nombre:"+nombre+"\n"+"Cédula:"+cedula;
        txtADatos.setText(datos);
      
        setDatos();
        
        
           VehiculoController rc=new VehiculoController();
        
       ArrayList<Object[]>listas= rc.ObtenerVehiculos();
       
        for (Object[] filas : listas) {
            modelo.addRow(filas);
          }
     tblFichaVehicular.setModel(modelo);
        
        
        
        
        
        
        
    }//GEN-LAST:event_formInternalFrameActivated

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        
        
        DefaultTableModel dtm = (DefaultTableModel) tblFichaVehicular.getModel();

        int filaSeleccionada = tblFichaVehicular.getSelectedRow();
        if (filaSeleccionada != -1) {

            txtADatos.setText(dtm.getValueAt(filaSeleccionada, 0).toString());
           
        } else {

            JOptionPane.showMessageDialog(null, "Seleccione una fila antes de editar.");
        }
        
        
        
    }//GEN-LAST:event_formMouseClicked

    private void tblFichaVehicularMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFichaVehicularMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblFichaVehicularMouseEntered

    private void tblFichaVehicularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFichaVehicularMouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel dtm = (DefaultTableModel) tblFichaVehicular.getModel();

        int filaSeleccionada = tblFichaVehicular.getSelectedRow();
        if (filaSeleccionada != -1) {

            txtADatos.setText(dtm.getValueAt(filaSeleccionada, 0).toString());
            
        } else {

            JOptionPane.showMessageDialog(null, "Seleccione una fila antes de editar.");
        }
        
        
        
        
    }//GEN-LAST:event_tblFichaVehicularMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblFichaVehicular;
    private javax.swing.JTextArea txtADatos;
    // End of variables declaration//GEN-END:variables

   
}
