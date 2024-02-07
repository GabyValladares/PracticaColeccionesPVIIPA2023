/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Practica;

import DIU.modelo.E4_Jugador;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 59399
 */
public class Ejercicio4_formularioJugador extends javax.swing.JInternalFrame {
    DefaultTableModel ListaJugadores = new DefaultTableModel();
    DefaultTableModel tableJuveniles = new DefaultTableModel();
    DefaultTableModel tableSeniors = new DefaultTableModel();
    
    ArrayList<E4_Jugador> listaJugadores = new ArrayList();
    ArrayList<E4_Jugador> listaJugadoresJuveniles = new ArrayList();
    ArrayList<E4_Jugador> listaJugadoresSeniors = new ArrayList();
   
    public Ejercicio4_formularioJugador() {
        initComponents();
               
        String identficadores [] = {"APELLIDOS","EDAD","NACIONALIDAD","GOLES","PUESTO"};
        
        ListaJugadores.setColumnIdentifiers(identficadores);
        tblDatos.setModel(ListaJugadores);
    }

     public String[] datos(String datos) {
        String[] informacion = new String[4];

        if (datos.equalsIgnoreCase("Portero")) {
            informacion[0] = "Portero";
        }
        if (datos.equalsIgnoreCase("Defensa")) {
            informacion[0] = "Central";
            informacion[1] = "Lateral";
            informacion[2] = "Libre";
            informacion[3] = "Carrilero";
        }
        if (datos.equalsIgnoreCase("Centrocampista")) {
            informacion[0] = "Pivote";
            informacion[1] = "Media punta";
            informacion[2] = "Volante";
            informacion[3] = "Interior";
        }
        if (datos.equalsIgnoreCase("Delantero")) {
            informacion[0] = "Segundo Delantero";
            informacion[1] = "Delantero Centro";
            informacion[2] = "Extremo";
        }
        return informacion;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        cmbPuesto = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cmbOpcion = new javax.swing.JComboBox<>();
        btnFiltrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtNacionalidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtGoles = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        txtApellidos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        txtEdad = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        cmbOpcionListas = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        lblGoleadorJuvenil1 = new javax.swing.JLabel();
        lblGoleadorSenior1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        cmbPuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECCIONAR-", "portero", "defensa", "centrocampista", "delantero" }));
        cmbPuesto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPuestoItemStateChanged(evt);
            }
        });
        cmbPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPuestoActionPerformed(evt);
            }
        });

        jLabel7.setText("LISTAS ");

        cmbOpcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        cmbOpcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOpcionActionPerformed(evt);
            }
        });

        btnFiltrar.setText("Categoria");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        jLabel5.setText("Nacionalidad:");

        jLabel6.setText("Goles:");

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jLabel2.setText("REGISTRO DEL JUGADOR");

        jLabel3.setText("Apellidos:");

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblDatos);

        jLabel4.setText("Edad: ");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar Tabla");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel10.setText("Puesto:");

        cmbOpcionListas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "juveniles", "seniors" }));

        jLabel11.setText("Opción:");

        lblGoleadorJuvenil1.setText(":) ");

        lblGoleadorSenior1.setText(":)");

        jLabel12.setText("Jugador Goleador Juvenil:");

        jLabel13.setText("Jugador Goleador Senior:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(161, 161, 161)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(161, 161, 161)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbOpcion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbPuesto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtGoles))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbOpcionListas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblGoleadorSenior1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblGoleadorJuvenil1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnRegistrar)
                    .addComponent(btnLimpiar)
                    .addComponent(btnFiltrar))
                .addGap(405, 405, 405))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(cmbOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtGoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cmbOpcionListas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(lblGoleadorJuvenil1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(lblGoleadorSenior1))
                        .addGap(29, 29, 29)
                        .addComponent(btnRegistrar)
                        .addGap(34, 34, 34)
                        .addComponent(btnFiltrar)
                        .addGap(55, 55, 55)
                        .addComponent(btnLimpiar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarTabla();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        String puesto = cmbPuesto.getSelectedItem().toString();
        String opcion = cmbOpcion.getSelectedItem().toString();

        E4_Jugador jugador1 = new E4_Jugador(txtApellidos.getText(),
            Integer.parseInt(txtEdad.getText()),
            txtNacionalidad.getText(),
            Integer.parseInt(txtGoles.getText()),
            puesto + opcion);

        listaJugadores.add(jugador1);

        ListaJugadores.addRow(new Object[]{
            jugador1.getApellidos(), jugador1.getEdad(), jugador1.getPuesto(), jugador1.getNacionalidad(), jugador1.getGoles()
        });

       // if (Integer.parseInt(jugador1.getEdad()) < 23) {
            listaJugadoresJuveniles.add(jugador1);

       // } else if (Integer.parseInt(jugador1.getEdad()) >= 23) {
            listaJugadoresSeniors.add(jugador1);
      //  }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed

        String opcionLista = cmbOpcionListas.getSelectedItem().toString();

        System.out.println(opcionLista);

        if (opcionLista.equals("JUVENILES")) {
            imprimirJuveniles();
            goleadorJuvenil();

        } else if (opcionLista.equalsIgnoreCase("SENIORS")) {
            imprimirSeniors();
            goleadorSenior();
        }
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void cmbOpcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOpcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbOpcionActionPerformed

    private void cmbPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPuestoActionPerformed

    }//GEN-LAST:event_cmbPuestoActionPerformed

    private void cmbPuestoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPuestoItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (this.cmbPuesto.getSelectedIndex() > 0) {
                this.cmbOpcion.setModel(new DefaultComboBoxModel(this.datos(this.cmbPuesto.getSelectedItem().toString())));
            }
        }
    }//GEN-LAST:event_cmbPuestoItemStateChanged
    private void limpiarTabla() {
        int filas = ListaJugadores.getRowCount();
        for (int i = 0; i < filas; i++) {
            ListaJugadores.removeRow(0);

        }
    }
    private void imprimirJuveniles() {
        limpiarTabla();

        for (E4_Jugador jugador : listaJugadoresJuveniles) {

            ListaJugadores.addRow(new Object[]{
                jugador.getApellidos(), jugador.getEdad(), jugador.getPuesto(), jugador.getNacionalidad(), jugador.getGoles()
            });

        }
    }
    private void imprimirSeniors() {
        limpiarTabla();

        for (E4_Jugador jugador : listaJugadoresSeniors) {

             ListaJugadores.addRow(new Object[]{
                jugador.getApellidos(), jugador.getEdad(), jugador.getPuesto(), jugador.getNacionalidad(), jugador.getGoles()
            });
        }
    }
    private void goleadorJuvenil() {
        E4_Jugador JMayorGoles = null;

        for (E4_Jugador jugador : listaJugadoresJuveniles) {
       //     if (JMayorGoles == null || Integer.parseInt(jugador.getGoles()) > Integer.parseInt(JMayorGoles.getGoles())) {
                JMayorGoles = jugador;
         //  }
        }

       // if (JMayorGoles != null) {
            String goleador1 = JMayorGoles.getApellidos() + JMayorGoles.getGoles();

          //  lblGoleadorJuvenil.setText("Nombre: " + goleador1 + ", Nro de goles: " + JMayorGoles.getGoles());
        //} else {
        //    lblGoleadorJuvenil.setText("No hay goleador juvenil registrado.");
       // }
    }
    
    private void goleadorSenior() {
        E4_Jugador jSMayorGoles = null;

        for (E4_Jugador jugador : listaJugadoresSeniors) {
          //  if (jSMayorGoles == null || Integer.parseInt(jugador.getGoles()) > Integer.parseInt(jSMayorGoles.getGoles())) {
                jSMayorGoles = jugador;
            //}
        }

        if (jSMayorGoles != null) {
            String goleador1 = jSMayorGoles.getApellidos() + jSMayorGoles.getGoles();

          // lblGoleadorSenior.setText("Nombre: " + goleador1 + ", Nro de goles: " + jSMayorGoles.getGoles());
        } else {
          //  lblGoleadorSenior.setText("No hay goleador senior registrado.");
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbOpcion;
    private javax.swing.JComboBox<String> cmbOpcionListas;
    private javax.swing.JComboBox<String> cmbPuesto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblGoleadorJuvenil1;
    private javax.swing.JLabel lblGoleadorSenior1;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtGoles;
    private javax.swing.JTextField txtNacionalidad;
    // End of variables declaration//GEN-END:variables

    
}
