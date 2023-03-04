/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentportal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AA
 */
public class DataBaseHelper {
    
    Connection connection;
    
    public DataBaseHelper(Connection connection){
    
        this.connection = connection;
    
    }
    
    public String searchById(int id) throws SQLException {
    

            String query = "SELECT* FROM students WHERE id = '" + id + "'";
            Statement pStatement = connection.createStatement();
            
           ResultSet rs = pStatement.executeQuery(query);
           
           if(rs.next()){
           
               return rs.getString("name");
           
           }
           else return null;

    }
}
