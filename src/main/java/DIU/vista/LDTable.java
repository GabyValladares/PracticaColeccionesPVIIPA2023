/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package DIU.vista;

import DIU.Carro;
import DIU.controlador.CarroControlador;
import DIU.modelo.Persona;
import DIU.modelo.PersonaReport;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author oli
 */
public class LDTable extends javax.swing.JInternalFrame {

    ArrayList<Carro> listasNombres = new ArrayList();
    DefaultTableModel modelo = new DefaultTableModel();
    PersonaReport persona = new PersonaReport();

    /**
     * Creates new form LDTable
     */
    public LDTable(PersonaReport per) {
        this.persona=per;
        initComponents();
        setModelo();
        setDatos();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblVehiculos = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        tblVehiculos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblVehiculos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        
    }//GEN-LAST:event_formInternalFrameActivated

    public void setModelo() {
        String[] cabecera = {"Nombre", "Placa", "Año", "Marca", "Color", "Valor", "Multas"};
        modelo.setColumnIdentifiers(cabecera);
        tblVehiculos.setModel(modelo);
    }
    
    public void setDatos() {
        if (persona != null) {
            CarroControlador cr = new CarroControlador();
            ArrayList<Carro> vehiculos = new ArrayList<>();
            vehiculos=cr.listarVehiculo(persona.getIdpersona());

            int cont = 1;
            //modelo.setRowCount(0);
            for (Carro car : vehiculos) {
                Object[] informacion = new Object[modelo.getColumnCount()];
                System.out.println(modelo.getColumnCount());
                informacion[0] = persona.getNombre();
                informacion[1] = car.getPlaca();
                informacion[2] = car.getAnioFab();
                informacion[3] = car.getMarca();
                informacion[4] = car.getColor();
                informacion[5] = car.getValor();
                if (car.getMulta().equals("0")) {
                    informacion[6] = "No";
                } else {
                    informacion[6] = "Si";
                }
                modelo.addRow(informacion);
            }
            setModelo();
        }else{
            System.out.println("Error en el paso de la información");
        }
    }

    public void limpiarTabla(){
        modelo.setDataVector(null, new Object[]{"Nombre", "Placa", "Año", "Marca", "Color", "Valor", "Multas"});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVehiculos;
    // End of variables declaration//GEN-END:variables
}
