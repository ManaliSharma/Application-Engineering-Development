package UserInterface.HospitalRole;

import Business.Disaster;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Organisation.HospitalOrganisation;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BloodBankWorkTestRequest;
import Business.WorkQueue.FireToHospitalRequest;
import Business.WorkQueue.HospitalAvailabilityWorkTestRequest;
import Business.WorkQueue.PoliceToHospitalRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class HospitalWorkAreaJPanel extends javax.swing.JPanel {

private JPanel userProcessContainer; 
private UserAccount account; 
private HospitalOrganisation hospitalorganisation;
private Enterprise enterprise;
private EnterpriseDirectory enterpriseDirectory;

    public HospitalWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, HospitalOrganisation hospitalOrganisation, Enterprise enterprise, EnterpriseDirectory enterpriseDirectory) {
        initComponents();
        
        this.account=account;
        this.enterprise=enterprise;
        this.hospitalorganisation=hospitalOrganisation;
        this.userProcessContainer=userProcessContainer;
        this.enterpriseDirectory=enterpriseDirectory;
        
        valueLabel.setText(enterprise.getName());
        
        populateRequestTable();
        populateRequestBloodBankTable();
        populatePolicetoHospitalTable();
        populateFiretoHospitalTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        Refresh_TestJButton = new javax.swing.JButton();
        RequestTestAvailable_JButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        WorkRequestAvailable_JTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        WorkRequestBlood_JTable = new javax.swing.JTable();
        RequestTestBlood_JButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        PolicetoHospital_JTable = new javax.swing.JTable();
        PoliceAlert_JButton = new javax.swing.JButton();
        AssignEmergency_JButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        FiretoHospital_JTable = new javax.swing.JTable();
        FireAlert_JButton = new javax.swing.JButton();
        AssignFireEmergency_JButton = new javax.swing.JButton();
        Alert_JButton = new javax.swing.JButton();

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        valueLabel.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        valueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        valueLabel.setText("<value>");

        Refresh_TestJButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Refresh_TestJButton.setText("Refresh!");
        Refresh_TestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Refresh_TestJButtonActionPerformed(evt);
            }
        });

        RequestTestAvailable_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RequestTestAvailable_JButton.setText("Request Availability");
        RequestTestAvailable_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestTestAvailable_JButtonActionPerformed(evt);
            }
        });

        WorkRequestAvailable_JTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        WorkRequestAvailable_JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Receiver", "Status", "Result", "Doctors", "Beds", "Vans"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(WorkRequestAvailable_JTable);

        WorkRequestBlood_JTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        WorkRequestBlood_JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Receiver", "Status", "Result", "A+", "B+", "AB+", "O+", "A-", "B-", "AB-", "O-"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane2.setViewportView(WorkRequestBlood_JTable);

        RequestTestBlood_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RequestTestBlood_JButton.setText("Request Blood Bank");
        RequestTestBlood_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestTestBlood_JButtonActionPerformed(evt);
            }
        });

        PolicetoHospital_JTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PolicetoHospital_JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Receiver", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(PolicetoHospital_JTable);

        PoliceAlert_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PoliceAlert_JButton.setText("Police Alert");
        PoliceAlert_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PoliceAlert_JButtonActionPerformed(evt);
            }
        });

        AssignEmergency_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AssignEmergency_JButton.setText("Assign Emergency");
        AssignEmergency_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignEmergency_JButtonActionPerformed(evt);
            }
        });

        FiretoHospital_JTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        FiretoHospital_JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Receiver", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(FiretoHospital_JTable);

        FireAlert_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        FireAlert_JButton.setText("Fire Alert");
        FireAlert_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FireAlert_JButtonActionPerformed(evt);
            }
        });

        AssignFireEmergency_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AssignFireEmergency_JButton.setText("Assign Fire Emergency");
        AssignFireEmergency_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignFireEmergency_JButtonActionPerformed(evt);
            }
        });

        Alert_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Alert_JButton.setForeground(new java.awt.Color(255, 0, 0));
        Alert_JButton.setText("Alert!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RequestTestBlood_JButton)
                                    .addComponent(RequestTestAvailable_JButton))
                                .addGap(95, 95, 95)
                                .addComponent(Alert_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(8, 8, 8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AssignEmergency_JButton)
                                    .addComponent(PoliceAlert_JButton))
                                .addGap(60, 60, 60)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AssignFireEmergency_JButton)
                                    .addComponent(FireAlert_JButton))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Refresh_TestJButton)
                        .addGap(28, 28, 28))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Refresh_TestJButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RequestTestAvailable_JButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(Alert_JButton)))
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RequestTestBlood_JButton))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AssignEmergency_JButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PoliceAlert_JButton))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AssignFireEmergency_JButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FireAlert_JButton)))
                .addContainerGap(276, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Refresh_TestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Refresh_TestJButtonActionPerformed
        populateRequestTable();
        populateRequestBloodBankTable();
        populatePolicetoHospitalTable();
        populateFiretoHospitalTable();
    }//GEN-LAST:event_Refresh_TestJButtonActionPerformed

    public void  populateRequestBloodBankTable(){
        DefaultTableModel model = (DefaultTableModel) WorkRequestBlood_JTable.getModel();
        model.setRowCount(0);
        for (BloodBankWorkTestRequest request1 : hospitalorganisation.getHospitalbloodqueue()){
            Object[] row = new Object[12];
            row[0] = request1.getMessage();
            if(request1.getMessage().isEmpty()){
                System.out.println("Null");
            }
            else{
                if(request1.getStatus()=="Completed"){
                row[1] = request1.getReceiver();
                row[2] = request1.getStatus();
                String result1 = ((BloodBankWorkTestRequest) request1).getAvailabilty1();
                row[3] = result1 == null ? "Waiting" : result1;
                row[4] = request1.getBloodTypeA();
                row[5] = request1.getBloodTypeB();
                row[6] = request1.getBloodTypeAB();
                row[7]=request1.getBloodTypeO();
                row[8]=request1.getBloodTypeANeg();
                row[9]=request1.getBloodTypeBNeg();
                row[10]=request1.getBloodTypeABNeg();
                row[11]=request1.getBloodTypeONeg();
                model.addRow(row);
            }
                else{
                row[1] = request1.getReceiver();
                row[2] = request1.getStatus();
                String result = ((BloodBankWorkTestRequest) request1).getAvailabilty1();
                row[3] = result == null ? "Waiting" : result;
                 model.addRow(row);
                    
                }}
        
        }
    }
    public void populateRequestTable(){
        DefaultTableModel model1 = (DefaultTableModel) WorkRequestAvailable_JTable.getModel();
        model1.setRowCount(0);
        for (HospitalAvailabilityWorkTestRequest request : hospitalorganisation.getHospitalavailablityqueue()){
            
            Object[] row = new Object[7];
            row[0] = request.getMessage();
            if(request.getMessage().isEmpty()){
                System.out.println("Null");
            }
            else{
                if(request.getStatus()=="Completed"){
                    row[1] = request.getReceiver();
                    row[2] = request.getStatus();
                    String result = ((HospitalAvailabilityWorkTestRequest) request).getAvailabilty();
                    row[3] = result == null ? "Waiting" : result;
                    row[4] = request.getDoctor();
                    row[5] = request.getBeds();
                    row[6] = request.getVans();
                    model1.addRow(row);
            }
                else{
                    row[1] = request.getReceiver();
                    row[2] = request.getStatus();
                    String result = ((HospitalAvailabilityWorkTestRequest) request).getAvailabilty();
                    row[3] = result == null ? "Waiting" : result;
                    model1.addRow(row);
                }}
        }
    }
    public void populatePolicetoHospitalTable() {   
        DefaultTableModel model = (DefaultTableModel) PolicetoHospital_JTable.getModel();
        model.setRowCount(0);
            for (PoliceToHospitalRequest request : hospitalorganisation.getPthqueue()){
                if (request instanceof PoliceToHospitalRequest){
                    Object[] row = new Object[5];
                    row[0] = request;
                    row[1] = request.getReceiver();
                    row[2] = request.getStatus();
                    String result = ((PoliceToHospitalRequest) request).getAvailableNumberHospitalP();
                    row[3] = result == null ? "Waiting" : result;

                    model.addRow(row);
                }
    
            }
    }
    public void populateFiretoHospitalTable() {   
        DefaultTableModel model = (DefaultTableModel) FiretoHospital_JTable.getModel();
        model.setRowCount(0);
            for (FireToHospitalRequest request : hospitalorganisation.getFthqueue()){
                if (request instanceof FireToHospitalRequest){
                    Object[] row = new Object[5];
                    row[0] = request;
                    row[1] = request.getReceiver();
                    row[2] = request.getStatus();
                    String result = ((FireToHospitalRequest) request).getAvailableNumberHospitalH();
                    row[3] = result == null ? "Waiting" : result;
                    model.addRow(row);
                }
            }
    }
    
    private void RequestTestAvailable_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestTestAvailable_JButtonActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestAvailabiltyTestJPanel", new RequestAvailabiltyTestJPanel(userProcessContainer, account, enterprise,hospitalorganisation));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_RequestTestAvailable_JButtonActionPerformed

    private void RequestTestBlood_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestTestBlood_JButtonActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestBloodBankJPanel", new RequestBloodBankJPanel(userProcessContainer, account, enterprise,hospitalorganisation));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_RequestTestBlood_JButtonActionPerformed

    private void PoliceAlert_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PoliceAlert_JButtonActionPerformed
        int selectedRow = PolicetoHospital_JTable.getSelectedRow();
        if (selectedRow < 0){
            return;
        }
        PoliceToHospitalRequest request = (PoliceToHospitalRequest)PolicetoHospital_JTable.getValueAt(selectedRow, 0);
        request.setStatus("Processing");
        ProcessPoliceWorkRequest processPoliceWorkRequestJPanel = new ProcessPoliceWorkRequest(userProcessContainer, request, enterpriseDirectory);
        userProcessContainer.add("processPoliceWorkRequestJPanel", processPoliceWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_PoliceAlert_JButtonActionPerformed

    private void AssignEmergency_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssignEmergency_JButtonActionPerformed
    int selectedRow = PolicetoHospital_JTable.getSelectedRow();
        if (selectedRow < 0){
            return;
        }
        WorkRequest request = (WorkRequest)PolicetoHospital_JTable.getValueAt(selectedRow, 0);
        request.setReceiver(account);
        request.setStatus("Pending");
        populatePolicetoHospitalTable();
    }//GEN-LAST:event_AssignEmergency_JButtonActionPerformed

    private void FireAlert_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FireAlert_JButtonActionPerformed
        int selectedRow = FiretoHospital_JTable.getSelectedRow();
        if (selectedRow < 0){
            return;
        }
        FireToHospitalRequest request = (FireToHospitalRequest)FiretoHospital_JTable.getValueAt(selectedRow, 0);
        request.setStatus("Processing");
        ProcessFireWorkRequest_JPanel processFireWorkRequest_JPanel = new ProcessFireWorkRequest_JPanel(userProcessContainer, request, enterpriseDirectory);
        userProcessContainer.add("processFireWorkRequestJPanel", processFireWorkRequest_JPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_FireAlert_JButtonActionPerformed

    private void AssignFireEmergency_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssignFireEmergency_JButtonActionPerformed
       int selectedRow = FiretoHospital_JTable.getSelectedRow();
        if (selectedRow < 0){
            return;
        }
        WorkRequest request = (WorkRequest)FiretoHospital_JTable.getValueAt(selectedRow, 0);
        request.setReceiver(account);
        request.setStatus("Pending");
        populateFiretoHospitalTable();
    }//GEN-LAST:event_AssignFireEmergency_JButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alert_JButton;
    private javax.swing.JButton AssignEmergency_JButton;
    private javax.swing.JButton AssignFireEmergency_JButton;
    private javax.swing.JButton FireAlert_JButton;
    private javax.swing.JTable FiretoHospital_JTable;
    private javax.swing.JButton PoliceAlert_JButton;
    private javax.swing.JTable PolicetoHospital_JTable;
    private javax.swing.JButton Refresh_TestJButton;
    private javax.swing.JButton RequestTestAvailable_JButton;
    private javax.swing.JButton RequestTestBlood_JButton;
    private javax.swing.JTable WorkRequestAvailable_JTable;
    private javax.swing.JTable WorkRequestBlood_JTable;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
   
}
