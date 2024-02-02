/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package DIU.COLECCIONES;

import java.awt.event.ItemEvent;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tutut
 */
public class ArrayListJugadores extends javax.swing.JInternalFrame {

    /**
     * Creates new form ALEj4
     */
    public ArrayListJugadores() {
        initComponents();
    }

    public String[] datos(String datos) {
        String[] informacion = new String[4];
        if (datos.equalsIgnoreCase("Portero")) {
            informacion[0] = "Portero";
        }
        if (datos.equalsIgnoreCase("Defensa")) {
            informacion[0] = "Defensa central";
            informacion[1] = "Lateral";
            informacion[2] = "Libre";
            informacion[3] = "Carrilero";
        }

        if (datos.equalsIgnoreCase("Centrocampista")) {
            informacion[0] = "Pivote";
            informacion[1] = "Media Punta";
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

        jLabel2 = new javax.swing.JLabel();
        btnLimpiarT = new javax.swing.JButton();
        combo1 = new javax.swing.JComboBox<>();
        btnAgregarJ = new javax.swing.JButton();
        combo2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNacionalidad = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtGoles = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblGSenior = new javax.swing.JLabel();
        lblGJuv = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblEtiqueta = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Ejercicio 4");

        jLabel2.setText("Apellidos:");

        btnLimpiarT.setText("Limpiar Tabla");
        btnLimpiarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarTActionPerformed(evt);
            }
        });

        combo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Portero", "Defensa", "Centrocampista", "Delantero" }));
        combo1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo1ItemStateChanged(evt);
            }
        });
        combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo1ActionPerformed(evt);
            }
        });

        btnAgregarJ.setText("Agregar Jugador");
        btnAgregarJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarJActionPerformed(evt);
            }
        });

        combo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Maximos Goleadores Senior:");

        jLabel3.setText("Nacionalidad:");

        jLabel6.setText("Maximos Goleadores Juvenil:");

        jLabel4.setText("Goles:");

        jLabel1.setText("Edad:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Jugadores", "Apellidos", "Edad", "Puesto", "Nacionalidad", "Goles"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        lblEtiqueta.setText("Tabla de jugadores:");

        jLabel7.setText("Puesto:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblGJuv, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblGSenior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(102, 102, 102))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(combo1, javax.swing.GroupLayout.Alignment.LEADING, 0, 156, Short.MAX_VALUE)
                                        .addComponent(combo2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtGoles, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnLimpiarT, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAgregarJ))
                                    .addComponent(jLabel7))
                                .addGap(135, 135, 135)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEtiqueta)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(179, 179, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEtiqueta)
                    .addComponent(jLabel1)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtGoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(lblGSenior, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(lblGJuv, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpiarT)
                            .addComponent(btnAgregarJ)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarTActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);
    }//GEN-LAST:event_btnLimpiarTActionPerformed

    private void combo1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo1ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (this.combo1.getSelectedIndex() > 0) {
                this.combo2.setModel(new DefaultComboBoxModel(this.datos(this.combo1.getSelectedItem().toString())));
            }
        }
    }//GEN-LAST:event_combo1ItemStateChanged

    private void combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo1ActionPerformed

    private void btnAgregarJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarJActionPerformed
        String apellidos = txtApellidos.getText();
        int edad = Integer.parseInt(txtEdad.getText());
        String puesto = combo2.getSelectedItem().toString();
        String nacionalidad = txtNacionalidad.getText();
        int goles = Integer.parseInt(txtGoles.getText());

        Jugador nuevoJugador = new Jugador(apellidos, edad, puesto, nacionalidad, goles);
        jugadores.add(nuevoJugador);
        actualizarTabla();
        indicarGoleadores(nuevoJugador);
        txtApellidos.setText("");
        txtEdad.setText("");
        txtNacionalidad.setText("");
        txtGoles.setText("");
    }//GEN-LAST:event_btnAgregarJActionPerformed

    private void combo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo2ActionPerformed
    private ArrayList<Jugador> jugadores = new ArrayList<>();
    private Jugador maximoGoleadorJuvenil;
    private Jugador maximoGoleadorSenior;    private void actualizarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);

        for (Jugador jugador : jugadores) {
            String tipoJugador = (jugador.getEdad() < 23) ? "Juvenil" : "Senior";
            Object[] fila = {tipoJugador, jugador.getApellidos(), jugador.getEdad(), jugador.getPuesto(), jugador.getNacionalidad(), jugador.getGoles()};
            modelo.addRow(fila);
        }
        
    }
    private void indicarGoleadores(Jugador nuevoJugador) {
        int maxGolesJuvenil = 0;
        int maxGolesSenior = 0;
        String goleadorJuvenil = "";
        String goleadorSenior = "";

        for (Jugador jugador : jugadores) {
            if (jugador.getEdad() <= 23) {
                if (jugador.getGoles() > maxGolesJuvenil) {
                    maxGolesJuvenil = jugador.getGoles();
                    goleadorJuvenil = jugador.getApellidos();
                }
            } else {
                if (jugador.getGoles() > maxGolesSenior) {
                    maxGolesSenior = jugador.getGoles();
                    goleadorSenior = jugador.getApellidos();
                }
            }
        }

        lblGJuv.setText(goleadorJuvenil);
        lblGSenior.setText(goleadorSenior);

}
    
    private static class Jugador {
        private String apellidos;
        private int edad;
        private String puesto;
        private String nacionalidad;
        private int goles;

        public Jugador(String apellidos, int edad, String puesto, String nacionalidad, int goles) {
            this.apellidos = apellidos;
            this.edad = edad;
            this.puesto = puesto;
            this.nacionalidad = nacionalidad;
            this.goles = goles;
        }

        public String getApellidos() {
            return apellidos;
        }

        public int getEdad() {
            return edad;
        }

        public String getPuesto() {
            return puesto;
        }

        public String getNacionalidad() {
            return nacionalidad;
        }

        public int getGoles() {
            return goles;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarJ;
    private javax.swing.JButton btnLimpiarT;
    private javax.swing.JComboBox<String> combo1;
    private javax.swing.JComboBox<String> combo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblEtiqueta;
    private javax.swing.JLabel lblGJuv;
    private javax.swing.JLabel lblGSenior;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtGoles;
    private javax.swing.JTextField txtNacionalidad;
    // End of variables declaration//GEN-END:variables
}
