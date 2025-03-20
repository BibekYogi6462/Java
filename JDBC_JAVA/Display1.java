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
import java.sql.*;

public class Display1 {
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
         Statement statement = connection.createStatement();
         
         String query = "SELECT * from students";
         ResultSet resultSet = statement.executeQuery(query);
         while(resultSet.next())
         {
             int id = resultSet.getInt("id");
             String name = resultSet.getString("name");
             int age = resultSet.getInt("age");
             int marks = resultSet.getInt("marks");
             System.out.println("Id: "+id);
             System.out.println("Name: "+name);
             System.out.println("Age: "+age);
             System.out.println("Marks: "+marks);
        
         }
         
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            
        }
        
        
        
    }
}
