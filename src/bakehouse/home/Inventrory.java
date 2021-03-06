/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;
import home.Home.*;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author AMOD_PC
 */
public class Inventrory extends javax.swing.JFrame {

    
    public Connection cn;
    public PreparedStatement st;
    ResultSet rs=null;
    public Inventrory() {
        initComponents();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/bakehouse?zeroDateTimeBehavior=convertToNull","root","");
            JOptionPane.showMessageDialog(null, "conneted");
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Not conneted");
        }
          try{
              String sql="SELECT * FROM inventory ";
              st = cn.prepareStatement(sql);
              rs=st.executeQuery();
              DefaultTableModel tm=(DefaultTableModel)table4.getModel();
              tm.setRowCount(0);
              while(rs.next())
              {
                  //Object o[]={(rs.getInt("id"))};
                  Object o[]={rs.getString("code"),rs.getString("name"),rs.getString("catergory"),rs.getDouble("price"),rs.getString("size"),rs.getInt("quantity")};
                  tm.addRow(o);
              }
          }
          catch(Exception e)
          {
              JOptionPane.showMessageDialog(null, "Not Working the Search Query");
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

        btnAdd = new javax.swing.JButton();
        table2 = new javax.swing.JScrollPane();
        table4 = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnUpadate = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        txtCode = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtCatergory = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtSize = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        table4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Code", "Name", "Catergory", "Price", "Size", "Quantity"
            }
        ));
        table4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table4MouseClicked(evt);
            }
        });
        table2.setViewportView(table4);

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpadate.setText("UPDATE");
        btnUpadate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpadateActionPerformed(evt);
            }
        });

        btnSearch.setText("Show Inventory");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel1.setText("Code");

        jLabel2.setText("Name");

        jLabel3.setText("Catergory");

        jLabel4.setText("Price");

        jLabel5.setText("Size");

        jLabel6.setText("Quantity");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnUpadate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCatergory, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(table2)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCatergory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpadate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(table2, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void ClearTextFeilds()
    {
        txtCode.setText(null);
        txtName.setText(null);
        txtCatergory.setText(null);
        txtPrice.setText(null);
        txtSize.setText(null);
        txtQuantity.setText(null);
    }
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
         try
        {
              String code=txtCode.getText();
              int quantity=Integer.parseInt(txtQuantity.getText());
              String name=txtName.getText();
              String catergory=txtCatergory.getText();
              String size=txtSize.getText();
              double price=Double.parseDouble(txtPrice.getText());
              String sqll="INSERT INTO inventory(code,name,catergory,price,size,quantity) VALUES ('"+code+"','"+name+"','"+catergory+"','"+price+"','"+size+"','"+quantity+"')";            
              st = cn.prepareStatement(sqll);
              st.execute();
              
              JOptionPane.showMessageDialog(null,"Inserted");
        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null,"Error");  
        }
         
         //Empty the text feilds
         ClearTextFeilds();
         //REFRESH
          try{
              String sql="SELECT * FROM inventory ";
              st = cn.prepareStatement(sql);
              rs=st.executeQuery();
              DefaultTableModel tm=(DefaultTableModel)table4.getModel();
              tm.setRowCount(0);
              while(rs.next())
              {
                  
                  Object o[]={rs.getString("code"),rs.getString("name"),rs.getString("catergory"),rs.getDouble("price"),rs.getString("size"),rs.getInt("quantity")};
                  tm.addRow(o);
              }
          }
          catch(Exception e)
          {
              JOptionPane.showMessageDialog(null, "Not Working the Search Query");
          }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpadateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpadateActionPerformed
        try
        {
            
            String code=txtCode.getText();
              int quantity=Integer.parseInt(txtQuantity.getText());
              String name=txtName.getText();
              String catergory=txtCatergory.getText();
              String size=txtSize.getText();
              double price=Double.parseDouble(txtPrice.getText());
                  
              String sql2="Update inventory set name='"+name+"', catergory='"+catergory+"', price='"+price+"',size='"+size+"', quantity='"+quantity+"' where code='"+code+"' ";

              st = cn.prepareStatement(sql2);
              st.execute();
              
              JOptionPane.showMessageDialog(null,"UPDATED");
        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null,"Error:UPDATE");  
        }
        //Empty the text feilds
         ClearTextFeilds();
         //REFRESH
         try{
              String sql="SELECT * FROM inventory ";
              st = cn.prepareStatement(sql);
              rs=st.executeQuery();
              DefaultTableModel tm=(DefaultTableModel)table4.getModel();
              tm.setRowCount(0);
              while(rs.next())
              {
                  //Object o[]={(rs.getInt("id"))};
                  Object o[]={rs.getString("code"),rs.getString("name"),rs.getString("catergory"),rs.getDouble("price"),rs.getString("size"),rs.getInt("quantity")};
                  tm.addRow(o);
              }
          }
          catch(Exception e)
          {
              JOptionPane.showMessageDialog(null, "Not Working the Search Query");
          }
    }//GEN-LAST:event_btnUpadateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
       
    }//GEN-LAST:event_btnSearchActionPerformed

    private void table4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table4MouseClicked
           
        DefaultTableModel tbl4= (DefaultTableModel)table4.getModel();
        
        String Code=tbl4.getValueAt(table4.getSelectedRow(),0).toString();
        String Name=tbl4.getValueAt(table4.getSelectedRow(),1).toString();
        String Catergory=tbl4.getValueAt(table4.getSelectedRow(),2).toString();
        String Price=tbl4.getValueAt(table4.getSelectedRow(),3).toString();
        String Size=tbl4.getValueAt(table4.getSelectedRow(),4).toString();
        String Quantity=tbl4.getValueAt(table4.getSelectedRow(),5).toString();
        
        txtCode.setText(Code);
        txtName.setText(Name);
        txtCatergory.setText(Catergory);
        txtPrice.setText(Price);
        txtSize.setText(Size);
        txtQuantity.setText(Quantity);
        
        
         
        
        
            
    }//GEN-LAST:event_table4MouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
     
        try
        {
            
            String code=txtCode.getText();
              int quantity=Integer.parseInt(txtQuantity.getText());
              String name=txtName.getText();
              String catergory=txtCatergory.getText();
              String size=txtSize.getText();
              double price=Double.parseDouble(txtPrice.getText());
                  
              String sql2="Delete from inventory where code='"+code+"' ";

              st = cn.prepareStatement(sql2);
              st.execute();
              
              JOptionPane.showMessageDialog(null,"DELETED");
        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null,"Error:DELETE");  
        }
        //Empty the text feilds
         ClearTextFeilds();
         //REFRESH
         try{
              String sql="SELECT * FROM inventory ";
              st = cn.prepareStatement(sql);
              rs=st.executeQuery();
              DefaultTableModel tm=(DefaultTableModel)table4.getModel();
              tm.setRowCount(0);
              while(rs.next())
              {
                  //Object o[]={(rs.getInt("id"))};
                  Object o[]={rs.getString("code"),rs.getString("name"),rs.getString("catergory"),rs.getDouble("price"),rs.getString("size"),rs.getInt("quantity")};
                  tm.addRow(o);
              }
          }
          catch(Exception e)
          {
              JOptionPane.showMessageDialog(null, "Not Working the Search Query");
          }
    }//GEN-LAST:event_btnDeleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        //Home obj=new Home();
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
            java.util.logging.Logger.getLogger(Inventrory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventrory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventrory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventrory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventrory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpadate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane table2;
    private javax.swing.JTable table4;
    private javax.swing.JTextField txtCatergory;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSize;
    // End of variables declaration//GEN-END:variables
}
