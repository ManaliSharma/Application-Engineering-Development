/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminWorkAreas;

import Business.Disaster;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Boston.Boston;
import Business.Enterprise.EnterpriseDirectory;
import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;
import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Disaster disaster;
    private EnterpriseDirectory enterpriseList;

    public ManageEnterpriseAdminJPanel(JPanel userProcessContainer, Disaster disaster) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.disaster=disaster;

        populateTable();
        populateNetworkComboBox();
        
        Submit_JButton.setEnabled(false);
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) Enterprise_JTable.getModel();
        model.setRowCount(0);
        for (Boston network : disaster.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[3];
                    row[0] = enterprise.getName();
                    row[1] = network.getName();
                    row[2] = userAccount.getUsername();
                    model.addRow(row);
                }
            }
        }
    }

    private void populateNetworkComboBox(){
        Network_JComboBox.removeAllItems();
        for (Boston network : disaster.getNetworkList()){
            Network_JComboBox.addItem(network);
        }
    }
    
    private void populateEnterpriseComboBox(Boston network){
        Enterprise_JComboBox.removeAllItems();
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
            Enterprise_JComboBox.addItem(enterprise);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Enterprise_JTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Network_JComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        Username_JTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Enterprise_JComboBox = new javax.swing.JComboBox();
        Name_JTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Back_JButton = new javax.swing.JButton();
        Check_JButton = new javax.swing.JButton();
        Valid2_JLabel = new javax.swing.JLabel();
        Submit_JButton = new javax.swing.JButton();
        Valid1_JLabel = new javax.swing.JLabel();
        Password_JPasswordField = new javax.swing.JPasswordField();
        VerifyPassword_JPasswordField = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Valid_JLabel = new javax.swing.JLabel();
        Valid3_JLabel = new javax.swing.JLabel();
        Reset_JButton1 = new javax.swing.JButton();

        Enterprise_JTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Enterprise_JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise Name", "Network", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Enterprise_JTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Network");

        Network_JComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Network_JComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Network_JComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Network_JComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Username");

        Username_JTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Username_JTextField.setToolTipText("Alpha-Numeric Values, 3 to 30 Characters");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Enterprise");

        Enterprise_JComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Enterprise_JComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Name_JTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Name_JTextField.setToolTipText("Alpha-Numeric Values, 3 to 30 Characters");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Name");

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

        Valid2_JLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Submit_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Submit_JButton.setText("Submit >>");
        Submit_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit_JButtonActionPerformed(evt);
            }
        });

        Valid1_JLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Password_JPasswordField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Password_JPasswordField.setToolTipText("Alpha-Numeric values, at least 8 characters");
        Password_JPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Password_JPasswordFieldActionPerformed(evt);
            }
        });

        VerifyPassword_JPasswordField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        VerifyPassword_JPasswordField.setToolTipText("Alpha-Numeric values, at least 8 characters");
        VerifyPassword_JPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerifyPassword_JPasswordFieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Password");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Verify Password");

        Valid_JLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Valid3_JLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(373, 373, 373)
                        .addComponent(Check_JButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 312, Short.MAX_VALUE)
                        .addComponent(Submit_JButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Back_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(330, 330, 330))
            .addGroup(layout.createSequentialGroup()
                .addGap(398, 398, 398)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Enterprise_JComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Network_JComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Name_JTextField)
                            .addComponent(Username_JTextField)
                            .addComponent(Password_JPasswordField)
                            .addComponent(VerifyPassword_JPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Reset_JButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Valid1_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Valid2_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Valid_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Valid3_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Back_JButton)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Network_JComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(Enterprise_JComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(Name_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Valid3_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(Username_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Valid_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(Password_JPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(VerifyPassword_JPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Valid1_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Valid2_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Check_JButton)
                    .addComponent(Submit_JButton)
                    .addComponent(Reset_JButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(235, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Network_JComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Network_JComboBoxActionPerformed

        Boston network = (Boston) Network_JComboBox.getSelectedItem();
        if (network != null){
            populateEnterpriseComboBox(network);
        }
    }//GEN-LAST:event_Network_JComboBoxActionPerformed

    private void Back_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_JButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
       
    }//GEN-LAST:event_Back_JButtonActionPerformed

    private void Check_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Check_JButtonActionPerformed
        // TODO add your handling code here:
        boolean flag =true;
        String name = Name_JTextField.getText();
        Pattern pname=Pattern.compile("^[a-zA-Z0-9]{3,30}$");
        Matcher mname=pname.matcher(name);
        boolean isnameValid=mname.matches();
        
        String userName = Username_JTextField.getText();
        Pattern puser=Pattern.compile("^[a-zA-Z0-9]{3,30}$");
        Matcher muser=puser.matcher(userName);
        boolean isuserValid=muser.matches();

        String password = Password_JPasswordField.getText();
        Pattern pPassword= Pattern.compile("^[a-zA-Z0-9]{8,}$"); //!@#\$%\^&\*]{8,}$
        Matcher mPwd= pPassword.matcher(password);
        boolean isPasswordValid=mPwd.matches();
        
        String verifypassword = VerifyPassword_JPasswordField.getText();
        Pattern prePassword= Pattern.compile("^[a-zA-Z0-9]{8,}");
        Matcher mrePwd= prePassword.matcher(verifypassword);
        boolean isrePasswordValid=mrePwd.matches();
        
        Valid_JLabel.setText(Boolean.toString(isuserValid));
        Valid1_JLabel.setText(Boolean.toString(isPasswordValid));
        Valid2_JLabel.setText(Boolean.toString(isrePasswordValid));
        Valid3_JLabel.setText(Boolean.toString(isnameValid));
        for (Boston network : disaster.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    String username1=userAccount.getUsername();
                    if(username1.equals(userName)){
                        flag=false;
                        Submit_JButton.setEnabled(false);
                        JOptionPane.showMessageDialog(null,"Two People Cannot have the same username");
                    }
                }
            }
        }
        
        if(Password_JPasswordField.getText().equals(VerifyPassword_JPasswordField.getText())){
            if(isuserValid==true && isPasswordValid==true && isrePasswordValid==true && isnameValid==true && flag==true){
                Valid3_JLabel.setForeground(Color.green);
                Valid3_JLabel.setText(Boolean.toString(isnameValid)); 
                Valid_JLabel.setForeground(Color.green);
                Valid_JLabel.setText(Boolean.toString(isuserValid)); 
                Valid1_JLabel.setForeground(Color.green);
                Valid1_JLabel.setText(Boolean.toString(isPasswordValid)); 
                Valid2_JLabel.setForeground(Color.green);
                Valid2_JLabel.setText(Boolean.toString(isrePasswordValid)); 
                Submit_JButton.setEnabled(true);
                Name_JTextField.setEditable(false);
                Username_JTextField.setEditable(false);
                Password_JPasswordField.setEditable(false);
                VerifyPassword_JPasswordField.setEditable(false);
            }
            else{
                JOptionPane.showMessageDialog(null, "PLease input valid details");
                Valid3_JLabel.setForeground(Color.red);
                Valid3_JLabel.setText(Boolean.toString(isnameValid)); 
                Valid_JLabel.setForeground(Color.red);
                Valid_JLabel.setText(Boolean.toString(isuserValid)); 
                Valid1_JLabel.setForeground(Color.red);
                Valid1_JLabel.setText(Boolean.toString(isPasswordValid)); 
                Valid2_JLabel.setForeground(Color.red);
                Valid2_JLabel.setText(Boolean.toString(isrePasswordValid));
                Name_JTextField.setEditable(true);
                Username_JTextField.setEditable(true);
                Password_JPasswordField.setEditable(true);
                VerifyPassword_JPasswordField.setEditable(true);
            }
        }
    }//GEN-LAST:event_Check_JButtonActionPerformed

    private void Submit_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit_JButtonActionPerformed
        Enterprise enterprise = (Enterprise) Enterprise_JComboBox.getSelectedItem();
        String username = Username_JTextField.getText();
        String password = String.valueOf(Password_JPasswordField.getPassword());
        String name = Name_JTextField.getText();
        Employee employee = enterprise.getEmployeeDirectory().createEmployee(name);
        UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new AdminRole());
        populateTable();
        Name_JTextField.setEditable(true);
        Username_JTextField.setEditable(true);
        Password_JPasswordField.setEditable(true);
        VerifyPassword_JPasswordField.setEditable(true);
        Submit_JButton.setEnabled(false);
        Name_JTextField.setText("");
        Username_JTextField.setText("");
        Password_JPasswordField.setText("");
        VerifyPassword_JPasswordField.setText("");
    }//GEN-LAST:event_Submit_JButtonActionPerformed

    private void Password_JPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Password_JPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Password_JPasswordFieldActionPerformed

    private void VerifyPassword_JPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerifyPassword_JPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VerifyPassword_JPasswordFieldActionPerformed

    private void Reset_JButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset_JButton1ActionPerformed
        Name_JTextField.setText("");
        Username_JTextField.setText("");
        Password_JPasswordField.setText("");
        VerifyPassword_JPasswordField.setText("");
    }//GEN-LAST:event_Reset_JButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_JButton;
    private javax.swing.JButton Check_JButton;
    private javax.swing.JComboBox Enterprise_JComboBox;
    private javax.swing.JTable Enterprise_JTable;
    private javax.swing.JTextField Name_JTextField;
    private javax.swing.JComboBox Network_JComboBox;
    private javax.swing.JPasswordField Password_JPasswordField;
    private javax.swing.JButton Reset_JButton1;
    private javax.swing.JButton Submit_JButton;
    private javax.swing.JTextField Username_JTextField;
    private javax.swing.JLabel Valid1_JLabel;
    private javax.swing.JLabel Valid2_JLabel;
    private javax.swing.JLabel Valid3_JLabel;
    private javax.swing.JLabel Valid_JLabel;
    private javax.swing.JPasswordField VerifyPassword_JPasswordField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
