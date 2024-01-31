/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Listas;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Belial
 */
public class ListasEstaticass extends javax.swing.JInternalFrame {

    /**
     * Creates new form ListasEstaticass
     */
    public ListasEstaticass() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDimension = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPalabra = new javax.swing.JTextField();
        btnLista = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("               Listas Arryas");

        jLabel2.setText("Ingrese la Dimension: ");

        jLabel3.setText("Ingrese dos palabras separadas por espacio:");

        btnLista.setText("Ver lista");
        btnLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(43, 43, 43)
                                .addComponent(txtPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtDimension, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(btnLista, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDimension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addComponent(btnLista, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private String[] miArray;  // Declarar el array como una variable de instancia
    
    private void btnListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaActionPerformed
        // TODO add your handling code here:
         // Obtener la dimensión del array desde el campo de texto
        int n = Integer.parseInt(txtDimension.getText());

        // Obtener la oración desde el campo de texto
        String oracion = txtPalabra.getText();
        String[] palabras = oracion.split(" ");

         // Verificar que haya exactamente dos palabras en la oración
    if (palabras.length != 2) {
            mostrarVentanaError("La oración debe contener exactamente dos palabras separadas por espacio.");
            return; // Salir del método si hay un error
        }


        // Crear el array con el tamaño especificado
        miArray = new String[n];

        // Llenar el array intercalando las palabras
        for (int i = 0; i < n; i++) {
            miArray[i] = palabras[i % 2];
        }

        // Mostrar el array resultante en un JOptionPane
        JOptionPane.showMessageDialog(this, Arrays.toString(miArray), "Resultado", JOptionPane.INFORMATION_MESSAGE);
            
    }//GEN-LAST:event_btnListaActionPerformed

     private void mostrarVentanaError(String mensaje) {
    try {
        // Cambia "ruta_de_tu_imagen.jpg" con la ruta de tu imagen local
        String nombreImagenLocal = "C:\\Users\\floow\\OneDrive\\Escritorio\\git java\\PracticaColeccionesPVIIPA2023\\src\\main\\java\\Listas\\Icons\\st,small,507x507-pad,600x600,f8f8f8.jpg";

       //  String rutaImagenLocal = getClass().getResource("/Listas/Icons/" + nombreImagenLocal).toString();

        // Crear un ImageIcon con la imagen local
        ImageIcon icono = new ImageIcon(new URL("file:///" + nombreImagenLocal));

        // Crear un JOptionPane personalizado con la imagen
        JOptionPane optionPane = new JOptionPane(mensaje, JOptionPane.ERROR_MESSAGE, JOptionPane.DEFAULT_OPTION, icono);
        JDialog dialog = optionPane.createDialog("Error");
        dialog.setVisible(true);

    } catch (MalformedURLException e) {
        e.printStackTrace();
    }
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtDimension;
    private javax.swing.JTextField txtPalabra;
    // End of variables declaration//GEN-END:variables
}
