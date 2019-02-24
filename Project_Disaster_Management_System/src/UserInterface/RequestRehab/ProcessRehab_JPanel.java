package UserInterface.RequestRehab;

import Business.WorkQueue.RequestRehabTestRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ProcessRehab_JPanel extends javax.swing.JPanel {
 private JPanel userProcessContainer;
 private RequestRehabTestRequest requestRehabTestRequest;
    
    ProcessRehab_JPanel(JPanel userProcessContainer, RequestRehabTestRequest request) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.requestRehabTestRequest = request;
        
        Submit_JButton.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Email_JLabel = new javax.swing.JLabel();
        EmailAddress_JTextField = new javax.swing.JTextField();
        PhoneNumber_JTextField = new javax.swing.JTextField();
        Message_JTextField = new javax.swing.JTextField();
        Submit_JButton = new javax.swing.JButton();
        Back_JButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Message_JLabel = new javax.swing.JLabel();
        PhoneNumber_JLabel = new javax.swing.JLabel();
        Address_JLabel = new javax.swing.JLabel();
        Address_JTextField = new javax.swing.JTextField();
        Valid2_JLabel = new javax.swing.JLabel();
        Valid_JLabel = new javax.swing.JLabel();
        Valid1_JLabel = new javax.swing.JLabel();
        Valid3_JLabel = new javax.swing.JLabel();
        Check_JButton = new javax.swing.JButton();
        Reset_JButton1 = new javax.swing.JButton();

        Email_JLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Email_JLabel.setText("Email Addres");

        EmailAddress_JTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        PhoneNumber_JTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Message_JTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Submit_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Submit_JButton.setText("Submit Result >>");
        Submit_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit_JButtonActionPerformed(evt);
            }
        });

        Back_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Back_JButton.setText("<< Back");
        Back_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_JButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Availability");

        Message_JLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Message_JLabel.setText("Message");

        PhoneNumber_JLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PhoneNumber_JLabel.setText("Phone Number");

        Address_JLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Address_JLabel.setText("Address");

        Address_JTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Valid2_JLabel.setToolTipText("");
        Valid2_JLabel.setPreferredSize(new java.awt.Dimension(6, 20));

        Valid_JLabel.setToolTipText("");
        Valid_JLabel.setPreferredSize(new java.awt.Dimension(6, 20));

        Valid1_JLabel.setToolTipText("");
        Valid1_JLabel.setPreferredSize(new java.awt.Dimension(6, 20));

        Valid3_JLabel.setToolTipText("");
        Valid3_JLabel.setPreferredSize(new java.awt.Dimension(6, 20));

        Check_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Check_JButton.setText("Check?");
        Check_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Check_JButtonActionPerformed(evt);
            }
        });

        Reset_JButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Reset_JButton1.setText("Reset");
        Reset_JButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reset_JButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Back_JButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Reset_JButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(462, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Check_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Submit_JButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Message_JLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Message_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PhoneNumber_JLabel)
                                    .addComponent(Address_JLabel)
                                    .addComponent(Email_JLabel))
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Address_JTextField)
                                    .addComponent(PhoneNumber_JTextField)
                                    .addComponent(EmailAddress_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Valid2_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Valid1_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(Valid3_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Valid_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(356, 356, 356))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back_JButton)
                    .addComponent(Reset_JButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Message_JLabel)
                            .addComponent(Message_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(PhoneNumber_JLabel))
                                    .addComponent(PhoneNumber_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(Email_JLabel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(EmailAddress_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Valid1_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Valid2_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Address_JLabel)
                                .addComponent(Address_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Valid3_JLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Valid_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Submit_JButton)
                    .addComponent(Check_JButton))
                .addGap(368, 368, 368))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Submit_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit_JButtonActionPerformed
        requestRehabTestRequest.setAvailability1(Message_JTextField.getText());
        requestRehabTestRequest.setPhoneNumber(PhoneNumber_JTextField.getText());
        requestRehabTestRequest.setEmailAddress(EmailAddress_JTextField.getText());
        requestRehabTestRequest.setAddress(Address_JTextField.getText());
        requestRehabTestRequest.setStatus("Completed");
        Submit_JButton.setEnabled(false);
        Message_JTextField.setEditable(true);
        PhoneNumber_JTextField.setEditable(true);
        EmailAddress_JTextField.setEditable(true);
        Address_JTextField.setEditable(true);
    }//GEN-LAST:event_Submit_JButtonActionPerformed

    private void Back_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_JButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageRehab_JPanel dwjp = ( ManageRehab_JPanel) component;
        dwjp.PopulateRequestRehab();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_Back_JButtonActionPerformed

    private void Check_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Check_JButtonActionPerformed
        boolean flag =true;
        String message = Message_JTextField.getText();
        Pattern pmessage=Pattern.compile("^[a-zA-Z0-9!\\?\\.\\,]{2,30}$");
        Matcher mmessage=pmessage.matcher(message);
        boolean ismessageValid=mmessage.matches();

        String phone = PhoneNumber_JTextField.getText();
        Pattern pphone=Pattern.compile("^[0-9]{1,3}$");
        Matcher mphone=pphone.matcher(phone);
        boolean isphoneValid=mphone.matches();

        String email = EmailAddress_JTextField.getText();
        Pattern pemail= Pattern.compile("^[0-9]{1,3}$");
        Matcher memail= pemail.matcher(email);
        boolean isemailValid=memail.matches();
        
        String address = Address_JTextField.getText();
        Pattern paddress= Pattern.compile("^[0-9]{1,3}$");
        Matcher maddress= paddress.matcher(address);
        boolean isaddressValid=maddress.matches();

        Valid_JLabel.setText(Boolean.toString(ismessageValid));
        Valid1_JLabel.setText(Boolean.toString(isphoneValid));
        Valid2_JLabel.setText(Boolean.toString(isemailValid));
        Valid3_JLabel.setText(Boolean.toString(isaddressValid));

        if(ismessageValid==true && isphoneValid==true && isemailValid==true && isaddressValid==true && flag==true){
            Valid_JLabel.setForeground(Color.green);
            Valid_JLabel.setText(Boolean.toString(ismessageValid));
            Valid1_JLabel.setForeground(Color.green);
            Valid1_JLabel.setText(Boolean.toString(isphoneValid));
            Valid2_JLabel.setForeground(Color.green);
            Valid2_JLabel.setText(Boolean.toString(isemailValid));
            Valid3_JLabel.setForeground(Color.green);
            Valid3_JLabel.setText(Boolean.toString(isaddressValid));
            Submit_JButton.setEnabled(true);
            Message_JTextField.setEditable(false);
            PhoneNumber_JTextField.setEditable(false);
            EmailAddress_JTextField.setEditable(false);
            Address_JTextField.setEditable(false);
        }
        else{
            JOptionPane.showMessageDialog(null, "PLease input valid details");
            Valid_JLabel.setForeground(Color.red);
            Valid_JLabel.setText(Boolean.toString(ismessageValid));
            Valid1_JLabel.setForeground(Color.red);
            Valid1_JLabel.setText(Boolean.toString(isphoneValid));
            Valid2_JLabel.setForeground(Color.red);
            Valid2_JLabel.setText(Boolean.toString(isemailValid));
            Valid3_JLabel.setForeground(Color.red);
            Valid3_JLabel.setText(Boolean.toString(isaddressValid));
            Message_JTextField.setEditable(true);
            PhoneNumber_JTextField.setEditable(true);
            EmailAddress_JTextField.setEditable(true);
            Address_JTextField.setEditable(true);
        }
    }//GEN-LAST:event_Check_JButtonActionPerformed

    private void Reset_JButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset_JButton1ActionPerformed
        Message_JTextField.setText("");
        PhoneNumber_JTextField.setText("");
        EmailAddress_JTextField.setText("");
        Address_JTextField.setText("");
    }//GEN-LAST:event_Reset_JButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address_JLabel;
    private javax.swing.JTextField Address_JTextField;
    private javax.swing.JButton Back_JButton;
    private javax.swing.JButton Check_JButton;
    private javax.swing.JTextField EmailAddress_JTextField;
    private javax.swing.JLabel Email_JLabel;
    private javax.swing.JLabel Message_JLabel;
    private javax.swing.JTextField Message_JTextField;
    private javax.swing.JLabel PhoneNumber_JLabel;
    private javax.swing.JTextField PhoneNumber_JTextField;
    private javax.swing.JButton Reset_JButton1;
    private javax.swing.JButton Submit_JButton;
    private javax.swing.JLabel Valid1_JLabel;
    private javax.swing.JLabel Valid2_JLabel;
    private javax.swing.JLabel Valid3_JLabel;
    private javax.swing.JLabel Valid_JLabel;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
