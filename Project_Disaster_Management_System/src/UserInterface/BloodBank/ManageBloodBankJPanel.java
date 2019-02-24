package UserInterface.BloodBank;

import Business.Disaster;
import Business.Organisation.BloodBankOrganisation;
import Business.Organisation.Organisation;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BloodBankWorkTestRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class ManageBloodBankJPanel extends javax.swing.JPanel {

    private BloodBankOrganisation blood;
    private JPanel userProcessContainer;
    private Disaster disaster;
    private UserAccount userAccount;
    
    public ManageBloodBankJPanel(JPanel userProcessContainer, UserAccount account, Organisation organisation, Disaster business) {
        initComponents();

        this.userProcessContainer=userProcessContainer;
        this.disaster=business;
        this.blood=(BloodBankOrganisation)organisation;
        this.userAccount=account;
       
        populateTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JScrollPane = new javax.swing.JScrollPane();
        BloodBankWorkRequest_JTable = new javax.swing.JTable();
        Refresh_JButton = new javax.swing.JButton();
        Assign_JButton = new javax.swing.JButton();
        Process_JButton = new javax.swing.JButton();

        BloodBankWorkRequest_JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status", "A+", "B+", "AB+", "O+", "A-", "B-", "AB-", "O-"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JScrollPane.setViewportView(BloodBankWorkRequest_JTable);

        Refresh_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Refresh_JButton.setText("Refresh!");
        Refresh_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Refresh_JButtonActionPerformed(evt);
            }
        });

        Assign_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Assign_JButton.setText("Assign to me");
        Assign_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Assign_JButtonActionPerformed(evt);
            }
        });

        Process_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Process_JButton.setText("Process >>");
        Process_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Process_JButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(Refresh_JButton)
                                .addGap(150, 150, 150))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Assign_JButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Process_JButton)))))
                .addContainerGap(240, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Refresh_JButton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Process_JButton)
                    .addComponent(Assign_JButton))
                .addContainerGap(205, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)BloodBankWorkRequest_JTable.getModel();      
        model.setRowCount(0);
        for(BloodBankWorkTestRequest request :blood.getBloodTestRequestQueue()){          
            Object[] row = new Object[12];
            row[0] = request;
            if(request.getMessage().isEmpty()){
                System.out.println("Null");
            }
            else{
                row[1] = request.getSender().getEmployee().getName();
                row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
                row[3] = request.getStatus();
                row[4] = request.getBloodTypeA();
                row[5] = request.getBloodTypeB();
                row[6] = request.getBloodTypeAB();
                row[7]=request.getBloodTypeO();
                row[8]=request.getBloodTypeANeg();
                row[9]=request.getBloodTypeBNeg();
                row[10]=request.getBloodTypeABNeg();
                row[11]=request.getBloodTypeONeg();        
                model.addRow(row);
            }
        }
    }
    private void Refresh_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Refresh_JButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_Refresh_JButtonActionPerformed

    private void Assign_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Assign_JButtonActionPerformed

        int selectedRow = BloodBankWorkRequest_JTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        WorkRequest request = (WorkRequest)BloodBankWorkRequest_JTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        populateTable();
    }//GEN-LAST:event_Assign_JButtonActionPerformed

    private void Process_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Process_JButtonActionPerformed

        int selectedRow = BloodBankWorkRequest_JTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

       BloodBankWorkTestRequest request = (BloodBankWorkTestRequest)BloodBankWorkRequest_JTable.getValueAt(selectedRow, 0);

        request.setStatus("Processing");

        ProcessBloodRequestJPanel processBloodRequestJPanel = new ProcessBloodRequestJPanel(userProcessContainer, request);
        userProcessContainer.add("processBloodRequestJPanel", processBloodRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_Process_JButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Assign_JButton;
    private javax.swing.JTable BloodBankWorkRequest_JTable;
    private javax.swing.JScrollPane JScrollPane;
    private javax.swing.JButton Process_JButton;
    private javax.swing.JButton Refresh_JButton;
    // End of variables declaration//GEN-END:variables
}
