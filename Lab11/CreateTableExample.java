package Lab11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableExample {

    // JDBC URL, username, and password of MySQL server
    static final String URL = "jdbc:mysql://localhost:3306/MySQL";
    static final String USERNAME = "root";
    static final String PASSWORD = "";

    public static void main(String[] args) {
        // SQL statement to create a table
        String createTableSQL = "CREATE TABLE students ("
                + "id INT AUTO_INCREMENT PRIMARY KEY,"
                + "name VARCHAR(255),"
                + "age INT)";

        try {
            // Step 1: Load the database driver
            Class.forName("com.mysql.jdbc.Driver");

            // Step 2: Create connection to database
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            
            // Step 3: Create statement
            Statement statement = connection.createStatement();

            // Step 4: Execute the SQL statement to create the table
            statement.execute(createTableSQL);
            System.out.println("Table 'students' created successfully.");

            // Step 5: Close statement and connection
            statement.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed. ");
            e.printStackTrace();
        }
    }
}
