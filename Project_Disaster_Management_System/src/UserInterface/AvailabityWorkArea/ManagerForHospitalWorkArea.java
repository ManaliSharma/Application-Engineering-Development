package UserInterface.AvailabityWorkArea;

import Business.Disaster;
import Business.Organisation.AvailabiltyHospitalOrganisation;
import Business.Organisation.Organisation;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HospitalAvailabilityWorkTestRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class ManagerForHospitalWorkArea extends javax.swing.JPanel {

    private AvailabiltyHospitalOrganisation avg;
    private JPanel userProcessContainer;
    private Disaster disaster;
    private UserAccount userAccount;

    public ManagerForHospitalWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organisation, Disaster business) {
       initComponents();
       
       this.userProcessContainer=userProcessContainer;
       this.disaster=business;
       this.avg=(AvailabiltyHospitalOrganisation)organisation;
       this.userAccount=account;
       
       populateTable();
    }

     public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)WorkRequest_JTable.getModel();
        model.setRowCount(0);
        for(HospitalAvailabilityWorkTestRequest request : avg.getAvailablityqueue()){
            Object[] row = new Object[7];
            row[0] = request;
            if(request.getMessage().isEmpty()){
                System.out.println("Null");
            }
            else{
                row[1] = request.getSender().getEmployee().getName();
                row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
                row[3] = request.getStatus();
                row[4] = request.getDoctor();
                row[5] = request.getBeds();
                row[6] = request.getVans();
                model.addRow(row);
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JScrollPane = new javax.swing.JScrollPane();
        WorkRequest_JTable = new javax.swing.JTable();
        Refresh_JButton = new javax.swing.JButton();
        Process_JButton = new javax.swing.JButton();
        Assign_JButton = new javax.swing.JButton();

        WorkRequest_JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status", "Doctor Status", "Bed Status", "Van Status"
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
        JScrollPane.setViewportView(WorkRequest_JTable);
        if (WorkRequest_JTable.getColumnModel().getColumnCount() > 0) {
            WorkRequest_JTable.getColumnModel().getColumn(4).setHeaderValue("Doctor Status");
            WorkRequest_JTable.getColumnModel().getColumn(5).setHeaderValue("Bed Status");
            WorkRequest_JTable.getColumnModel().getColumn(6).setHeaderValue("Van Status");
        }

        Refresh_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Refresh_JButton.setText("Refresh!");
        Refresh_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Refresh_JButtonActionPerformed(evt);
            }
        });

        Process_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Process_JButton.setText("Process >>");
        Process_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Process_JButtonActionPerformed(evt);
            }
        });

        Assign_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Assign_JButton.setText("Assign to me");
        Assign_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Assign_JButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(247, 247, 247)
                            .addComponent(Refresh_JButton)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(Assign_JButton)
                        .addGap(129, 129, 129)
                        .addComponent(Process_JButton)))
                .addContainerGap(42, Short.MAX_VALUE))
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
                .addContainerGap(79, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Refresh_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Refresh_JButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_Refresh_JButtonActionPerformed

    private void Process_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Process_JButtonActionPerformed

        int selectedRow = WorkRequest_JTable.getSelectedRow();
        if (selectedRow < 0){
            return;
        }
        HospitalAvailabilityWorkTestRequest request = (HospitalAvailabilityWorkTestRequest)WorkRequest_JTable.getValueAt(selectedRow, 0);
        request.setStatus("Processing");
        ProcessWorkRequestJPanel processWorkRequestJPanel = new ProcessWorkRequestJPanel(userProcessContainer, request);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_Process_JButtonActionPerformed

    private void Assign_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Assign_JButtonActionPerformed

        int selectedRow = WorkRequest_JTable.getSelectedRow();
        if (selectedRow < 0){
            return;
        }
        WorkRequest request = (WorkRequest)WorkRequest_JTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        populateTable();
    }//GEN-LAST:event_Assign_JButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Assign_JButton;
    private javax.swing.JScrollPane JScrollPane;
    private javax.swing.JButton Process_JButton;
    private javax.swing.JButton Refresh_JButton;
    private javax.swing.JTable WorkRequest_JTable;
    // End of variables declaration//GEN-END:variables
}
