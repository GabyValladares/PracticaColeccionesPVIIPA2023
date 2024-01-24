/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package DIU;

/**
 *
 * @author Usuario
 */
public class ReporteValorPagar extends javax.swing.JInternalFrame {

    public String nombre, cedula, placa, anio, marca, color, valor, multas, tipo;

    /**
     * Creates new form ReporteValorPagar
     */
    public ReporteValorPagar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtADatos = new javax.swing.JTextArea();
        lblTitulo = new javax.swing.JLabel();
        lblRenovacionPlaca = new javax.swing.JLabel();
        lblMultaContaminacion = new javax.swing.JLabel();
        lblMontoMatricula = new javax.swing.JLabel();
        lblSiMultas = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblRenovacion = new javax.swing.JLabel();
        lblContaminacion = new javax.swing.JLabel();
        lblMatricula = new javax.swing.JLabel();
        lblMultas = new javax.swing.JLabel();
        lblTotalPagar = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Reporte Valor a Pagar");
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

        txtADatos.setColumns(20);
        txtADatos.setRows(5);
        jScrollPane1.setViewportView(txtADatos);

        lblTitulo.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        lblTitulo.setText("REPORTE VEHICULAR");

        lblRenovacionPlaca.setText("Importe renovación de placa: $");

        lblMultaContaminacion.setText("Importe monto de la multa por contaminación: $");

        lblMontoMatricula.setText("Importe monto de matriculación: $");

        lblSiMultas.setText("Importe po si posee multas: $");

        lblTotal.setText("Total a pagar: $");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(359, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRenovacionPlaca)
                        .addGap(18, 18, 18)
                        .addComponent(lblRenovacion, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMultaContaminacion)
                        .addGap(18, 18, 18)
                        .addComponent(lblContaminacion, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMontoMatricula)
                        .addGap(18, 18, 18)
                        .addComponent(lblMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSiMultas)
                        .addGap(18, 18, 18)
                        .addComponent(lblMultas, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTotal)
                        .addGap(18, 18, 18)
                        .addComponent(lblTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(96, 96, 96))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRenovacionPlaca)
                            .addComponent(lblRenovacion, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMultaContaminacion)
                            .addComponent(lblContaminacion, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblMontoMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblSiMultas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMultas, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTotal)
                            .addComponent(lblTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    double sueldoBasico = 435;

    private double calcularMultaContaminacion(int anioFabricacion) {
        // Variable para almacenar los mensajes
        int anioVehiculo = Integer.parseInt(anio);
        if (anioFabricacion < 2010) {
            int añosContaminacion = 2024 - anioVehiculo;
            double porcentajeMulta = 0.02 * añosContaminacion;

            // Calcula el monto de la multa en efectivo (por ejemplo, basado en un sueldo)
            double montoMulta = sueldoBasico * porcentajeMulta;

            return montoMulta;
        } else {

            return 0;
        }
    }

    private double calcularMatriculacion() {
        double porcentajeMatriculacion = 0;

        if (marca.equalsIgnoreCase("Toyota")) {
            if (tipo.equalsIgnoreCase("Jeep")) {
                porcentajeMatriculacion = 0.08;
            } else if (tipo.equalsIgnoreCase("Camioneta")) {
                porcentajeMatriculacion = 0.12;
            }
        } else if (marca.equalsIgnoreCase("Suzuki")) {
            if (tipo.equalsIgnoreCase("Vitara")) {
                porcentajeMatriculacion = 0.10;
            } else if (tipo.equalsIgnoreCase("Automóvil")) {
                porcentajeMatriculacion = 0.09;
            }
        }

        // Calcula el monto de matriculación en efectivo
        double montoMatriculacion = Double.parseDouble(valor) * porcentajeMatriculacion;

        return montoMatriculacion;
    }

    private double calcularPoseMultas(String multas) {
        // Verificar si tiene multa
        if (multas.equalsIgnoreCase("Si")) {
            // Calcular el 20% del sueldo básico como porcentaje adicional
            double porcentajeAdicional = 0.25;
            return sueldoBasico * porcentajeAdicional;
        } else {
            // No hay multa, retorna 0
            return 0;
        }
    }

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        double importeRenovacionPlacas = 0;
        if (!cedula.isEmpty() && !placa.isEmpty()) {
            if (cedula.charAt(0) == '1' && placa.charAt(0) == 'I') {
                importeRenovacionPlacas = sueldoBasico * 0.05;
            }
        }
        // Llama al método calcularMultaContaminacion y obtiene el resultado
        double importeMultaContaminacion = calcularMultaContaminacion(Integer.parseInt(anio));
        double importeMatriculacion = calcularMatriculacion();
        double importeMultas = calcularPoseMultas(multas);

        // Calcula el total
        double totalPagar = importeRenovacionPlacas + importeMultaContaminacion + importeMatriculacion + importeMultas;

        String datos = "Nombre:" + nombre + "\n" + "Cédula:" + cedula + "\n" + "Placa: " + placa + "\n"
                + "Año: " + anio + "\n" + "Marca: " + marca + "\n" + "Color: " + color + "\n"
                + "Valor: " + valor + "\n" + "Multas: " + multas + "\n" + "Tipo de vehículo: " + tipo + "\n"
                + "Importe renovación de placa: $" + importeRenovacionPlacas + "\n"
                + "Importe monto de la multa por contaminación: $" + importeMultaContaminacion + "\n"
                + "Importe monto de matriculación: $" + importeMatriculacion + "\n"
                + "Importe porcentaje por multas: $" + importeMultas + "\n"
                + "Total a pagar: $" + totalPagar + "\n";
        txtADatos.setText(datos);
        lblRenovacion.setText(String.valueOf(importeRenovacionPlacas));
        lblContaminacion.setText(String.valueOf(importeMultaContaminacion));
        lblMatricula.setText(String.valueOf(importeMatriculacion));
        lblMultas.setText(String.valueOf(importeMultas));
        lblTotalPagar.setText(String.valueOf(totalPagar));

    }//GEN-LAST:event_formInternalFrameActivated


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblContaminacion;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblMontoMatricula;
    private javax.swing.JLabel lblMultaContaminacion;
    private javax.swing.JLabel lblMultas;
    private javax.swing.JLabel lblRenovacion;
    private javax.swing.JLabel lblRenovacionPlaca;
    private javax.swing.JLabel lblSiMultas;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalPagar;
    private javax.swing.JTextArea txtADatos;
    // End of variables declaration//GEN-END:variables

}
