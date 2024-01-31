/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package DIU;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class ReportedeValoraPagar extends javax.swing.JInternalFrame {

    public String nombre, cedula, placa, marca, anio, tipo, multas, valorV, color;
    public int numAnio;
    public double valorAuto;
    
    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel modeloR = new DefaultTableModel();
    
    public void modeloTabla(){
    String[] tabla1={"N°","Placa","Año Fabricacion","Marca","Color","Tipo","Valor","Multas"};
    modelo.setColumnIdentifiers(tabla1);
    tblInfoPerson.setModel(modelo);
    
    String[] tablaR={"N°"+"Valor de Matricula","Multas Existentes","Importe por Renovacion","Multa por Contaminacion","Total"};
    modeloR.setColumnIdentifiers(tablaR);
    tblResultadoPago.setModel(modeloR);
    }
    
    /**
     * Creates new form ReportedeValoraPagar
     */
    public ReportedeValoraPagar() {        
        initComponents();
        Fecha();
        modeloTabla();

        if (anio != null) {
            numAnio = Integer.parseInt(anio);
        }

        if (valorV != null) {
            valorAuto = Double.parseDouble(valorV);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaR = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblInfoPerson = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblResultadoPago = new javax.swing.JTable();
        lblFecha = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Reporte Vehicular");
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

        lblTitulo.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lblTitulo.setText("Resultado de reporte");

        txtAreaR.setColumns(20);
        txtAreaR.setLineWrap(true);
        txtAreaR.setRows(5);
        txtAreaR.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtAreaR);

        tblInfoPerson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11"
            }
        ));
        jScrollPane2.setViewportView(tblInfoPerson);

        tblResultadoPago.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tblResultadoPago);

        lblFecha.setText("Fecha de Emision:  ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(lblTitulo)
                        .addGap(134, 134, 134)
                        .addComponent(lblFecha))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lblFecha)))
                .addGap(23, 23, 23)
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
        String multasR = null;
        String valorMaticula = null;
        String validarDatos = null;
        String multaContaminacion = null;
        
        double sueldoBasico = 435.0;
        boolean cedulaEmpiezaEn1 = cedula.startsWith("1");
        boolean placaContieneLetraI = placa.contains("I");
        double Renovacion = 0;
        
        if (cedulaEmpiezaEn1 && placaContieneLetraI) {
             Renovacion = 0.05 * sueldoBasico;

            validarDatos = "Se debe cobrar un importe del 5% del sueldo básico ($" + Renovacion + ") para la renovación de placas.";
        } else {
            validarDatos = "No se aplican cargos para la renovación de placas.";
        }
        
        //Multa por Contaminacion//
        
        int anosDeContaminacion = 2010 - numAnio;
        double porcentajeMulta = 0.02 * anosDeContaminacion;
        double MultaContaminacion = porcentajeMulta * sueldoBasico;
        multaContaminacion = "Se debe cobrar una multa por contaminación de $" + MultaContaminacion;
        
        // Multas de Tipo de Vehiculo//
        
        
        double porcentajeMatriculacion = 0.0;
      if (marca != null && tipo != null) { 
        if (marca.equalsIgnoreCase("Toyota") && tipo.equalsIgnoreCase("Jeep")) {
            porcentajeMatriculacion = 0.08;
        } else if (marca.equalsIgnoreCase("Toyota") && tipo.equalsIgnoreCase("Camioneta")) {
            porcentajeMatriculacion = 0.12;
        } else if (marca.equalsIgnoreCase("Suzuki") && tipo.equalsIgnoreCase("Vitara")) {
            porcentajeMatriculacion = 0.10;
        } else if (marca.equalsIgnoreCase("Suzuki") && tipo.equalsIgnoreCase("Automóvil")) {
            porcentajeMatriculacion = 0.09;
        }
      }

        double valorMatriculacion = porcentajeMatriculacion * valorAuto;
        valorMaticula = "El valor de matriculación es de $" + valorMatriculacion;
        
        // Si tiene Multas//
        double valorPagar =0;
        if(multas.equals("Si")){
            valorPagar = sueldoBasico*0.25;
            multasR = "Por cometer multas su valor a pagar es: "+valorPagar;
            
        }else if(multas.equals("No")){
            multasR = "Por No cometer multas su valor a pagar es: 0.00 ";
        }
        
        //Total de Multas//
        double totalPagar = valorPagar + valorMatriculacion+porcentajeMatriculacion+MultaContaminacion+Renovacion;
                
        //Enviar Datos al Usuario
        //String datos = "Su total es: "+totalPagar+"\n"+multasR+"\n"+valorMaticula+"\n"+validarDatos+"\n"+multaContaminacion;   
         //txtAreaR.setText(datos);
         
         lblNombre.setText("Propietario del Vehiculo: "+nombre);
         lblCedula.setText("Cedula del Propietaro: "+cedula);
         
         int fila = modelo.getRowCount()+1;
    modelo.addRow(new Object[]{fila,placa,anio,marca,color,tipo,valorV,multas});
    modeloR.addRow(new Object[]{fila,valorMaticula,multasR,validarDatos,multaContaminacion,totalPagar});
    
        
    }//GEN-LAST:event_formInternalFrameActivated

    
    public void Fecha(){
         Date fechaAnio = new Date();
        SimpleDateFormat sp = new SimpleDateFormat("dd/MM/yyyy");
        Object fechaPars = sp.format(fechaAnio);
        String fechaString = String.valueOf(fechaPars);
        lblFecha.setText("Fecha de Emision: "+fechaString);
    }
    
    //public void Matriculacion(String cedula, String placa,int anio, String marca, String tipo, String valor, String multas){
        
    //}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblInfoPerson;
    private javax.swing.JTable tblResultadoPago;
    private javax.swing.JTextArea txtAreaR;
    // End of variables declaration//GEN-END:variables

    

 
 
}

