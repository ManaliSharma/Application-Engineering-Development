package UserInterface.HospitalRole;

import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Organisation.HospitalOrganisation;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FireToHospitalRequest;
import Business.WorkQueue.PoliceToHospitalRequest;
import UserInterface.AdminstrativeRole.AdminWorkAreaJPanel;
import UserInterface.HospitalRole.HospitalWorkAreaJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

public class ProcessPoliceWorkRequest extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private PoliceToHospitalRequest request;
    private EnterpriseDirectory enterDir;
    
    public ProcessPoliceWorkRequest(JPanel userProcessContainer, PoliceToHospitalRequest request, EnterpriseDirectory enterDir) {
        
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.enterDir=enterDir;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Availability_JLabel = new javax.swing.JLabel();
        Message_JLabel = new javax.swing.JLabel();
        Result_JTextField = new javax.swing.JTextField();
        Back_JButton = new javax.swing.JButton();
        Submit_JButton = new javax.swing.JButton();
        Valid_JLabel = new javax.swing.JLabel();
        Reset_JButton1 = new javax.swing.JButton();

        Availability_JLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Availability_JLabel.setText("Availability");

        Message_JLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Message_JLabel.setText("Message");

        Result_JTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Result_JTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Result_JTextFieldActionPerformed(evt);
            }
        });

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

        Valid_JLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Valid_JLabel.setToolTipText("");
        Valid_JLabel.setPreferredSize(new java.awt.Dimension(6, 20));

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
                        .addComponent(Back_JButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(395, 395, 395)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Availability_JLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Message_JLabel)
                                .addGap(107, 107, 107)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Submit_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Result_JTextField))))))
                .addGap(45, 45, 45)
                .addComponent(Valid_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
                .addComponent(Reset_JButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Back_JButton)
                        .addGap(2, 2, 2)
                        .addComponent(Availability_JLabel)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Message_JLabel)
                            .addComponent(Result_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Reset_JButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(Valid_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68)
                .addComponent(Submit_JButton)
                .addContainerGap(452, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Back_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_JButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
            for(Component c:componentArray){
                if(c instanceof HospitalWorkAreaJPanel){
                    HospitalWorkAreaJPanel mhtp= (HospitalWorkAreaJPanel) c;
                    mhtp.populatePolicetoHospitalTable();
                    mhtp.populateRequestTable();
                    mhtp.populateRequestBloodBankTable();
       
                }
            }
    }//GEN-LAST:event_Back_JButtonActionPerformed

    private void Submit_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit_JButtonActionPerformed
        request.setAvailableNumberHospitalP(Result_JTextField.getText());
        request.setStatus("Completed");
    }//GEN-LAST:event_Submit_JButtonActionPerformed

    private void Result_JTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Result_JTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Result_JTextFieldActionPerformed

    private void Reset_JButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset_JButton1ActionPerformed
        Result_JTextField.setText("");
    }//GEN-LAST:event_Reset_JButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Availability_JLabel;
    private javax.swing.JButton Back_JButton;
    private javax.swing.JLabel Message_JLabel;
    private javax.swing.JButton Reset_JButton1;
    private javax.swing.JTextField Result_JTextField;
    private javax.swing.JButton Submit_JButton;
    private javax.swing.JLabel Valid_JLabel;
    // End of variables declaration//GEN-END:variables
}
