/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DIU;

import DIU.Deber.ALEj3;
import DIU.Deber.ALEj4;
import DIU.Deber.ColasEj7;
import DIU.Deber.LEEj2;
import DIU.Deber.LEEj1;
import DIU.Deber.PilasEj5;
import DIU.Deber.PilasEj6;
import DIU.Vista.LbTable;

/**
 *
 * @author tutut
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
        opLDinamica = new javax.swing.JMenuItem();
        opLEEj1 = new javax.swing.JMenuItem();
        opLEEj2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        opAlEj3 = new javax.swing.JMenuItem();
        opALEj4 = new javax.swing.JMenuItem();
        menuPilas = new javax.swing.JMenu();
        opPilasEj5 = new javax.swing.JMenuItem();
        opPEj6 = new javax.swing.JMenuItem();
        menuArboles = new javax.swing.JMenu();
        menuColas = new javax.swing.JMenu();
        opCEj7 = new javax.swing.JMenuItem();
        menuFichaVehicular = new javax.swing.JMenu();
        opFicha = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1459, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 541, Short.MAX_VALUE)
        );

        menuListas.setText("Listas");

        opLEstatico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        opLEstatico.setText("Estaticas");
        opLEstatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opLEstaticoActionPerformed(evt);
            }
        });
        menuListas.add(opLEstatico);

        opLDinamica.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        opLDinamica.setText("Dinamicas");
        opLDinamica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opLDinamicaActionPerformed(evt);
            }
        });
        menuListas.add(opLDinamica);

        opLEEj1.setText("L.E.Ej1");
        opLEEj1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opLEEj1ActionPerformed(evt);
            }
        });
        menuListas.add(opLEEj1);

        opLEEj2.setText("L.E.Ej2");
        opLEEj2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opLEEj2ActionPerformed(evt);
            }
        });
        menuListas.add(opLEEj2);

        jMenuItem1.setText("Manejo de table");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuListas.add(jMenuItem1);

        opAlEj3.setText("Array List Ej3");
        opAlEj3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opAlEj3ActionPerformed(evt);
            }
        });
        menuListas.add(opAlEj3);

        opALEj4.setText("AL Ej 4");
        opALEj4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opALEj4ActionPerformed(evt);
            }
        });
        menuListas.add(opALEj4);

        jMenuBar1.add(menuListas);

        menuPilas.setText("Pilas");
        menuPilas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPilasActionPerformed(evt);
            }
        });

        opPilasEj5.setText("Pilas Ej 5");
        opPilasEj5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opPilasEj5ActionPerformed(evt);
            }
        });
        menuPilas.add(opPilasEj5);

        opPEj6.setText("Pilas Ej 6");
        opPEj6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opPEj6ActionPerformed(evt);
            }
        });
        menuPilas.add(opPEj6);

        jMenuBar1.add(menuPilas);

        menuArboles.setText("Arboles");
        jMenuBar1.add(menuArboles);

        menuColas.setText("Colas");

        opCEj7.setText("Colas Ej 7");
        opCEj7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCEj7ActionPerformed(evt);
            }
        });
        menuColas.add(opCEj7);

        jMenuBar1.add(menuColas);

        menuFichaVehicular.setText("Ficha Vehicular");
        menuFichaVehicular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFichaVehicularActionPerformed(evt);
            }
        });

        opFicha.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        opFicha.setText("Ver Ficha");
        opFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opFichaActionPerformed(evt);
            }
        });
        menuFichaVehicular.add(opFicha);

        jMenuBar1.add(menuFichaVehicular);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opLEstaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opLEstaticoActionPerformed
        // TODO add your handling code here:
        ListasEstaticas ventanaLE= new ListasEstaticas();
        escritorio.add(ventanaLE);
        ventanaLE.show();
    }//GEN-LAST:event_opLEstaticoActionPerformed

    private void menuFichaVehicularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFichaVehicularActionPerformed
        // TODO add your handling code here:  
    }//GEN-LAST:event_menuFichaVehicularActionPerformed

    private void opFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opFichaActionPerformed
        // TODO add your handling code here:
        FichaVehicular ventanaFV = new FichaVehicular();
        escritorio.add(ventanaFV);
        ventanaFV.show();
    }//GEN-LAST:event_opFichaActionPerformed

    private void opLEEj1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opLEEj1ActionPerformed
        // TODO add your handling code here:
        LEEj1 ventanaEj1 = new LEEj1();
        escritorio.add(ventanaEj1);
        ventanaEj1.show();
    }//GEN-LAST:event_opLEEj1ActionPerformed

    private void opLEEj2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opLEEj2ActionPerformed
        // TODO add your handling code here:
        LEEj2 ventanaEj2 = new LEEj2();
        escritorio.add(ventanaEj2);
        ventanaEj2.show();
    }//GEN-LAST:event_opLEEj2ActionPerformed

    private void opLDinamicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opLDinamicaActionPerformed
        // TODO add your handling code here:
      ListasDinamicas ventanaLD = new ListasDinamicas();
      escritorio.add(ventanaLD);
      ventanaLD.show();
             
    }//GEN-LAST:event_opLDinamicaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        LbTable ventanaTable = new LbTable();
        escritorio.add(ventanaTable);
        ventanaTable.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void opAlEj3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opAlEj3ActionPerformed
        // TODO add your handling code here:
        ALEj3 ventanaAlEj3 = new ALEj3();
        escritorio.add(ventanaAlEj3);
        ventanaAlEj3.show();
    }//GEN-LAST:event_opAlEj3ActionPerformed

    private void opALEj4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opALEj4ActionPerformed
        // TODO add your handling code here:
        ALEj4 ventanaAlEj4 = new ALEj4();
        escritorio.add(ventanaAlEj4);
        ventanaAlEj4.show();
    }//GEN-LAST:event_opALEj4ActionPerformed

    private void menuPilasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPilasActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_menuPilasActionPerformed

    private void opPEj6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opPEj6ActionPerformed
        // TODO add your handling code here:
        PilasEj6 ventanaPilasEj6 = new PilasEj6();
        escritorio.add(ventanaPilasEj6);
        ventanaPilasEj6.show();
    }//GEN-LAST:event_opPEj6ActionPerformed

    private void opCEj7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCEj7ActionPerformed
        // TODO add your handling code here:
        ColasEj7 ventanaColasEj7=new ColasEj7();
        escritorio.add(ventanaColasEj7);
        ventanaColasEj7.show();
    }//GEN-LAST:event_opCEj7ActionPerformed

    private void opPilasEj5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opPilasEj5ActionPerformed
        // TODO add your handling code here:
        PilasEj5 ventanaPilasEj5 = new PilasEj5();
        escritorio.add(ventanaPilasEj5);
        ventanaPilasEj5.show();
    }//GEN-LAST:event_opPilasEj5ActionPerformed

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
    public static javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menuArboles;
    private javax.swing.JMenu menuColas;
    private javax.swing.JMenu menuFichaVehicular;
    private javax.swing.JMenu menuListas;
    private javax.swing.JMenu menuPilas;
    private javax.swing.JMenuItem opALEj4;
    private javax.swing.JMenuItem opAlEj3;
    private javax.swing.JMenuItem opCEj7;
    private javax.swing.JMenuItem opFicha;
    private javax.swing.JMenuItem opLDinamica;
    private javax.swing.JMenuItem opLEEj1;
    private javax.swing.JMenuItem opLEEj2;
    private javax.swing.JMenuItem opLEstatico;
    private javax.swing.JMenuItem opPEj6;
    private javax.swing.JMenuItem opPilasEj5;
    // End of variables declaration//GEN-END:variables
}
