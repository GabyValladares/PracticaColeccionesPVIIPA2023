/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

/**
 *
 * @author Andy Moya
 */
public class reporte extends javax.swing.JInternalFrame {

    /**
     * Creates new form reporte
     */
    public reporte() {
        initComponents();
        
    }
    String nombre, cedula, placa, anio, marca, color, tipo_ve, valor,multas;
  String texto ;//= "Nombre del propietario: "+nombre+"\n"+
//                  "cedula: "+cedula+"\n";
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txta_reporte = new javax.swing.JTextArea();

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

        txta_reporte.setColumns(20);
        txta_reporte.setRows(5);
        txta_reporte.setEnabled(false);
        jScrollPane1.setViewportView(txta_reporte);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 883, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
       texto= 
               "Nombre del propietario: "+nombre+"\n"+
               "cedula: "+cedula+"\n"+
               "Placa: "+placa+"\n"+
               "Año: "+anio+"\n"+
               "Marca: "+marca+"\n"+
               "Color: "+color+"\n"+
               "Tipo de Vehiculo: "+tipo_ve+"\n"+
               "Valor: "+valor+"\n"+
               "Multas: "+multas+"\n";
       txta_reporte.setText(texto);
    }//GEN-LAST:event_formInternalFrameActivated
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txta_reporte;
    // End of variables declaration//GEN-END:variables
}
