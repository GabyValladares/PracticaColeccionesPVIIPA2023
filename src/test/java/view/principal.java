/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

/**
 *
 * @author Andy Moya
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public principal() {
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
        opDinamica = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        menuFicha = new javax.swing.JMenu();
        opFicha = new javax.swing.JMenuItem();
        opreporte = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 833, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 481, Short.MAX_VALUE)
        );

        menuListas.setText("listas");

        opLEstatico.setText("Estaticas");
        opLEstatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opLEstaticoActionPerformed(evt);
            }
        });
        menuListas.add(opLEstatico);

        opDinamica.setText("Dinamicas");
        opDinamica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opDinamicaActionPerformed(evt);
            }
        });
        menuListas.add(opDinamica);

        jMenuItem1.setText("Lista palabras");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuListas.add(jMenuItem1);

        jMenuItem2.setText("ArrayList");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuListas.add(jMenuItem2);

        jMenuBar1.add(menuListas);

        jMenu2.setText("pilas");

        jMenuItem3.setText("jMenuItem3");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Arboles");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Colas");
        jMenuBar1.add(jMenu4);

        menuFicha.setText("ficha  vehicular");
        menuFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFichaActionPerformed(evt);
            }
        });

        opFicha.setText("Datos Personales");
        opFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opFichaActionPerformed(evt);
            }
        });
        menuFicha.add(opFicha);

        opreporte.setText("reporte");
        opreporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opreporteActionPerformed(evt);
            }
        });
        menuFicha.add(opreporte);

        jMenuBar1.add(menuFicha);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opDinamicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opDinamicaActionPerformed
    ListasEstaticas ventanaLE = new ListasEstaticas();
    escritorio.add(ventanaLE);
    ventanaLE.show();
    }//GEN-LAST:event_opDinamicaActionPerformed

    private void opLEstaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opLEstaticoActionPerformed
    Listainversa ventanaLI = new Listainversa();
    escritorio.add(ventanaLI);
    ventanaLI.show();
    }//GEN-LAST:event_opLEstaticoActionPerformed

    private void menuFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFichaActionPerformed
     
    }//GEN-LAST:event_menuFichaActionPerformed

    private void opFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opFichaActionPerformed
        FichaVehicular ficha = new FichaVehicular();
     escritorio.add(ficha);
     ficha.show();
     
     
     
    }//GEN-LAST:event_opFichaActionPerformed

    private void opreporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opreporteActionPerformed
      reporte reporte = new reporte();
     escritorio.add(reporte);
     reporte.show();
    }//GEN-LAST:event_opreporteActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      ListaPalabras lis = new ListaPalabras();
     escritorio.add(lis);
     lis.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
     ListaProm listaprom1 = new ListaProm();
     escritorio.add(listaprom1);
     listaprom1.show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
    CadenaInvertida cad = new CadenaInvertida();
     escritorio.add(cad);
     cad.show();
    }//GEN-LAST:event_jMenuItem3ActionPerformed
    
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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenu menuFicha;
    private javax.swing.JMenu menuListas;
    private javax.swing.JMenuItem opDinamica;
    private javax.swing.JMenuItem opFicha;
    private javax.swing.JMenuItem opLEstatico;
    private javax.swing.JMenuItem opreporte;
    // End of variables declaration//GEN-END:variables
}
