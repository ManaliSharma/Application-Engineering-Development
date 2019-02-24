package UserInterface.CustomerRole;

import Business.Boston.Boston;
import Business.Customer.CustomerDirectory;
import Business.Disaster;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PoliceEnterprise;
import Business.Organisation.Organisation;
import Business.Organisation.PoliceOrganisation;
import Business.WorkQueue.CustomerToPoliceRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class PoliceCustomerPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    CustomerDirectory cusDir;
    Disaster disaster;
    PoliceOrganisation polorg;
    
    public PoliceCustomerPanel(JPanel userProcessCustomer,CustomerDirectory cusDir,Disaster disaster) {
        initComponents();
        
        this.userProcessContainer=userProcessCustomer;
        this.cusDir=cusDir;
        this.disaster=disaster;
        
        populateTable();      
    }
    
    public void populateTable() {  
        DefaultTableModel model = (DefaultTableModel) PolicetoHospital_JTable.getModel();
        model.setRowCount(0);
        Organisation org=null;
        if(org==null){
            for(Boston net:disaster.getNetworkList()){

               for(Enterprise enterprise:net.getEnterpriseDirectory().getEnterpriseList()){
                   if(enterprise instanceof PoliceEnterprise){
                        for(Organisation organisation:enterprise.getOrganisationDirectory().getOrganisationList()){
                                polorg=(PoliceOrganisation)organisation;
                                for (CustomerToPoliceRequest request :polorg.getCtprqueue() ){
                                        if (request instanceof CustomerToPoliceRequest){
                                                Object[] row = new Object[5];
                                                row[0] = request;
                                                row[1] = request.getReceiver();
                                                row[2] = request.getStatus();
                                                String result = ((CustomerToPoliceRequest) request).getRequest();
                                                row[3] = result == null ? "Waiting" : result;

                                                model.addRow(row);
                                        }
                                }
                        }
                   }
               }
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        PolicetoHospital_JTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        PolicetoHospital_JTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PolicetoHospital_JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
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

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Request Police !>>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Emergency Alert");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(440, 440, 440)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(476, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addContainerGap(407, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ReqHospitalEnterpriseJPanel", new RequestPoliceCustomerPanel(userProcessContainer,cusDir, disaster));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable PolicetoHospital_JTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
