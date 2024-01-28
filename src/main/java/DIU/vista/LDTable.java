package DIU.vista;

import DIU.modelo.Persona;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Criss
 */
public class LDTable extends javax.swing.JInternalFrame {
    ArrayList<Persona> listaNombres=new ArrayList<>();
    DefaultTableModel modelo=new DefaultTableModel();
    /**
     * Creates new form LDTable
     */
    public LDTable() {
        initComponents();
        setModelo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
   
    public void setModelo(){
        String[] cabecera={"Nro.","Nombres"};
        modelo.setColumnIdentifiers(cabecera);
        tbNombres.setModel(modelo);       
    
    }
    
    public void llenarArrayList(){
        String nombre=txtNombres.getText();
        Persona persona=new Persona(nombre);
        listaNombres.add(persona);
        
    }
    
    public void setDatos(){
        //ESTRUCTURA INFORMACIÓN TABLA
      Object[]informacion=new Object[modelo.getColumnCount()];
      int cont=1; 
      modelo.setRowCount(0);
              
      for (Persona persona : listaNombres) {
            informacion[0]=cont;
            informacion[1]=persona.getNombre();
            cont++;
            modelo.addRow(informacion);
        }
        tbNombres.setModel(modelo);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombres = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNombres = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("LD TABLE");

        lblNombres.setText("INGRESAR NOMBRES:");

        txtNombres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombresMouseClicked(evt);
            }
        });

        tbNombres.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbNombres);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(lblNombres)
                .addGap(18, 18, 18)
                .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
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
    private javax.swing.JTable tbNombres;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
