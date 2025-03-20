/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Bibek Yogi
 */
public class SaveRecord {
    public static void main(String[] args) {
        String url = "jdbs:mysql://localhost:3306/mydatabase";
        String uname = "root";
        String pwd = "";
        
        
        try{
            //Step 1: Load the database driver
//            Class.forName("com.mysql.jdbc.Driver");
            
            //Step 2: Create connection tom database
            Connection con = (Connection) DriverManager.getConnection(url,uname,pwd);
            
            //Step 3: Create sql qvalues and execute it.
            //String sql = "Insert into tbl_person VALUES ()
            
            //Insertion
            String sql = "insert into users (username,password) VALUES ('Ram','**********')";
            
            // to update tbl_person
            // String sql = "Update tbl_person set Salary
            //to delete
            // String sql = "delete from tbl_person 
            
        }
        catch(Exception ex){
            System.out.println(ex);
            
        }
    }
}
