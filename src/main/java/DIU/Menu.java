/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DIU;

import DIU.Ejercicio1.Ejercicio1;
import DIU.Ejercicio2.Ejercicio2;
import DIU.Ejercicio3.Ejercicio3;
import DIU.Ejercicio4.Ejercicio4;
import DIU.Ejercicio5.Ejercicio5;
import DIU.Ejercicio6.Ejercicio6;
import DIU.Ejercicio7.Ejercicio7;
import DIU.Ejercicio8.Ejercicio8;
import DIU.EjerciciosFichaVehicular.FichaVehicular;
import DIU.vista.LDTable;
import DIU.vista.ListasDinamicas;
//import DIU.vista.PersonaView;

/**
 *
 * @author Usuario
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuListas = new javax.swing.JMenu();
        opLEstatico = new javax.swing.JMenuItem();
        opLDinamicas = new javax.swing.JMenuItem();
        opDTable = new javax.swing.JMenuItem();
        menuPilas = new javax.swing.JMenu();
        menuArboles = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        opFichaVehicular = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        opEjercicio1 = new javax.swing.JMenuItem();
        opEjercicio2 = new javax.swing.JMenuItem();
        opEjercicio3 = new javax.swing.JMenuItem();
        opEjericio4 = new javax.swing.JMenuItem();
        opEjercicio5 = new javax.swing.JMenuItem();
        opEjercicio6 = new javax.swing.JMenuItem();
        opEjercicio7 = new javax.swing.JMenuItem();
        opEjercicio8 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        opGestionUsuario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1387, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 564, Short.MAX_VALUE)
        );

        menuListas.setText("Listas");

        opLEstatico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        opLEstatico.setText("Estáticas");
        opLEstatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opLEstaticoActionPerformed(evt);
            }
        });
        menuListas.add(opLEstatico);

        opLDinamicas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        opLDinamicas.setText("Dinámicas");
        opLDinamicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opLDinamicasActionPerformed(evt);
            }
        });
        menuListas.add(opLDinamicas);

        opDTable.setText("Listas / Table");
        opDTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opDTableActionPerformed(evt);
            }
        });
        menuListas.add(opDTable);

        jMenuBar1.add(menuListas);

        menuPilas.setText("Pilas");
        jMenuBar1.add(menuPilas);

        menuArboles.setText("Árboles");
        jMenuBar1.add(menuArboles);

        jMenu1.setText("Colas");

        jMenuItem1.setText("jMenuItem1");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Ficha Vehicular");

        opFichaVehicular.setText("FichaVehicular");
        opFichaVehicular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opFichaVehicularActionPerformed(evt);
            }
        });
        jMenu3.add(opFichaVehicular);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Ejercicios");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        opEjercicio1.setText("Ejercicio1");
        opEjercicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opEjercicio1ActionPerformed(evt);
            }
        });
        jMenu4.add(opEjercicio1);

        opEjercicio2.setText("Ejercicio2");
        opEjercicio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opEjercicio2ActionPerformed(evt);
            }
        });
        jMenu4.add(opEjercicio2);

        opEjercicio3.setText("Ejercicio3");
        opEjercicio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opEjercicio3ActionPerformed(evt);
            }
        });
        jMenu4.add(opEjercicio3);

        opEjericio4.setText("Ejercicio4");
        opEjericio4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opEjericio4ActionPerformed(evt);
            }
        });
        jMenu4.add(opEjericio4);

        opEjercicio5.setText("Ejercicio5");
        opEjercicio5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opEjercicio5ActionPerformed(evt);
            }
        });
        jMenu4.add(opEjercicio5);

        opEjercicio6.setText("Ejercicio6");
        opEjercicio6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opEjercicio6ActionPerformed(evt);
            }
        });
        jMenu4.add(opEjercicio6);

        opEjercicio7.setText("Ejercicio7");
        opEjercicio7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opEjercicio7ActionPerformed(evt);
            }
        });
        jMenu4.add(opEjercicio7);

        opEjercicio8.setText("Ejercicio8");
        opEjercicio8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opEjercicio8ActionPerformed(evt);
            }
        });
        jMenu4.add(opEjercicio8);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("Administración");

        opGestionUsuario.setText("Gestión Usuario");
        opGestionUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opGestionUsuarioActionPerformed(evt);
            }
        });
        jMenu2.add(opGestionUsuario);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opLEstaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opLEstaticoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_opLEstaticoActionPerformed

    private void opFichaVehicularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opFichaVehicularActionPerformed
        FichaVehicular ventanaLE = new FichaVehicular();
        escritorio.add(ventanaLE);
        ventanaLE.show();
    }//GEN-LAST:event_opFichaVehicularActionPerformed

    private void opLDinamicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opLDinamicasActionPerformed
        ListasDinamicas ld = new ListasDinamicas();
        escritorio.add(ld);
        ld.show();
    }//GEN-LAST:event_opLDinamicasActionPerformed

    private void opDTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opDTableActionPerformed
        LDTable ldtable = new LDTable();
        escritorio.add(ldtable);
        ldtable.show();
    }//GEN-LAST:event_opDTableActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void opEjercicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opEjercicio1ActionPerformed
        // TODO add your handling code here:
        Ejercicio1 eje1 = new Ejercicio1();
        escritorio.add(eje1);
        eje1.show();
    }//GEN-LAST:event_opEjercicio1ActionPerformed

    private void opEjercicio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opEjercicio2ActionPerformed
        // TODO add your handling code here:
        Ejercicio2 eje2 = new Ejercicio2();
        escritorio.add(eje2);
        eje2.show();
    }//GEN-LAST:event_opEjercicio2ActionPerformed

    private void opEjercicio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opEjercicio3ActionPerformed
        // TODO add your handling code here:
        Ejercicio3 eje3 = new Ejercicio3();
        escritorio.add(eje3);
        eje3.show();
    }//GEN-LAST:event_opEjercicio3ActionPerformed

    private void opEjericio4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opEjericio4ActionPerformed
        // TODO add your handling code here:
        Ejercicio4 eje4 = new Ejercicio4();
        escritorio.add(eje4);
        eje4.show();
    }//GEN-LAST:event_opEjericio4ActionPerformed

    private void opEjercicio5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opEjercicio5ActionPerformed
        // TODO add your handling code here:
        Ejercicio5 eje5 = new Ejercicio5();
        escritorio.add(eje5);
        eje5.show();
    }//GEN-LAST:event_opEjercicio5ActionPerformed

    private void opEjercicio6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opEjercicio6ActionPerformed
        // TODO add your handling code here:
        Ejercicio6 eje6 = new Ejercicio6();
        escritorio.add(eje6);
        eje6.show();
    }//GEN-LAST:event_opEjercicio6ActionPerformed

    private void opEjercicio7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opEjercicio7ActionPerformed
        // TODO add your handling code here:
        Ejercicio7 eje7 = new Ejercicio7();
        escritorio.add(eje7);
        eje7.show();
    }//GEN-LAST:event_opEjercicio7ActionPerformed

    private void opEjercicio8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opEjercicio8ActionPerformed
        // TODO add your handling code here:
        Ejercicio8 eje8 = new Ejercicio8();
        escritorio.add(eje8);
        eje8.show();
    }//GEN-LAST:event_opEjercicio8ActionPerformed

    private void opGestionUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opGestionUsuarioActionPerformed
//        // TODO add your handling code here:
//        PersonaView pv=new PersonaView();
//        escritorio.add(pv);
//        pv.show();
    }//GEN-LAST:event_opGestionUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menuArboles;
    private javax.swing.JMenu menuListas;
    private javax.swing.JMenu menuPilas;
    private javax.swing.JMenuItem opDTable;
    private javax.swing.JMenuItem opEjercicio1;
    private javax.swing.JMenuItem opEjercicio2;
    private javax.swing.JMenuItem opEjercicio3;
    private javax.swing.JMenuItem opEjercicio5;
    private javax.swing.JMenuItem opEjercicio6;
    private javax.swing.JMenuItem opEjercicio7;
    private javax.swing.JMenuItem opEjercicio8;
    private javax.swing.JMenuItem opEjericio4;
    private javax.swing.JMenuItem opFichaVehicular;
    private javax.swing.JMenuItem opGestionUsuario;
    private javax.swing.JMenuItem opLDinamicas;
    private javax.swing.JMenuItem opLEstatico;
    // End of variables declaration//GEN-END:variables
}
