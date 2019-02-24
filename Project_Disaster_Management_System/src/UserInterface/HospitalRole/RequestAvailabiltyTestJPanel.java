package UserInterface.HospitalRole;

import Business.Disaster;
import Business.Enterprise.Enterprise;
import Business.Organisation.AvailabiltyHospitalOrganisation;
import Business.Organisation.HospitalOrganisation;
import Business.Organisation.Organisation;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HospitalAvailabilityWorkTestRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class RequestAvailabiltyTestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private AvailabiltyHospitalOrganisation avgorg;
    private HospitalOrganisation hospitalorganisation;

    public RequestAvailabiltyTestJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise,HospitalOrganisation hospitalorganisation) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.hospitalorganisation=hospitalorganisation;

        Value_JLabel.setText(enterprise.getName());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RequestAvailability_JButton = new javax.swing.JButton();
        Back_JButton = new javax.swing.JButton();
        Value_JLabel = new javax.swing.JLabel();
        Enterprise_JLabel = new javax.swing.JLabel();
        Message_JTextField = new javax.swing.JTextField();
        Message_JLabel = new javax.swing.JLabel();
        Valid_JLabel = new javax.swing.JLabel();
        Reset_JButton1 = new javax.swing.JButton();

        RequestAvailability_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RequestAvailability_JButton.setText("Request Availabilty >>");
        RequestAvailability_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestAvailability_JButtonActionPerformed(evt);
            }
        });

        Back_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Back_JButton.setText("<<Back");
        Back_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_JButtonActionPerformed(evt);
            }
        });

        Value_JLabel.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        Value_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Value_JLabel.setText("<value>");

        Enterprise_JLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Enterprise_JLabel.setText("EnterPrise :");

        Message_JTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Message_JTextField.setToolTipText("Alpha-Numeric values");
        Message_JTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Message_JTextFieldActionPerformed(evt);
            }
        });
        Message_JTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Message_JTextFieldKeyTyped(evt);
            }
        });

        Message_JLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Message_JLabel.setText("Message");

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(366, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Enterprise_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Message_JLabel))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Message_JTextField)
                            .addComponent(RequestAvailability_JButton)
                            .addComponent(Value_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Reset_JButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(Valid_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(364, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Reset_JButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Back_JButton)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(Valid_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Enterprise_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Value_JLabel))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(Message_JLabel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Message_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(31, 31, 31)
                                .addComponent(RequestAvailability_JButton)))))
                .addContainerGap(473, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RequestAvailability_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestAvailability_JButtonActionPerformed
        String message = Message_JTextField.getText();
        HospitalAvailabilityWorkTestRequest request = new HospitalAvailabilityWorkTestRequest();
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
            if (organisation instanceof AvailabiltyHospitalOrganisation){
                org = organisation;
                break;
            }
        }
        if (org!=null){
            //org.getWorkQueue().getWorkRequestList().add(request);
            avgorg=(AvailabiltyHospitalOrganisation)org;
            avgorg.getAvailablityqueue().add(request);
            hospitalorganisation.getHospitalavailablityqueue().add(request);
            //userAccount.getWorkQueue().getWorkRequestList().add(request);
        }
    }//GEN-LAST:event_RequestAvailability_JButtonActionPerformed

    private void Back_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_JButtonActionPerformed
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        HospitalWorkAreaJPanel dwjp = (HospitalWorkAreaJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_Back_JButtonActionPerformed

    private void Message_JTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Message_JTextFieldActionPerformed
    }//GEN-LAST:event_Message_JTextFieldActionPerformed

    private void Message_JTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Message_JTextFieldKeyTyped
    }//GEN-LAST:event_Message_JTextFieldKeyTyped

    private void Reset_JButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset_JButton1ActionPerformed
        Message_JTextField.setText("");
    }//GEN-LAST:event_Reset_JButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_JButton;
    private javax.swing.JLabel Enterprise_JLabel;
    private javax.swing.JLabel Message_JLabel;
    private javax.swing.JTextField Message_JTextField;
    private javax.swing.JButton RequestAvailability_JButton;
    private javax.swing.JButton Reset_JButton1;
    private javax.swing.JLabel Valid_JLabel;
    private javax.swing.JLabel Value_JLabel;
    // End of variables declaration//GEN-END:variables
}
