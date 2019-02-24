/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ManageFlights;

import Business.Flight;
import Business.FlightDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author manalisharma
 */
public class ViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPanel
     */
    

   
   Flight flight;
   JPanel viewPanel;
    

    public ViewPanel(Flight flight, JPanel ManageFlight)  {
         initComponents();
        this.viewPanel = ManageFlight;
        this.flight=flight;
         
        priceTextfield.setText(String.valueOf(flight.getPrice()));
        airlinerTextfield.setText(flight.getName());
        fromDestinationTextfield.setText(flight.getFromDestination());
        
        toDestinationTextfield.setText(flight.getToDestination());
        scheduleTextfield.setText(flight.getSchedule());
        
        
        
        /*String start_Date = String.valueOf(flight.getStartDate());
        String end_Date=String.valueOf(flight.getEndDate());
        SimpleDateFormat formatnow = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzzz yyyy", Locale.ENGLISH); 
        SimpleDateFormat formatneeded=new SimpleDateFormat("dd-MM-yyyy:HH:mm:SS");
        String startDate_=null;
        String endDate_=null;
         
        Date date1 = formatnow.parse(start_Date);
        start_Date = formatneeded.format(date1);
        Date date2 = formatnow.parse(end_Date);
        end_Date = formatneeded.format(date2);

        startTextfield.setText(String.valueOf(start_Date));
        
       endTextfield.setText(String.valueOf(end_Date));
        
    */
    
    
    }

    
    public void resettextfield(){
    
        airlinerTextfield.setText("");      //clearing the textfield after inputting the value in the array list
        priceTextfield.setText("");
       
        toDestinationTextfield.setText("");
        fromDestinationTextfield.setText("");
        scheduleTextfield.setText("");
       
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        availLabel = new javax.swing.JLabel();
        lblHead = new javax.swing.JLabel();
        lblRoutingNo = new javax.swing.JLabel();
        lblBankName = new javax.swing.JLabel();
        lblBalance = new javax.swing.JLabel();
        airlinerTextfield = new javax.swing.JTextField();
        priceTextfield = new javax.swing.JTextField();
        fromDestinationTextfield = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        update = new javax.swing.JButton();
        save = new javax.swing.JButton();
        lblBalance1 = new javax.swing.JLabel();
        toDestinationTextfield = new javax.swing.JTextField();
        lblBalance2 = new javax.swing.JLabel();
        scheduleTextfield = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        availLabel.setForeground(java.awt.Color.red);
        availLabel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                availLabelKeyPressed(evt);
            }
        });

        lblHead.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHead.setText("View Flight");

        lblRoutingNo.setText("Airplane Name*");

        lblBankName.setText("Price*");

        lblBalance.setText("From Destination");

        airlinerTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airlinerTextfieldActionPerformed(evt);
            }
        });
        airlinerTextfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                airlinerTextfieldKeyTyped(evt);
            }
        });

        priceTextfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                priceTextfieldKeyTyped(evt);
            }
        });

        fromDestinationTextfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fromDestinationTextfieldKeyTyped(evt);
            }
        });

        back.setBackground(new java.awt.Color(204, 204, 204));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
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

        lblBalance1.setText("To Destination");

        toDestinationTextfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                toDestinationTextfieldKeyTyped(evt);
            }
        });

        lblBalance2.setText("Schedule");

        scheduleTextfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                scheduleTextfieldKeyTyped(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("aa");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("aasa");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ax");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("x");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("x");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("xa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(lblHead))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblBankName)
                                    .addComponent(lblBalance1)
                                    .addComponent(lblBalance2)
                                    .addComponent(lblBalance)
                                    .addComponent(lblRoutingNo))
                                .addGap(28, 28, 28))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(back)
                                .addGap(60, 60, 60)))
                        .addComponent(update)
                        .addGap(59, 59, 59)
                        .addComponent(save))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(scheduleTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(toDestinationTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fromDestinationTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(priceTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(airlinerTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(availLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblHead)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(availLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblRoutingNo)
                                .addComponent(airlinerTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblBankName)
                                .addGap(39, 39, 39)
                                .addComponent(lblBalance))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(priceTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(fromDestinationTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(lblBalance1))
                            .addComponent(jLabel7)
                            .addComponent(toDestinationTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(lblBalance2))
                            .addComponent(jLabel8)
                            .addComponent(scheduleTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(back)
                            .addComponent(update)
                            .addComponent(save))
                        .addContainerGap(69, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void availLabelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_availLabelKeyPressed

        
          
        
        
        
        
        
        
    }//GEN-LAST:event_availLabelKeyPressed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
         toDestinationTextfield.setEditable(true);
            priceTextfield.setEditable(true);
            airlinerTextfield.setEditable(true);
            fromDestinationTextfield.setEditable(true);
            
            scheduleTextfield.setEditable(true);
            
            save.setEnabled(true);
            update.setEnabled(false);
        
        
        
    }//GEN-LAST:event_updateActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
         /*String format = "dd-MM-yyyy:HH:mm:SS";
            SimpleDateFormat sdf = new SimpleDateFormat(format);

            String startDate= startTextfield.getText();
            String endDate= endTextfield.getText();

            Date flight_startDate = null;
            Date flight_endDate = null;
        
        
       try {
           flight_startDate = sdf.parse(startDate);
       } catch (ParseException ex) {
           Logger.getLogger(ViewPanel.class.getName()).log(Level.SEVERE, null, ex);
       }
       try {
           flight_endDate = sdf.parse(endDate);
       } catch (ParseException ex) {
           Logger.getLogger(ViewPanel.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        */
        
      
        toDestinationTextfield.setEditable(false);
           priceTextfield.setEditable(false);
           airlinerTextfield.setEditable(false);
            fromDestinationTextfield.setEditable(false);
           
         scheduleTextfield.setEditable(false);
         
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
        
            flight.setName(airlinerTextfield.getText());
            flight.setPrice(Double.parseDouble(priceTextfield.getText()));
            flight.setToDestination(toDestinationTextfield.getText());
            flight.setFromDestination(fromDestinationTextfield.getText());
            
            flight.setSchedule(scheduleTextfield.getText());
             /* flight.setStartDate(flight_startDate);
            flight.setEndDate(flight_endDate);*/
        
            JOptionPane.showMessageDialog(null, "Account updated successfully");        
        
    }//GEN-LAST:event_saveActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        viewPanel.remove(this);
        Component[] componentArray = viewPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageFlighstCatalog manage = (ManageFlighstCatalog) component;
        //manage.populate();
        CardLayout layout = (CardLayout) viewPanel.getLayout();
        layout.previous(viewPanel);
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_backActionPerformed

    private void airlinerTextfieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_airlinerTextfieldKeyTyped
        // TODO add your handling code here:
         if (airlinerTextfield.getText().trim().isEmpty()){
        jLabel1.setText("Invalid");
        
        }
        
        else {
        jLabel1.setText("");
        }
        
        
    }//GEN-LAST:event_airlinerTextfieldKeyTyped

    private void priceTextfieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceTextfieldKeyTyped
        // TODO add your handling code here:
          if (priceTextfield.getText().trim().isEmpty()){
        jLabel5.setText("Invalid");
        
        }
        
        else {
        jLabel5.setText("");
        }
    }//GEN-LAST:event_priceTextfieldKeyTyped

    private void fromDestinationTextfieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fromDestinationTextfieldKeyTyped
        // TODO add your handling code here:
          if (fromDestinationTextfield.getText().trim().isEmpty()){
        jLabel6.setText("Invalid");
        
        }
        
        else {
        jLabel6.setText("");
        }
    }//GEN-LAST:event_fromDestinationTextfieldKeyTyped

    private void toDestinationTextfieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_toDestinationTextfieldKeyTyped
        // TODO add your handling code here:
          if (toDestinationTextfield.getText().trim().isEmpty()){
        jLabel7.setText("Invalid");
        
        }
        
        else {
        jLabel7.setText("");
        }
    }//GEN-LAST:event_toDestinationTextfieldKeyTyped

    private void scheduleTextfieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_scheduleTextfieldKeyTyped
        // TODO add your handling code here:
          if (scheduleTextfield.getText().trim().isEmpty()){
        jLabel8.setText("Invalid");
        
        }
        
        else {
        jLabel8.setText("");
        }
    }//GEN-LAST:event_scheduleTextfieldKeyTyped

    private void airlinerTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airlinerTextfieldActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_airlinerTextfieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField airlinerTextfield;
    private javax.swing.JLabel availLabel;
    private javax.swing.JButton back;
    private javax.swing.JTextField fromDestinationTextfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblBalance1;
    private javax.swing.JLabel lblBalance2;
    private javax.swing.JLabel lblBankName;
    private javax.swing.JLabel lblHead;
    private javax.swing.JLabel lblRoutingNo;
    private javax.swing.JTextField priceTextfield;
    private javax.swing.JButton save;
    private javax.swing.JTextField scheduleTextfield;
    private javax.swing.JTextField toDestinationTextfield;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}