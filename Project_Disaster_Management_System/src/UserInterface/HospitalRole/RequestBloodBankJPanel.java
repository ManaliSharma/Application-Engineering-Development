package UserInterface.HospitalRole;

import Business.Enterprise.Enterprise;
import Business.Organisation.BloodBankOrganisation;
import Business.Organisation.HospitalOrganisation;
import Business.Organisation.Organisation;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BloodBankWorkTestRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class RequestBloodBankJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private BloodBankOrganisation bloodorg;
    private HospitalOrganisation hospitalorganisation;
    
    public RequestBloodBankJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, HospitalOrganisation hospitalorganisation) {
        
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.hospitalorganisation=hospitalorganisation;
        
        valueLabel.setText(enterprise.getName());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TypeofBlood_JLabel = new javax.swing.JLabel();
        Message_JTextField = new javax.swing.JTextField();
        valueLabel = new javax.swing.JLabel();
        Enterprise_JLabel = new javax.swing.JLabel();
        Back_JButton = new javax.swing.JButton();
        RequestAvailability_JButton = new javax.swing.JButton();
        Valid_JLabel = new javax.swing.JLabel();
        Reset_JButton1 = new javax.swing.JButton();

        TypeofBlood_JLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TypeofBlood_JLabel.setText("Type of Blood Available");

        Message_JTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Message_JTextField.setToolTipText("Alpha-Numeric values");
        Message_JTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Message_JTextFieldActionPerformed(evt);
            }
        });

        valueLabel.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        valueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        valueLabel.setText("<value>");

        Enterprise_JLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Enterprise_JLabel.setText("EnterPrise :");

        Back_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Back_JButton.setText("<<Back");
        Back_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_JButtonActionPerformed(evt);
            }
        });

        RequestAvailability_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RequestAvailability_JButton.setText("Request Availabilty!");
        RequestAvailability_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestAvailability_JButtonActionPerformed(evt);
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
                        .addComponent(Back_JButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Reset_JButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(386, 386, 386)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TypeofBlood_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Enterprise_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RequestAvailability_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Message_JTextField)
                            .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(Valid_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 323, Short.MAX_VALUE)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Enterprise_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TypeofBlood_JLabel)
                            .addComponent(Message_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(Valid_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(RequestAvailability_JButton)
                .addContainerGap(473, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Message_JTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Message_JTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Message_JTextFieldActionPerformed

    private void Back_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_JButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        HospitalWorkAreaJPanel dwjp = (HospitalWorkAreaJPanel) component;
        dwjp.populateRequestTable();
        dwjp.populateRequestBloodBankTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_Back_JButtonActionPerformed

    private void RequestAvailability_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestAvailability_JButtonActionPerformed
        String message = Message_JTextField.getText();
        BloodBankWorkTestRequest request = new BloodBankWorkTestRequest();
        request.setMessage(message);
        request.setMessage(message);
            if(request.getMessage().isEmpty()){
                JOptionPane.showMessageDialog(null, "Enter a Message!!");        
            }
            else{
                request.setSender(userAccount);
                request.setStatus("Sent");
            }
        Organisation org = null;
        for (Organisation organisation : enterprise.getOrganisationDirectory().getOrganisationList()){
            if (organisation instanceof BloodBankOrganisation){
                org = organisation;
                break;
            }
        }
        if (org!=null){
            //org.getWorkQueue().getWorkRequestList().add(request);
            //org = (BloodBankOrganisation)org;
            bloodorg=(BloodBankOrganisation) org;
            bloodorg.getBloodTestRequestQueue().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
            hospitalorganisation.getHospitalbloodqueue().add(request);
        }
    }//GEN-LAST:event_RequestAvailability_JButtonActionPerformed

    private void Reset_JButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset_JButton1ActionPerformed
        Message_JTextField.setText("");
    }//GEN-LAST:event_Reset_JButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_JButton;
    private javax.swing.JLabel Enterprise_JLabel;
    private javax.swing.JTextField Message_JTextField;
    private javax.swing.JButton RequestAvailability_JButton;
    private javax.swing.JButton Reset_JButton1;
    private javax.swing.JLabel TypeofBlood_JLabel;
    private javax.swing.JLabel Valid_JLabel;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
