/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Diuu;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import modelo.Persona;
import modelo.Vehiculo;

/**
 *
 * @author  Leo
 */
public class FichaVehicular extends javax.swing.JInternalFrame {

    /**
     * Creates new form FichaVehicular
     */
    public FichaVehicular() {
        initComponents();
        ReportePalorAPagar reporte = new ReportePalorAPagar();
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

        rgbAutos = new javax.swing.ButtonGroup();
        rgbMultas = new javax.swing.ButtonGroup();
        txtAnioFab = new javax.swing.JTextField();
        lblMarca = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        cmbMarca = new javax.swing.JComboBox<>();
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
        lblTitulo = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        lblNombres = new javax.swing.JLabel();
        lblPlaca = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        lblAnioFab = new javax.swing.JLabel();
        btnTablaVehiculos = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("FIcha Vehicular");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAnioFab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnioFabActionPerformed(evt);
            }
        });
        getContentPane().add(txtAnioFab, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 185, 205, 36));

        lblMarca.setText("Marca del Vehículo:");
        getContentPane().add(lblMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 227, 160, 36));

        lblColor.setText("Color del Vehículo:");
        getContentPane().add(lblColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 272, 160, 36));

        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });
        getContentPane().add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 272, 205, 36));

        cmbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Toyota", "Suzuki", "Kia", "Skoda" }));
        getContentPane().add(cmbMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 227, 205, 36));

        lblTipo.setText("Tipo de Vehículo:");
        getContentPane().add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 353, 160, 36));

        rgbAutos.add(rdbJeep);
        rdbJeep.setText("Jeep");
        rdbJeep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbJeepActionPerformed(evt);
            }
        });
        getContentPane().add(rdbJeep, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 314, -1, -1));

        rgbAutos.add(rdAuto);
        rdAuto.setText("Automóvil");
        rdAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdAutoActionPerformed(evt);
            }
        });
        getContentPane().add(rdAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 341, -1, -1));

        rgbAutos.add(rdVitara);
        rdVitara.setText("Vitara");
        getContentPane().add(rdVitara, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 368, -1, -1));

        rgbAutos.add(rdCamioneta);
        rdCamioneta.setText("Camioneta");
        getContentPane().add(rdCamioneta, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 395, -1, -1));

        lblValor.setText("Valor del Vehículo:");
        getContentPane().add(lblValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 422, 160, 36));

        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });
        getContentPane().add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 422, 205, 36));

        lblValor1.setText("¿Posee Multas?");
        getContentPane().add(lblValor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 476, 160, 36));

        btnVer.setText("Ver Ficha");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });
        getContentPane().add(btnVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 96, -1));

        rgbMultas.add(chxMultasSi);
        chxMultasSi.setText("Si");
        chxMultasSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chxMultasSiActionPerformed(evt);
            }
        });
        getContentPane().add(chxMultasSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 476, -1, -1));

        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        getContentPane().add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 53, 205, 36));

        rgbMultas.add(chxMultasNo);
        chxMultasNo.setText("No");
        chxMultasNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chxMultasNoActionPerformed(evt);
            }
        });
        getContentPane().add(chxMultasNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 477, -1, -1));

        lblCedula.setText("Número de Cédula :");
        getContentPane().add(lblCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 53, 151, 36));

        lblTitulo.setText("REGISTRO DE DATOS PARA CONOCER EL PAGO A REALIZAR");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 6, -1, -1));

        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 95, 205, 36));

        lblNombres.setText("Nombres Completos :");
        getContentPane().add(lblNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 95, 160, 36));

        lblPlaca.setText("Número de Placa:");
        getContentPane().add(lblPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 137, 160, 36));

        txtPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacaActionPerformed(evt);
            }
        });
        getContentPane().add(txtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 137, 205, 36));

        lblAnioFab.setText("Año Fabricación:");
        getContentPane().add(lblAnioFab, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 185, 160, 36));

        btnTablaVehiculos.setText("Tabla Vehiculos de Persona");
        btnTablaVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTablaVehiculosActionPerformed(evt);
            }
        });
        getContentPane().add(btnTablaVehiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAnioFabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnioFabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnioFabActionPerformed

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
    public static ArrayList<Vehiculo> ListaVe;
    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed

        ReportePalorAPagar ventana = new ReportePalorAPagar();
        Vehiculo auto = new Vehiculo();
        Persona per = new Persona();
        
        per.setCedula(txtCedula.getText());
        per.setNombre(txtNombres.getText());
        auto.setPlaca(txtPlaca.getText());
        auto.setValor(txtValor.getText());
        auto.setMarca(cmbMarca.getSelectedItem().toString());
        String anioTexto = txtAnioFab.getText();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy");
        try {
            auto.setAnoFabricacion(formatoFecha.parse(anioTexto));
        } catch (ParseException ex) {
            Logger.getLogger(FichaVehicular.class.getName()).log(Level.SEVERE, null, ex);
        }
        auto.setColor(txtColor.getText());
        if (rdAuto.isSelected()) {
            auto.setTipo("Automóvil");
        } else if (rdCamioneta.isSelected()) {
            auto.setTipo("Camioneta");
        } else if (rdVitara.isSelected()) {
            auto.setTipo("Vitara");
        } else {
            auto.setTipo("Jeep");
            
        }
        auto.setMultas("");
        if (chxMultasSi.isSelected() == true) {
            auto.setMultas("SI");
        } else {
            auto.setMultas("NO");
        }
       try {
        // Conectar a la base de datos
        ConexionBDD conexionBDD = new ConexionBDD();
        Connection conexion = conexionBDD.conectar();

String procedimiento = "{CALL InsertarVehiculo(?, ?, ?, ?, ?, ?, ?)}";
    CallableStatement statement = conexion.prepareCall(procedimiento);
    statement.setString(1, auto.getPlaca());
    statement.setString(2, auto.getMarca());
    statement.setString(3, auto.getColor());
    statement.setString(4, auto.getTipo());
    statement.setString(5, auto.getMultas());
    statement.setString(6, formatoFecha.format(auto.getAnoFabricacion()));
    statement.setDouble(7, Double.parseDouble(auto.getValor()));


        statement.executeUpdate();

        statement.close();
        conexion.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
        ventana.mostrarDatos(auto,per);
        this.dispose();
        Menu.Escritorio.add(ventana);
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

    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresActionPerformed

    private void txtPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlacaActionPerformed

    private void btnTablaVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTablaVehiculosActionPerformed
    
        
        TablaVehiculo reporte1=new TablaVehiculo();
        reporte1.cedula=txtCedula.getText();
        reporte1.nombre=txtNombres.getText();
        reporte1.placa=txtPlaca.getText();
        reporte1.color=txtColor.getText();
        reporte1.añoFabricacion=txtAnioFab.getText();
        reporte1.valor=txtValor.getText();
        reporte1.marca=(String) cmbMarca.getSelectedItem();
        if(rdAuto.isSelected()){
            reporte1.tipo="Automovil";
        }else if(rdbJeep.isSelected()){
            reporte1.tipo="Jeep";
        }else if(rdCamioneta.isSelected()){
            reporte1.tipo="Camioneta";
        }else if(rdVitara.isSelected()){
            reporte1.tipo="Vitara";
        }
        
        if(chxMultasSi.isSelected()){
            reporte1.multas="Si";
        }else{
            reporte1.multas="No";
        }
      
        Menu.Escritorio.add(reporte1);
        reporte1.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_btnTablaVehiculosActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTablaVehiculos;
    private javax.swing.JButton btnVer;
    private javax.swing.JCheckBox chxMultasNo;
    private javax.swing.JCheckBox chxMultasSi;
    private javax.swing.JComboBox<String> cmbMarca;
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
    private javax.swing.JRadioButton rdAuto;
    private javax.swing.JRadioButton rdCamioneta;
    private javax.swing.JRadioButton rdVitara;
    private javax.swing.JRadioButton rdbJeep;
    private javax.swing.ButtonGroup rgbAutos;
    private javax.swing.ButtonGroup rgbMultas;
    public static javax.swing.JTextField txtAnioFab;
    public static javax.swing.JTextField txtCedula;
    public static javax.swing.JTextField txtColor;
    public static javax.swing.JTextField txtNombres;
    public static javax.swing.JTextField txtPlaca;
    public static javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
