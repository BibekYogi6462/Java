/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC10;

import java.sql.*;

/**
 * Inserts a record into the users table in the orchid database.
 * 
 * @author Bibek Yogi
 */
public class InsertJ {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Update the driver class name

            // Creating a connection
            String url = "jdbc:mysql://localhost:3306/orchid";
            String username = "root";
            String password = "";

            Connection con = DriverManager.getConnection(url, username, password); 

            // Create a query
            String q = "INSERT INTO users (id,name) VALUES (?, ?)";

            PreparedStatement pstmt = con.prepareStatement(q);

            // Set the values to query
            pstmt.setInt(1, 4);
            pstmt.setString(2, "Jaggu BAndar");
           

            pstmt.executeUpdate();

            System.out.println("Record inserted successfully.");

            con.close();        

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
