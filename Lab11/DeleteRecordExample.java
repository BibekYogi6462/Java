package Lab11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecordExample {
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

            // SQL query to delete the student with id 1
            String deleteSQL = "DELETE FROM students WHERE id = 1";

            // Step 4: Execute the SQL query to delete the record
            int rowsAffected = statement.executeUpdate(deleteSQL);
            if (rowsAffected > 0) {
                System.out.println("Record deleted successfully.");
            } else {
                System.out.println("No rows affected.");
            }

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
