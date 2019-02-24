package UserInterface.AvailabityWorkArea;

import Business.Disaster;
import Business.WorkQueue.HospitalAvailabilityWorkTestRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ProcessWorkRequestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private HospitalAvailabilityWorkTestRequest request;

    public ProcessWorkRequestJPanel(JPanel userProcessContainer, HospitalAvailabilityWorkTestRequest request) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        
        Submit_JButton.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Availability_JLabel = new javax.swing.JLabel();
        Message_JLabel = new javax.swing.JLabel();
        Message_JTextField = new javax.swing.JTextField();
        Valid3_JLabel = new javax.swing.JLabel();
        Valid_JLabel = new javax.swing.JLabel();
        Valid1_JLabel = new javax.swing.JLabel();
        Valid2_JLabel = new javax.swing.JLabel();
        Back_JButton = new javax.swing.JButton();
        Check_JButton = new javax.swing.JButton();
        Submit_JButton = new javax.swing.JButton();
        Reset_JButton = new javax.swing.JButton();

        Availability_JLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Availability_JLabel.setText("Availability");

        Message_JLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Message_JLabel.setText("Message");

        Message_JTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Message_JTextField.setToolTipText("Message should be a alpha-numeric character, only special symbols allowed are , . ! ?");
        Message_JTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Message_JTextFieldActionPerformed(evt);
            }
        });

        Valid3_JLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Valid3_JLabel.setToolTipText("");
        Valid3_JLabel.setPreferredSize(new java.awt.Dimension(6, 20));
        Valid3_JLabel.setRequestFocusEnabled(false);

        Valid_JLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Valid_JLabel.setToolTipText("");
        Valid_JLabel.setPreferredSize(new java.awt.Dimension(6, 20));

        Valid1_JLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Valid1_JLabel.setToolTipText("");
        Valid1_JLabel.setPreferredSize(new java.awt.Dimension(6, 20));

        Valid2_JLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Valid2_JLabel.setToolTipText("");
        Valid2_JLabel.setPreferredSize(new java.awt.Dimension(6, 20));

        Back_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Back_JButton.setText("<< Back");
        Back_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_JButtonActionPerformed(evt);
            }
        });

        Check_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Check_JButton.setText("Check?");
        Check_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Check_JButtonActionPerformed(evt);
            }
        });

        Submit_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Submit_JButton.setText("Submit Result >>");
        Submit_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit_JButtonActionPerformed(evt);
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
                .addContainerGap(400, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(Message_JLabel)
                                        .addGap(52, 52, 52)
                                        .addComponent(Message_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Back_JButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Check_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Submit_JButton)
                                    .addComponent(Valid2_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Valid_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Valid3_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Valid1_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(Availability_JLabel)))
                        .addGap(323, 323, 323))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Reset_JButton)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Reset_JButton)
                .addGap(67, 67, 67)
                .addComponent(Availability_JLabel)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Message_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Message_JLabel))
                            .addComponent(Valid_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Valid1_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Valid2_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Back_JButton)
                            .addComponent(Check_JButton)
                            .addComponent(Submit_JButton)))
                    .addComponent(Valid3_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(268, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Back_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_JButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManagerForHospitalWorkArea dwjp = (ManagerForHospitalWorkArea) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_Back_JButtonActionPerformed

    private void Submit_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit_JButtonActionPerformed
        request.setAvailabilty(Message_JTextField.getText());
        request.setStatus("Completed");
        Submit_JButton.setEnabled(false);
        Message_JTextField.setEditable(true);
        
    }//GEN-LAST:event_Submit_JButtonActionPerformed

    private void Check_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Check_JButtonActionPerformed
        // TODO add your handling code here:
        boolean flag =true;
        String message = Message_JTextField.getText();
        Pattern pmessage=Pattern.compile("^[a-zA-Z0-9!\\?\\.\\,]{2,30}$");
        Matcher mmessage=pmessage.matcher(message);
        boolean ismessageValid=mmessage.matches();

        Valid_JLabel.setText(Boolean.toString(ismessageValid));
            if(ismessageValid==true && flag==true){
                Valid3_JLabel.setForeground(Color.green);
                Valid3_JLabel.setText(Boolean.toString(ismessageValid));
                Submit_JButton.setEnabled(true);
                Message_JTextField.setEditable(false);
                
            }
            else{
                JOptionPane.showMessageDialog(null, "PLease input valid details");
                Valid3_JLabel.setForeground(Color.red);
                Valid3_JLabel.setText(Boolean.toString(ismessageValid));
                Valid_JLabel.setForeground(Color.red);
                Message_JTextField.setEditable(true);
                
            }
    }//GEN-LAST:event_Check_JButtonActionPerformed

    private void Message_JTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Message_JTextFieldActionPerformed
    }//GEN-LAST:event_Message_JTextFieldActionPerformed

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
    private javax.swing.JLabel Valid1_JLabel;
    private javax.swing.JLabel Valid2_JLabel;
    private javax.swing.JLabel Valid3_JLabel;
    private javax.swing.JLabel Valid_JLabel;
    // End of variables declaration//GEN-END:variables
}
