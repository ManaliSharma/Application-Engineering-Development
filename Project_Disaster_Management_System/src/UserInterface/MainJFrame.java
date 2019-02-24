package UserInterface;

import Business.DB4OUtil.DB4OUtil;
import Business.Disaster;
import Business.Enterprise.Enterprise;
import Business.Boston.Boston;
import Business.Enterprise.EnterpriseDirectory;
import Business.Organisation.Organisation;
import Business.UserAccount.UserAccount;
import Business.Customer.CustomerDirectory;
import UserInterface.CustomerRole.SignUpJPanel;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class MainJFrame extends javax.swing.JFrame {

    private Disaster disaster;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private CustomerDirectory customerDirectory;
    JPanel userProcessContainer;
 
    public MainJFrame() {
        initComponents();
         disaster = dB4OUtil.retrieveSystem();
         this.customerDirectory = new CustomerDirectory();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        Top_JPanel = new javax.swing.JPanel();
        Middle_JPanel = new javax.swing.JPanel();
        Password_JLabel = new javax.swing.JLabel();
        UserName_JLabel = new javax.swing.JLabel();
        UserName_JTextField = new javax.swing.JTextField();
        Password_PasswordField = new javax.swing.JPasswordField();
        Login_JButton = new javax.swing.JButton();
        Logout_JButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        SignUp_Button = new javax.swing.JButton();
        Title_JLabel = new javax.swing.JLabel();
        Icon_JLabel = new javax.swing.JLabel();
        Close_JButton = new javax.swing.JButton();
        Bottom_JPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        Top_JPanel.setBackground(new java.awt.Color(204, 204, 255));
        Top_JPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Middle_JPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Password_JLabel.setText("Password");
        Middle_JPanel.add(Password_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 94, 24));

        UserName_JLabel.setText("User Name");
        Middle_JPanel.add(UserName_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 94, 24));
        Middle_JPanel.add(UserName_JTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 143, -1));
        Middle_JPanel.add(Password_PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 143, -1));

        Login_JButton.setText("Login");
        Login_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_JButtonActionPerformed(evt);
            }
        });
        Middle_JPanel.add(Login_JButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 65, -1));

        Logout_JButton.setText("Logout");
        Logout_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout_JButtonActionPerformed(evt);
            }
        });
        Middle_JPanel.add(Logout_JButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));

        jLabel1.setText("New User?");
        Middle_JPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, -1, -1));

        SignUp_Button.setText("Sign Up");
        SignUp_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUp_ButtonActionPerformed(evt);
            }
        });
        Middle_JPanel.add(SignUp_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, -1, -1));

        Top_JPanel.add(Middle_JPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 58, 1250, -1));

        Title_JLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Title_JLabel.setText("Disaster Management System");
        Top_JPanel.add(Title_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 238, -1));

        Icon_JLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\rusha\\Documents\\NetBeansProjects\\Code_Geass_DisasterManagement\\assets\\images\\500px-civildefencesvg1-300x300_10.png")); // NOI18N
        Top_JPanel.add(Icon_JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 39, 41));

        Close_JButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\rusha\\Documents\\NetBeansProjects\\Code_Geass_DisasterManagement\\assets\\images\\rsz_actions-window-close-icon.jpg")); // NOI18N
        Close_JButton.setPreferredSize(new java.awt.Dimension(40, 40));
        Close_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Close_JButtonActionPerformed(evt);
            }
        });
        Top_JPanel.add(Close_JButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1185, 10, -1, -1));

        jSplitPane1.setTopComponent(Top_JPanel);

        Bottom_JPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(Bottom_JPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Login_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_JButtonActionPerformed
        // TODO add your handling code here:
        // Get user name
        String userName = UserName_JTextField.getText();
        // Get Password
        char[] passwordCharArray = Password_PasswordField.getPassword();
        String password = String.valueOf(passwordCharArray);
        //Step1: Check in the system admin user account directory if you have the user
        UserAccount userAccount=disaster.getUserAccountDirectory().authenticateUser(userName, password);
        
        Enterprise inEnterprise=null;
        Organisation inOrganization=null;
        EnterpriseDirectory Enterprisedirectory=null;
        
        if(userAccount==null){
            //Step 2: Go inside each network and check each enterprise
            for(Boston boston_area:disaster.getNetworkList()){
                Enterprisedirectory=boston_area.getEnterpriseDirectory();
                //Step 2.a: check against each enterprise
                for(Enterprise enterprise:boston_area.getEnterpriseDirectory().getEnterpriseList()){
                    userAccount=enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    if(userAccount==null){
                       //Step 3:check against each organization for each enterprise
                       for(Organisation organisation:enterprise.getOrganisationDirectory().getOrganisationList()){
                           userAccount=organisation.getUserAccountDirectory().authenticateUser(userName, password);
                           if(userAccount!=null){
                               inEnterprise=enterprise;
                               inOrganization=organisation;
                               break;
                           }
                       }
                        
                    }
                    else{
                       inEnterprise=enterprise;
                       break;
                    }
                    if(inOrganization!=null){
                        break;
                    }  
                }
                if(inEnterprise!=null){
                    break;
                }
            }
        }
        
        if(userAccount==null){
            JOptionPane.showMessageDialog(null, "Invalid credentials");
            return;
        }
        else{
            CardLayout layout=(CardLayout)Bottom_JPanel.getLayout();
            Bottom_JPanel.add("workArea",userAccount.getRole().createWorkArea(Bottom_JPanel, userAccount, inOrganization, inEnterprise, disaster, Enterprisedirectory));
            layout.next(Bottom_JPanel);
        
        }
        
        Login_JButton.setEnabled(false);
        Logout_JButton.setEnabled(true);
        UserName_JTextField.setEnabled(false);
        Password_PasswordField.setEnabled(false);
        

    }//GEN-LAST:event_Login_JButtonActionPerformed

    private void Logout_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout_JButtonActionPerformed
        // TODO add your handling code here:
        Logout_JButton.setEnabled(false);
        UserName_JTextField.setEnabled(true);
        Password_PasswordField.setEnabled(true);
        Login_JButton.setEnabled(true);

        UserName_JTextField.setText("");
        Password_PasswordField.setText("");

        Bottom_JPanel.removeAll();
        JPanel blankJP = new JPanel();
        Bottom_JPanel.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) Bottom_JPanel.getLayout();
        crdLyt.next(Bottom_JPanel);
        dB4OUtil.storeSystem(disaster);
    }//GEN-LAST:event_Logout_JButtonActionPerformed

    private void Close_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Close_JButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_Close_JButtonActionPerformed

    private void SignUp_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUp_ButtonActionPerformed
        // TODO add your handling code here:
            SignUpJPanel signUpJPanel = new SignUpJPanel(Bottom_JPanel, disaster,customerDirectory);
            Bottom_JPanel.add("signUpJPanel",signUpJPanel);
            CardLayout layout=(CardLayout)Bottom_JPanel.getLayout();
            layout.next(Bottom_JPanel);
    }//GEN-LAST:event_SignUp_ButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bottom_JPanel;
    private javax.swing.JButton Close_JButton;
    private javax.swing.JLabel Icon_JLabel;
    private javax.swing.JButton Login_JButton;
    private javax.swing.JButton Logout_JButton;
    private javax.swing.JPanel Middle_JPanel;
    private javax.swing.JLabel Password_JLabel;
    private javax.swing.JPasswordField Password_PasswordField;
    private javax.swing.JButton SignUp_Button;
    private javax.swing.JLabel Title_JLabel;
    private javax.swing.JPanel Top_JPanel;
    private javax.swing.JLabel UserName_JLabel;
    private javax.swing.JTextField UserName_JTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
