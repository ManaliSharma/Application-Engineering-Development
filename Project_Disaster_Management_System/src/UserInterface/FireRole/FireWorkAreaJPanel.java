package UserInterface.FireRole;

import Business.Disaster;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Organisation.FireOrganisation;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.RequestInformationTestRequest;
import Business.WorkQueue.FireAvailabilityWorkTestRequest;
import Business.WorkQueue.FireRehabRequest;
import Business.WorkQueue.FireToHospitalRequest;
import Business.WorkQueue.FireToPoliceRequest;
import Business.WorkQueue.PoliceToHospitalRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class FireWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer; 
    private UserAccount account; 
    private FireOrganisation fireorganisation;
    private Enterprise enterprise;
    private EnterpriseDirectory enterpriseDirectory;
    private Disaster disaster;
 
    public FireWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, FireOrganisation fireOrganisation, Enterprise enterprise, Disaster disaster, EnterpriseDirectory enterpriseDirectory) {
    initComponents();
    
    this.account=account;
    this.enterprise=enterprise;
    this.fireorganisation=fireOrganisation;
    this.userProcessContainer=userProcessContainer;
    this.enterpriseDirectory=enterpriseDirectory;
    this.disaster=disaster;
    
    Value_JLabel.setText(enterprise.getName());
    populateFireRehabRequestTable();
    populateRequestInfoTable();
    populateFiretoHospitalTable();
    populateFiretoPoliceTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        RequestInfo_JTable = new javax.swing.JTable();
        enterpriseLabel = new javax.swing.JLabel();
        Value_JLabel = new javax.swing.JLabel();
        Refresh_JButton = new javax.swing.JButton();
        RequestInformation_JButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        RequestRehab_JTable = new javax.swing.JTable();
        RequestRehab_JButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        FiretoHospital_JTable = new javax.swing.JTable();
        HospitalAlert_JButton = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        FiretoPolice_JTable = new javax.swing.JTable();
        PoliceAlert_JButton = new javax.swing.JButton();

        RequestInfo_JTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RequestInfo_JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Receiver", "Status", "Result", "FireEngine", "Fireman"
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
        jScrollPane1.setViewportView(RequestInfo_JTable);

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        Value_JLabel.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        Value_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Value_JLabel.setText("<value>");

        Refresh_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Refresh_JButton.setText("Refresh!");
        Refresh_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Refresh_JButtonActionPerformed(evt);
            }
        });

        RequestInformation_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RequestInformation_JButton.setText("Request Information");
        RequestInformation_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestInformation_JButtonActionPerformed(evt);
            }
        });

        RequestRehab_JTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RequestRehab_JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
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

        RequestRehab_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RequestRehab_JButton.setText("Request Rehab >>");
        RequestRehab_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestRehab_JButtonActionPerformed(evt);
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

        PoliceAlert_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PoliceAlert_JButton.setText("Police Alert!");
        PoliceAlert_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PoliceAlert_JButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RequestInformation_JButton)
                            .addComponent(RequestRehab_JButton))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PoliceAlert_JButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addComponent(HospitalAlert_JButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Value_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Refresh_JButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Value_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Refresh_JButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(RequestRehab_JButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RequestInformation_JButton)
                                    .addComponent(HospitalAlert_JButton)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabel1)))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PoliceAlert_JButton))))
                .addContainerGap(400, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Refresh_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Refresh_JButtonActionPerformed
       populateRequestInfoTable();
       populateFireRehabRequestTable();
       populateFiretoHospitalTable();
       populateFiretoPoliceTable();
    }//GEN-LAST:event_Refresh_JButtonActionPerformed

    private void RequestInformation_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestInformation_JButtonActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestInformationJPanel", new RequestInformationJPanel(userProcessContainer, account, enterprise, fireorganisation));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_RequestInformation_JButtonActionPerformed

    private void RequestRehab_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestRehab_JButtonActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestFireRehabJPanel", new RequestFireRehabJPane(userProcessContainer, account, enterprise,fireorganisation));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_RequestRehab_JButtonActionPerformed

    private void HospitalAlert_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HospitalAlert_JButtonActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("FireReqHospitalEnterpriseJPanel", new FireReqHospitalEnterpriseJPanel(userProcessContainer, account, enterprise,fireorganisation,enterpriseDirectory,disaster));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_HospitalAlert_JButtonActionPerformed

    private void PoliceAlert_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PoliceAlert_JButtonActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ReqPoliceEnterpriseJPanel", new ReqPoliceEnterpriseJPanel(userProcessContainer, account, enterprise,fireorganisation,enterpriseDirectory,disaster));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_PoliceAlert_JButtonActionPerformed
    public void populateRequestInfoTable() {
        DefaultTableModel model = (DefaultTableModel) RequestInfo_JTable.getModel();
        model.setRowCount(0);
        for (FireAvailabilityWorkTestRequest request1 : fireorganisation.getFireavailablityqueue()){
            Object[] row = new Object[6];
            row[0] = request1.getMessage();
            if(request1.getMessage().isEmpty()){
                System.out.println("Null");
            }
            else{
                if(request1.getStatus()=="Completed"){
                row[1] = request1.getReceiver();
                row[2] = request1.getStatus();
                String result1 = ((FireAvailabilityWorkTestRequest) request1).getAvailabilty();
                row[3] = result1 == null ? "Waiting" : result1;
                row[4] = request1.getFireEngine();
                row[5] = request1.getFireman();
                model.addRow(row);
            }
                else{
                row[1] = request1.getReceiver();
                row[2] = request1.getStatus();
                String result1 = ((FireAvailabilityWorkTestRequest) request1).getAvailabilty();
                row[3] = result1 == null ? "Waiting" : result1;
                model.addRow(row);
                    
                    
                    
                }}
        }
        
    }
    public void populateFireRehabRequestTable(){
        DefaultTableModel model = (DefaultTableModel) RequestRehab_JTable.getModel();
        
        model.setRowCount(0);
        for (FireRehabRequest request : fireorganisation.getFireRehabqueue()){
            Object[] row = new Object[7];
            row[0] = request.getMessage();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            String result = ((FireRehabRequest) request).getAvailability();
            row[3] = result == null ? "Waiting" : result;
            row[4] = request.getPhoneNumber();
            row[5] = request.getEmailAddress();
            row[6] = request.getAddress();
            model.addRow(row);
        }
    }
    public void populateFiretoHospitalTable() {
        DefaultTableModel model = (DefaultTableModel) FiretoHospital_JTable.getModel();
        model.setRowCount(0);
        for (FireToHospitalRequest request : fireorganisation.getFthpqueue()){
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
    public void populateFiretoPoliceTable() {
        DefaultTableModel model = (DefaultTableModel) FiretoPolice_JTable.getModel();
        model.setRowCount(0);
        for (FireToPoliceRequest request : fireorganisation.getFtppqueue()){
            if (request instanceof FireToPoliceRequest){
            Object[] row = new Object[5];
            row[0] = request;
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            String result = ((FireToPoliceRequest) request).getAvailableNumberHospitalF();
            row[3] = result == null ? "Waiting" : result;
            model.addRow(row);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable FiretoHospital_JTable;
    private javax.swing.JTable FiretoPolice_JTable;
    private javax.swing.JButton HospitalAlert_JButton;
    private javax.swing.JButton PoliceAlert_JButton;
    private javax.swing.JButton Refresh_JButton;
    private javax.swing.JTable RequestInfo_JTable;
    private javax.swing.JButton RequestInformation_JButton;
    private javax.swing.JButton RequestRehab_JButton;
    private javax.swing.JTable RequestRehab_JTable;
    private javax.swing.JLabel Value_JLabel;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables

    
}
