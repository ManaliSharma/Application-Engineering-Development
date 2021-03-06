/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ManageFlights;

import Business.Airliner;
import Business.AirlinerDirectory;
import Business.Flight;
import Business.FlightDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author manalisharma
 */
public class Manage extends javax.swing.JPanel {

    /**
     * Creates new form Manage
     */
    JPanel Manage;
    AirlinerDirectory airDir;
    //Flight_Directory flightDir;
    
    //public Manage() {
      //  initComponents();
    //}

    public Manage(AirlinerDirectory airDir, JPanel cardlayoutjPanel) {
        initComponents();
       this.Manage=cardlayoutjPanel;
      this.airDir=airDir;
//       masterOrderCatalog = moc;
       airlinercombo.removeAllItems();
       for(Airliner airliner : airDir.getAirlinerDirectory()) {
           airlinercombo.addItem(airliner);
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

        jLabel1 = new javax.swing.JLabel();
        airlinercombo = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Manage Flights");

        airlinercombo.setBackground(new java.awt.Color(204, 204, 204));
        airlinercombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        airlinercombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airlinercomboActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Find Flights");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(airlinercombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jButton1)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(airlinercombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(179, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
         
     
       Airliner airliner = (Airliner)airlinercombo.getSelectedItem();
       FlightDirectory f = airliner.getFlightDirectory();
      
       ManageFlight manage = new ManageFlight(Manage,airliner,airDir);
       Manage.add("ManageFlightCtalog",manage);
        CardLayout layout = (CardLayout)Manage.getLayout();
        layout.next(Manage);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void airlinercomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airlinercomboActionPerformed
        // TODO add your handling code here:
         //searchTextfield.setText(airlinercombo.getSelectedItem().toString());
    }//GEN-LAST:event_airlinercomboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox airlinercombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
