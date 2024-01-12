/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package DIU;

/**
 *
 * @author 59398
 */
public class FichaVehicular extends javax.swing.JInternalFrame {

    /**
     * Creates new form FichaVehicular
     */
    public FichaVehicular() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbtGrupo = new javax.swing.ButtonGroup();
        lblMarca = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        cmbMarcas = new javax.swing.JComboBox<>();
        lblTipo = new javax.swing.JLabel();
        rdbJeep = new javax.swing.JRadioButton();
        rdAuto = new javax.swing.JRadioButton();
        rdVitara = new javax.swing.JRadioButton();
        rdCamioneta = new javax.swing.JRadioButton();
        lblValor = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        lblValor1 = new javax.swing.JLabel();
        btnVer = new javax.swing.JButton();
        chxMultasSi = new javax.swing.JCheckBox();
        txtCedula = new javax.swing.JTextField();
        chxMultasNo = new javax.swing.JCheckBox();
        lblCedula = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        txtNombres = new javax.swing.JTextField();
        lblNombres = new javax.swing.JLabel();
        lblPlaca = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        lblAnioFab = new javax.swing.JLabel();
        txtAnioFab = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("FICHA VEHICULAR");
        setToolTipText("");
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

        lblMarca.setText("Marca del Vehículo:");

        lblColor.setText("Color del Vehículo:");

        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });

        cmbMarcas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Toyota", "Suzuki", "Kia", "Skoda" }));
        cmbMarcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMarcasActionPerformed(evt);
            }
        });

        lblTipo.setText("Tipo de Vehículo:");

        rdbJeep.setText("Jeep");
        rdbJeep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbJeepActionPerformed(evt);
            }
        });

        rdAuto.setText("Automóvil");
        rdAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdAutoActionPerformed(evt);
            }
        });

        rdVitara.setText("Vitara");

        rdCamioneta.setText("Camioneta");

        lblValor.setText("Valor del Vehículo:");

        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        lblValor1.setText("¿Posee Multas?");

        btnVer.setText("Ver Ficha");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        chxMultasSi.setText("Si");
        chxMultasSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chxMultasSiActionPerformed(evt);
            }
        });

        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });

        chxMultasNo.setText("No");
        chxMultasNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chxMultasNoActionPerformed(evt);
            }
        });

        lblCedula.setText("Número de Cédula :");

        btnSalir.setText("X");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblTitulo.setText("REGISTRO DE DATOS PARA CONOCER EL PAGO A REALIZAR");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });

        lblNombres.setText("Nombres Completos :");

        lblPlaca.setText("Número de Placa:");

        txtPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacaActionPerformed(evt);
            }
        });

        lblAnioFab.setText("Año Fabricación:");

        txtAnioFab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnioFabActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(51, 51, 51)
                .addComponent(btnSalir)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblValor, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(553, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAnioFab, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtAnioFab, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblColor, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rdbJeep)
                                            .addComponent(rdAuto)
                                            .addComponent(rdVitara)
                                            .addComponent(rdCamioneta)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chxMultasNo)
                                            .addComponent(chxMultasSi)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblNombres, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblPlaca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                                    .addComponent(lblCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCedula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 427, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnVer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitulo)
                    .addComponent(btnSalir))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPlaca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblAnioFab, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAnioFab, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnVer))
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rdbJeep)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdAuto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdVitara))
                    .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdCamioneta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chxMultasSi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chxMultasNo)))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorActionPerformed

    private void rdbJeepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbJeepActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_rdbJeepActionPerformed

    private void rdAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdAutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdAutoActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        // TODO add your handling code here:
        Ficha ventana=new Ficha();
        ventana.cedula=txtCedula.getText();
        ventana.nombre=txtNombres.getText();
        ventana.numeroPlaca=txtPlaca.getText();
        ventana.valor=txtValor.getText();
        ventana.marca=cmbMarcas.getSelectedItem().toString();
        if(rdAuto.isSelected()){
            ventana.tipo="Automóvil";
        }else if (rdCamioneta.isSelected()){
            ventana.tipo="Camioneta";
        }else if(rdVitara.isSelected()){
            ventana.tipo="Vitara";
        }else {
            ventana.tipo="Jeep";
        }
        ventana.multa="";
        if(chxMultasSi.isSelected()==true){
            ventana.multa="SI";
        }else{
            ventana.multa="NO";
        }
        ventana.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnVerActionPerformed

    private void chxMultasSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chxMultasSiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chxMultasSiActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void chxMultasNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chxMultasNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chxMultasNoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        txtCedula.setText("");
        txtNombres.setText("");
        txtPlaca.setText("");
        txtAnioFab.setText("");
        cmbMarcas.setSelectedIndex(0);
        txtColor.setText("");
        rdbJeep.setSelected(false);
        rdAuto.setSelected(false);
        rdCamioneta.setSelected(false);
        rdVitara.setSelected(false);
        txtAnioFab.setText("");
        txtValor.setText("");
        chxMultasNo.setSelected(false);
        chxMultasSi.setSelected(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresActionPerformed

    private void txtPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlacaActionPerformed

    private void txtAnioFabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnioFabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnioFabActionPerformed

    private void cmbMarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMarcasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMarcasActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
rbtGrupo.add(rdbJeep);
rbtGrupo.add(rdAuto);
rbtGrupo.add(rdVitara);
rbtGrupo.add(rdCamioneta);
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameActivated


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVer;
    private javax.swing.JCheckBox chxMultasNo;
    private javax.swing.JCheckBox chxMultasSi;
    private javax.swing.JComboBox<String> cmbMarcas;
    private javax.swing.JLabel lblAnioFab;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblValor;
    private javax.swing.JLabel lblValor1;
    private javax.swing.ButtonGroup rbtGrupo;
    private javax.swing.JRadioButton rdAuto;
    private javax.swing.JRadioButton rdCamioneta;
    private javax.swing.JRadioButton rdVitara;
    private javax.swing.JRadioButton rdbJeep;
    public static javax.swing.JTextField txtAnioFab;
    public static javax.swing.JTextField txtCedula;
    public static javax.swing.JTextField txtColor;
    public static javax.swing.JTextField txtNombres;
    public static javax.swing.JTextField txtPlaca;
    public static javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
