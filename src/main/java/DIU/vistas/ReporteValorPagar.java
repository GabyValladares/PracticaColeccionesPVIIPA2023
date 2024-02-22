/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package DIU.vistas;

import DIU.Persona;
import DIU.controlador.PersonaController;
import DIU.controlador.VehiculoControlador;
import DIU.modelo.VehiculoModelo;
import static DIU.vistas.FichaVehicular.txtCedula;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class ReporteValorPagar extends javax.swing.JInternalFrame {
public String nombre,cedula,placa,marca,color,valor,multas,tipo,añoFabricacion;
    /**
     * Creates new form ReporteValorPagar
     */
    ArrayList<VehiculoModelo> listaVehiculos=new ArrayList<>();
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
    
    public void llenarDatos(){
    VehiculoModelo v1=new VehiculoModelo(placa, marca, color, tipo, Double.parseDouble(valor),multas, new Date(añoFabricacion));
    Persona p1=new Persona(nombre, Integer.parseInt(cedula), listaVehiculos);
   listaVehiculos.add(v1);}
    
    private void setDatos(){
        Object[]datos=new Object[modelo.getColumnCount()];
        int i=1;
        modelo.setRowCount(0);
        for (VehiculoModelo vehiculo :listaVehiculos) {
            datos[0]=i;
            datos[1]=vehiculo.getPlaca();
            datos[2]=vehiculo.getMarca();
            datos[3]=vehiculo.getColor();
            datos[4]=vehiculo.getTipo();
            datos[5]=vehiculo.getValor();
            datos[6]=vehiculo.getMultas();
            datos[7]=vehiculo.getAñoFabricacion();
            modelo.addRow(datos);
                        i++;
        }
         tblFichaVehicular.setModel(modelo);}
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblFichaVehicular = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblNombres = new javax.swing.JLabel();
        lblCNombres = new javax.swing.JLabel();
        lblCCedula = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();

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
        jScrollPane2.setViewportView(tblFichaVehicular);

        jLabel1.setText("RESUMEN DE PAGO FICHA VEHICULAR");

        lblNombres.setText("NOMBRES DEL PROPIETARIO:");

        lblCedula.setText("CÉDULA DEL PROPIETARIO:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblNombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(326, 326, 326))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCNombres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
        String datos="Nombre:"+nombre+"\n"+"Cédula:"+cedula;
        lblCNombres.setText(nombre);
        lblCCedula.setText(cedula);
       // llenarDatos();
        setDatos();
        
        // int cedula = Integer.parseInt(txtCedula1.getText());
        PersonaController pC=new PersonaController();
        int idPersona=pC.obtenerIdPersona(Integer.parseInt(txtCedula.getText()));
        System.out.println("-------------"+idPersona);
        VehiculoControlador vC = new VehiculoControlador();
        ArrayList<Object[]> listaFilas = vC.buscarVehiculos(idPersona);
        
        for (Object[] listaFila : listaFilas) {
            modelo.addRow(listaFila);
            }

        tblFichaVehicular.setModel(modelo);
        
    }//GEN-LAST:event_formInternalFrameActivated


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCCedula;
    private javax.swing.JLabel lblCNombres;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JTable tblFichaVehicular;
    // End of variables declaration//GEN-END:variables

    void isVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
