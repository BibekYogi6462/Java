package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertRecord {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/orchid";
        String uname = "root";
        String pwd = "";

        Connection con = null;
        PreparedStatement pst = null;

        try {
            // Load and register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // Establish a connection
            con = DriverManager.getConnection(url, uname, pwd);

            // SQL query to insert data
            String sql = "INSERT INTO users (id, name, email) VALUES (?, ?, ?)";

            // Prepare the statement
            pst = con.prepareStatement(sql);
            pst.setInt(1, 1); // Set ID value
            pst.setString(2, "John Doe"); // Set name value
            pst.setString(3, "123 Elm Street"); // Set address value

            // Execute the insert operation
            int rowsAffected = pst.executeUpdate();

            // Print the result
            if (rowsAffected > 0) {
                System.out.println("A new user was inserted successfully!");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            // Close PreparedStatement
            if (pst != null) {
                try {
                    pst.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            // Close Connection
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
