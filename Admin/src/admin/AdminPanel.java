/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AA
 */
public class AdminPanel extends javax.swing.JFrame {
    
  

    /**
     * Creates new form AdminPanel
     */
    public AdminPanel() throws ClassNotFoundException, SQLException {
        initComponents();
        setTitle("AA Colleges (Admin Panel)");
        
       Connection conn = ConnectionConfiguration.getConnection();
       if(conn != null){
       
        Statement st=conn.createStatement();
        //query
        String sql = "select * from students";
        ResultSet rs=st.executeQuery(sql);
        
        while(rs.next()){
            //data will be added
                String sname=rs.getString("name");
                int sid=rs.getInt("id");
                String sfathername=rs.getString("fathername");
                String sage=rs.getString("age");
                String saddress=rs.getString("address");
                String sdegree=rs.getString("degree");
                String syear=rs.getString("year");
                String sphoneno=rs.getString("phoneno");
                String scourses=rs.getString("courses");
    
                
                String tbData[]={sname,String.valueOf(sid),sfathername,sage,saddress,sdegree,syear,sphoneno,scourses};
                DefaultTableModel tblModel=(DefaultTableModel)table.getModel();
                tblModel.addRow(tbData);
        }
       
       }
       
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        tfSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnShowAll = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        tfDelete = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(40, 100));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADMIN PANEL");

        btnRegister.setText("Register a Student");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        tfSearch.setText("Type an ID here to search");
        tfSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfSearchFocusLost(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "ID", "Father Name", "Age", "Address", "Degree", "Year", "Phone No", "Courses"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Short.class, java.lang.String.class, java.lang.Short.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table.setToolTipText("");
        table.setColumnSelectionAllowed(true);
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table.setName(""); // NOI18N
        table.setOpaque(false);
        table.setSurrendersFocusOnKeystroke(true);
        table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table);
        table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        btnShowAll.setText("Show All");
        btnShowAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAllActionPerformed(evt);
            }
        });

        btnLogout.setText("Log Out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tfDelete.setText("Type an ID here to delete");
        tfDelete.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfDeleteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfDeleteFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnShowAll, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(420, 420, 420))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegister, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                        .addComponent(tfDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnShowAll, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
    
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
        dispose();
        
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void tfSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfSearchFocusGained

        if(tfSearch.getText().equals("Type an ID here to search")){
        
            tfSearch.setText("");
        
        }
        
    }//GEN-LAST:event_tfSearchFocusGained

    private void tfSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfSearchFocusLost
       
        if(tfSearch.getText().isEmpty()){
     
            tfSearch.setText("Type an ID here to search");
        
        }
     
    }//GEN-LAST:event_tfSearchFocusLost

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
      
         String id = tfSearch.getText().toString().trim();
         DefaultTableModel tblModel=(DefaultTableModel)table.getModel();
         Connection conn = null;
            try {
                conn = ConnectionConfiguration.getConnection();
            } catch (SQLException ex) {
                ex.getStackTrace();
            }
          
                if(conn != null){

                System.out.println("Database Connected");
                DataBaseHelper dbHelper = new DataBaseHelper(conn);
                ResultSet search = null;
             
                 try {
                     
                     search = dbHelper.searchById(Integer.parseInt(id));
                     
                     
                 } catch (SQLException ex) {
                     ex.printStackTrace();
                 }
                 
                if(search != null){
               
                 for (int i = tblModel.getRowCount() - 1; i >= 0; i--) {
 
                     tblModel.removeRow(i);
                 }
                 
             }else JOptionPane.showMessageDialog(rootPane,"ID Not Found"); 
            }else System.out.println("Database Not Connected");
        
            ResultSet rs=null;
            try {
                rs=function();
            } catch (SQLException ex) {
                Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            try{
                if(rs.next()){
                    tfSearch.setText(String.valueOf(id));
                    String sname=rs.getString("name");
                    int sid=rs.getInt("id");
                    String sfathername=rs.getString("fathername");
                    String sage=rs.getString("age");
                    String saddress=rs.getString("address");
                    String sdegree=rs.getString("degree");
                    String syear=rs.getString("year");
                    String sphoneno=rs.getString("phoneno");
                    String scourses=rs.getString("courses");


                    String tbData[]={sname,String.valueOf(sid),sfathername,sage,saddress,sdegree,syear,sphoneno,scourses};
                    tblModel=(DefaultTableModel)table.getModel();
                    tblModel.addRow(tbData);


                }
                else{
                    System.out.println(" ");
                }
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAllActionPerformed
       
        showAllStudentsData();
        
    }//GEN-LAST:event_btnShowAllActionPerformed

    public void showAllStudentsData() {
        DefaultTableModel tblModel=(DefaultTableModel)table.getModel();
         Connection conn = null;
            try {
                conn = ConnectionConfiguration.getConnection();
            } catch (SQLException ex) {
                ex.getStackTrace();
            }
          
         if(conn != null){

             System.out.println("Database Connected");
             DataBaseHelper dbHelper = new DataBaseHelper(conn);
        
        
               
                 for (int i = tblModel.getRowCount() - 1; i >= 0; i--) {
 
                     tblModel.removeRow(i);
                 }
         
       
        Statement st=null;
            try {
                st = conn.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        //query
        String sql = "select * from students";
        ResultSet rs=null;
            try {
                rs = st.executeQuery(sql);
            } catch (SQLException ex) {
                Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            try {
                while(rs.next()){
                    //data will be added
                    String sname=rs.getString("name");
                    int sid=rs.getInt("id");
                    String sfathername=rs.getString("fathername");
                    String sage=rs.getString("age");
                    String saddress=rs.getString("address");
                    String sdegree=rs.getString("degree");
                    String syear=rs.getString("year");
                    String sphoneno=rs.getString("phoneno");
                    String scourses=rs.getString("courses");
                    
                    
                    String tbData[]={sname,String.valueOf(sid),sfathername,sage,saddress,sdegree,syear,sphoneno,scourses};
                    tblModel=(DefaultTableModel)table.getModel();
                    tblModel.addRow(tbData);       
                }   } catch (SQLException ex) {
                Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
         
         }else 
             System.out.println("Database Not Connected");
        
    }
    
    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignIn().setVisible(true);
            }
        });
        dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       Connection conn;
        try {
            conn = ConnectionConfiguration.getConnection();
            Statement st;
            st = conn.createStatement();
            
            String sql = "DELETE FROM students " +
                   "WHERE id = "+"'"+tfDelete.getText()+"'";
            int rs = st.executeUpdate(sql);

            showAllStudentsData();
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfDeleteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDeleteFocusGained
        // TODO add your handling code here:
        if(tfDelete.getText().equals("Type an ID here to delete")){
       
            tfDelete.setText("");
        
        }
        
    }//GEN-LAST:event_tfDeleteFocusGained

    private void tfDeleteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDeleteFocusLost
        // TODO add your handling code here:
        
        if(tfDelete.getText().isEmpty()){
        
            tfDelete.setText("Type an ID here to delete");
        
        }
        
    }//GEN-LAST:event_tfDeleteFocusLost

    public ResultSet function() throws SQLException{
        
      Connection conn = ConnectionConfiguration.getConnection();
       Statement st=conn.createStatement();
        //query
        String sql = "select * from students where id="+"'"+tfSearch.getText()+"'";
        ResultSet rs=st.executeQuery(sql);
        
          
        return rs;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnShowAll;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField tfDelete;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables
}
