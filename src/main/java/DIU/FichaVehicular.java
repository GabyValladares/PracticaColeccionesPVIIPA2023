/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package DIU;

import DIU.vistas.tablaVehiculo;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.SwingUtilities;

/**
 *
 * @author USUARIO
 */
public class FichaVehicular extends javax.swing.JInternalFrame {

    /**
     * Creates new form FichaVehicular
     */
    
    public FichaVehicular() {
        initComponents();
        ReportedeValoraPagar reporte = new ReportedeValoraPagar();
        reporte.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        lblNumCedula = new javax.swing.JLabel();
        CBMarca = new javax.swing.JComboBox<>();
        txtValor = new javax.swing.JTextField();
        rdtJeep = new javax.swing.JRadioButton();
        rdtAutomovil = new javax.swing.JRadioButton();
        rdtCamioneta = new javax.swing.JRadioButton();
        txtAnio = new javax.swing.JTextField();
        txtNumPlaca = new javax.swing.JTextField();
        txtNombreP = new javax.swing.JTextField();
        txtNumCedula = new javax.swing.JTextField();
        blbNombreP = new javax.swing.JLabel();
        lblNumPlaca = new javax.swing.JLabel();
        lblAnio = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        btnVerFicha = new javax.swing.JButton();
        lblMultas = new javax.swing.JLabel();
        CheckBoxYes = new javax.swing.JCheckBox();
        CheckBoxNo = new javax.swing.JCheckBox();
        btnVerTabla = new javax.swing.JButton();
        lblColor = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("FICHA VEHICULAR");
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

        lblNumCedula.setText("Numero de Cédula:");

        CBMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TOYOTA", "Chevrolet", "BMW", "Ford" }));

        rdtJeep.setText("Jepp");

        rdtAutomovil.setText("Automovil");

        rdtCamioneta.setText("Camioneta");

        blbNombreP.setText("Nombre del Propietario:");

        lblNumPlaca.setText("Número de Placa:");

        lblAnio.setText("Año de Fabricacion del Vehículo:");

        lblMarca.setText("Marca del Vehiculo");

        jLabel6.setText("Tipo de Vehiculo");

        lblValor.setText("Valor del Vehiculo");

        btnVerFicha.setText("Ver Ficha");
        btnVerFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerFichaActionPerformed(evt);
            }
        });

        lblMultas.setText("Multas");

        CheckBoxYes.setText("Si");

        CheckBoxNo.setText("No");

        btnVerTabla.setText("Ver Tabla");
        btnVerTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTablaActionPerformed(evt);
            }
        });

        lblColor.setText("Color del Vehiculo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(77, 77, 77)
                                    .addComponent(lblValor)
                                    .addGap(67, 67, 67))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(81, 81, 81)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(CBMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(lblMarca))
                                    .addGap(43, 43, 43)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNumPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(blbNombreP)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(rdtJeep)
                                                .addGap(7, 7, 7))
                                            .addComponent(CheckBoxYes))
                                        .addGap(60, 60, 60)
                                        .addComponent(CheckBoxNo))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(138, 138, 138)
                                        .addComponent(rdtAutomovil)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdtCamioneta))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(55, 55, 55)
                                            .addComponent(txtNumCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(105, 105, 105)
                                            .addComponent(lblNumCedula))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(105, 105, 105)
                                            .addComponent(jLabel6)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(130, 130, 130)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnVerTabla)
                                            .addComponent(lblMultas))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(lblNumPlaca)
                        .addGap(119, 119, 119)
                        .addComponent(lblAnio)))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(btnVerFicha))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(lblColor)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(blbNombreP)
                    .addComponent(lblNumCedula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumPlaca)
                    .addComponent(lblAnio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblColor)
                .addGap(14, 14, 14)
                .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarca)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdtJeep)
                        .addComponent(rdtAutomovil)
                        .addComponent(rdtCamioneta))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CBMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblValor)
                            .addComponent(lblMultas))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CheckBoxYes)
                        .addComponent(CheckBoxNo)))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerFicha)
                    .addComponent(btnVerTabla))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
        buttonGroup.add(rdtJeep);
        buttonGroup.add(rdtAutomovil);
        buttonGroup.add(rdtCamioneta);
        
    }//GEN-LAST:event_formInternalFrameActivated

    @SuppressWarnings("empty-statement")
    private void btnVerFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerFichaActionPerformed
        // TODO add your handling code here:
        ReportedeValoraPagar reporte1 = new ReportedeValoraPagar();
        reporte1.nombre = txtNombreP.getText();
        reporte1.color = txtColor.getText();
        reporte1.cedula = txtNumCedula.getText();
        reporte1.placa = txtNumPlaca.getText();
        reporte1.valorV = txtValor.getText();
        reporte1.anio = txtAnio.getText();
        reporte1.marca = (String)CBMarca.getSelectedItem();
        
        if(rdtAutomovil.isSelected()){
            reporte1.tipo = "Automovil";  
        }else if(rdtCamioneta.isSelected()){
            reporte1.tipo = "Camioneta"; 
        }else if(rdtJeep.isSelected()){
            reporte1.tipo = "Jeep"; 
        }
        
        
        if(CheckBoxNo.isSelected()){
            reporte1.multas = "No";
        }else if(CheckBoxYes.isSelected()){
            reporte1.multas = "Si";
        }
                
        Menu.escritorio.add(reporte1);
        reporte1.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnVerFichaActionPerformed

    private void btnVerTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTablaActionPerformed
        // TODO add your handling code here:
        ReportedeValoraPagar reporte1 = new ReportedeValoraPagar();
        reporte1.nombre = txtNombreP.getText();
        reporte1.color = txtColor.getText();
        reporte1.cedula = txtNumCedula.getText();
        reporte1.placa = txtNumPlaca.getText();
        reporte1.valorV = txtValor.getText();
        reporte1.anio = txtAnio.getText();
        reporte1.marca = (String)CBMarca.getSelectedItem();
        
        if(rdtAutomovil.isSelected()){
            reporte1.tipo = "Automovil";  
        }else if(rdtCamioneta.isSelected()){
            reporte1.tipo = "Camioneta"; 
        }else if(rdtJeep.isSelected()){
            reporte1.tipo = "Jeep"; 
        }
        
        
        if(CheckBoxNo.isSelected()){
            reporte1.multas = "No";
        }else if(CheckBoxYes.isSelected()){
            reporte1.multas = "Si";
        }
        
        tablaVehiculo tvehiculo = new tablaVehiculo();
        Menu.escritorio.add(tvehiculo);
        tvehiculo.show();
        this.dispose();
    }//GEN-LAST:event_btnVerTablaActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBMarca;
    private javax.swing.JCheckBox CheckBoxNo;
    private javax.swing.JCheckBox CheckBoxYes;
    private javax.swing.JLabel blbNombreP;
    private javax.swing.JButton btnVerFicha;
    private javax.swing.JButton btnVerTabla;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblAnio;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblMultas;
    private javax.swing.JLabel lblNumCedula;
    private javax.swing.JLabel lblNumPlaca;
    private javax.swing.JLabel lblValor;
    private javax.swing.JRadioButton rdtAutomovil;
    private javax.swing.JRadioButton rdtCamioneta;
    private javax.swing.JRadioButton rdtJeep;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtNombreP;
    private javax.swing.JTextField txtNumCedula;
    private javax.swing.JTextField txtNumPlaca;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
