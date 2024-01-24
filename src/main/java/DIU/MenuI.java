/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DIU;
import Listas.Ejercicio1;


/**
 *
 * @author kevin
 */
public class MenuI extends javax.swing.JFrame {

    /**
     * Creates new form MenuI
     */
    public MenuI() {
        initComponents();
        ReporteValorPagar reporte = new ReporteValorPagar();
        reporte.setVisible(false);
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
        jMenu2 = new javax.swing.JMenu();
        opLEstatica1 = new javax.swing.JMenuItem();
        opLEstatica2 = new javax.swing.JMenuItem();
        MenuListas = new javax.swing.JMenu();
        opLDinamicas = new javax.swing.JMenuItem();
        opLDinamicas2 = new javax.swing.JMenuItem();
        menuPilas = new javax.swing.JMenu();
        opLPilas1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        opLFichaVehicular = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1212, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        jMenu2.setText("Listas Estaticas");

        opLEstatica1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        opLEstatica1.setText("Estatico 1");
        opLEstatica1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opLEstatica1ActionPerformed(evt);
            }
        });
        jMenu2.add(opLEstatica1);

        opLEstatica2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        opLEstatica2.setText("Estatico 2");
        opLEstatica2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opLEstatica2ActionPerformed(evt);
            }
        });
        jMenu2.add(opLEstatica2);

        jMenuBar1.add(jMenu2);

        MenuListas.setText("Listas Dinamicas");

        opLDinamicas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        opLDinamicas.setText("Dinamicas 1");
        opLDinamicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opLDinamicasActionPerformed(evt);
            }
        });
        MenuListas.add(opLDinamicas);

        opLDinamicas2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        opLDinamicas2.setText("Dinamicas 2");
        opLDinamicas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opLDinamicas2ActionPerformed(evt);
            }
        });
        MenuListas.add(opLDinamicas2);

        jMenuBar1.add(MenuListas);

        menuPilas.setText("Pilas");
        menuPilas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPilasActionPerformed(evt);
            }
        });

        opLPilas1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        opLPilas1.setText("Pilas1");
        opLPilas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opLPilas1ActionPerformed(evt);
            }
        });
        menuPilas.add(opLPilas1);

        jMenuBar1.add(menuPilas);

        jMenu1.setText("Ficha Vehicular");

        opLFichaVehicular.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        opLFichaVehicular.setText("Igresar Datos");
        opLFichaVehicular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opLFichaVehicularActionPerformed(evt);
            }
        });
        jMenu1.add(opLFichaVehicular);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Escritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opLFichaVehicularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opLFichaVehicularActionPerformed
        FichaVehicular1 fc = new FichaVehicular1();
        Escritorio.add(fc);
        fc.show();
    }//GEN-LAST:event_opLFichaVehicularActionPerformed

    private void opLDinamicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opLDinamicasActionPerformed
        ListasDinamicas ld=new ListasDinamicas();
        Escritorio.add(ld) ;
        ld.show();
        
    }//GEN-LAST:event_opLDinamicasActionPerformed

    private void opLEstatica1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opLEstatica1ActionPerformed
        IngresarNumeros an = new IngresarNumeros();
        Escritorio.add(an);
        an.show();
    }//GEN-LAST:event_opLEstatica1ActionPerformed

    private void opLEstatica2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opLEstatica2ActionPerformed
        CantidadPalabras cp = new CantidadPalabras();
        Escritorio.add(cp);
        cp.show();
    }//GEN-LAST:event_opLEstatica2ActionPerformed

    private void menuPilasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPilasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuPilasActionPerformed

    private void opLPilas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opLPilas1ActionPerformed
        PalabrasAlrevez pa = new PalabrasAlrevez();
        Escritorio.add(pa);
        pa.show();
    }//GEN-LAST:event_opLPilas1ActionPerformed

    private void opLDinamicas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opLDinamicas2ActionPerformed
        ArrayDinamico ad= new ArrayDinamico();
        Escritorio.add(ad);
        ad.show();
    }//GEN-LAST:event_opLDinamicas2ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu MenuListas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuPilas;
    private javax.swing.JMenuItem opLDinamicas;
    private javax.swing.JMenuItem opLDinamicas2;
    private javax.swing.JMenuItem opLEstatica1;
    private javax.swing.JMenuItem opLEstatica2;
    private javax.swing.JMenuItem opLFichaVehicular;
    private javax.swing.JMenuItem opLPilas1;
    // End of variables declaration//GEN-END:variables
}
