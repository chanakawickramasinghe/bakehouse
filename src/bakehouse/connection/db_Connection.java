/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class db_Connection {
    
    
    public java.sql.Connection cn;
    public PreparedStatement st;
    ResultSet rs=null;
    public void buildConnection()
    {
        //initComponents();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn=(java.sql.Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/bakehouse?zeroDateTimeBehavior=convertToNull","root","");
            JOptionPane.showMessageDialog(null, "conneted");
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Not conneted");
        }
      
    }
    public static void main(String args[])
    {
       
    }
}
