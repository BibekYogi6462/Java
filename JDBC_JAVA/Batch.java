/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC_JAVA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author Bibek Yogi
 */
public class Batch {
    
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
         Scanner scanner = new Scanner(System.in);
         while(true)
         {
             System.out.println("Enter Name: ");
             String name = scanner.next();
             System.out.println("Enter age");
             int age = scanner.nextInt();
             System.out.println("Enter Marks");
             int marks = scanner.nextInt();
             System.out.println("Enter more data(y/N)");
             String choice = scanner.next();
             String query = String.format("INSERT INTO students(name, age, marks) VALUES ('%s',%d,%d)",name, age,marks);
             Statement statement = connection.createStatement();
             statement.addBatch(query);
             
             if(choice.toUpperCase().equals("N")){
                 break;
             }
             
         }
         int[] arr = statement.executeBatch();
                 if(rowsAffected>0){
            System.out.println("Data inserted Sucessfully");
                    
        }
        else{
            System.out.println("Not affected");
        }
//         String query = String.format("INSERT INTO students (name, age , marks) VALUES ('%s',%d,%d )");
//         
//         PreparedStatement preparedStatement = connection.prepareStatement(query);
//         preparedStatement.setInt(1,98);
//         preparedStatement.setInt(2,3);
//         int rowsAffected = preparedStatement.executeUpdate();
//        if(rowsAffected>0){
//            System.out.println("Data inserted Sucessfully");
//                    
//        }
//        else{
//            System.out.println("Not affected");
//        }
//         
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            
        }
        
        
    }
    }
