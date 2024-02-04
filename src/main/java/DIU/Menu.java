/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DIU;

import DIU.vistas.LDTabla;
import DIU.vistas.PersonaView;
import Practica.Ejercicio1_ListaEstaticas;
import Practica.Ejercicio2_ListaPalabras;

/**
 *
 * @author 59399
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
        MenuListas = new javax.swing.JMenu();
        opLEstatica = new javax.swing.JMenuItem();
        opLDinamica = new javax.swing.JMenuItem();
        oplTabla = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuArboles = new javax.swing.JMenu();
        MenuColas = new javax.swing.JMenu();
        MenuFichaV = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        opEjercicio1 = new javax.swing.JMenuItem();
        opEjercicio2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1282, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 614, Short.MAX_VALUE)
        );

        MenuListas.setText("Listas");

        opLEstatica.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        opLEstatica.setText("Estáticas");
        opLEstatica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opLEstaticaActionPerformed(evt);
            }
        });
        MenuListas.add(opLEstatica);

        opLDinamica.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        opLDinamica.setText("Dinamica");
        opLDinamica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opLDinamicaActionPerformed(evt);
            }
        });
        MenuListas.add(opLDinamica);

        oplTabla.setText("Lista con Tablas");
        oplTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oplTablaActionPerformed(evt);
            }
        });
        MenuListas.add(oplTabla);

        jMenuBar1.add(MenuListas);

        jMenu2.setText("Pilas");
        jMenuBar1.add(jMenu2);

        MenuArboles.setText("Árboles");
        jMenuBar1.add(MenuArboles);

        MenuColas.setText("Colas");
        jMenuBar1.add(MenuColas);

        MenuFichaV.setText("Ficha Vehicular");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem1.setText("Ver ficha");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MenuFichaV.add(jMenuItem1);

        jMenuBar1.add(MenuFichaV);

        jMenu3.setText("Practica Colecciones");

        opEjercicio1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        opEjercicio1.setText("Ejercicio1");
        opEjercicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opEjercicio1ActionPerformed(evt);
            }
        });
        jMenu3.add(opEjercicio1);

        opEjercicio2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        opEjercicio2.setText("Ejercicio2 ");
        opEjercicio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opEjercicio2ActionPerformed(evt);
            }
        });
        jMenu3.add(opEjercicio2);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Gestión de Persona");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_7, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem2.setText("Ingreso de Persona");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opLDinamicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opLDinamicaActionPerformed
        // TODO add your handling code here:
        ListasDinamicas_Practica LD = new ListasDinamicas_Practica();
        escritorio.add(LD);
        LD.show();
    }//GEN-LAST:event_opLDinamicaActionPerformed

    private void opLEstaticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opLEstaticaActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_opLEstaticaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        FichaVehicula ventanaLE = new FichaVehicula(); 
        escritorio.add(ventanaLE);
        ventanaLE.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void oplTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oplTablaActionPerformed
        // TODO add your handling code here:
        LDTabla tabla = new LDTabla();
        escritorio.add(tabla);
        tabla.show();
        
    }//GEN-LAST:event_oplTablaActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        PersonaView pv = new PersonaView();
        escritorio.add(pv);
        pv.show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void opEjercicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opEjercicio1ActionPerformed
        Ejercicio1_ListaEstaticas eL1 = new Ejercicio1_ListaEstaticas();
        escritorio.add(eL1);
        eL1.show();
        
    }//GEN-LAST:event_opEjercicio1ActionPerformed

    private void opEjercicio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opEjercicio2ActionPerformed
        Ejercicio2_ListaPalabras lP2 = new Ejercicio2_ListaPalabras();
        escritorio.add(lP2);
        lP2.show();
    }//GEN-LAST:event_opEjercicio2ActionPerformed

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
    private javax.swing.JMenu MenuArboles;
    private javax.swing.JMenu MenuColas;
    private javax.swing.JMenu MenuFichaV;
    private javax.swing.JMenu MenuListas;
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem opEjercicio1;
    private javax.swing.JMenuItem opEjercicio2;
    private javax.swing.JMenuItem opLDinamica;
    private javax.swing.JMenuItem opLEstatica;
    private javax.swing.JMenuItem oplTabla;
    // End of variables declaration//GEN-END:variables
}
