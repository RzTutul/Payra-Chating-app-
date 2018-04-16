/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat_client;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author rztut
 */
public class MySqlConnector {
    Connection con =null;
    
    public static Connection ConnectDB()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/payra","root","");
            
          
            return conn;
          
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
        }
      return  ConnectDB();
    }
    
}
