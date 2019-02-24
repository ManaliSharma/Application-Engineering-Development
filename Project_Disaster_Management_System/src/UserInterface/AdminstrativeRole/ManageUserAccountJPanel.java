package UserInterface.AdminstrativeRole;

import Business.Boston.Boston;
import Business.Disaster;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organisation.Organisation;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class ManageUserAccountJPanel extends javax.swing.JPanel {

    private JPanel container;
    private Disaster disaster;
    private Enterprise enterprise;
    
    public ManageUserAccountJPanel(JPanel container, Enterprise enterprise) {
        initComponents();
        
        this.enterprise = enterprise;
        this.container = container;
        
        
        popOrganizationComboBox();
        Employee_JComboBox.removeAllItems();
        popData();
        CreateUser_JButton.setEnabled(false);
    }

    public void popOrganizationComboBox() {
        Organization_JComboBox.removeAllItems();
        for (Organisation organisation : enterprise.getOrganisationDirectory().getOrganisationList()) {
            Organization_JComboBox.addItem(organisation);
        }
    }
    
    public void populateEmployeeComboBox(Organisation organization){
        Employee_JComboBox.removeAllItems();        
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            Employee_JComboBox.addItem(employee);
        }
    }
    
    private void populateRoleComboBox(Organisation organization){
        Role_JComboBox.removeAllItems();
        for (Role role : organization.getSupportedRole()){
            Role_JComboBox.addItem(role);
        }
    }

    public void popData() {

        DefaultTableModel model = (DefaultTableModel) User_JTable.getModel();
        model.setRowCount(0);
        for (Organisation organization : enterprise.getOrganisationDirectory().getOrganisationList()) {
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[2];
                row[0] = ua;
                row[1] = ua.getRole();
                ((DefaultTableModel) User_JTable.getModel()).addRow(row);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UserName_JTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        JScrollPane = new javax.swing.JScrollPane();
        User_JTable = new javax.swing.JTable();
        Organization_JLabel = new javax.swing.JLabel();
        Organization_JComboBox = new javax.swing.JComboBox();
        Employee_JLabel = new javax.swing.JLabel();
        Employee_JComboBox = new javax.swing.JComboBox();
        Role_JLabel = new javax.swing.JLabel();
        Role_JComboBox = new javax.swing.JComboBox();
        Valid_JLabel = new javax.swing.JLabel();
        Password_JLabel = new javax.swing.JLabel();
        Password_JPasswordField = new javax.swing.JPasswordField();
        Valid1_JLabel = new javax.swing.JLabel();
        VerifyPassword_JLabel = new javax.swing.JLabel();
        VerifyPassword_JPasswordField = new javax.swing.JPasswordField();
        Valid2_JLabel = new javax.swing.JLabel();
        Back_JButton = new javax.swing.JButton();
        Check_JButton = new javax.swing.JButton();
        CreateUser_JButton = new javax.swing.JButton();
        Reset_JButton = new javax.swing.JButton();

        UserName_JTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        UserName_JTextField.setToolTipText("Alpha-Numeric values, 3 to 30 characters");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("User Name");

        User_JTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        User_JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JScrollPane.setViewportView(User_JTable);
        if (User_JTable.getColumnModel().getColumnCount() > 0) {
            User_JTable.getColumnModel().getColumn(0).setResizable(false);
            User_JTable.getColumnModel().getColumn(1).setResizable(false);
        }

        Organization_JLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Organization_JLabel.setText("Organization");

        Organization_JComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Organization_JComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Organization_JComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Organization_JComboBoxActionPerformed(evt);
            }
        });

        Employee_JLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Employee_JLabel.setText("Employee");

        Employee_JComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Employee_JComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Role_JLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Role_JLabel.setText("Role");

        Role_JComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Role_JComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Valid_JLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Password_JLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Password_JLabel.setText("Password");

        Password_JPasswordField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Password_JPasswordField.setToolTipText("Alpha-Numeric values, at least 8 characters");
        Password_JPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Password_JPasswordFieldActionPerformed(evt);
            }
        });

        Valid1_JLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        VerifyPassword_JLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        VerifyPassword_JLabel.setText("Verify Password");

        VerifyPassword_JPasswordField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        VerifyPassword_JPasswordField.setToolTipText("Alpha-Numeric values, at least 8 characters");
        VerifyPassword_JPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerifyPassword_JPasswordFieldActionPerformed(evt);
            }
        });

        Valid2_JLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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

        CreateUser_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CreateUser_JButton.setText("Create >>");
        CreateUser_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateUser_JButtonActionPerformed(evt);
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
                .addComponent(Back_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(397, 397, 397)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(9, 9, 9))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(VerifyPassword_JLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Check_JButton))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(3, 3, 3)
                                            .addComponent(Password_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(Employee_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Role_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(VerifyPassword_JPasswordField)
                                        .addComponent(Password_JPasswordField)
                                        .addComponent(UserName_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(Reset_JButton)
                                        .addGap(37, 37, 37))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Organization_JLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Employee_JComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Role_JComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Organization_JComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CreateUser_JButton)
                            .addComponent(Valid_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Valid1_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Valid2_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(310, 310, 310))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Back_JButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Organization_JComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Organization_JLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Employee_JComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Employee_JLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Role_JComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Role_JLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(UserName_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Valid_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Password_JPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Password_JLabel))
                            .addComponent(Valid1_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Valid2_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(VerifyPassword_JPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(VerifyPassword_JLabel)))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Check_JButton)
                            .addComponent(CreateUser_JButton)
                            .addComponent(Reset_JButton))))
                .addContainerGap(248, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CreateUser_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateUser_JButtonActionPerformed
        String userName = UserName_JTextField.getText();
        String password = Password_JPasswordField.getText();
        String verifypassword = VerifyPassword_JPasswordField.getText();
        
        Organisation organization = (Organisation) Organization_JComboBox.getSelectedItem();
        Employee employee = (Employee) Employee_JComboBox.getSelectedItem();
        Role role = (Role) Role_JComboBox.getSelectedItem();
        organization.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
        popData();
        UserName_JTextField.setEditable(true);
        Password_JPasswordField.setEditable(true);
        VerifyPassword_JPasswordField.setEditable(true);
        CreateUser_JButton.setEnabled(false);
        UserName_JTextField.setText("");
        Password_JPasswordField.setText("");
        VerifyPassword_JPasswordField.setText("");
    }//GEN-LAST:event_CreateUser_JButtonActionPerformed

    private void Organization_JComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Organization_JComboBoxActionPerformed
        Organisation organization = (Organisation) Organization_JComboBox.getSelectedItem();
        if (organization != null){
            populateEmployeeComboBox(organization);
            populateRoleComboBox(organization);
        }
    }//GEN-LAST:event_Organization_JComboBoxActionPerformed

    private void Password_JPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Password_JPasswordFieldActionPerformed
    }//GEN-LAST:event_Password_JPasswordFieldActionPerformed

    private void VerifyPassword_JPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerifyPassword_JPasswordFieldActionPerformed
    }//GEN-LAST:event_VerifyPassword_JPasswordFieldActionPerformed

    private void Check_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Check_JButtonActionPerformed
        // TODO add your handling code here:
        boolean flag =true;
        String userName = UserName_JTextField.getText(); 
        Pattern puser=Pattern.compile("^[a-zA-Z0-9]{3,30}$");
        Matcher muser=puser.matcher(UserName_JTextField.getText());
        boolean isuserValid=muser.matches();

        String password = Password_JPasswordField.getText();   
        Pattern pPassword= Pattern.compile("^[a-zA-Z0-9]{8,}$"); //!@#\$%\^&\*]{8,}$
        Matcher mPwd= pPassword.matcher(Password_JPasswordField.getText());
        boolean isPasswordValid=mPwd.matches();
        
        String verifypassword = VerifyPassword_JPasswordField.getText();
        Pattern prePassword= Pattern.compile("^[a-zA-Z0-9]{8,}");
        Matcher mrePwd= prePassword.matcher(VerifyPassword_JPasswordField.getText());
        boolean isrePasswordValid=mrePwd.matches();
        Valid_JLabel.setText(Boolean.toString(isuserValid));
        Valid1_JLabel.setText(Boolean.toString(isPasswordValid));
        Valid2_JLabel.setText(Boolean.toString(isrePasswordValid));
