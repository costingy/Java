/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame 
{
    
    private String loggedInUserID;
    private final ArrayList<String[]> idPasswordList;
    private boolean matchFound;
    
    private boolean loginComplete;
    public boolean isLoginComplete() {
        return loginComplete;
    }

       public static void main(String[] args) {
    
        java.awt.EventQueue.invokeLater(() -> {
            Login login = new Login();
        login.setVisible(true);

        login.jBLogin.addActionListener((evt) -> {
            String loggedInUserID = login.handleLogin();
        });
       });
    }
    public Login()
    {
        initComponents();          
        setLocationRelativeTo(null) ;
        idPasswordList = new ArrayList<>();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        JTFUserID = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        JTfPassword = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jBLogin = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(153, 255, 255));
        jPanel9.setLayout(new java.awt.GridLayout(4, 1));

        jPanel10.setBackground(new java.awt.Color(153, 255, 255));
        jPanel10.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setText("Login");
        jPanel10.add(jLabel2, new java.awt.GridBagConstraints());

        jPanel9.add(jPanel10);

        jPanel11.setLayout(new java.awt.GridLayout(1, 0));

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("User ID:");
        jPanel2.add(jLabel3);

        jPanel11.add(jPanel2);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        JTFUserID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFUserIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(JTFUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 178, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JTFUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jPanel11.add(jPanel1);

        jPanel9.add(jPanel11);

        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        jPanel4.setBackground(new java.awt.Color(153, 255, 255));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 51));
        jLabel6.setText("Password:");
        jPanel4.add(jLabel6);

        jPanel5.add(jPanel4);

        jPanel3.setBackground(new java.awt.Color(153, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTfPasswordActionPerformed(evt);
            }
        });
        jPanel3.add(JTfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 8, 100, 20));

        jPanel5.add(jPanel3);

        jPanel9.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(153, 255, 255));
        jPanel6.setLayout(new java.awt.GridLayout(2, 1));

        jPanel12.setBackground(new java.awt.Color(153, 255, 255));

        jBLogin.setText("Login");
        jBLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLoginActionPerformed(evt);
            }
        });
        jPanel12.add(jBLogin);

        jPanel6.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(153, 255, 255));

        jButton2.setText("Forgot Password");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton2);

        jPanel6.add(jPanel13);

        jPanel9.add(jPanel6);

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 565, 411));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTfPasswordActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_JTfPasswordActionPerformed
    {//GEN-HEADEREND:event_JTfPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTfPasswordActionPerformed

    private void JTFUserIDActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_JTFUserIDActionPerformed
    {//GEN-HEADEREND:event_JTFUserIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFUserIDActionPerformed

    private void jBLoginActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jBLoginActionPerformed
    {//GEN-HEADEREND:event_jBLoginActionPerformed
    String userType = "";
    String userID = "";
    String Passkey = JTFUserID.getText() + "," + JTfPassword.getText();
    
    File f = new File("C:\\Users\\chiaj\\OneDrive\\Documents\\NetBeansProjects\\Assignment\\src\\assignment\\password.txt");

    try (BufferedReader br = new BufferedReader(new FileReader(f))) {
        String line;

        while ((line = br.readLine()) != null) {
            // Split the line using commas as the separator
            String[] data = line.split(", ");

            // Ensure that there are at least two elements (id and password)
            if (data.length >= 3) { // Modified to check for at least three elements
                String id = data[1].trim(); // Assuming id is the second element
                String password = data[2].trim(); // Assuming password is the third element

                idPasswordList.add(new String[]{id, password});
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }

    for (String[] pair : idPasswordList) {
        if (Passkey.equals(pair[0] + "," + pair[1])) {
            matchFound = true;
            userType = pair[0].substring(0, 2);
                  if ("vd".equals(userType)) {
            userID = pair[0];
        } else {
            userID = pair[0];
        }
        loggedInUserID = userID;
        break;
        }
    }
        // ... After the loop
        if (!matchFound) {
            JOptionPane.showMessageDialog(this, "Invalid login credentials", "Error", JOptionPane.ERROR_MESSAGE);
            // Display an error message or handle invalid credentials as needed
        } else {
            switch (userType) {
                /**
                case "cu":
                    // Open customer page
                    CustomerPage customerPage = new CustomerPage();
                    customerPage.setVisible(true);
                    break;
                    */
                case "ad":
                    // Open admin page
                    AdminPage adminPage = new AdminPage();
                    adminPage.setVisible(true);
                    break;
                case "dm":
                    // Open delivery driver page
                    DDPage deliveryDriverPage = new DDPage();
                    deliveryDriverPage.setVisible(true);
                    break;
                /**
                case "vd":
                    // Open vendor page with the user ID
                    VendorPage vendorPage = new VendorPage();
                    vendorPage.setUserID(loggedInUserID);
                    vendorPage.setVisible(true);
                    break;
                    */
                default:
                    // Handle unknown user type
                    System.out.println("Unknown user type");
                    break;
            }
           
            loginComplete = true;
            
            this.setVisible(false);
        }
    }
        private String handleLogin() {
        jBLoginActionPerformed(null);
        return loggedInUserID;
    }//GEN-LAST:event_jBLoginActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
    {//GEN-HEADEREND:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

        public String getLoggedInUserID() {
        return loggedInUserID;
        }

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTFUserID;
    private javax.swing.JTextField JTfPassword;
    private javax.swing.JButton jBLogin;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
