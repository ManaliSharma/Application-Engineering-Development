package UserInterface.ManageFireAvail;

import Business.Disaster;
import Business.Organisation.Organisation;
import Business.Organisation.RequestReportInfoOrganisation;
import Business.Organisation.RequestAvailibilityFireOrganisation;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FireAvailabilityWorkTestRequest;
import Business.WorkQueue.RequestInformationTestRequest;
import Business.WorkQueue.RequestReportTestRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class ManagerForFireDepartmentWorkArea extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Disaster disaster;
    private UserAccount userAccount;
    private RequestAvailibilityFireOrganisation requestAvailibilityFireOrganisation;

    public ManagerForFireDepartmentWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organisation, Disaster business) {
       initComponents();
       
       this.userProcessContainer=userProcessContainer;
       this.disaster=business;
       this.userAccount=account;
       this.requestAvailibilityFireOrganisation=(RequestAvailibilityFireOrganisation)organisation;
       
       PopulateRequest();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        refreshJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        assignJButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        RequestReport_JTable = new javax.swing.JTable();

        refreshJButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        processJButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        assignJButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        RequestReport_JTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RequestReport_JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Reciever", "Status", "Fire Engine", "Fire Man"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(RequestReport_JTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refreshJButton)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(376, 376, 376)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(assignJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(processJButton))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(406, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(refreshJButton)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(processJButton)
                    .addComponent(assignJButton))
                .addContainerGap(437, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        PopulateRequest();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
        int selectedRow = RequestReport_JTable.getSelectedRow();
        if (selectedRow < 0){
            return;
        }
        FireAvailabilityWorkTestRequest request = (FireAvailabilityWorkTestRequest)RequestReport_JTable.getValueAt(selectedRow, 0);
        request.setStatus("Processing");
        ProcessInfoReport_JPanel processInfoReport_JPanel = new ProcessInfoReport_JPanel(userProcessContainer, request);
        userProcessContainer.add("processInfoReport_JPanel", processInfoReport_JPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_processJButtonActionPerformed
    void PopulateRequest() {
        DefaultTableModel model = (DefaultTableModel)RequestReport_JTable.getModel();
        model.setRowCount(0);
        for(FireAvailabilityWorkTestRequest request: requestAvailibilityFireOrganisation.getAvailabiltyfirerequest()){ 
            Object[] row = new Object[6];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = request.getStatus();
            row[4] = request.getFireEngine();
            row[5] = request.getFireman();
            model.addRow(row);
        }
    }
    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed
        int selectedRow = RequestReport_JTable.getSelectedRow();
        if (selectedRow < 0){
            return;
        }
        WorkRequest request = (WorkRequest)RequestReport_JTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        PopulateRequest();
    }//GEN-LAST:event_assignJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable RequestReport_JTable;
    private javax.swing.JButton assignJButton;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    // End of variables declaration//GEN-END:variables


}
