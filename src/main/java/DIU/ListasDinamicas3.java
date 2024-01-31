/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package DIU;

import DIU.modelo.Numeros1;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class ListasDinamicas3 extends javax.swing.JInternalFrame {

    /**
     * Creates new form ListasDinamicas4
     */
    public String numero;
    
    DefaultTableModel modelo = new DefaultTableModel();
    ArrayList<Numeros1> listaValores = new ArrayList<>();
    
    public ListasDinamicas3() {
        initComponents();
        setModelo();
    }
    
    public void setModelo() {
        String[] cabecera = {"Número de valores leídos", "Suma de los valores", "Promedio de los valores","Valores mayores que el promedio"};
        modelo.setColumnIdentifiers(cabecera);
        tblValores.setModel(modelo);

    }
    public void llenarTabla() {
        String numeroStr = txtNumero.getText();
        int numero = Integer.parseInt(numeroStr);

        if (numero == -99) {
            setDatos();
        } else {
            Numeros1 valor = new Numeros1(numero);
            listaValores.add(valor);
            txtNumero.setText("");
        }
        
    }

    
    private void setDatos() {
        // Calcular suma y promedio
        int cantidad = listaValores.size();
        int suma = 0;
        for (Numeros1 num : listaValores) {
            suma += num.getNumero();
        }
        double promedio = cantidad > 0 ? (double) suma / cantidad : 0;

        // Calcular valores mayores que el promedio
        ArrayList<Integer> valoresMayores = new ArrayList<>();
        for (Numeros1 num : listaValores) {
            if (num.getNumero() > promedio) {
                valoresMayores.add(num.getNumero());
            }
        }

        // ESTRUCTURA INFORMACIÓN TABLA
        Object[] informacion = new Object[modelo.getColumnCount()];
        informacion[0] = cantidad;
        informacion[1] = suma;
        informacion[2] = promedio;
        informacion[3] = valoresMayores;

        modelo.addRow(informacion);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblIngreseNumeros = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblValores = new javax.swing.JTable();
        txtNumero = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("LISTAS DINÁMICAS EJERCICIO 4");
        setToolTipText("");

        lblTitulo.setText("ArrayList");

        lblIngreseNumeros.setText("Ingrese números enteros ingrese (-99) si desea terminar: ");

        tblValores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblValores);

        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(519, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(492, 492, 492))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(lblIngreseNumeros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIngreseNumeros)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
        this.llenarTabla();
    }//GEN-LAST:event_txtNumeroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIngreseNumeros;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblValores;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
