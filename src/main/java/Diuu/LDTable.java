/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Diuu;


import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.PersonaV;
import modelo.Vehiculo;

/**
 *
 * @author Leo
 */
public class LDTable extends javax.swing.JInternalFrame {

    ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
    DefaultTableModel modelo = new DefaultTableModel();
    
    /**
     * Creates new form LDTable
     */
    
    public LDTable() {
        initComponents();
        setModelo();
    }

 
    public void setModelo() {
        String[] cabecera = {"Nro.", "Placa", "Marca", "Color", "Tipo", "Multas", "Año", "Valor"};
        modelo.setColumnIdentifiers(cabecera);
        tbVehiculos.setModel(modelo);
    }
    
    public void llenarArrayList(Vehiculo vehiculo) {
        listaVehiculos.add(vehiculo);
        setDatos(); 
    }
    
   
 public void setDatos() {
        Object[] informacion = new Object[modelo.getColumnCount()];
        int cont = 1;
        modelo.setRowCount(0);

        for (Vehiculo vehiculo : listaVehiculos) {
            informacion[0] = cont;
            informacion[1] = vehiculo.getPlaca();
            informacion[2] = vehiculo.getMarca();
            informacion[3] = vehiculo.getColor();
            informacion[4] = vehiculo.getTipo();
            informacion[5] = vehiculo.getMultas();
            informacion[6] = vehiculo.getAnoFabricacion();
            informacion[7] = vehiculo.getValor();
            cont++;
            modelo.addRow(informacion);
        }
        tbVehiculos.setModel(modelo);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombres = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbVehiculos = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("LISTAS DINÁMICAS CON TABLE");

        lblNombres.setText("INGRESAR CEDULA:");

        txtNombres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombresMouseClicked(evt);
            }
        });

        tbVehiculos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbVehiculos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(lblNombres)
                .addGap(18, 18, 18)
                .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(198, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombres)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombresMouseClicked
            this.llenarArrayList();
            this.setDatos();
            txtNombres.setText("");
//        String nombres=txtNombres.getText();
//        //INSTANCIA DEL OBJETO PERSONA
//        PersonaLD persona=new PersonaLD(nombres);
//        listaNombres.add(persona);
//        txtNombres.setText("");
//        txtAResultado.setText("");
//        for (PersonaLD listaNombre : listaNombres) {
//            txtAResultado.append(listaNombre.getNombre()+"\n");
//        }

    }//GEN-LAST:event_txtNombresMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JTable tbVehiculos;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
