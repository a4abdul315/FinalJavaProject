/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author AA
 */
public class ConnectionConfiguration {
    
     public static Connection  getConnection() throws SQLException{
       
           Connection conn = null;
    
           try {
               Class.forName("com.mysql.cj.jdbc.Driver");
               conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_portal","root","");
               
          
               
           } catch (ClassNotFoundException ex) {
               System.out.println("Connector Not Loaded");
           }
       
           return conn;
           
           
                  
       }
     
}
