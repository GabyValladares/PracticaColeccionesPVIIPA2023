/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DIU;

import DIU.Tareas.Ejercicio1;
import DIU.Tareas.Ejercicio2;
import DIU.Tareas.Ejercicio3;
import DIU.Tareas.Ejercicio4;
import DIU.Tareas.Ejercicio5;
import DIU.Tareas.Ejercicio6;
import DIU.Tareas.Ejercicio7;
import DIU.Tareas.Ejercicio8;
import DIU.EjerciciosFichaVehicular.FichaVehicular;
import DIU.vista.LDTable;
import DIU.vista.ListasDinamicas;
import Listas.ListasEstaticass;

/**
 *
 * @author Belial
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
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        MenuTareas = new javax.swing.JMenu();
        opLTarea1 = new javax.swing.JMenuItem();
        opLTarea2 = new javax.swing.JMenuItem();
        opLTarea3 = new javax.swing.JMenuItem();
        opLTarea4 = new javax.swing.JMenuItem();
        menuPilas = new javax.swing.JMenu();
        opLTarea5 = new javax.swing.JMenuItem();
        opLTarea6 = new javax.swing.JMenuItem();
        menuArboles = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        opLTarea7 = new javax.swing.JMenuItem();
        opLTarea8 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        opFichaVehicular = new javax.swing.JMenuItem();

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

        opLEstatico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        opLEstatico.setText("Estáticas");
        opLEstatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opLEstaticoActionPerformed(evt);
            }
        });
        menuListas.add(opLEstatico);

        opLDinamicas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
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
        menuListas.add(jSeparator1);

        MenuTareas.setText("Tareas Listas Estaticas");

        opLTarea1.setText("Tarea 1");
        opLTarea1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opLTarea1ActionPerformed(evt);
            }
        });
        MenuTareas.add(opLTarea1);

        opLTarea2.setText("Tarea 2");
        opLTarea2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opLTarea2ActionPerformed(evt);
            }
        });
        MenuTareas.add(opLTarea2);

        opLTarea3.setText("Tarea 3");
        opLTarea3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opLTarea3ActionPerformed(evt);
            }
        });
        MenuTareas.add(opLTarea3);

        opLTarea4.setText("Tarea 4");
        opLTarea4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opLTarea4ActionPerformed(evt);
            }
        });
        MenuTareas.add(opLTarea4);

        menuListas.add(MenuTareas);

        jMenuBar1.add(menuListas);

        menuPilas.setText("Pilas");

        opLTarea5.setText("Tarea 5");
        opLTarea5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opLTarea5ActionPerformed(evt);
            }
        });
        menuPilas.add(opLTarea5);

        opLTarea6.setText("Tarea 6");
        opLTarea6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opLTarea6ActionPerformed(evt);
            }
        });
        menuPilas.add(opLTarea6);

        jMenuBar1.add(menuPilas);

        menuArboles.setText("Árboles");
        jMenuBar1.add(menuArboles);

        jMenu1.setText("Colas");

        opLTarea7.setText("Tarea 7");
        opLTarea7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opLTarea7ActionPerformed(evt);
            }
        });
        jMenu1.add(opLTarea7);

        opLTarea8.setText("Tarea 8");
        opLTarea8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opLTarea8ActionPerformed(evt);
            }
        });
        jMenu1.add(opLTarea8);

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

    private void opFichaVehicularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opFichaVehicularActionPerformed
        FichaVehicular ventanaLE = new FichaVehicular();
        escritorio.add(ventanaLE);
        ventanaLE.show();
    }//GEN-LAST:event_opFichaVehicularActionPerformed
    
    private void opDTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opDTableActionPerformed
        LDTable ldtable = new LDTable();
        escritorio.add(ldtable);
        ldtable.show();
    }//GEN-LAST:event_opDTableActionPerformed

    private void opLDinamicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opLDinamicasActionPerformed
        ListasDinamicas ld = new ListasDinamicas();
        escritorio.add(ld);
        ld.show();
    }//GEN-LAST:event_opLDinamicasActionPerformed

    private void opLEstaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opLEstaticoActionPerformed
        ListasEstaticass estaticas =  new ListasEstaticass();
        escritorio.add(estaticas);
        estaticas.show();
    }//GEN-LAST:event_opLEstaticoActionPerformed

    private void opLTarea1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opLTarea1ActionPerformed
        // TODO add your handling code here:
        Ejercicio1 eje1 = new Ejercicio1();
        escritorio.add(eje1);
        eje1.show();
    }//GEN-LAST:event_opLTarea1ActionPerformed

    private void opLTarea2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opLTarea2ActionPerformed
        // TODO add your handling code here:
        Ejercicio2 eje2 = new Ejercicio2();
        escritorio.add(eje2);
        eje2.show();
    }//GEN-LAST:event_opLTarea2ActionPerformed

    private void opLTarea3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opLTarea3ActionPerformed
        // TODO add your handling code here:
        Ejercicio3 eje3 = new Ejercicio3();
        escritorio.add(eje3);
        eje3.show();
    }//GEN-LAST:event_opLTarea3ActionPerformed

    private void opLTarea4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opLTarea4ActionPerformed
        // TODO add your handling code here:
        Ejercicio4 eje4 = new Ejercicio4();
        escritorio.add(eje4);
        eje4.show();
    }//GEN-LAST:event_opLTarea4ActionPerformed

    private void opLTarea5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opLTarea5ActionPerformed
        // TODO add your handling code here:
        Ejercicio5 eje5 = new Ejercicio5();
        escritorio.add(eje5);
        eje5.show();
    }//GEN-LAST:event_opLTarea5ActionPerformed

    private void opLTarea6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opLTarea6ActionPerformed
        // TODO add your handling code here:
        Ejercicio6 eje6 = new Ejercicio6();
        escritorio.add(eje6);
        eje6.show();
    }//GEN-LAST:event_opLTarea6ActionPerformed

    private void opLTarea7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opLTarea7ActionPerformed
        // TODO add your handling code here:
        Ejercicio7 eje7 = new Ejercicio7();
        escritorio.add(eje7);
        eje7.show();
    }//GEN-LAST:event_opLTarea7ActionPerformed

    private void opLTarea8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opLTarea8ActionPerformed
        // TODO add your handling code here:
          Ejercicio8 eje8 = new Ejercicio8();
        escritorio.add(eje8);
        eje8.show();
    }//GEN-LAST:event_opLTarea8ActionPerformed

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
    private javax.swing.JMenu MenuTareas;
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuArboles;
    private javax.swing.JMenu menuListas;
    private javax.swing.JMenu menuPilas;
    private javax.swing.JMenuItem opDTable;
    private javax.swing.JMenuItem opFichaVehicular;
    private javax.swing.JMenuItem opLDinamicas;
    private javax.swing.JMenuItem opLEstatico;
    private javax.swing.JMenuItem opLTarea1;
    private javax.swing.JMenuItem opLTarea2;
    private javax.swing.JMenuItem opLTarea3;
    private javax.swing.JMenuItem opLTarea4;
    private javax.swing.JMenuItem opLTarea5;
    private javax.swing.JMenuItem opLTarea6;
    private javax.swing.JMenuItem opLTarea7;
    private javax.swing.JMenuItem opLTarea8;
    // End of variables declaration//GEN-END:variables
}
