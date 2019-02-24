package UserInterface.PoliceRole;

import Business.Disaster;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Organisation.PoliceOrganisation;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CustomerToPoliceRequest;
import Business.WorkQueue.FireToPoliceRequest;
import Business.WorkQueue.PoliceToHospitalRequest;
import Business.WorkQueue.RequestRehabTestRequest;
import Business.WorkQueue.RequestReportTestRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class PoliceWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer; 
    private UserAccount account; 
    private PoliceOrganisation policeOrganisation;
    private Enterprise enterprise;
    private EnterpriseDirectory enterpriseDirectory;
    private Disaster disaster;

    public PoliceWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, PoliceOrganisation policeOrganisation, Enterprise enterprise, Disaster disaster, EnterpriseDirectory enterpriseDirectory) {
        initComponents();
        
        this.account=account;
        this.enterprise=enterprise;
        this.policeOrganisation=policeOrganisation;
        this.userProcessContainer=userProcessContainer;
        this.enterpriseDirectory=enterpriseDirectory;
        this.disaster=disaster;
        
        valueLabel.setText(enterprise.getName());
        
        populateRequestRehabTable();
        populateRequestReportTable();
        populatePolicetoHospitalTable();
        populateFiretoPoliceTable();
        populateCustomerRequest();
    }
    public void populateRequestRehabTable(){
        DefaultTableModel model = (DefaultTableModel) RequestRehab_JTable.getModel();
        
        model.setRowCount(0);
        for (RequestRehabTestRequest request : policeOrganisation.getRequestrehabworktestrequest()){
            Object[] row = new Object[7];
            row[0] = request.getMessage();
            if(request.getMessage().isEmpty()){
                System.out.println("Null");
            }
            else{
                row[1] = request.getReceiver();
                row[2] = request.getStatus();
                String result = ((RequestRehabTestRequest) request).getAvailability1();
                row[3] = result == null ? "Waiting" : result;
                row[4] = request.getPhoneNumber();
                row[5] = request.getEmailAddress();
                row[6] = request.getAddress();
                model.addRow(row);
            }
        }
    }
    public void populateRequestReportTable(){
        DefaultTableModel model = (DefaultTableModel) RequestReport_JTable.getModel();
        
        model.setRowCount(0);
        for (RequestReportTestRequest request1 : policeOrganisation.getRequestreportworktestrequest()){
            Object[] row = new Object[6];
            row[0] = request1.getMessage();
            if(request1.getMessage().isEmpty()){
                System.out.println("Null");
            }
            else{
                if(request1.getStatus()=="Completed"){
                row[1] = request1.getReceiver();
                row[2] = request1.getStatus();
                String result1 = ((RequestReportTestRequest) request1).getAvailability2();
                row[3] = result1 == null ? "Waiting" : result1;
                row[4] = request1.getAvailabilityVans();
                row[5] = request1.getPoliceOfficers();
                model.addRow(row);
            }
                else{
                row[1] = request1.getReceiver();
                row[2] = request1.getStatus();
                String result1 = ((RequestReportTestRequest) request1).getAvailability2();
                row[3] = result1 == null ? "Waiting" : result1;
                model.addRow(row);
                    
                    
                }}
        }
    }
    public void populatePolicetoHospitalTable() {  
        DefaultTableModel model = (DefaultTableModel) PolicetoHospital_JTable.getModel();
        
        model.setRowCount(0);
        for (PoliceToHospitalRequest request : policeOrganisation.getPthpqueue()){
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
    public void populateFiretoPoliceTable() { 
        DefaultTableModel model1 = (DefaultTableModel) FiretoPolice_JTable.getModel();
        model1.setRowCount(0);
            for (FireToPoliceRequest request1 : policeOrganisation.getFtpqueue()){
                if (request1 instanceof FireToPoliceRequest){
                    Object[] row1 = new Object[5];
                    row1[0] = request1;
                    row1[1] = request1.getReceiver();
                    row1[2] = request1.getStatus();
                    String result1 = ((FireToPoliceRequest) request1).getAvailableNumberHospitalF();
                    row1[3] = result1 == null ? "Waiting" : result1;
                    model1.addRow(row1);
                }
            }
    }
        public void populateCustomerRequest(){
     DefaultTableModel model = (DefaultTableModel)Customer_PoliceJTable .getModel();
        model.setRowCount(0);
            for (CustomerToPoliceRequest request : policeOrganisation.getCtprqueue()){
                if (request instanceof CustomerToPoliceRequest){
                    Object[] row = new Object[5];
                    
                    row[0] = request;
                    if(request.getMessage().isEmpty()){
                    }
                    else{
                        row[1] = request.getReceiver();
                        row[2] = request.getStatus();
                        String result = ((CustomerToPoliceRequest) request).getRequest();
                        row[3] = result == null ? "Waiting" : result;
                        model.addRow(row);
                    }
                }
    
            }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RequestReport_JButton = new javax.swing.JButton();
        RequestRehab_JButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        refreshTestJButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        RequestRehab_JTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        RequestReport_JTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        PolicetoHospital_JTable = new javax.swing.JTable();
        HospitalAlert_JButton = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        FiretoPolice_JTable = new javax.swing.JTable();
        FireAlert_JButton = new javax.swing.JButton();
        AssignFireEmergency_JButton = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        Customer_PoliceJTable = new javax.swing.JTable();
        Assign_JButton = new javax.swing.JButton();
        CustomerAssistance_JButton = new javax.swing.JButton();

        RequestReport_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RequestReport_JButton.setText("Request Report");
        RequestReport_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestReport_JButtonActionPerformed(evt);
            }
        });

        RequestRehab_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RequestRehab_JButton.setText("Request Rehab");
        RequestRehab_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestRehab_JButtonActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        valueLabel.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        valueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        valueLabel.setText("<value>");

        refreshTestJButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        refreshTestJButton.setText("Refresh!");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        RequestRehab_JTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RequestRehab_JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Receiver", "Status", "Result", "Number", "Email", "Address"
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
        jScrollPane2.setViewportView(RequestRehab_JTable);

        RequestReport_JTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RequestReport_JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Receiver", "Status", "Result", "Vans", "Officers"
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
        jScrollPane3.setViewportView(RequestReport_JTable);

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
        jScrollPane4.setViewportView(PolicetoHospital_JTable);

        HospitalAlert_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        HospitalAlert_JButton.setText("Hospital Alert!");
        HospitalAlert_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HospitalAlert_JButtonActionPerformed(evt);
            }
        });

        FiretoPolice_JTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        FiretoPolice_JTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(FiretoPolice_JTable);

        FireAlert_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        FireAlert_JButton.setText("Fire Alert");
        FireAlert_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FireAlert_JButtonActionPerformed(evt);
            }
        });

        AssignFireEmergency_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AssignFireEmergency_JButton.setText("Assign Emergency");
        AssignFireEmergency_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignFireEmergency_JButtonActionPerformed(evt);
            }
        });

        Customer_PoliceJTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Customer_PoliceJTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(Customer_PoliceJTable);

        Assign_JButton.setText("Assign");
        Assign_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Assign_JButtonActionPerformed(evt);
            }
        });

        CustomerAssistance_JButton.setText("Customer Assistance");
        CustomerAssistance_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerAssistance_JButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshTestJButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RequestReport_JButton)
                            .addComponent(RequestRehab_JButton))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(HospitalAlert_JButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AssignFireEmergency_JButton)
                                    .addComponent(FireAlert_JButton))))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(429, 429, 429)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Assign_JButton)
                    .addComponent(CustomerAssistance_JButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(refreshTestJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RequestReport_JButton)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HospitalAlert_JButton))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RequestRehab_JButton)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AssignFireEmergency_JButton)
                        .addGap(18, 18, 18)
                        .addComponent(FireAlert_JButton))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Assign_JButton)
                        .addGap(18, 18, 18)
                        .addComponent(CustomerAssistance_JButton)))
                .addContainerGap(258, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RequestReport_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestReport_JButtonActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestReportJPanel", new RequestReportJPanel(userProcessContainer, account, enterprise,policeOrganisation));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_RequestReport_JButtonActionPerformed

    private void RequestRehab_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestRehab_JButtonActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestRehabJPanel", new RequestRehabJPanel(userProcessContainer, account, enterprise,policeOrganisation));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_RequestRehab_JButtonActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed
        populateRequestRehabTable();
        populateRequestReportTable();
        populatePolicetoHospitalTable();
        populateFiretoPoliceTable();
        populateCustomerRequest();
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void HospitalAlert_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HospitalAlert_JButtonActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ReqHospitalEnterpriseJPanel", new ReqHospitalEnterpriseJPanel(userProcessContainer, account, enterprise,policeOrganisation,enterpriseDirectory,disaster));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_HospitalAlert_JButtonActionPerformed

    private void FireAlert_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FireAlert_JButtonActionPerformed
        int selectedRow = FiretoPolice_JTable.getSelectedRow();
        if (selectedRow < 0){
            return;
        }
        FireToPoliceRequest request = (FireToPoliceRequest)FiretoPolice_JTable.getValueAt(selectedRow, 0);
        request.setStatus("Processing");
        ProcessFireWorkRequestJPanel processFireWorkRequestJPanel = new ProcessFireWorkRequestJPanel(userProcessContainer, request, enterpriseDirectory);
        userProcessContainer.add("processFireWorkRequestJPanel", processFireWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_FireAlert_JButtonActionPerformed

    private void AssignFireEmergency_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssignFireEmergency_JButtonActionPerformed
        int selectedRow = FiretoPolice_JTable.getSelectedRow();
        if (selectedRow < 0){
            return;
        }
        WorkRequest request = (WorkRequest)FiretoPolice_JTable.getValueAt(selectedRow, 0);
        request.setReceiver(account);
        request.setStatus("Pending");
        populateFiretoPoliceTable();
    }//GEN-LAST:event_AssignFireEmergency_JButtonActionPerformed

    private void Assign_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Assign_JButtonActionPerformed
        int selectedRow = Customer_PoliceJTable.getSelectedRow();
        if (selectedRow < 0){
            return;
        }
        WorkRequest request1 = (WorkRequest)Customer_PoliceJTable.getValueAt(selectedRow, 0);
        request1.setReceiver(account);
        request1.setStatus("Pending");
        populateCustomerRequest();
    }//GEN-LAST:event_Assign_JButtonActionPerformed

    private void CustomerAssistance_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerAssistance_JButtonActionPerformed
        int selectedRow = Customer_PoliceJTable.getSelectedRow();
        if (selectedRow < 0){
            return;
        }
        CustomerToPoliceRequest request = (CustomerToPoliceRequest)Customer_PoliceJTable.getValueAt(selectedRow, 0);
        request.setStatus("Processing");
        ProcessCustomerWorkRequest processWorkRequestJPanel = new ProcessCustomerWorkRequest(userProcessContainer, request, enterpriseDirectory);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_CustomerAssistance_JButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AssignFireEmergency_JButton;
    private javax.swing.JButton Assign_JButton;
    private javax.swing.JButton CustomerAssistance_JButton;
    private javax.swing.JTable Customer_PoliceJTable;
    private javax.swing.JButton FireAlert_JButton;
    private javax.swing.JTable FiretoPolice_JTable;
    private javax.swing.JButton HospitalAlert_JButton;
    private javax.swing.JTable PolicetoHospital_JTable;
    private javax.swing.JButton RequestRehab_JButton;
    private javax.swing.JTable RequestRehab_JTable;
    private javax.swing.JButton RequestReport_JButton;
    private javax.swing.JTable RequestReport_JTable;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
