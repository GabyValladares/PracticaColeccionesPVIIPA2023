/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view.vistas;

import java.util.Calendar;
import javax.swing.JOptionPane;
import view.vistas.TablaV;
import view.vistas.reporte;
import view.vistas.principal;

import static java.lang.Runtime.version;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import javax.swing.JOptionPane;
/**
 *
 * @author Andy Moya
 */
public class FichaVehicular extends javax.swing.JInternalFrame {
private static final String DB_URL = "jdbc:mysql://localhost:3306/ficha";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "";
     String cedula;
     String nombre;
     String apellido;
    /**
     * Creates new form FichaVehicular
     */
    public FichaVehicular() {
        initComponents();
        reporte report = new reporte();
        report.setVisible(true);
        
        TablaV reporteV = new TablaV();
        reporteV.setVisible(true);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbtgroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnVer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtplaca = new javax.swing.JTextField();
        txtanioehiculo = new javax.swing.JTextField();
        txtvalor = new javax.swing.JTextField();
        cmbMarcas = new javax.swing.JComboBox<>();
        rbtjeep = new javax.swing.JRadioButton();
        rbtautomovil = new javax.swing.JRadioButton();
        rbtvitara = new javax.swing.JRadioButton();
        cmbsi = new javax.swing.JCheckBox();
        cmbno = new javax.swing.JCheckBox();
        cmbColores = new javax.swing.JComboBox<>();
        btm_tabla = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Ficha");
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

        btnVer.setText("Ver Ficha");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        jLabel1.setText("Datos de un Vehículo a matricular");

        jLabel2.setText("Número de Cédula:");

        jLabel3.setText("Nombres del Propietario:");

        jLabel4.setText("Número de placa:");

        jLabel5.setText("Año de Fabricación del Vehículo:");

        jLabel6.setText("Marca:");

        jLabel7.setText("Color:");

        jLabel8.setText("Tipo de Vehículo:");

        jLabel9.setText("Valor del Vehículo:");

        jLabel10.setText("Multas:");

        txtnombre.setEnabled(false);

        txtplaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtplacaActionPerformed(evt);
            }
        });

        cmbMarcas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "toyota", "masda", "nizan", "tesla" }));

        rbtjeep.setText("jeep");

        rbtautomovil.setText("automovil");

        rbtvitara.setText("vitara");

        cmbsi.setText("si");

        cmbno.setText("no");

        cmbColores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amarillo", "Azul", "Rojo", "Verde", "Naranja", "Morado", "Blanco", "Negro", "Marron", "Gris", " " }));

        btm_tabla.setText("generar tabla vehiculo");
        btm_tabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_tablaActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar usuario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cmbsi)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbno))
                                    .addComponent(txtvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtcedula))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtplaca, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmbColores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(rbtjeep)
                                            .addComponent(jLabel5))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(rbtautomovil)
                                                .addGap(18, 18, 18)
                                                .addComponent(rbtvitara))
                                            .addComponent(txtanioehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnVer)
                                        .addGap(107, 107, 107))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btm_tabla)
                                        .addGap(79, 79, 79))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jButton1)
                                .addGap(0, 0, Short.MAX_VALUE))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(jLabel1)
                .addContainerGap(422, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtplaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtanioehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cmbMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbColores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(rbtjeep)
                            .addComponent(rbtautomovil)
                            .addComponent(rbtvitara))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtvalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(cmbsi)
                            .addComponent(cmbno)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btnVer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btm_tabla)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
    
    reporte reporte1 = new reporte();
    reporte1.nombre =txtnombre.getText();
    reporte1.cedula=txtcedula.getText();
    reporte1.placa= txtplaca.getText();
    reporte1.anio=txtanioehiculo.getText();
    reporte1.color= (String) cmbColores.getSelectedItem();
    reporte1.marca=(String) cmbMarcas.getSelectedItem();
        if (rbtautomovil.isSelected()) {
            reporte1.tipo_ve = "Automovil";
        }else if(rbtjeep.isSelected()){
            reporte1.tipo_ve = "Jeet";
        }else if(rbtvitara.isSelected()){
            reporte1.tipo_ve = "Vitara";
        }
    reporte1.valor=txtvalor.getText();
    
     if(cmbsi.isSelected()){
            reporte1.multas="Si";
        }else{
            reporte1.multas="No";
        }
        this.dispose();
         //principal m=new principal();
         principal.escritorio.add(reporte1);
         reporte1.setVisible(true);
    


    

    }//GEN-LAST:event_btnVerActionPerformed
