/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package DIU;

import Pilas.Nodo;
import Pilas.Pila;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author USUARIO
 */
public class TorresHanoi extends javax.swing.JInternalFrame {

    Pila PilaTorreA;
    Pila PilaTorreB;
    Pila PilaTorreC;
    
    DefaultTableModel TablaA, TablaB, TablaC;
    int objetivo = 0;
    double numMinMov = 0;
    boolean stop = false;
    int contNumMov = 0;
    /**
     * Creates new form TorresHanoi
     */
    public TorresHanoi() {
        initComponents();
        
        TablaA = (DefaultTableModel)torreA.getModel();
        TablaA.setRowCount(10);
        
        TablaB = (DefaultTableModel)torreB.getModel();
        TablaB.setRowCount(10);
        
        TablaC = (DefaultTableModel)torreC.getModel();
        TablaC.setRowCount(10);
        
    }

    public void Limpiar(){       
       cboxNDis.setSelectedItem(String.valueOf(objetivo));
       
    }
    
    private void Reiniciar(){
        try{
            
            Limpiar();
            Iniciar();
            
        }catch(NumberFormatException E){
            
            lblMensaje.setText("Error");
            
        }
    }
    
    private void PresentarTorreA(){
        ((DefaultTableModel)torreA.getModel()).setRowCount(0);
        
        TablaA.setRowCount(10);
        
        Nodo K;
        
        int rowDisco = (10 - PilaTorreA.getContNodo());
        
        if(PilaTorreA.getContNodo() > 0){
            for(K = PilaTorreA.getCabeza();K.getAbajo() != null; K = K.getAbajo()){
               
                String[]  VectorNormal = {K.getDato()};
                
                TablaA.insertRow(rowDisco, VectorNormal);
                
                rowDisco++;
            }
            
            if(K.getAbajo() == null){
                
                String[]  VectorNormal = {K.getDato()};
                TablaA.insertRow(rowDisco, VectorNormal);
                
            }
        }
        
        torreA.setModel(TablaA);
        TablaA.setRowCount(10);
    }
    
    private void PresentarTorreB(){
        ((DefaultTableModel)torreB.getModel()).setRowCount(0);
        
        TablaB.setRowCount(10);
        
        Nodo K;
        
        int rowDisco = (10 - PilaTorreB.getContNodo());
        
        if(PilaTorreB.getContNodo() > 0){
            for(K = PilaTorreB.getCabeza();K.getAbajo() != null; K = K.getAbajo()){
               
                String[]  VectorNormal = {K.getDato()};
                
                TablaB.insertRow(rowDisco, VectorNormal);
                
                rowDisco++;
            }
            
            if(K.getAbajo() == null){
                
                String[]  VectorNormal = {K.getDato()};
                TablaB.insertRow(rowDisco, VectorNormal);
                
            }
        }
        
        torreB.setModel(TablaB);
        TablaB.setRowCount(10);
    }
    
    private void PresentarTorreC(){
        ((DefaultTableModel)torreC.getModel()).setRowCount(0);
        
        TablaC.setRowCount(10);
        
        Nodo K;
        
        int rowDisco = (10 - PilaTorreC.getContNodo());
        
        if(PilaTorreC.getContNodo() > 0){
            for(K = PilaTorreC.getCabeza();K.getAbajo() != null; K = K.getAbajo()){
               
                String[]  VectorNormal = {K.getDato()};
                
                TablaC.insertRow(rowDisco, VectorNormal);
                
                rowDisco++;
            }
            
            if(K.getAbajo() == null){
                
                String[]  VectorNormal = {K.getDato()};
                TablaC.insertRow(rowDisco, VectorNormal);
                
            }
        }
        
        torreC.setModel(TablaC);
        TablaC.setRowCount(10);
    }
    
