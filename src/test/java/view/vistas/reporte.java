/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view.vistas;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import view.modelo.Persona;

/**
 *
 * @author Andy Moya
 */
public class reporte extends javax.swing.JInternalFrame {

 DefaultTableModel modelo = new DefaultTableModel();
 String nombre, cedula, placa, anio, marca, color, tipo_ve, valor,multas;
 ArrayList<String> listaV = new ArrayList<>();
 ArrayList<String> datos = new ArrayList<>();
    String texto ;
    
    private static final String DB_URL = "jdbc:mysql://localhost:3306/ficha";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "";    
    /**
     * Creates new form reporte
     */
    public reporte() {
        initComponents();
         setModelo();
    }
    public void setModelo(){
    String[] titulo = {"Placa","Año","Marca","color","tipo","Valor","multas"};
    modelo.setColumnIdentifiers(titulo);
    tbl_vehiculos.setModel(modelo);
    }
    
    public void llenarpersona(String nombre, String cedula){  
    texto= 
               "Nombre del propietario: "+nombre+"\n"+
               "cedula: "+cedula+"\n";
       txta_reporte.setText(texto);
    }
    public void Llenartb(String placa,String anio,String marca,String color,String tipo_ve,String valor, String multas){
    
        listaV.add(placa);
        listaV.add(anio);
        listaV.add(marca);
        listaV.add(color);
        listaV.add(tipo_ve);
        listaV.add(valor);
        listaV.add(multas);
        Object[]info= new Object[modelo.getColumnCount()];
    modelo.setRowCount(0);
    for (String p : listaV){
        info[0]= placa ;
        info[1]= anio;
        info[2]= marca;
        info[3]= color;
        info[4]= tipo_ve;
        info[5]= valor;
        info[6]= multas;      
        modelo.addRow(info);
        }
        tbl_vehiculos.setModel(modelo);
    }
    
    //= "Nombre del propietario: "+nombre+"\n"+
//                  "cedula: "+cedula+"\n";
    
//    +
//               "Placa: "+placa+"\n"+
//               "Año: "+anio+"\n"+
//               "Marca: "+marca+"\n"+
//               "Color: "+color+"\n"+
//               "Tipo de Vehiculo: "+tipo_ve+"\n"+
//               "Valor: "+valor+"\n"+
//               "Multas: "+multas+"\n"
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txta_reporte = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_vehiculos = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

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

        txta_reporte.setColumns(20);
        txta_reporte.setRows(5);
        txta_reporte.setEnabled(false);
        jScrollPane1.setViewportView(txta_reporte);

        tbl_vehiculos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tbl_vehiculos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 883, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
        llenarpersona(nombre, cedula);
        Llenartb(placa, anio, marca, color, tipo_ve, valor, multas);
        
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {
            // Llamar al procedimiento almacenado
            try (CallableStatement statement = conn.prepareCall("{call sp_guardar_vehiculo(?, ?, ?, ?, ?)}")) {
                // Establecer los parámetros del procedimiento
//                statement.setString(1, placa);
//                statement.setString(2, Apellido);
//                statement.setString(3, Cedula);
//                statement.setString(4, Usuario);
//                statement.setString(5, Clave);

                // Ejecutar el procedimiento almacenado
                statement.execute();
                System.out.println("Usuario guardado correctamente mediante procedimiento almacenado.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_formInternalFrameActivated
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_vehiculos;
    private javax.swing.JTextArea txta_reporte;
    // End of variables declaration//GEN-END:variables
}