//    private void verFichaActionPerformed(java.awt.event.ActionEvent evt) {
//    // Cerrar el InternalFrame actual (FichaVehicular)
//    this.dispose();
//
//    // Crear y mostrar el InternalFrame del Reporte
//  reporte reporte = new reporte();
//  principal.escritorio.add(reporte1);
//  m.escritorio.add(reporte1);
//  reporte.show();
    private void txtplacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtplacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtplacaActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
      rbtgroup.add(rbtjeep);
      rbtgroup.add(rbtautomovil);
      rbtgroup.add(rbtvitara);
    }//GEN-LAST:event_formInternalFrameActivated

    private void btm_tablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_tablaActionPerformed
   try {
        TablaV reporte1 = new TablaV();
        // Validar que se haya ingresado el nombre
        if (txtnombre.getText().isEmpty()) {
            throw new IllegalArgumentException("Por favor ingrese un nombre.");
        }
        reporte1.nombre = txtnombre.getText();
        
        // Validar que se haya ingresado la cédula y que tenga 10 dígitos
        String cedula = txtcedula.getText();
        if (cedula.isEmpty()) {
            throw new IllegalArgumentException("Por favor ingrese una cédula.");
        } else if (cedula.length() != 10) {
            throw new IllegalArgumentException("La cédula debe tener 10 dígitos.");
        }
        reporte1.cedula = cedula;
        
        // Validar la placa (dos letras, tres números y una letra)
        String placa = txtplaca.getText().toUpperCase();
        if (!placa.matches("[A-Z]{2}\\d{3}[A-Z]")) {
            throw new IllegalArgumentException("Por favor ingrese una placa válida (dos letras, tres números y una letra).");
        }
        reporte1.placa = placa;
        
        // Validar el año (que no sea mayor al año actual)
        String anioStr = txtanioehiculo.getText();
        int anioActual = Calendar.getInstance().get(Calendar.YEAR);
        if (anioStr.isEmpty()) {
            throw new IllegalArgumentException("Por favor ingrese un año.");
        } else if (!anioStr.matches("\\d{4}")) {
            throw new IllegalArgumentException("Por favor ingrese un año válido.");
        } else if (Integer.parseInt(anioStr) > anioActual) {
            throw new IllegalArgumentException("El año del vehículo no puede ser mayor que el año actual.");
        }
        reporte1.anio = anioStr;
        
        reporte1.color = (String) cmbColores.getSelectedItem();
        reporte1.marca = (String) cmbMarcas.getSelectedItem();
        
        if (rbtautomovil.isSelected()) {
            reporte1.tipo_ve = "Automovil";
        } else if (rbtjeep.isSelected()) {
            reporte1.tipo_ve = "Jeet";
        } else if (rbtvitara.isSelected()) {
            reporte1.tipo_ve = "Vitara";
        }
        
        reporte1.valor = txtvalor.getText();
        
        if (cmbsi.isSelected()) {
            reporte1.multas = "Si";
        } else {
            reporte1.multas = "No";
        }
        
        this.dispose();
        principal.escritorio.add(reporte1);
        reporte1.setVisible(true);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor ingrese un año válido.", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (IllegalArgumentException e) {
        JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btm_tablaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    cedula = txtcedula.getText();
     
     try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {
    // Llamar al procedimiento almacenado
    String sql = "CALL ObtenerUsu_por_cedula(?)";
    CallableStatement pstmt = conn.prepareCall(sql);
     pstmt.setString(1, cedula);
    ResultSet rs = pstmt.executeQuery();
        // Obtener los resultados
        while (rs.next()) {
        nombre = rs.getString("nombres");
        apellido = rs.getString("apellidos");
        }
        // Mostrar los resultados
        txtnombre.setText(nombre+" "+apellido);
    rs.close();
    pstmt.close();
} catch (SQLException e) {
    e.printStackTrace();
}



    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btm_tabla;
    public static javax.swing.JButton btnVer;
    private javax.swing.JComboBox<String> cmbColores;
    private javax.swing.JComboBox<String> cmbMarcas;
    private javax.swing.JCheckBox cmbno;
    private javax.swing.JCheckBox cmbsi;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbtautomovil;
    private javax.swing.ButtonGroup rbtgroup;
    private javax.swing.JRadioButton rbtjeep;
    private javax.swing.JRadioButton rbtvitara;
    private javax.swing.JTextField txtanioehiculo;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtplaca;
    private javax.swing.JTextField txtvalor;
    // End of variables declaration//GEN-END:variables
}
