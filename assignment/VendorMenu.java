/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javagrpassignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
/**
 *
 * @author baigs
 */
public class VendorMenu extends javax.swing.JFrame {
    
    private String userID;
    /**
     * Creates new form VendorMenu
     */
    public VendorMenu(String userID) {
        initComponents();
        this.setTitle("Vendor Menu");
        setLocationRelativeTo(null);
        setUserID(userID);
    }
    
    public String getUserID() {
        return userID;
    }
    public void setUserID(String userID){
    this.userID = userID;
    filterTable(userID);
    }
    
    
     private void filterTable(String userID) {
        try {
            // Specify the path to your text file containing the food menu
            String filePath = "C:\\Users\\baigs\\OneDrive\\Documents\\NetBeansProjects\\JavaGrpAssignment\\src\\javagrpassignment/menu_details.txt";

            // Read the contents of the file
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            // Clear existing table data
            DefaultTableModel model = (DefaultTableModel) VendorMenuEditTable.getModel();
            model.setColumnIdentifiers(new String[]{"Vendor ID", "Vendor Name", "Food Name", "Price"});
            model.setRowCount(0);

            // Populate the table with file content for the specified userID
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split("\t");
                if (data.length >= 2 && userID.equals(data[0]))
                    model.addRow(data);
            }

            reader.close();

            JOptionPane.showMessageDialog(this, "Menu Loaded");

        } catch (IOException ex) {
            // Handle any exceptions that may occur during file reading
            JOptionPane.showMessageDialog(this, "Error loading menu: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        VFoodNametxtFld = new javax.swing.JTextField();
        VFoodPricetxtFld = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        VendorAddMenubtn = new javax.swing.JButton();
        VendorMenuTable = new javax.swing.JScrollPane();
        VendorMenuEditTable = new javax.swing.JTable();
        VendorViewMenubtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name");

        jLabel2.setText("Prices");

        VFoodNametxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VFoodNametxtFldActionPerformed(evt);
            }
        });

        VFoodPricetxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VFoodPricetxtFldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Add item to Menu");

        VendorAddMenubtn.setText("Add menu");
        VendorAddMenubtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VendorAddMenubtnActionPerformed(evt);
            }
        });

        VendorMenuEditTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Vendor ID", "Vendor Name", "Food Name", "Price"
            }
        ));
        VendorMenuTable.setViewportView(VendorMenuEditTable);

        VendorViewMenubtn.setText("View menu");
        VendorViewMenubtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VendorViewMenubtnActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(VendorViewMenubtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(VendorMenuTable, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(VFoodPricetxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(50, 50, 50)
                                    .addComponent(VFoodNametxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(VendorAddMenubtn))
                        .addGap(39, 39, 39))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addGap(181, 181, 181)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jButton2))
                        .addGap(38, 38, 38)
                        .addComponent(VendorMenuTable, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(VFoodNametxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(VFoodPricetxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(55, 55, 55)
                        .addComponent(VendorAddMenubtn)))
                .addGap(18, 18, 18)
                .addComponent(VendorViewMenubtn)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VendorAddMenubtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VendorAddMenubtnActionPerformed
        // TODO add your handling code here:
           // Get the data from text fields
    String vendorName = VFoodNametxtFld.getText().trim();
    String price = VFoodPricetxtFld.getText().trim();

    // Validate that both fields are not empty
    if (vendorName.isEmpty() || price.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter both Name and Prices.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        // Specify the path to your text file containing the food menu
        String filePath = "C:\\Users\\baigs\\OneDrive\\Documents\\NetBeansProjects\\JavaGrpAssignment\\src\\javagrpassignment/menu_details.txt";

        // Append the new data to the file
        Files.write(Path.of(filePath), (vendorName + "\tYourStringValue\t" + price + "\n").getBytes(), StandardOpenOption.APPEND);

        // Display success message
        JOptionPane.showMessageDialog(this, "Menu Updated");

        // Clear text fields
        VFoodNametxtFld.setText("");
        VFoodPricetxtFld.setText("");

    } catch (IOException ex) {
        // Handle any exceptions thaat may occur during file writing
        JOptionPane.showMessageDialog(this, "Error updating menu: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_VendorAddMenubtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        VendorPage page6 = new VendorPage ();
        page6.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void VendorViewMenubtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VendorViewMenubtnActionPerformed
        // TODO add your handling code here:
        try {
            // Specify the path to your text file containing the food menu
            String filePath = "C:\\Users\\baigs\\OneDrive\\Documents\\NetBeansProjects\\JavaGrpAssignment\\src\\javagrpassignment/menu_details.txt";

            // Read the contents of the file
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            // Clear existing table data
            DefaultTableModel model = (DefaultTableModel) VendorMenuEditTable.getModel();
            model.setColumnIdentifiers(new String[]{"Vendor ID", "Vendor Name", "Food Name", "Price"});
            model.setRowCount(0);

            // Populate the table with file content
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split("\t"); 
                if (data.length >= 2 && userID.equals(data[0])) 
                model.addRow(data);
            }

            reader.close();

            JOptionPane.showMessageDialog(this, "Menu Loaded");

        } catch (IOException ex) {
// Handle any exceptions that may occur during file reading
            JOptionPane.showMessageDialog(this, "Error loading menu: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_VendorViewMenubtnActionPerformed

    private void VFoodNametxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VFoodNametxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VFoodNametxtFldActionPerformed

    private void VFoodPricetxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VFoodPricetxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VFoodPricetxtFldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VendorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendorMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendorMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField VFoodNametxtFld;
    private javax.swing.JTextField VFoodPricetxtFld;
    private javax.swing.JButton VendorAddMenubtn;
    private javax.swing.JTable VendorMenuEditTable;
    private javax.swing.JScrollPane VendorMenuTable;
    private javax.swing.JButton VendorViewMenubtn;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
