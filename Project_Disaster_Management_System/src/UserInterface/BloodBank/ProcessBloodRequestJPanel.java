package UserInterface.BloodBank;

import Business.WorkQueue.BloodBankWorkTestRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ProcessBloodRequestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private BloodBankWorkTestRequest request;

    public ProcessBloodRequestJPanel(JPanel userProcessContainer, BloodBankWorkTestRequest request) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.request = request;  
        
        Submit_JButton.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Availability_JLabel = new javax.swing.JLabel();
        Message_JTextField = new javax.swing.JTextField();
        Message_JLabel = new javax.swing.JLabel();
        Back_JButton = new javax.swing.JButton();
        Submit_JButton = new javax.swing.JButton();
        Check_JButton = new javax.swing.JButton();
        Reset_JButton = new javax.swing.JButton();

        Availability_JLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Availability_JLabel.setText("Availability");

        Message_JTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Message_JTextField.setToolTipText("Alpha-Numeric Value, at least 2 Characters");

        Message_JLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Message_JLabel.setText("Message");

        Back_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Back_JButton.setText("<< Back");
        Back_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_JButtonActionPerformed(evt);
            }
        });

        Submit_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Submit_JButton.setText("Submit Result >>");
        Submit_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit_JButtonActionPerformed(evt);
            }
        });

        Check_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Check_JButton.setText("Check?");
        Check_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Check_JButtonActionPerformed(evt);
            }
        });

        Reset_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Reset_JButton.setText("Reset");
        Reset_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reset_JButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Back_JButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Check_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Availability_JLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Message_JLabel)
                                .addGap(105, 105, 105)
                                .addComponent(Message_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Submit_JButton)
                        .addGap(0, 44, Short.MAX_VALUE))
                    .addComponent(Reset_JButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Availability_JLabel)
                    .addComponent(Reset_JButton))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Message_JLabel)
                    .addComponent(Message_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(199, 199, 199)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Submit_JButton)
                    .addComponent(Back_JButton)
                    .addComponent(Check_JButton))
                .addContainerGap(33, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Submit_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit_JButtonActionPerformed
        request.setAvailabilty1(Message_JTextField.getText());
        request.setStatus("Completed");
        Submit_JButton.setEnabled(false);
        
        
    }//GEN-LAST:event_Submit_JButtonActionPerformed

    private void Back_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_JButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageBloodBankJPanel dwjp = ( ManageBloodBankJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_Back_JButtonActionPerformed

    private void Check_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Check_JButtonActionPerformed
        // TODO add your handling code here:
        boolean flag =true;
        String message = Message_JTextField.getText();
        Pattern pmessage=Pattern.compile("^(?!\\d+$)\\w+\\S+$");
        Matcher mmessage=pmessage.matcher(message);
        boolean ismessageValid=mmessage.matches();

       if(ismessageValid==true && flag==true){
            Submit_JButton.setEnabled(true);
            Message_JTextField.setEditable(false);
            
        }
        else{
            JOptionPane.showMessageDialog(null, "PLease input valid details");
            Message_JTextField.setEditable(true);
           
        }
    }//GEN-LAST:event_Check_JButtonActionPerformed

    private void Reset_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset_JButtonActionPerformed
            Message_JTextField.setText("");
           
    }//GEN-LAST:event_Reset_JButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Availability_JLabel;
    private javax.swing.JButton Back_JButton;
    private javax.swing.JButton Check_JButton;
    private javax.swing.JLabel Message_JLabel;
    private javax.swing.JTextField Message_JTextField;
    private javax.swing.JButton Reset_JButton;
    private javax.swing.JButton Submit_JButton;
    // End of variables declaration//GEN-END:variables
}
