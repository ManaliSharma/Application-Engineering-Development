/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Customer;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author manalisharma
 */
public class paymentPanel extends javax.swing.JPanel {

    /**
     * Creates new form paymentPanel
     */
    JPanel paymentpanel;
   
    public paymentPanel(JPanel bookFlightPanel) {
    initComponents();    
    this.paymentpanel=bookFlightPanel;
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Card Number:-");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 100, -1, -1));
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 94, 95, -1));
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 134, 95, -1));

        jLabel2.setText("Card Holder Name:-");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 140, -1, -1));

        jLabel3.setText("Pin:-");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 186, -1, -1));
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 180, 95, -1));

        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        jLabel4.setText("Make Payment");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 39, -1, -1));

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 90, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(null,"Congratulations your payment is successful");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
         paymentpanel.remove(this);
        CardLayout cardlayout=(CardLayout)paymentpanel.getLayout();
        cardlayout.previous(paymentpanel);
        
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
