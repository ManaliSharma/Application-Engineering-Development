/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerRole;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.Disaster;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author manalisharma
 */
public class CodeBlueReport extends javax.swing.JPanel {

    /**
     * Creates new form CodeBlueReport
     */
    private JPanel userProcessContainer;
    private Disaster disaster;
    private CustomerDirectory cusDir;
    private String Type;
    private String Descr;

    public CodeBlueReport(JPanel userProcessContainer, Disaster disaster, CustomerDirectory cusDir) {
        
         initComponents();
         
         this.userProcessContainer=userProcessContainer;
         this.cusDir=cusDir;
         this.disaster=disaster;
         populatetable();
    
    
    
    }
    
    public void populatetable(){
        DefaultTableModel dtm1=(DefaultTableModel)BlueJTable.getModel();
        dtm1.setRowCount(0);
            for(Customer c:cusDir.getCusDir()){
                Object row[]=new Object[2];  
                row[0]=c.getEmergencyType();
                Type=c.getEmergencyType();
                Descr=c.getBlueDesc();
                row[1]=c.getBlueDesc();
               
                dtm1.addRow(row);
            }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        BlueJTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        BlueJTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BlueJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Emergency Type", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(BlueJTable);

        jButton1.setText("Submit Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(jButton1)))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(251, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
			String apiKey = "apikey=" + "pAU0zWADtjE-ZjvTBoIyAQjVDL9z1FdReuiKlhpkkC";
                       // String apiKey = "apikey=" + "pAU0zWADtjE-ZjvTBoIyAQjVDL9z1FdReuiKlhpkkC";
			String message = "&message=" + "There is an Emergency" +Type+Descr;
			String sender = "&sender=" + "Customer";
			String numbers = "&numbers=" + "+18574130522";
                        //String numbers = "&numbers=" + "+16178697102";
			
			// Send data
			HttpURLConnection conn = (HttpURLConnection) new URL("https://api.txtlocal.com/send/?").openConnection();
			String data = apiKey + numbers + message + sender;
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
			conn.getOutputStream().write(data.getBytes("UTF-8"));
			final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			final StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = rd.readLine()) != null) {
				//stringBuffer.append(line);
                            JOptionPane.showMessageDialog(null,"message"+line);
			}
			rd.close();
			
			//return stringBuffer.toString();
		} catch (Exception e) {
			//System.out.println("Error SMS "+e);
                    JOptionPane.showMessageDialog(null,e);
			//return "Error "+e;
		}
                  
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BlueJTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