    private void Iniciar(){
        
        try{
        PilaTorreA = new Pila();
        PilaTorreB = new Pila();
        PilaTorreC = new Pila();
        
        objetivo = Integer.parseInt(cboxNDis.getSelectedItem().toString());
         
        for (int x = objetivo; x >= 1; x--) {
            Nodo Plataforma = new Nodo();
            
            String disco = "";
            
            for(int y = x; y > 0; y--){
                disco+= "#";
            }
            
            Plataforma.setDato(disco);
            
            PilaTorreA.Push(Plataforma);
        }
        
        PresentarTorreA();
        PresentarTorreB();
        PresentarTorreC();
        
        }catch(NumberFormatException E){
            
            lblMensaje.setText("Error");
            
        }
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
        torreA = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        torreB = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        torreC = new javax.swing.JTable();
        btnBTA = new javax.swing.JButton();
        btnCTA = new javax.swing.JButton();
        btnBTC = new javax.swing.JButton();
        btnCTB = new javax.swing.JButton();
        btnATB = new javax.swing.JButton();
        btnATC = new javax.swing.JButton();
        btnIniciar = new javax.swing.JButton();
        btnResolver = new javax.swing.JButton();
        lblNumDiscos = new javax.swing.JLabel();
        cboxNDis = new javax.swing.JComboBox<>();
        btnReiniciar = new javax.swing.JButton();
        lblMensaje = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        torreA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Torre A"
            }
        ));
        jScrollPane1.setViewportView(torreA);

        torreB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Torre B"
            }
        ));
        jScrollPane2.setViewportView(torreB);

        torreC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Torre C"
            }
        ));
        jScrollPane3.setViewportView(torreC);

        btnBTA.setText("B");
        btnBTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBTAActionPerformed(evt);
            }
        });

        btnCTA.setText("C");
        btnCTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCTAActionPerformed(evt);
            }
        });

        btnBTC.setText("B");
        btnBTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBTCActionPerformed(evt);
            }
        });

        btnCTB.setText("C");
        btnCTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCTBActionPerformed(evt);
            }
        });

        btnATB.setText("A");
        btnATB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnATBActionPerformed(evt);
            }
        });

        btnATC.setText("A");
        btnATC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnATCActionPerformed(evt);
            }
        });

        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        btnResolver.setText("Resolver");
        btnResolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResolverActionPerformed(evt);
            }
        });

        lblNumDiscos.setText("Elegir el numero de discos:");

        cboxNDis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3", "4", "5", "6", "7", "8", "9", "10" }));

        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(btnIniciar)
                                .addGap(58, 58, 58))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnATB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCTB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnReiniciar))
                                .addGap(25, 25, 25)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(btnResolver))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBTA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCTA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(222, 222, 222)
                                .addComponent(btnATC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBTC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(lblNumDiscos)
                                .addGap(59, 59, 59)
                                .addComponent(cboxNDis, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBTA)
                        .addComponent(btnCTA))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnATC)
                        .addComponent(btnBTC)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCTB)
                            .addComponent(btnATB))))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumDiscos)
                    .addComponent(cboxNDis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciar)
                    .addComponent(btnResolver)
                    .addComponent(btnReiniciar))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        // TODO add your handling code here:
        Iniciar();
        
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnBTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBTAActionPerformed
        // TODO add your handling code here:
        MoverA_B();
    }//GEN-LAST:event_btnBTAActionPerformed

    private void MoverA_B(){
       try{ 
           if(PilaTorreA.getContNodo() > 0){
              Nodo Plataforma = new Nodo();
              Plataforma.setDato(PilaTorreA.Peek());
              
              if(PilaTorreB.getContNodo() > 0){
                  
                  if(Plataforma.getDato().compareTo(PilaTorreB.Peek()) > 0){
                      return;
                  }  
              }
              
              PilaTorreA.Pop();
              PilaTorreB.Push(Plataforma);
              
              PresentarTorreA();
              PresentarTorreB();
           }
           
       
        }catch(NumberFormatException E){
            lblMensaje.setText("Error"); 
        }
    }
  
    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        // TODO add your handling code here:
        Reiniciar();
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnCTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCTAActionPerformed
        // TODO add your handling code here:
        MoverA_C();
    }//GEN-LAST:event_btnCTAActionPerformed

    private void MoverA_C(){
       try{
           
           if(PilaTorreA.getContNodo() > 0){
              Nodo Plataforma = new Nodo();
              Plataforma.setDato(PilaTorreA.Peek());
              
              if(PilaTorreC.getContNodo() > 0){
                  
                  if(Plataforma.getDato().compareTo(PilaTorreC.Peek()) > 0){
                      return;
                  }  
              }
              
              PilaTorreA.Pop();
              PilaTorreC.Push(Plataforma);
              
              PresentarTorreA();
              PresentarTorreC();
              
              if(PilaTorreC.getContNodo() == objetivo){
                  lblMensaje.setText("Buen Trabajo"); 
              }
           }
           
       }catch(NumberFormatException E){
            lblMensaje.setText("Error"); 
        }
        
    }
    
    private void btnATBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnATBActionPerformed
        // TODO add your handling code here:
        MoverB_A();
    }//GEN-LAST:event_btnATBActionPerformed

    private void MoverB_A(){
        try{ 
           if(PilaTorreB.getContNodo() > 0){
              Nodo Plataforma = new Nodo();
              Plataforma.setDato(PilaTorreB.Peek());
              
              if(PilaTorreA.getContNodo() > 0){
                  
                  if(Plataforma.getDato().compareTo(PilaTorreA.Peek()) > 0){
                      return;
                  }  
              }
              
              PilaTorreB.Pop();
              PilaTorreA.Push(Plataforma);
              
              PresentarTorreA();
              PresentarTorreB();
           }
           
       
        }catch(NumberFormatException E){
            lblMensaje.setText("Error"); 
        }
        
    }
    
    private void btnCTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCTBActionPerformed
        // TODO add your handling code here:
                MoverB_C();
    }//GEN-LAST:event_btnCTBActionPerformed

    private void MoverB_C(){
        try{
           
           if(PilaTorreB.getContNodo() > 0){
              Nodo Plataforma = new Nodo();
              Plataforma.setDato(PilaTorreB.Peek());
              
              if(PilaTorreC.getContNodo() > 0){
                  
                  if(Plataforma.getDato().compareTo(PilaTorreC.Peek()) > 0){
                      return;
                  }  
              }
              
              PilaTorreB.Pop();
              PilaTorreC.Push(Plataforma);
              
              PresentarTorreB();
              PresentarTorreC();
              
              if(PilaTorreC.getContNodo() == objetivo){
                  lblMensaje.setText("Buen Trabajo"); 
              }
           }
           
       }catch(NumberFormatException E){
            lblMensaje.setText("Error"); 
        }
        
    }
    
    private void btnATCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnATCActionPerformed
        // TODO add your handling code here:
        MoverC_A();
    }//GEN-LAST:event_btnATCActionPerformed

    private void MoverC_A(){
        try{ 
           if(PilaTorreC.getContNodo() > 0){
              Nodo Plataforma = new Nodo();
              Plataforma.setDato(PilaTorreC.Peek());
              
              if(PilaTorreA.getContNodo() > 0){
                  
                  if(Plataforma.getDato().compareTo(PilaTorreA.Peek()) > 0){
                      return;
                  }  
              }
              
              PilaTorreC.Pop();
              PilaTorreA.Push(Plataforma);
              
              PresentarTorreA();
              PresentarTorreC();
           }
           
       
        }catch(NumberFormatException E){
            lblMensaje.setText("Error"); 
        }
    }
    
    private void btnBTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBTCActionPerformed
        // TODO add your handling code here:
        MoverC_B();
    }//GEN-LAST:event_btnBTCActionPerformed

    private void MoverC_B(){
        try{ 
           if(PilaTorreC.getContNodo() > 0){
              Nodo Plataforma = new Nodo();
              Plataforma.setDato(PilaTorreC.Peek());
              
              if(PilaTorreB.getContNodo() > 0){
                  
                  if(Plataforma.getDato().compareTo(PilaTorreB.Peek()) > 0){
                      return;
                  }  
              }
              
              PilaTorreC.Pop();
              PilaTorreB.Push(Plataforma);
              
              PresentarTorreB();
              PresentarTorreC();
           }
           
       
        }catch(NumberFormatException E){
            lblMensaje.setText("Error"); 
        }
    }
    
    private void btnResolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResolverActionPerformed
        // TODO add your handling code here:
        if(PilaTorreC.getContNodo() != objetivo){
            Reiniciar();
            stop = false;
            ResolverTorre(objetivo, PilaTorreA, PilaTorreB, PilaTorreC);
        }
        
    }//GEN-LAST:event_btnResolverActionPerformed

    private void MoverPlataforma(Pila Origen, Pila Destino){
        if(stop == false){
            Nodo Plataforma = new Nodo();
            Plataforma.setDato(Origen.Peek());
            Origen.Pop();
            Destino.Push(Plataforma);
            
            PresentarTorreA();
            PresentarTorreB();
            PresentarTorreC();
        }
    }
    
    private void ResolverTorre(int n, Pila Origen, Pila Auxiliar, Pila Destino){
       if(n == 1){
           MoverPlataforma(Origen, Destino);
       }else{
           ResolverTorre(n -1, Origen, Destino, Auxiliar);
           MoverPlataforma(Origen, Destino);
           ResolverTorre(n -1, Auxiliar, Origen, Destino);
       }
    }
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnATB;
    private javax.swing.JButton btnATC;
    private javax.swing.JButton btnBTA;
    private javax.swing.JButton btnBTC;
    private javax.swing.JButton btnCTA;
    private javax.swing.JButton btnCTB;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnResolver;
    private javax.swing.JComboBox<String> cboxNDis;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblNumDiscos;
    private javax.swing.JTable torreA;
    private javax.swing.JTable torreB;
    private javax.swing.JTable torreC;
    // End of variables declaration//GEN-END:variables
}
