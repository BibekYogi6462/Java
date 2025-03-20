/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC_JAVA;

/**
 *
 * @author Bibek Yogi
 */
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DropTableExample {

    // JDBC URL, username, and password of MySQL server
    static final String URL = "jdbc:mysql://localhost:3306/MySQL";
    static final String USERNAME = "root";
    static final String PASSWORD = "";

    public static void main(String[] args) {
        // SQL statement to drop the table
        String dropTableSQL = "DROP TABLE IF EXISTS students";

        try {
            // Step 1: Load the database driver
            Class.forName("com.mysql.jdbc.Driver");

            // Step 2: Create connection to database
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            
            // Step 3: Create statement
            Statement statement = connection.createStatement();

            // Step 4: Execute the SQL statement to drop the table
            statement.execute(dropTableSQL);
            System.out.println("Table 'students' dropped successfully.");

            // Step 5: Close statement and connection
            statement.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found. Include it in your library path");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed. Check output console");
            e.printStackTrace();
        }
    }
}
