/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package chat;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Manish
 */
public class tryfv extends javax.swing.JFrame {
ResultSet rs1;
     Connection conn=null,con2=null;
    PreparedStatement stmt=null,p=null;
    
     
    ResultSet r;
    /**
     * Creates new form tryfv
     */
    public tryfv() {
        initComponents();
        this.setLocationRelativeTo(null);
        
      this.getContentPane().setBackground(Color.white);
    }
    
    
    
  
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Update");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Check");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User name", "password", "name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                            .addComponent(jTextField1))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jButton4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
       
          try{
            String url = "jdbc:mysql://localhost:3306/phone";
            String uname ="root";
            String password = "manumani";
            
            String query ="INSERT into phone7 values(?,?,?)";
            
            conn = DriverManager.getConnection(url,uname,password);
            
            stmt = conn.prepareStatement(query);
            stmt.setString(1, jTextField1.getText());
            stmt.setString(2, jTextField2.getText());
            stmt.setString(3, jTextField3.getText());
            
           
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "DONE");
            
            
            jTextField1.setText("");
           jTextField2.setText("");
            jTextField3.setText("");
           
            
            
            
        }
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PreparedStatement p;
        
        
         try {
            String url = "jdbc:mysql://localhost:3306/phone";
            String uname ="root";
            String password = "manumani";
            
            String query ="SELECT * FROM `phone7` WHERE `uname` = ?";
            
             conn = DriverManager.getConnection(url,uname,password);
             
              p = conn.prepareStatement(query);             
            p.setString(1, jTextField1.getText());
            rs1 = p.executeQuery();
            if(rs1.next() == true)
            {
                
                 
                  String id = rs1.getString("pass");
                   String id2 = rs1.getString("name");
               
                

                jTextField2.setText(id);
                 jTextField3.setText(id2);
                
                String username = rs1.getString("uname");
                String username1 = rs1.getString("pass");
                 String username2 = rs1.getString("name");
                
                
                
                String tbData[] = {username,username1,username2};
                DefaultTableModel tblModel =(DefaultTableModel)table.getModel();
               
                tblModel.addRow(tbData);
                
                

            }

            else
            {
               
                JOptionPane.showMessageDialog(null,"Account Not found");
                jTextField1.setText("");
                jTextField2.setText("");

            }

        } 
        catch (SQLException ex) {
           
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
          PreparedStatement p;
        
        
         try {
            String url = "jdbc:mysql://localhost:3306/phone";
            String uname ="root";
            String password = "manumani";
            
            String query ="SELECT * FROM `phone4` WHERE `pass` =pass AND `uname` = ?";
            
             conn = DriverManager.getConnection(url,uname,password);
             
              p = conn.prepareStatement(query);
            p.setString(1, jTextField1.getText());
            rs1 = p.executeQuery();
            if(rs1.next() == true)
            {
                
                 
                  String id = rs1.getString("pass");
               
                

                jTextField2.setText(id);
                
                String username = rs1.getString("uname");
                String username1 = rs1.getString("pass");
                
                
                
                String tbData[] = {username,username1};
                DefaultTableModel tblModel =(DefaultTableModel)table.getModel();
               
                tblModel.addRow(tbData);
                
              
                
                

            }

            else
            {
               
                JOptionPane.showMessageDialog(null,"Account Not found");
                jTextField1.setText("");
                jTextField2.setText("");

            }
            
             DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
        
        if(table.getSelectedRowCount() ==1)
        {
            String a = jTextField1.getText();
            String b = jTextField2.getText();
           
            
            tblModel.setValueAt(a, table.getSelectedRow(), 0);
            tblModel.setValueAt(b, table.getSelectedRow(), 1);
          
            
            JOptionPane.showMessageDialog(this, "Update Successfull...");
        }

        } 
        catch (SQLException ex) {
           
        }
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          try {
            String url = "jdbc:mysql://localhost:3306/phone";
            String uname ="root";
            String password = "manumani";
            
           
            
             conn = DriverManager.getConnection(url,uname,password);
             
           String query ="update phone7 set pass='"+jTextField2.getText()+"', name='"+jTextField3.getText()+"' where uname ='"+jTextField1.getText()+"'";
             
            stmt=conn.prepareStatement(query);
          
    
           
            
            stmt.executeUpdate();
             JOptionPane.showMessageDialog(null, "DONE");
             
           
             DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
        
        if(table.getSelectedRowCount() ==1)
        {
            String a = jTextField1.getText();
            String b = jTextField2.getText();
             String c = jTextField3.getText();
           
            
            tblModel.setValueAt(a, table.getSelectedRow(), 0);
            tblModel.setValueAt(b, table.getSelectedRow(), 1);
             tblModel.setValueAt(c, table.getSelectedRow(), 2);
          
            
            JOptionPane.showMessageDialog(this, "Update Successfull...");
        }

             
        
     

        } 
        catch (SQLException ex) {
           
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try{
        String url = "jdbc:mysql://localhost:3306/phone";
            String uname ="root";
            String password = "manumani";
            
            String query ="SELECT * FROM `phone7` WHERE `uname` =? AND `pass` =?";
            
             conn = DriverManager.getConnection(url,uname,password);
             
              p = conn.prepareStatement(query);
            p.setString(1, jTextField1.getText());
            p.setString(2, jTextField2.getText());
            
            r = p.executeQuery();
           
           if(r.next())
           {
              String query2 ="SELECT * FROM `phone7` WHERE `uname` = ?";
              
             conn = DriverManager.getConnection(url,uname,password);
             
              p = conn.prepareStatement(query2);             
            p.setString(1, jTextField1.getText());
            rs1 = p.executeQuery();
            if(rs1.next() == true)
            {
                
                                 
                String username = rs1.getString("uname");
                String username1 = rs1.getString("pass");
                 String username2 = rs1.getString("name");
                
                
                
                String tbData[] = {username,username1,username2};
                DefaultTableModel tblModel =(DefaultTableModel)table.getModel();
               
                tblModel.addRow(tbData);
                
                

            }

           }
           else
           {
               JOptionPane.showMessageDialog(null, "Failed To Login Retry..");
           }
           
             
      }
      
      catch(Exception e)
      {
          
      }

    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(tryfv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tryfv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tryfv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tryfv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tryfv().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
