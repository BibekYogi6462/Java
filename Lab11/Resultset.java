/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab11;

/**
 *
 * @author Bibek Yogi
 */
import java.sql.*;
public class Resultset {
     static final String URL = "jdbc:mysql://localhost:3306/orchid";
    static final String User = "root";
    static final String Pwd = "";
    public static void main(String[] args) {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(URL,User,Pwd);
        Statement statement = connection.createStatement();
        String retrive = "SELECT * FROM employees";
        ResultSet resultSet = statement.executeQuery(retrive);

        while(resultSet.next())
        {
            int id = resultSet.getInt("id");
            String username = resultSet.getString("username");
            String password = resultSet.getString("password");
            String email = resultSet.getString("email");
            
            System.out.println("id: "+id+ " usernmae : "+username+" password: "+password+"Email: "+email);
        }
        
        
        
        }
        catch(SQLException e)
        {
            System.out.println("Eirrogn");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Eroor%");
        }
        
    }
}
