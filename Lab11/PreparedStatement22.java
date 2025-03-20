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
public class PreparedStatement22 {
    static final String URL = "jdbc:mysql://localhost:3306/orchid";
    static final String User = "root";
    static final String Pwd = "";

    public static void main(String[] args) {
        try
        {
         Class.forName("com.mysql.jdbc.Driver");
         Connection connection = DriverManager.getConnection(URL,User,Pwd);
         String insertSql = "INSERT INTO employees (username,password,email) VALUES (?,?,?)";
          PreparedStatement preparedStatement = connection.prepareStatement(insertSql);
          
          preparedStatement.setString(1,"KALEVAI");
          preparedStatement.setString(2,"KALEVAI");
          preparedStatement.setString(3,"KALEVAI");
          
          int rowsAffected = preparedStatement.executeUpdate();
          if(rowsAffected>0)
          {
              System.out.println("Inserted");
          }
          connection.close();
          preparedStatement.close();
     
        }
        catch(SQLException e)
        {
            System.out.println("SQL eroor");
            
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Failed");
        }
    }
    
}

