/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.sql.SQLException;

/**
 *
 * @author AA
 */
public class Admin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignIn().setVisible(true);
            }
        });
        
    }
    
}
