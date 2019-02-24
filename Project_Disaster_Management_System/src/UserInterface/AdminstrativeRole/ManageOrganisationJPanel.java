package UserInterface.AdminstrativeRole;

import Business.Enterprise.*;
import Business.Organisation.OrganisationDirectory;
import Business.Organisation.Organisation;
import Business.Organisation.Organisation.Type;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class ManageOrganisationJPanel extends javax.swing.JPanel {

    private OrganisationDirectory directory;
    private JPanel userProcessContainer;
    private Enterprise enterprise;

   /* ManageOrganisationJPanel(JPanel userProcessContainer, OrganisationDirectory organisationDirectory) {
       initComponents();
       this.userProcessContainer = userProcessContainer;
       this.directory = organisationDirectory;
    
       EnterpriseType_JLabel.setText(enterprise.getEnterpriseType().getValue());
        populateTable();
        populateCombo();
       
    }
*/  
    public ManageOrganisationJPanel(JPanel userProcessContainer, OrganisationDirectory organisationDirectory,Enterprise enterprise) {
       
       initComponents();
       
       this.userProcessContainer = userProcessContainer;
       this.directory = organisationDirectory;
       this.enterprise=enterprise;
       
       populateTable();
       populateCombo();
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JScrollPane = new javax.swing.JScrollPane();
        Organisation_JTable = new javax.swing.JTable();
        Organization_JLabel = new javax.swing.JLabel();
        Organisation_JComboBox = new javax.swing.JComboBox();
        Back_JButton = new javax.swing.JButton();
        Add_JButton = new javax.swing.JButton();

        Organisation_JTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Organisation_JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JScrollPane.setViewportView(Organisation_JTable);

        Organization_JLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Organization_JLabel.setText("Organisation Type ");

        Organisation_JComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Organisation_JComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Back_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Back_JButton.setText("<< Back");
        Back_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_JButtonActionPerformed(evt);
            }
        });

        Add_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Add_JButton.setText("Add Organisation +");
        Add_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_JButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(438, 438, 438)
                        .addComponent(Organization_JLabel)
                        .addGap(63, 63, 63)
                        .addComponent(Organisation_JComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Back_JButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(499, 499, 499)
                        .addComponent(Add_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(400, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Back_JButton)
                .addGap(31, 31, 31)
                .addComponent(JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Organisation_JComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Organization_JLabel))
                .addGap(34, 34, 34)
                .addComponent(Add_JButton)
                .addContainerGap(376, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Add_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_JButtonActionPerformed
        
        Type type = (Type) Organisation_JComboBox.getSelectedItem();
        directory.createOrganisation(type);
        populateTable();
    }//GEN-LAST:event_Add_JButtonActionPerformed

    private void Back_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_JButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_Back_JButtonActionPerformed
 private void populateCombo(){
        Organisation_JComboBox.removeAllItems();
      
        for (Type type : Organisation.Type.values()){
            if (!type.getValue().equals(Type.Admin.getValue())){
                
                if(enterprise instanceof HospitalEnterprise){
                    if(type.getValue().equals(Type.Hospital.getValue()) || type.getValue().equals(Type.AvailabiltyOrgHospital.getValue())|| type.getValue().equals(Type.BloodBank.getValue())){
                    Organisation_JComboBox.addItem(type);
                }
            }
                 if(enterprise instanceof PoliceEnterprise){
                    if(type.getValue().equals(Type.Police.getValue()) || type.getValue().equals(Type.RequestRehab.getValue()) || type.getValue().equals(Type.RequestReport.getValue())){
                    Organisation_JComboBox.addItem(type);
                }
            }
                 
                  if(enterprise instanceof FireEnterprise){
                    if(type.getValue().equals(Type.Fire.getValue()) || type.getValue().equals(Type.AvailabiltyOrgFire.getValue()) || type.getValue().equals(Type.FireRehabRequest.getValue())){
                    Organisation_JComboBox.addItem(type);
                }           
            }
                  
            }
        }
    }
 
    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) Organisation_JTable.getModel();
        
        model.setRowCount(0);
       
        for (Organisation organisation : directory.getOrganisationList())
                {
            Object[] row = new Object[2];
            row[0] = organisation.getOrganisationID();
            row[1] = organisation.getName();
            
            model.addRow(row);
        }   
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_JButton;
    private javax.swing.JButton Back_JButton;
    private javax.swing.JScrollPane JScrollPane;
    private javax.swing.JComboBox Organisation_JComboBox;
    private javax.swing.JTable Organisation_JTable;
    private javax.swing.JLabel Organization_JLabel;
    // End of variables declaration//GEN-END:variables

}
