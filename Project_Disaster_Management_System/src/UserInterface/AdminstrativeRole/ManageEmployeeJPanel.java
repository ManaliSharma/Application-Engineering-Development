package UserInterface.AdminstrativeRole;

import Business.Employee.Employee;
import Business.Organisation.Organisation;
import Business.Organisation.OrganisationDirectory;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class ManageEmployeeJPanel extends javax.swing.JPanel {

    private OrganisationDirectory organisationDirectory;
    private JPanel userProcessContainer;
    
    ManageEmployeeJPanel(JPanel userProcessContainer, OrganisationDirectory organisationDirectory) {
        initComponents(); 
        this.userProcessContainer = userProcessContainer;
        this.organisationDirectory = organisationDirectory;
        
        populateOrganizationComboBox();
        populateOrganizationEmpComboBox();
        
        CreateEmp_JButton.setEnabled(false);
    }

    public void populateOrganizationComboBox(){
        Organization_JComboBox.removeAllItems();
        
        for (Organisation organisation : organisationDirectory.getOrganisationList()){
            Organization_JComboBox.addItem(organisation);
        }
    }
    
    public void populateOrganizationEmpComboBox(){
        OrganizationEmp_JComboBox.removeAllItems();
        
        for (Organisation organisation : organisationDirectory.getOrganisationList()){
            OrganizationEmp_JComboBox.addItem(organisation);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Organization_JLabel = new javax.swing.JLabel();
        Organization_JComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        Organization_JTable = new javax.swing.JTable();
        OrgnaizationEmp_JLabel = new javax.swing.JLabel();
        OrganizationEmp_JComboBox = new javax.swing.JComboBox();
        Name_JLabel = new javax.swing.JLabel();
        Name_JTextField = new javax.swing.JTextField();
        Valid_JLabel = new javax.swing.JLabel();
        Back_JButton = new javax.swing.JButton();
        Check_JButton = new javax.swing.JButton();
        CreateEmp_JButton = new javax.swing.JButton();
        Reset_JButton = new javax.swing.JButton();

        Organization_JLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Organization_JLabel.setText("Organization");

        Organization_JComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Organization_JComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Organization_JComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Organization_JComboBoxActionPerformed(evt);
            }
        });

        Organization_JTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Organization_JTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Organization_JTable);

        OrgnaizationEmp_JLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        OrgnaizationEmp_JLabel.setText("Organization");

        OrganizationEmp_JComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        OrganizationEmp_JComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Name_JLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Name_JLabel.setText("Name");

        Name_JTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Name_JTextField.setToolTipText("Alpha-Numeric values, 3 to 30 characters");

        Valid_JLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Valid_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

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

        CreateEmp_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CreateEmp_JButton.setText("Create Employee +");
        CreateEmp_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateEmp_JButtonActionPerformed(evt);
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
                .addContainerGap()
                .addComponent(Back_JButton)
                .addGap(270, 270, 270)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(Organization_JLabel)
                        .addGap(31, 31, 31)
                        .addComponent(Organization_JComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Check_JButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Reset_JButton)
                            .addGap(46, 46, 46)
                            .addComponent(CreateEmp_JButton))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(64, 64, 64)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(OrgnaizationEmp_JLabel)
                                .addComponent(Name_JLabel))
                            .addGap(32, 32, 32)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(OrganizationEmp_JComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Name_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(63, 63, 63)
                                    .addComponent(Valid_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(355, 355, 355))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Back_JButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Organization_JComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Organization_JLabel))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(OrgnaizationEmp_JLabel)
                            .addComponent(OrganizationEmp_JComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Name_JLabel)
                                .addComponent(Name_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Valid_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CreateEmp_JButton)
                            .addComponent(Check_JButton)
                            .addComponent(Reset_JButton))))
                .addContainerGap(349, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Organization_JComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Organization_JComboBoxActionPerformed
        Organisation organisation = (Organisation) Organization_JComboBox.getSelectedItem();
        if (organisation != null){
            populateTable(organisation);
            populateTable(organisation);
        }
    }//GEN-LAST:event_Organization_JComboBoxActionPerformed

    private void CreateEmp_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateEmp_JButtonActionPerformed

        Organisation organisation = (Organisation) OrganizationEmp_JComboBox.getSelectedItem();
        String name = Name_JTextField.getText();
        organisation.getEmployeeDirectory().createEmployee(name);
        populateTable(organisation);
        Name_JTextField.setEditable(true);
        CreateEmp_JButton.setEnabled(false);
        Name_JTextField.setText("");

    }//GEN-LAST:event_CreateEmp_JButtonActionPerformed

    private void Back_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_JButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_Back_JButtonActionPerformed

    private void Check_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Check_JButtonActionPerformed
        // TODO add your handling code here:
        
        String Name = Name_JTextField.getText();
        Pattern puser=Pattern.compile("^[a-zA-Z0-9]{3,30}$");
        Matcher muser=puser.matcher(Name_JTextField.getText());
        boolean isnameValid=muser.matches();
                   
        if(isnameValid==true){
            Valid_JLabel.setForeground(Color.green);
            Valid_JLabel.setText(Boolean.toString(isnameValid));
            CreateEmp_JButton.setEnabled(true);
            Name_JTextField.setEditable(false);
        }
        else{
            Valid_JLabel.setForeground(Color.red);
            Valid_JLabel.setText(Boolean.toString(isnameValid));
            Name_JTextField.setEditable(true);
        }
    }//GEN-LAST:event_Check_JButtonActionPerformed

    private void Reset_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset_JButtonActionPerformed
        Name_JTextField.setText("");
    }//GEN-LAST:event_Reset_JButtonActionPerformed

     private void populateTable(Organisation Organisation){
        DefaultTableModel model = (DefaultTableModel) Organization_JTable.getModel();
        model.setRowCount(0);
        for (Employee employee : Organisation.getEmployeeDirectory().getEmployeeList()){
            Object[] row = new Object[2];
            row[0] = employee.getId();
            row[1] = employee.getName();
            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_JButton;
    private javax.swing.JButton Check_JButton;
    private javax.swing.JButton CreateEmp_JButton;
    private javax.swing.JLabel Name_JLabel;
    private javax.swing.JTextField Name_JTextField;
    private javax.swing.JComboBox OrganizationEmp_JComboBox;
    private javax.swing.JComboBox Organization_JComboBox;
    private javax.swing.JLabel Organization_JLabel;
    private javax.swing.JTable Organization_JTable;
    private javax.swing.JLabel OrgnaizationEmp_JLabel;
    private javax.swing.JButton Reset_JButton;
    private javax.swing.JLabel Valid_JLabel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