/*        for (Boston network : disaster.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {*/
                    for (Organisation organization : enterprise.getOrganisationDirectory().getOrganisationList()) {
                        for (UserAccount useraccount : organization.getUserAccountDirectory().getUserAccountList()) {
                            //String username2=userAccount.getUsername();
                            String username1=useraccount.getUsername();
                            if(username1.equals(userName)){
                                flag=false;
                                CreateUser_JButton.setEnabled(false);
                                JOptionPane.showMessageDialog(null,"Two People Cannot have the same username");
                            }
                           /* else if(username2.equals(userName)){
                                flag=false;
                                CreateUser_JButton.setEnabled(false);
                                JOptionPane.showMessageDialog(null,"Two People Cannot have the same username");
                            }*/
                        }
                    }
          /*      }
            }
        }*/
        if(Password_JPasswordField.getText().equals(VerifyPassword_JPasswordField.getText())){        
            if(isuserValid==true && isPasswordValid==true && isrePasswordValid==true && flag==true){
                Valid_JLabel.setForeground(Color.green);
                Valid_JLabel.setText(Boolean.toString(isuserValid)); 
                Valid1_JLabel.setForeground(Color.green);
                Valid1_JLabel.setText(Boolean.toString(isuserValid)); 
                Valid2_JLabel.setForeground(Color.green);
                Valid2_JLabel.setText(Boolean.toString(isuserValid));
                CreateUser_JButton.setEnabled(true);
                UserName_JTextField.setEditable(false);
                Password_JPasswordField.setEditable(false);
                VerifyPassword_JPasswordField.setEditable(false);
            }
            else{
                JOptionPane.showMessageDialog(null, "PLease input valid details");
                Valid_JLabel.setForeground(Color.red);
                Valid_JLabel.setText(Boolean.toString(isuserValid)); 
                Valid1_JLabel.setForeground(Color.red);
                Valid1_JLabel.setText(Boolean.toString(isuserValid)); 
                Valid2_JLabel.setForeground(Color.red);
                Valid2_JLabel.setText(Boolean.toString(isuserValid));
                UserName_JTextField.setEditable(true);
                Password_JPasswordField.setEditable(true);
                VerifyPassword_JPasswordField.setEditable(true);
            }
        }
    }//GEN-LAST:event_Check_JButtonActionPerformed

    private void Back_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_JButtonActionPerformed
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_Back_JButtonActionPerformed

    private void Reset_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset_JButtonActionPerformed
        UserName_JTextField.setText("");
        Password_JPasswordField.setText("");
        VerifyPassword_JPasswordField.setText("");
    }//GEN-LAST:event_Reset_JButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_JButton;
    private javax.swing.JButton Check_JButton;
    private javax.swing.JButton CreateUser_JButton;
    private javax.swing.JComboBox Employee_JComboBox;
    private javax.swing.JLabel Employee_JLabel;
    private javax.swing.JScrollPane JScrollPane;
    private javax.swing.JComboBox Organization_JComboBox;
    private javax.swing.JLabel Organization_JLabel;
    private javax.swing.JLabel Password_JLabel;
    private javax.swing.JPasswordField Password_JPasswordField;
    private javax.swing.JButton Reset_JButton;
    private javax.swing.JComboBox Role_JComboBox;
    private javax.swing.JLabel Role_JLabel;
    private javax.swing.JTextField UserName_JTextField;
    private javax.swing.JTable User_JTable;
    private javax.swing.JLabel Valid1_JLabel;
    private javax.swing.JLabel Valid2_JLabel;
    private javax.swing.JLabel Valid_JLabel;
    private javax.swing.JLabel VerifyPassword_JLabel;
    private javax.swing.JPasswordField VerifyPassword_JPasswordField;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
