package UserInterface.RequestReport;

import Business.WorkQueue.RequestReportTestRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ProcessReport_JPanel extends javax.swing.JPanel {
private JPanel userProcessContainer;
 private RequestReportTestRequest requestReportTestRequest;
    ProcessReport_JPanel(JPanel userProcessContainer, RequestReportTestRequest request) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.requestReportTestRequest = request;   
        
        Submit_JButton.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Message_JTextField = new javax.swing.JTextField();
        Submit_JButton = new javax.swing.JButton();
        Back_JButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Message_JLabel = new javax.swing.JLabel();
        Valid_JLabel = new javax.swing.JLabel();
        Valid1_JLabel = new javax.swing.JLabel();
        Valid2_JLabel = new javax.swing.JLabel();
        Check_JButton = new javax.swing.JButton();
        Reset_JButton1 = new javax.swing.JButton();

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

        Valid_JLabel.setToolTipText("");
        Valid_JLabel.setPreferredSize(new java.awt.Dimension(6, 20));

        Valid1_JLabel.setToolTipText("");
        Valid1_JLabel.setPreferredSize(new java.awt.Dimension(6, 20));

        Valid2_JLabel.setToolTipText("");
        Valid2_JLabel.setPreferredSize(new java.awt.Dimension(6, 20));

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Back_JButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Reset_JButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(470, 470, 470)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Message_JLabel)
                                    .addComponent(Check_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Message_JTextField)
                                    .addComponent(Submit_JButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Valid_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Valid2_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Valid1_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel5))
                        .addGap(0, 244, Short.MAX_VALUE)))
                .addContainerGap())
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
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Message_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Message_JLabel))
                        .addGap(90, 90, 90))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Valid_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(Valid1_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Valid2_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Submit_JButton)
                    .addComponent(Check_JButton))
                .addContainerGap(411, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Submit_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit_JButtonActionPerformed
        requestReportTestRequest.setAvailability2(Message_JTextField.getText());
        requestReportTestRequest.setStatus("Completed");
    }//GEN-LAST:event_Submit_JButtonActionPerformed

    private void Back_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_JButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageReport_JPanel dwjp = ( ManageReport_JPanel) component;
        dwjp.PopulateRequestReport();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_Back_JButtonActionPerformed

    private void Check_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Check_JButtonActionPerformed
        boolean flag =true;
        String message = Message_JTextField.getText();
        Pattern pmessage=Pattern.compile("^[a-zA-Z0-9!\\?\\.\\,]{2,30}$");
        Matcher mmessage=pmessage.matcher(message);
        boolean ismessageValid=mmessage.matches();

        Valid_JLabel.setText(Boolean.toString(ismessageValid));
       

        if(ismessageValid==true && flag==true){
            Valid_JLabel.setForeground(Color.green);
            Valid_JLabel.setText(Boolean.toString(ismessageValid));
            Submit_JButton.setEnabled(true);
            Message_JTextField.setEditable(false);
           
        }
        else{
            JOptionPane.showMessageDialog(null, "PLease input valid details");
            Valid_JLabel.setForeground(Color.red);
            Valid_JLabel.setText(Boolean.toString(ismessageValid));
            
            Message_JTextField.setEditable(true);
            
        }
    }//GEN-LAST:event_Check_JButtonActionPerformed

    private void Reset_JButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset_JButton1ActionPerformed
        Message_JTextField.setText("");
        
    }//GEN-LAST:event_Reset_JButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_JButton;
    private javax.swing.JButton Check_JButton;
    private javax.swing.JLabel Message_JLabel;
    private javax.swing.JTextField Message_JTextField;
    private javax.swing.JButton Reset_JButton1;
    private javax.swing.JButton Submit_JButton;
    private javax.swing.JLabel Valid1_JLabel;
    private javax.swing.JLabel Valid2_JLabel;
    private javax.swing.JLabel Valid_JLabel;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
