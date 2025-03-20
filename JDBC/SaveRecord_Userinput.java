/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.jar.Attributes.Name;

/**
 *
 * @author Bibek Yogi
 */
public class SaveRecord_Userinput {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/orchid";
        String uname = "root";
        String pwd = "";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, uname, pwd);
            
            String sql = "Insert into users(name,email,phone) VALUES (')";
            PreparedStatement st = con.prepareStatement(sql,)
            st.setString(1,Name);
            
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
}
