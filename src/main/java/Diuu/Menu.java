/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Diuu;


import Listas.EArraylist1;
import Listas.EArraylist2;
import Pilas.Pilas1;
import Pilas.Pilas2;
import javax.management.JMX;

/**
 *
 * @author carlo
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form ver
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

        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmListas = new javax.swing.JMenu();
        jmEstatica1 = new javax.swing.JMenuItem();
        jmEstatica2 = new javax.swing.JMenuItem();
        jmArraylist = new javax.swing.JMenuItem();
        jMArraylist2 = new javax.swing.JMenuItem();
        jMPracticaArrayClase = new javax.swing.JMenuItem();
        jmPilas = new javax.swing.JMenu();
        jMpilas1 = new javax.swing.JMenuItem();
        jMpilas2 = new javax.swing.JMenuItem();
        jmColas = new javax.swing.JMenu();
        jMcolas1 = new javax.swing.JMenuItem();
        jMcolas2 = new javax.swing.JMenuItem();
        FichaVehicular = new javax.swing.JMenu();
        jmVer = new javax.swing.JMenuItem();
        jmArboles = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 887, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 532, Short.MAX_VALUE)
        );

        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));

        jmListas.setBackground(new java.awt.Color(204, 204, 204));
        jmListas.setBorder(null);
        jmListas.setText("Listas");
        jmListas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmListasActionPerformed(evt);
            }
        });

        jmEstatica1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jmEstatica1.setText("Estatica");
        jmEstatica1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEstatica1ActionPerformed(evt);
            }
        });
        jmListas.add(jmEstatica1);

        jmEstatica2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jmEstatica2.setText("Estatica 2");
        jmEstatica2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEstatica2ActionPerformed(evt);
            }
        });
        jmListas.add(jmEstatica2);

        jmArraylist.setText("Arraylist");
        jmArraylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmArraylistActionPerformed(evt);
            }
        });
        jmListas.add(jmArraylist);

        jMArraylist2.setText("Arraylist Objetos");
        jMArraylist2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMArraylist2ActionPerformed(evt);
            }
        });
        jmListas.add(jMArraylist2);

        jMPracticaArrayClase.setText("Dinámicas PRACTICA");
        jMPracticaArrayClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMPracticaArrayClaseActionPerformed(evt);
            }
        });
        jmListas.add(jMPracticaArrayClase);

        jMenuBar1.add(jmListas);

        jmPilas.setBorder(null);
        jmPilas.setText("Pilas");

        jMpilas1.setText("Pilas 1");
        jMpilas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMpilas1ActionPerformed(evt);
            }
        });
        jmPilas.add(jMpilas1);

        jMpilas2.setText("Pilas 2");
        jMpilas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMpilas2ActionPerformed(evt);
            }
        });
        jmPilas.add(jMpilas2);

        jMenuBar1.add(jmPilas);

        jmColas.setBorder(null);
        jmColas.setText("Colas");

        jMcolas1.setText("Colas 1");
        jMcolas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMcolas1ActionPerformed(evt);
            }
        });
        jmColas.add(jMcolas1);

        jMcolas2.setText("Colas 2");
        jMcolas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMcolas2ActionPerformed(evt);
            }
        });
        jmColas.add(jMcolas2);

        jMenuBar1.add(jmColas);

        FichaVehicular.setBorder(null);
        FichaVehicular.setText("Ficha vehicular");
        FichaVehicular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FichaVehicularActionPerformed(evt);
            }
        });

        jmVer.setText("Ver");
        jmVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmVerActionPerformed(evt);
            }
        });
        FichaVehicular.add(jmVer);

        jMenuBar1.add(FichaVehicular);

        jmArboles.setBorder(null);
        jmArboles.setText("Árboles");
        jMenuBar1.add(jmArboles);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmListasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmListasActionPerformed
        
    }//GEN-LAST:event_jmListasActionPerformed

    private void jmEstatica1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEstatica1ActionPerformed
        ListasEstaticas1 ventanaLE= new ListasEstaticas1();
        Escritorio.add(ventanaLE);
        ventanaLE.show();
    }//GEN-LAST:event_jmEstatica1ActionPerformed

    private void FichaVehicularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FichaVehicularActionPerformed
        
    }//GEN-LAST:event_FichaVehicularActionPerformed

    private void jmVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmVerActionPerformed
        FichaVehicular ventFvehi = new FichaVehicular();
        Escritorio.add(ventFvehi);
        ventFvehi.show();
     
    }//GEN-LAST:event_jmVerActionPerformed

    private void jmEstatica2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEstatica2ActionPerformed
        ListasEstaticas2 ventanaLE = new ListasEstaticas2();
        Escritorio.add(ventanaLE);
        ventanaLE.show();
    }//GEN-LAST:event_jmEstatica2ActionPerformed

    private void jmArraylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmArraylistActionPerformed
        EArraylist1 ventanaArr = new EArraylist1();
        Escritorio.add(ventanaArr);
        ventanaArr.show();
    }//GEN-LAST:event_jmArraylistActionPerformed

    private void jMpilas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMpilas1ActionPerformed
        Pilas1 ventanaP = new Pilas1();
        Escritorio.add(ventanaP);
        ventanaP.show();
    }//GEN-LAST:event_jMpilas1ActionPerformed

    private void jMpilas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMpilas2ActionPerformed
        Pilas2 ventanaP = new Pilas2();
        Escritorio.add(ventanaP);
        ventanaP.show();
    }//GEN-LAST:event_jMpilas2ActionPerformed

    private void jMcolas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMcolas1ActionPerformed
        Colas1 ventanaP = new Colas1();
        Escritorio.add(ventanaP);
        ventanaP.show();
    }//GEN-LAST:event_jMcolas1ActionPerformed

    private void jMcolas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMcolas2ActionPerformed
        Colas2 ventanaP = new Colas2();
        Escritorio.add(ventanaP);
        ventanaP.show();
    }//GEN-LAST:event_jMcolas2ActionPerformed

    private void jMArraylist2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMArraylist2ActionPerformed
        EArraylist2 ventanaArr = new EArraylist2();
        Escritorio.add(ventanaArr);
        ventanaArr.show();
    }//GEN-LAST:event_jMArraylist2ActionPerformed

    private void jMPracticaArrayClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMPracticaArrayClaseActionPerformed
        PracticaArraylist ventanaArr = new PracticaArraylist();
        Escritorio.add(ventanaArr);
        ventanaArr.show();
    }//GEN-LAST:event_jMPracticaArrayClaseActionPerformed

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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu FichaVehicular;
    private javax.swing.JMenuItem jMArraylist2;
    private javax.swing.JMenuItem jMPracticaArrayClase;
    private javax.swing.JMenuItem jMcolas1;
    private javax.swing.JMenuItem jMcolas2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMpilas1;
    private javax.swing.JMenuItem jMpilas2;
    private javax.swing.JMenu jmArboles;
    private javax.swing.JMenuItem jmArraylist;
    private javax.swing.JMenu jmColas;
    private javax.swing.JMenuItem jmEstatica1;
    private javax.swing.JMenuItem jmEstatica2;
    private javax.swing.JMenu jmListas;
    private javax.swing.JMenu jmPilas;
    private javax.swing.JMenuItem jmVer;
    // End of variables declaration//GEN-END:variables
}
