package UserInterface.RequestRehab;

import Business.Disaster;
import Business.Organisation.RequestRehabOrganisation;
import Business.Organisation.Organisation;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.RequestRehabTestRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class ManageRehab_JPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Disaster disaster;
    private UserAccount userAccount;
    private RequestRehabOrganisation requestRehabOrganisation;
    
    public ManageRehab_JPanel(JPanel userProcessContainer, UserAccount account, Organisation organisation, Disaster business) {
       initComponents();
       
       this.userProcessContainer=userProcessContainer;
       this.disaster=business;
       this.requestRehabOrganisation=(RequestRehabOrganisation)organisation;
       this.userAccount=account;
       
       PopulateRequestRehab();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        RequestRehab_JTable = new javax.swing.JTable();
        refreshJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        assignJButton = new javax.swing.JButton();

        RequestRehab_JTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RequestRehab_JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status", "Number", "Email", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(RequestRehab_JTable);

        refreshJButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        processJButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        processJButton.setText("Process >>");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        assignJButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        assignJButton.setText("Assign to me!");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refreshJButton)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(assignJButton)
                        .addGap(145, 145, 145)
                        .addComponent(processJButton)))
                .addContainerGap(392, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(refreshJButton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(processJButton)
                    .addComponent(assignJButton))
                .addContainerGap(438, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    public void PopulateRequestRehab() {
        DefaultTableModel model = (DefaultTableModel)RequestRehab_JTable.getModel();       
        model.setRowCount(0); 
        for(RequestRehabTestRequest request :requestRehabOrganisation.getRequestrehabrestrequest()){
            Object[] row = new Object[7];
            row[0] = request;
            if(request.getMessage().isEmpty()){
                System.out.println("Null");
            }
            else{
                row[1] = request.getSender().getEmployee().getName();
                row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
                row[3] = request.getStatus();
                row[4] = request.getPhoneNumber();
                row[5] = request.getEmailAddress();
                row[6] = request.getAddress();
                model.addRow(row);
            }
        }
    }
    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        PopulateRequestRehab();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
        int selectedRow = RequestRehab_JTable.getSelectedRow();
        if (selectedRow < 0){
            return;
        }
        RequestRehabTestRequest request = (RequestRehabTestRequest)RequestRehab_JTable.getValueAt(selectedRow, 0);
        request.setStatus("Processing");
        ProcessRehab_JPanel processWorkRequestJPanel = new ProcessRehab_JPanel(userProcessContainer, request);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_processJButtonActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed
        int selectedRow = RequestRehab_JTable.getSelectedRow();
        if (selectedRow < 0){
            return;
        }
        WorkRequest request = (WorkRequest)RequestRehab_JTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        PopulateRequestRehab();
    }//GEN-LAST:event_assignJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable RequestRehab_JTable;
    private javax.swing.JButton assignJButton;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    // End of variables declaration//GEN-END:variables
}
