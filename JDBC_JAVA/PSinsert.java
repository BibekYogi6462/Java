/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC_JAVA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Bibek Yogi
 */
public class PSinsert {
      private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String username="root";
    private static final String password="";
    
    public static void main(String[] args) {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
//            System.out.println(e.getMessage());
        }
        
        try{
         Connection connection =    DriverManager.getConnection(url,username,password);
         String query = "SELECT marks from students WHERE id = ?";
         
         PreparedStatement preparedStatement = connection.prepareStatement(query);
         preparedStatement.setInt(1,1);
         ResultSet resultSet = preparedStatement.executeQuery();
         if(resultSet.next())
         {
             int marks = resultSet.getInt("Marks");
             System.out.println("Marks: "+marks);
         }
         else{
             System.out.println("Not found");
         }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            
        }
        
        
        
    }
}