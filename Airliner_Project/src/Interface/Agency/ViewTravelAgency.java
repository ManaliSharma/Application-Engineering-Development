/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Agency;

import Business.Airliner;
import Business.Flight;
import Business.TravelAgency;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author manalisharma
 */
public class ViewTravelAgency extends javax.swing.JPanel {

    /**
     * Creates new form ViewTravelAgency
     */
   
    JPanel viewAgency;
    TravelAgency agency;
    Flight flight;
    public ViewTravelAgency(TravelAgency a, JPanel ManageTravel) {
        
         initComponents();
         this.viewAgency= viewAgency;
         this.agency=a;
         
         
         this.flight=new Flight();
         
          
            
           
            Flight f= a.getAirDir().airlineraddDirectory().getFlightDirectory().addFlight();
         
         flightTextfield.setText(f.getName());
         seatTextfield.setText(String.valueOf(f.getSeat()));
         fromTextfield.setText(f.getFromDestination());
         toTextfield.setText(f.getToDestination());
         priceTextfield.setText(String.valueOf(f.getPrice()));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        airlinerLabel1 = new javax.swing.JLabel();
        flightTextfield = new javax.swing.JTextField();
        airlinerLabel3 = new javax.swing.JLabel();
        seatTextfield = new javax.swing.JTextField();
        airlinerLabel4 = new javax.swing.JLabel();
        fromTextfield = new javax.swing.JTextField();
        airlinerLabel5 = new javax.swing.JLabel();
        airlinerLabel6 = new javax.swing.JLabel();
        toTextfield = new javax.swing.JTextField();
        priceTextfield = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        update = new javax.swing.JButton();
        save = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        airlinerLabel1.setText("Flight Name:-");

        airlinerLabel3.setText("Available Seats:-");

        airlinerLabel4.setText("From Destination:-");

        airlinerLabel5.setText("To Destination:-");

        airlinerLabel6.setText("Price:-");

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(204, 204, 204));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        save.setBackground(new java.awt.Color(204, 204, 204));
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jButton1)
                .addGap(30, 30, 30)
                .addComponent(save)
                .addGap(18, 18, 18)
                .addComponent(update)
                .addContainerGap(206, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(87, 87, 87)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(airlinerLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(toTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(airlinerLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36)
                            .addComponent(flightTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(airlinerLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(airlinerLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fromTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(seatTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(airlinerLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(priceTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(252, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(290, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(update)
                    .addComponent(save))
                .addGap(41, 41, 41))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(76, 76, 76)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(airlinerLabel1))
                        .addComponent(flightTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(6, 6, 6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(airlinerLabel3))
                        .addComponent(seatTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(airlinerLabel4))
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(fromTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(airlinerLabel5)
                        .addComponent(toTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(airlinerLabel6)
                        .addComponent(priceTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(102, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        
        
        
        
        
          flightTextfield.setEditable(true);
            seatTextfield.setEditable(true);
            fromTextfield.setEditable(true);
            toTextfield.setEditable(true);
           priceTextfield.setEditable(true);
            save.setEnabled(true);
            update.setEnabled(false);
    }//GEN-LAST:event_updateActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
       
          flightTextfield.setEditable(false);
            seatTextfield.setEditable(false);
            fromTextfield.setEditable(false);
            toTextfield.setEditable(false);
             priceTextfield.setEditable(false);
            save.setEnabled(false);
            update.setEnabled(true);
            
           /* try{
                if(airlinerTextfield.getText().isEmpty()|| priceTextfield.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "please add all the meta fields"); 
          return ;
        }
            }
                catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "please add fields for price and availabilty");
            return;}*/
        Airliner airliner=agency.getAirDir().airlineraddDirectory();
           
            Flight f= agency.getAirDir().airlineraddDirectory().getFlightDirectory().addFlight();
           
            f.setName(flightTextfield.getText());
            f.setSeat(Integer.parseInt(seatTextfield.getText()));
            f.setFromDestination(fromTextfield.getText());
            f.setToDestination(toTextfield.getText());
            f.setPrice(Double.parseDouble(priceTextfield.getText()));
           
        
            JOptionPane.showMessageDialog(null, "Account updated successfully");        
        
    }//GEN-LAST:event_saveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         viewAgency.remove(this);
        Component[] componentArray = viewAgency.getComponents();
        Component component = componentArray[componentArray.length - 1];
       ManageTravelAgency panel = (ManageTravelAgency) component;
        //panel.populate();
        CardLayout layout = (CardLayout) viewAgency.getLayout();
        layout.previous(viewAgency);
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel airlinerLabel1;
    private javax.swing.JLabel airlinerLabel3;
    private javax.swing.JLabel airlinerLabel4;
    private javax.swing.JLabel airlinerLabel5;
    private javax.swing.JLabel airlinerLabel6;
    private javax.swing.JTextField flightTextfield;
    private javax.swing.JTextField fromTextfield;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField priceTextfield;
    private javax.swing.JButton save;
    private javax.swing.JTextField seatTextfield;
    private javax.swing.JTextField toTextfield;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}