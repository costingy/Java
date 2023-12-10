/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chiaj
 */
public class Register extends javax.swing.JFrame
{

    private int row = -1;
    
    private DefaultTableModel model = new DefaultTableModel();
    
    private String[] column = {"Name", "ID", "Password","amount"};

    private String name ;

     private   String id;

     private   String password ;
        
     private   String topup ;
 
    public Register()
    {
        initComponents();
        
        setLocationRelativeTo(null) ;
        
        model.setColumnIdentifiers(column);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        RFLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jTFNameRegister = new javax.swing.JTextField();
        JBRegisterUser = new javax.swing.JButton();
        jBDeleteUser = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        JBShowUser = new javax.swing.JButton();
        JBsave = new javax.swing.JButton();
        JTFIDReg1 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        JBUpdateUser = new javax.swing.JButton();
        JBClearUser = new javax.swing.JButton();
        JTFPasswordReg = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        JBreceipt = new javax.swing.JButton();
        JBTopup = new javax.swing.JButton();
        JTFtopup = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTPasswordTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        RFLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        RFLabel.setForeground(new java.awt.Color(0, 0, 0));
        RFLabel.setText("User Control");
        jPanel1.add(RFLabel);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));
        jPanel2.setLayout(new java.awt.GridLayout(4, 2));

        jPanel4.setBackground(new java.awt.Color(153, 255, 255));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Name:");
        jPanel4.add(jLabel1);

        jPanel2.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(153, 255, 255));

        jTFNameRegister.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTFNameRegisterActionPerformed(evt);
            }
        });

        JBRegisterUser.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        JBRegisterUser.setText("Register User");
        JBRegisterUser.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                JBRegisterUserActionPerformed(evt);
            }
        });

        jBDeleteUser.setText("delete user");
        jBDeleteUser.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jBDeleteUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jTFNameRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(JBRegisterUser)
                .addGap(37, 37, 37)
                .addComponent(jBDeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNameRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBRegisterUser)
                    .addComponent(jBDeleteUser))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5);

        jPanel7.setBackground(new java.awt.Color(153, 255, 255));
        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ID:");
        jPanel7.add(jLabel2);

        jPanel2.add(jPanel7);

        jPanel6.setBackground(new java.awt.Color(153, 255, 255));

        JBShowUser.setText("show User");
        JBShowUser.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                JBShowUserActionPerformed(evt);
            }
        });

        JBsave.setText("save");
        JBsave.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                JBsaveActionPerformed(evt);
            }
        });

        JTFIDReg1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                JTFIDReg1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(JTFIDReg1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(JBShowUser, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(JBsave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFIDReg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBShowUser)
                    .addComponent(JBsave))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel6);

        jPanel8.setBackground(new java.awt.Color(153, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Password:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(363, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel8);

        jPanel10.setBackground(new java.awt.Color(153, 255, 255));

        JBUpdateUser.setText("update user");
        JBUpdateUser.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                JBUpdateUserActionPerformed(evt);
            }
        });

        JBClearUser.setText("Clear");
        JBClearUser.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                JBClearUserActionPerformed(evt);
            }
        });

        JTFPasswordReg.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                JTFPasswordRegActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(JTFPasswordReg, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(JBUpdateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(JBClearUser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(JTFPasswordReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBUpdateUser)
                    .addComponent(JBClearUser))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel10);

        jPanel12.setBackground(new java.awt.Color(153, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Top Up:");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(373, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(153, 255, 255));

        JBreceipt.setText("send recepit");
        JBreceipt.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                JBreceiptActionPerformed(evt);
            }
        });

        JBTopup.setText("Top up");
        JBTopup.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                JBTopupActionPerformed(evt);
            }
        });

        JTFtopup.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                JTFtopupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addComponent(JTFtopup, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(JBTopup, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(JBreceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(JTFtopup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBreceipt)
                    .addComponent(JBTopup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.add(jPanel13);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel3.setBackground(new java.awt.Color(153, 255, 255));

        jPanel11.setBackground(new java.awt.Color(153, 255, 255));

        JTPasswordTable.setModel(model);
        JTPasswordTable.addMouseListener(new java.awt.event.MouseAdapter()
            {
                public void mouseReleased(java.awt.event.MouseEvent evt)
                {
                    JTPasswordTableMouseReleased(evt);
                }
            });
            jScrollPane1.setViewportView(JTPasswordTable);

            jButton1.setText("back");
            jButton1.addActionListener(new java.awt.event.ActionListener()
            {
                public void actionPerformed(java.awt.event.ActionEvent evt)
                {
                    jButton1ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
            jPanel11.setLayout(jPanel11Layout);
            jPanel11Layout.setHorizontalGroup(
                jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addGap(143, 143, 143)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                    .addComponent(jButton1)
                    .addContainerGap())
            );
            jPanel11Layout.setVerticalGroup(
                jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jButton1)
                    .addGap(168, 168, 168))
            );

            javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
            jPanel3.setLayout(jPanel3Layout);
            jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(144, 144, 144))
            );
            jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            );

            getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

            pack();
        }// </editor-fold>//GEN-END:initComponents

    public void clearTextField()
    {
        jTFNameRegister.setText("");
         
        JTFIDReg1.setText(""); 
        
        JTFPasswordReg.setText("");
        
        JTFtopup.setText("");
    }


    
    
 
    
     public void WriteFiles(String files,boolean m)
    {
            try
           {
              FileWriter fw = new FileWriter(files, m);

               BufferedWriter bw = new BufferedWriter(fw);

               for(int i= 0; i<JTPasswordTable.getRowCount(); i++)//rows
               {

                   for(int j =0; j<JTPasswordTable.getColumnCount();j++)
                   {

                       bw.write(JTPasswordTable.getValueAt(i, j).toString()+", ");



                   }
                   bw.newLine();
               }


               bw.close();
               fw.close();

           } 
           catch (IOException ex)
           {
               Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
           }
    }
    
    

    
    
    public void ReadFiles(String l)
    {
        
      FileReader fr = null;
       
        try
        {
            fr = new FileReader(l);
           BufferedReader br = new BufferedReader(fr);
           
           DefaultTableModel model2 =(DefaultTableModel)JTPasswordTable.getModel();
           
           Object[] lines = br.lines().toArray();
           
           for(int i =0; i<lines.length;i++)
           {
               String[] row=lines[i].toString().split(" ");
              
                  // Replace commas with an empty string in each element of the row
            for (int j = 0; j < row.length; j++) {
                row[j] = row[j].replace(",", "");
            }
               
               
                
               model.addRow(row);
           }
        } 
        
        catch (FileNotFoundException ex)
        {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     
        
    }
    

    
    
    
    private void jTFNameRegisterActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTFNameRegisterActionPerformed
    {//GEN-HEADEREND:event_jTFNameRegisterActionPerformed
        
    }//GEN-LAST:event_jTFNameRegisterActionPerformed

    private void JTFIDReg1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_JTFIDReg1ActionPerformed
    {//GEN-HEADEREND:event_JTFIDReg1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFIDReg1ActionPerformed

    private void JTFPasswordRegActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_JTFPasswordRegActionPerformed
    {//GEN-HEADEREND:event_JTFPasswordRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFPasswordRegActionPerformed

    private void JBRegisterUserActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_JBRegisterUserActionPerformed
    {//GEN-HEADEREND:event_JBRegisterUserActionPerformed
        this.name = jTFNameRegister.getText();

        this.id = JTFIDReg1.getText();

        this.password = JTFPasswordReg.getText();
        
        this.topup = JTFtopup.getText();
        
       if(name.contains(",")||id.contains(",")||password.contains(","))
       {
           JOptionPane.showMessageDialog(this, "Please avoid using commas in your input!");
       }
        else if( name.length() == 0|| id.length() == 0|| password.length() == 0)
      {
          JOptionPane.showMessageDialog(this,"Pleae fill up the form!");
      }
 
      else
      {
          String []value = {name,id,password,topup}; 
          
          model.addRow(value);
           
          clearTextField();
      }
        
        
    
        
     
    
    }//GEN-LAST:event_JBRegisterUserActionPerformed

    private void JTPasswordTableMouseReleased(java.awt.event.MouseEvent evt)                                      
    {                                          
        row= JTPasswordTable.getSelectedRow();
        
     
      String name = String.valueOf(model.getValueAt(row, 0));
      
      String id = String.valueOf(model.getValueAt(row, 1));
       
       
      String password = String.valueOf(model.getValueAt(row, 2));
      
      String amount = String.valueOf(model.getValueAt(row, 3));
       
      
     
        jTFNameRegister.setText(name);
         
        JTFIDReg1.setText(id); 
        
        JTFPasswordReg.setText(password);
        
      
    } 
    
    
    private void JBUpdateUserActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_JBUpdateUserActionPerformed
    {//GEN-HEADEREND:event_JBUpdateUserActionPerformed
        this.name = jTFNameRegister.getText();
        this.id = JTFIDReg1.getText();
        this.password = JTFPasswordReg.getText();
        this.topup = JTFtopup.getText();

        // Update the user information in the table model
        model.setValueAt(name, row, 0);
        model.setValueAt(id, row, 1);
        model.setValueAt(password, row, 2);
         model.setValueAt(topup, row, 3);
         

          WriteFiles("C:\\Users\\chiaj\\OneDrive\\Documents\\NetBeansProjects\\Assignment\\src\\assignment\\password.txt",false);

        clearTextField();
        row = -1;
        
       
      
    }//GEN-LAST:event_JBUpdateUserActionPerformed

    private void jBDeleteUserActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jBDeleteUserActionPerformed
    {//GEN-HEADEREND:event_jBDeleteUserActionPerformed
          if(row == -1)
        {
            JOptionPane.showMessageDialog(this, "Please select a row to delete!");
        }
        else{
         // Get the user information from the selected row in JTPasswordTable
        String id = String.valueOf(model.getValueAt(row, 1));

       

        // Update the table model
        model.removeRow(row);

      
              // Clear text fields
        clearTextField();
          row = -1;
          
          WriteFiles("C:\\Users\\chiaj\\OneDrive\\Documents\\NetBeansProjects\\Assignment\\src\\assignment\\password.txt",false);
       
         
        }
      
    }//GEN-LAST:event_jBDeleteUserActionPerformed

    private void JBShowUserActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_JBShowUserActionPerformed
    {//GEN-HEADEREND:event_JBShowUserActionPerformed
        DefaultTableModel model4 = (DefaultTableModel) JTPasswordTable.getModel();
        model4.setRowCount(0);
        
        ReadFiles("C:\\Users\\chiaj\\OneDrive\\Documents\\NetBeansProjects\\Assignment\\src\\assignment\\password.txt");
 

    }//GEN-LAST:event_JBShowUserActionPerformed

    private void JBsaveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_JBsaveActionPerformed
    {//GEN-HEADEREND:event_JBsaveActionPerformed
         //write to password
        
       WriteFiles("C:\\Users\\chiaj\\OneDrive\\Documents\\NetBeansProjects\\Assignment\\src\\assignment\\password.txt",true);
        
    
      
       DefaultTableModel model3 = (DefaultTableModel) JTPasswordTable.getModel();
        model3.setRowCount(0);
      
    }//GEN-LAST:event_JBsaveActionPerformed

    private void JBClearUserActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_JBClearUserActionPerformed
    {//GEN-HEADEREND:event_JBClearUserActionPerformed
        DefaultTableModel model3 = (DefaultTableModel) JTPasswordTable.getModel();
        model3.setRowCount(0);
        
        clearTextField();
    }//GEN-LAST:event_JBClearUserActionPerformed

    private void JBreceiptActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_JBreceiptActionPerformed
    {//GEN-HEADEREND:event_JBreceiptActionPerformed
        this.name = jTFNameRegister.getText();

        this.id= JTFIDReg1.getText();
        
        this.topup = JTFtopup.getText();
        try{
        File f = new File("C:\\Users\\chiaj\\OneDrive\\Documents\\NetBeansProjects\\Assignment\\src\\assignment\\recipt.txt");
        
        FileWriter fw = new FileWriter(f);
        
        

        BufferedWriter bw = new BufferedWriter(fw);
        
        bw.write(toString());
        
        bw.close();
               fw.close();
        } catch (IOException ex)
        {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_JBreceiptActionPerformed
    
    public String toString()
    {
        return "name:"+this.name + "\n" +
               "id:+"+this.id+  "\n" +
               "topup："+this.topup+"\n";
           
    }
    
    private void JBTopupActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_JBTopupActionPerformed
    {//GEN-HEADEREND:event_JBTopupActionPerformed
        this.name = jTFNameRegister.getText();

        this.id = JTFIDReg1.getText();

        this.password = JTFPasswordReg.getText();
        
        this.topup = JTFtopup.getText();
        
        
      try {
    // Get the current amount from the table model, treat null as 0
    String currentAmountStr = (String) model.getValueAt(row, 3);
    double currentAmount = (currentAmountStr != "") ? Double.parseDouble(currentAmountStr) : 0.0;

    // Get the top-up amount from the JTextField
    double topUpAmount = Double.parseDouble(JTFtopup.getText().trim());

    // Calculate the new total amount
    double newAmount = currentAmount + topUpAmount;

    // Update the user information in the table model
    model.setValueAt(name, row, 0);
    model.setValueAt(id, row, 1);
    model.setValueAt(password, row, 2);
    model.setValueAt(String.valueOf(newAmount), row, 3); // Convert to String before updating model
} catch (NumberFormatException e) {
    // Handle the exception gracefully (e.g., show an error message)
    System.err.println("Error parsing amount: " + e.getMessage());
}

              
         WriteFiles("C:\\Users\\chiaj\\OneDrive\\Documents\\NetBeansProjects\\Assignment\\src\\assignment\\password.txt",false);
    }//GEN-LAST:event_JBTopupActionPerformed

    private void JTFtopupActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_JTFtopupActionPerformed
    {//GEN-HEADEREND:event_JTFtopupActionPerformed
        
        

          

   
    }//GEN-LAST:event_JTFtopupActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
         AdminPage a = new AdminPage();
        a.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[])
    {
      
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Register().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBClearUser;
    private javax.swing.JButton JBRegisterUser;
    private javax.swing.JButton JBShowUser;
    private javax.swing.JButton JBTopup;
    private javax.swing.JButton JBUpdateUser;
    private javax.swing.JButton JBreceipt;
    private javax.swing.JButton JBsave;
    private javax.swing.JTextField JTFIDReg1;
    private javax.swing.JTextField JTFPasswordReg;
    private javax.swing.JTextField JTFtopup;
    private javax.swing.JTable JTPasswordTable;
    private javax.swing.JLabel RFLabel;
    private javax.swing.JButton jBDeleteUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFNameRegister;
    // End of variables declaration//GEN-END:variables
}
