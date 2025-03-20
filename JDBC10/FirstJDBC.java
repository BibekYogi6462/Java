/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC10;

import java.sql.*;

/**
 *
 * @author Bibek Yogi
 */
public class FirstJDBC {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            // Creating a connection
            String url = "jdbc:mysql://localhost:3306/orchid";
            String username = "root";
            String password = "";
            
            Connection con = DriverManager.getConnection(url, username, password);
        
                if (con.isClosed()) {
                    System.out.println("Connection not built");
                } else {
                    System.out.println("Connection created");
                }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
