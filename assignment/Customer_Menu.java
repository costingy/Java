

package assignment;

import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Customer_Menu extends javax.swing.JFrame {

    private javax.swing.JTable jTable;
    private javax.swing.JButton wBtnPlaceOrder;
    
    public Customer_Menu() {
        initComponents();
        setLocationRelativeTo(null);
        jTable = new javax.swing.JTable();
        loadMenuData();
    }
    
     private void loadMenuData() {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\mazya\\OneDrive\\Desktop\\College\\Y2\\Assignment\\src\\assignment\\menu_details.txt"))) {
        DefaultTableModel model = (DefaultTableModel) CustMenuTable.getModel();
        model.setRowCount(0); 

        String line;
        while ((line = reader.readLine()) != null) {
        String[] columns = line.split("\t"); 
           
            if (columns.length >= 4 && columns[0].startsWith("vd")) {
                String[] rowData = new String[4];
                rowData[0] = columns[0]; // UserID
                rowData[1] = columns[2]; // Food Name
                rowData[2] = columns[3]; // Price
                rowData[3] = ""; // Blank status
                model.addRow(rowData);
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error saving data: " + e.getMessage());
    }
}
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mBtnBack = new javax.swing.JButton();
        mBtnPlaceOrder = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CustMenuTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mBtnBack.setText("Back");
        mBtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBtnBackActionPerformed(evt);
            }
        });

        mBtnPlaceOrder.setText("Place Order");
        mBtnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBtnPlaceOrderActionPerformed(evt);
            }
        });

        CustMenuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "VendorID", "Food Name", "Price", "Status"
            }
        ));
        jScrollPane1.setViewportView(CustMenuTable);

        jPanel1.setBackground(new java.awt.Color(153, 153, 0));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Menu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mBtnPlaceOrder)
                .addGap(18, 18, 18)
                .addComponent(mBtnBack)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mBtnBack)
                    .addComponent(mBtnPlaceOrder))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mBtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBtnBackActionPerformed
        dispose();
        CustomerPage customerPage = new CustomerPage();
        customerPage.setVisible(true);
    }//GEN-LAST:event_mBtnBackActionPerformed

    private void mBtnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBtnPlaceOrderActionPerformed
        DefaultTableModel model = (DefaultTableModel) CustMenuTable.getModel();
        int rowCount = model.getRowCount();

        // List to store selected rows' data
        List<Object[]> selectedRowsData = new ArrayList<>();

        // Iterate through all rows
        for (int i = 0; i < rowCount; i++) {
            // Check if the row is selected
            if (CustMenuTable.isRowSelected(i)) {
                // Get data from selected row
                Object[] rowData = new Object[model.getColumnCount()];
                for (int j = 0; j < model.getColumnCount(); j++) {
                    rowData[j] = model.getValueAt(i, j);
                }
                selectedRowsData.add(rowData);
            }
        }
        
        processSelectedRowsData(selectedRowsData);
    }//GEN-LAST:event_mBtnPlaceOrderActionPerformed

    
    private void processSelectedRowsData(List<Object[]> selectedRowsData) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\mazya\\OneDrive\\Desktop\\College\\Y2\\Assignment\\src\\assignment\\placed_order.txt", true))) {
            for (Object[] rowData : selectedRowsData) {
                // Concatenate the data and write it to the file
                String rowString = String.join(", ", Arrays.stream(rowData)
                        .map(Object::toString)
                        .toArray(String[]::new));
                writer.write(rowString);
                writer.newLine();
            }
            JOptionPane.showMessageDialog(this, "Order placed for selected items. Data saved.");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error saving data.");
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CustMenuTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mBtnBack;
    private javax.swing.JButton mBtnPlaceOrder;
    // End of variables declaration//GEN-END:variables
}
