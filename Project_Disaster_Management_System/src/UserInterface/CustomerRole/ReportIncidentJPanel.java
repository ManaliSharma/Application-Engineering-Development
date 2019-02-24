package UserInterface.CustomerRole;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.Disaster;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

public class ReportIncidentJPanel extends javax.swing.JPanel {

   private JPanel userProcessContainer;
   private Disaster disaster;
   private CustomerDirectory cusDir;
    
    public ReportIncidentJPanel(JPanel userProcessContainer, CustomerDirectory cusDir) {
        initComponents();
        
        this.userProcessContainer=userProcessContainer;
        this.cusDir=cusDir;      
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Gender_ButtonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Street_JTextField = new javax.swing.JTextField();
        CodeRed_JRadioButton = new javax.swing.JRadioButton();
        CodeBlue_RadioButton = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Description_JEditorPane = new javax.swing.JEditorPane();
        Back_JButton = new javax.swing.JButton();
        Street_JTextField1 = new javax.swing.JTextField();
        Street_JTextField3 = new javax.swing.JTextField();
        Submit_JButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Report Incident");

        jLabel2.setText("Time of Accident:");

        jLabel3.setText("Date of Accident :");

        jLabel5.setText("Severity: ");

        jLabel6.setText("Street:");

        Street_JTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Street_JTextFieldActionPerformed(evt);
            }
        });

        Gender_ButtonGroup.add(CodeRed_JRadioButton);
        CodeRed_JRadioButton.setText("Code RED");

        Gender_ButtonGroup.add(CodeBlue_RadioButton);
        CodeBlue_RadioButton.setText("Code BLUE");

        jLabel8.setText("Description: ");

        jScrollPane1.setViewportView(Description_JEditorPane);

        Back_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Back_JButton.setText("<< Back");
        Back_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_JButtonActionPerformed(evt);
            }
        });

        Street_JTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Street_JTextField1ActionPerformed(evt);
            }
        });

        Street_JTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Street_JTextField3ActionPerformed(evt);
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
                        .addGap(314, 314, 314)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(93, 93, 93)
                                .addComponent(Street_JTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CodeRed_JRadioButton)
                                    .addComponent(CodeBlue_RadioButton)
                                    .addComponent(Street_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(44, 44, 44)
                                .addComponent(Street_JTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(71, 71, 71)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Submit_JButton)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(Back_JButton)
                        .addGap(466, 466, 466)
                        .addComponent(jLabel1)))
                .addContainerGap(474, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(Back_JButton))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Street_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Street_JTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Street_JTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CodeRed_JRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CodeBlue_RadioButton)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Submit_JButton)
                .addContainerGap(435, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Street_JTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Street_JTextFieldActionPerformed
    }//GEN-LAST:event_Street_JTextFieldActionPerformed

    private void Back_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_JButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CustomerWorkPanel customerWorkPanel = (CustomerWorkPanel) component;
        customerWorkPanel.populateReportIncident();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_Back_JButtonActionPerformed

    private void Street_JTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Street_JTextField1ActionPerformed
    }//GEN-LAST:event_Street_JTextField1ActionPerformed

    private void Street_JTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Street_JTextField3ActionPerformed
    }//GEN-LAST:event_Street_JTextField3ActionPerformed

    private void Submit_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit_JButtonActionPerformed
        Customer c=cusDir.addCustomer();
        String location=Street_JTextField1.getText();
        c.setLocation(location);
        String Desc=Description_JEditorPane.getText();
        c.setDescription(Desc);
        CodeRed_JRadioButton.setActionCommand("RED");
        CodeBlue_RadioButton.setActionCommand("BLUE");
        String Type=Gender_ButtonGroup.getSelection().getActionCommand();
        c.setType(Type);
    }//GEN-LAST:event_Submit_JButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_JButton;
    private javax.swing.JRadioButton CodeBlue_RadioButton;
    private javax.swing.JRadioButton CodeRed_JRadioButton;
    private javax.swing.JEditorPane Description_JEditorPane;
    private javax.swing.ButtonGroup Gender_ButtonGroup;
    private javax.swing.JTextField Street_JTextField;
    private javax.swing.JTextField Street_JTextField1;
    private javax.swing.JTextField Street_JTextField3;
    private javax.swing.JButton Submit_JButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
