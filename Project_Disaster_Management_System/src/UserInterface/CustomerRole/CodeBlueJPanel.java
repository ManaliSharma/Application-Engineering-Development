
package UserInterface.CustomerRole;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.Disaster;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class CodeBlueJPanel extends javax.swing.JPanel {

   private JPanel userProcessContainer;
   private Disaster disaster;
   private CustomerDirectory cusDir;
  
    public CodeBlueJPanel(JPanel userProcessContainer, Disaster disaster, CustomerDirectory cusDir) {
         initComponents();
        
        this.userProcessContainer=userProcessContainer;
        this.disaster=disaster;  
        this.cusDir=cusDir;
    
    
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title_JLabel = new javax.swing.JLabel();
        TypeComboEmergency_JLabel = new javax.swing.JLabel();
        Emergency_JComboBox = new javax.swing.JComboBox();
        Description_JTextField = new javax.swing.JTextField();
        Description_JLabel = new javax.swing.JLabel();
        Back_JButton = new javax.swing.JButton();
        Submit_JButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setForeground(new java.awt.Color(102, 204, 255));

        Title_JLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Title_JLabel.setForeground(new java.awt.Color(102, 102, 255));
        Title_JLabel.setText("CODE BLUE ");

        TypeComboEmergency_JLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TypeComboEmergency_JLabel.setText("Select Type of emergency:");

        Emergency_JComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Emergency_JComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Medical Emergency", "Fire Emergency", "Theft", "Others" }));
        Emergency_JComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Emergency_JComboBoxActionPerformed(evt);
            }
        });

        Description_JTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Description_JTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Description_JTextFieldActionPerformed(evt);
            }
        });

        Description_JLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Description_JLabel.setText("Detali Description:");

        Back_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Back_JButton.setText("<< Back");
        Back_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_JButtonActionPerformed(evt);
            }
        });

        Submit_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Submit_JButton.setText("Submit >>");
        Submit_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit_JButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TypeComboEmergency_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Description_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Back_JButton)))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Title_JLabel)
                            .addComponent(Emergency_JComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Description_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(391, 391, 391)
                        .addComponent(Submit_JButton)))
                .addContainerGap(594, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back_JButton)
                    .addComponent(Title_JLabel))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TypeComboEmergency_JLabel)
                    .addComponent(Emergency_JComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Description_JLabel)
                    .addComponent(Description_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(Submit_JButton)
                .addContainerGap(344, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Emergency_JComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Emergency_JComboBoxActionPerformed
    }//GEN-LAST:event_Emergency_JComboBoxActionPerformed

    private void Back_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_JButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SOSTypeJPanel sOSTypeJPanel = (SOSTypeJPanel) component;
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_Back_JButtonActionPerformed

    private void Description_JTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Description_JTextFieldActionPerformed
    }//GEN-LAST:event_Description_JTextFieldActionPerformed

    private void Submit_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit_JButtonActionPerformed
            
        
            Customer c=cusDir.addCustomer();
            String type=Emergency_JComboBox.getSelectedItem().toString();
            c.setEmergencyType(type);
            String Desc=Description_JTextField.getText();
            c.setBlueDesc(Desc);
        
            CodeBlueReport codeBlue = new CodeBlueReport(userProcessContainer, disaster,cusDir);
            userProcessContainer.add("CodeBlueJPanel",codeBlue);
            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        




    }//GEN-LAST:event_Submit_JButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_JButton;
    private javax.swing.JLabel Description_JLabel;
    private javax.swing.JTextField Description_JTextField;
    private javax.swing.JComboBox Emergency_JComboBox;
    private javax.swing.JButton Submit_JButton;
    private javax.swing.JLabel Title_JLabel;
    private javax.swing.JLabel TypeComboEmergency_JLabel;
    // End of variables declaration//GEN-END:variables
}
