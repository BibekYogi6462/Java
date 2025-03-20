package Lab11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecordExample {
    // JDBC URL, username, and password of MySQL server
    static final String URL = "jdbc:mysql://localhost:3306/MySQL";
    static final String USERNAME = "root";
    static final String PASSWORD = "";

    public static void main(String[] args) {
        try {
            // Step 1: Load the database driver
            Class.forName("com.mysql.jdbc.Driver");

            // Step 2: Create connection to database
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            // Step 3: Create statement
            Statement statement = connection.createStatement();

            // SQL query to update the age of the student with id 1
            String updateSQL = "UPDATE students SET age = 21 WHERE id = 1";

            // Step 4: Execute the SQL query to update the record
            int rowsAffected = statement.executeUpdate(updateSQL);
            if (rowsAffected > 0) {
                System.out.println("Record updated successfully.");
            } else {
                System.out.println("No rows affected.");
            }

            // Step 5: Close statement and connection
            statement.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
        }
    }
}
