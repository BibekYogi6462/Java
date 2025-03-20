package Lab11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrieveRecordsExample2 {
    // JDBC URL, username, and password of MySQL server
    static final String URL = "jdbc:mysql://localhost:3306/MySQL";
    static final String USERNAME = "root";
    static final String PASSWORD = "";

    public static void main(String[] args) {
        try {
            // Load the database driver
            Class.forName("com.mysql.jdbc.Driver");

            // Create connection to database
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            // Create statement
            Statement statement = connection.createStatement();

            // SQL query to retrieve all records from the students table
            String selectSQL = "SELECT * FROM students";

            // Execute the query and get a ResultSet
            ResultSet resultSet = statement.executeQuery(selectSQL);

            // Iterate through the ResultSet and print each record
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");

                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }

            // Close ResultSet, Statement, and Connection
            resultSet.close();
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
