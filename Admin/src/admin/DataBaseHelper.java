/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author AA
 */
public class DataBaseHelper {
    
    Connection connection;
    
    public DataBaseHelper(Connection connection){
    
        this.connection = connection;
    
    }

    
    public void createTable() throws SQLException{
    
        String query = "CREATE TABLE IF NOT EXISTS students(id int primary key ,name varchar(55),fathername varchar(55),age int,phoneno varchar(55),address varchar(250),degree varchar(50),year varchar(50),courses varchar(250))";
        Statement statement = connection.createStatement();
        statement.execute(query);
    }
    
    public void addRecord(int id,String name,String fatherName,int age,String phoneNo,String address,String degree,String year,String courses) throws SQLException{
    
        String query = "INSERT INTO students VALUES(?,?,?,?,?,?,?,?,?)";
        
        PreparedStatement pStatement = connection.prepareStatement(query);
        pStatement.setInt(1,id);
        pStatement.setString(2,name);
        pStatement.setString(3,fatherName);
        pStatement.setInt(4,age);
        pStatement.setString(5,phoneNo);
        pStatement.setString(6,address);
        pStatement.setString(7,degree);
        pStatement.setString(8,year);
        pStatement.setString(9,courses);
        
        pStatement.execute();
    }
    
     public ResultSet searchById(int id) throws SQLException {
    

            String query = "SELECT* FROM students WHERE id = '" + id + "'";
            Statement pStatement = connection.createStatement();
            
           ResultSet rs = pStatement.executeQuery(query);
           
           if(rs.next()){
           
               return rs;
           
           }
           else return null;
    }
}
