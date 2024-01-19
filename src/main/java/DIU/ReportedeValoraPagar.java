/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package DIU;

/**
 *
 * @author 59398
 */
public class ReportedeValoraPagar extends javax.swing.JInternalFrame {

    public String nombre, cedula, placa, marca, anio, tipo, multas, valorV;
    public int numAnio;
    public double valorAuto;
    
    
    /**
     * Creates new form ReportedeValoraPagar
     */
    public ReportedeValoraPagar() {
        initComponents();
        
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

        lblTitulo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblTitulo.setText("Total a Pagar:");

        txtAreaR.setColumns(20);
        txtAreaR.setLineWrap(true);
        txtAreaR.setRows(5);
        txtAreaR.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtAreaR);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(145, 145, 145))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitulo)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
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

            validarDatos = "debe un 5% del sueldo básico ( +" + Renovacion + ") la renovación de placas";
        } else {
            validarDatos = "No posee cargos";
        }
        
        //Multa por Contaminacion//
        
        int anosDeContaminacion = 2010 - numAnio;
        double porcentajeMulta = 0.02 * anosDeContaminacion;
        double MultaContaminacion = porcentajeMulta * sueldoBasico;
        multaContaminacion = "Multa por contaminación de " + MultaContaminacion;
        
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
        valorMaticula = "La matriculación es de: " + valorMatriculacion;
        
        // Si tiene Multas//
        double valorPagar =0;
        if(multas.equals("Si")){
            valorPagar = sueldoBasico*0.25;
            multasR = " Su valor a pagar es: "+valorPagar;
            
        }else if(multas.equals("No")){
            multasR = "Su valor a pagar es: 0.00 ";
        }
        
        //Total de Multas//
        double totalPagar = valorPagar + valorMatriculacion+porcentajeMatriculacion+MultaContaminacion+Renovacion;
                
        //Enviar Datos al Usuario
        String datos = "Nombre: "+nombre+"\n"+"Cedula: "+cedula+"\n"+"Su total es: "+totalPagar
                +"\n"+multasR+"\n"+valorMaticula+"\n"+validarDatos+"\n"+multaContaminacion;   
         txtAreaR.setText(datos);
        
    }//GEN-LAST:event_formInternalFrameActivated

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txtAreaR;
    // End of variables declaration//GEN-END:variables

    

 
 
}

