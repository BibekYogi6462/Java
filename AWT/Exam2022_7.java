/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AWT;

/**
 *
 * @author Bibek Yogi
 */
import java.sql.*;

public class EmployeeDatabaseExample {

    // JDBC URL, username, and password of MySQL server
    static final String JDBC_URL = "jdbc:mysql://localhost:3306/Company";
    static final String USERNAME = "root";
    static final String PASSWORD = "your_password";

    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // Step 1: Establish connection to database
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

            // Step 2: Insert 5 employee records into Employee table
            String insertQuery = "INSERT INTO Employee (name, salary, department) VALUES (?, ?, ?)";
            preparedStatement = connection.prepareStatement(insertQuery);

            // Sample employee data
            String[] names = {"John Doe", "Jane Smith", "Michael Johnson", "Emily Brown", "David Lee"};
            double[] salaries = {50000.0, 60000.0, 55000.0, 58000.0, 52000.0};
            String[] departments = {"sales", "marketing", "sales", "hr", "sales"};

            for (int i = 0; i < 5; i++) {
                preparedStatement.setString(1, names[i]);
                preparedStatement.setDouble(2, salaries[i]);
                preparedStatement.setString(3, departments[i]);
                preparedStatement.executeUpdate();
            }

            System.out.println("Inserted 5 employee records into Employee table.");

            // Step 3: Query and display records where department is 'sales'
            String selectQuery = "SELECT id, name, salary, department FROM Employee WHERE department = ?";
            preparedStatement = connection.prepareStatement(selectQuery);
            preparedStatement.setString(1, "sales");
            resultSet = preparedStatement.executeQuery();

            System.out.println("\nEmployees in the 'sales' department:");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double salary = resultSet.getDouble("salary");
                String department = resultSet.getString("department");

                System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary + ", Department: " + department);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Step 4: Close all resources
            try {
                if (resultSet != null) resultSet.close();
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

