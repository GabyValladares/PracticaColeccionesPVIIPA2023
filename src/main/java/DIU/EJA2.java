/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package DIU;

import java.awt.event.ItemEvent;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 59398
 */
public class EJA2 extends javax.swing.JInternalFrame {

    /**
     */
    public EJA2() {
        initComponents();
    }
        
    public String[] datos(String datos) {
        String[] informacion = new String[4];
        if (datos.equalsIgnoreCase("Portero")) {
            informacion[0] = "P:Portero";
        }
        if (datos.equalsIgnoreCase("Defensa")) {
            informacion[0] = "Def:Defensa central";
            informacion[1] = "Def:Lateral";
            informacion[2] = "Def:Libre";
            informacion[3] = "Def:Carrilero";
        }

        if (datos.equalsIgnoreCase("Centrocampista")) {
            informacion[0] = "Cen:Pivote";
            informacion[1] = "Cen:Media punta";
            informacion[2] = "Cen:Volante";
            informacion[3] = "Cen:Interior";
        }

        if (datos.equalsIgnoreCase("Delantero")) {
            informacion[0] = "Delan:Segundo delantero";
            informacion[1] = "Delan:Delantero centro";
            informacion[2] = "Delan:Extremo";
        }
        return informacion;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        combo1 = new javax.swing.JComboBox<>();
        combo2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNacionalidad = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtGoles = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnLimpiarT = new javax.swing.JButton();
        btnAgregarJ = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtGolJuvenil = new javax.swing.JTextField();
        txtGolSenior = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Arraylist 2 Objetos");
        setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel1.setText("Edad:");

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel2.setText("Apellidos:");

        combo1.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
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

        combo2.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        combo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel3.setText("Nacionalidad:");

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel4.setText("Goles:");

        txtNacionalidad.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N

        txtApellidos.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N

        txtEdad.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N

        txtGoles.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(255, 153, 255));
        jTable1.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
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

        btnLimpiarT.setBackground(new java.awt.Color(255, 51, 0));
        btnLimpiarT.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        btnLimpiarT.setText("Limpiar Tabla");
        btnLimpiarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarTActionPerformed(evt);
            }
        });

        btnAgregarJ.setBackground(new java.awt.Color(102, 255, 102));
        btnAgregarJ.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        btnAgregarJ.setText("Agregar Jugador");
        btnAgregarJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarJActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel5.setText("Maximos Goleadores Senior:");

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel6.setText("Maximos Goleadores Juvenil:");

        txtGolJuvenil.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N

        txtGolSenior.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnAgregarJ, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(23, 23, 23)))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(84, 84, 84))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(combo2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(combo1, 0, 128, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtGoles, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(209, 209, 209))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtGolSenior, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(109, 109, 109)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtGolJuvenil, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiarT, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 26, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addComponent(combo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtGoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(combo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(btnAgregarJ, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(btnLimpiarT, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtGolSenior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtGolJuvenil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(192, 192, 192))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private ArrayList<Jugador> jugadores = new ArrayList<>();
    private Jugador maximoGoleadorJuvenil;
    private Jugador maximoGoleadorSenior;
    private void combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo1ActionPerformed

    private void combo1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo1ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
        if (this.combo1.getSelectedIndex() > 0) {
            this.combo2.setModel(new DefaultComboBoxModel(this.datos(this.combo1.getSelectedItem().toString())));
        }
    }

    }//GEN-LAST:event_combo1ItemStateChanged

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

    private void btnLimpiarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarTActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);
    }//GEN-LAST:event_btnLimpiarTActionPerformed

    private void combo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo2ActionPerformed
    
    private void actualizarTabla() {
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

        txtGolJuvenil.setText(goleadorJuvenil);
        txtGolSenior.setText(goleadorSenior);

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtGolJuvenil;
    private javax.swing.JTextField txtGolSenior;
    private javax.swing.JTextField txtGoles;
    private javax.swing.JTextField txtNacionalidad;
    // End of variables declaration//GEN-END:variables
}
