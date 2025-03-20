/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC_JAVA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Bibek Yogi
 */
public class Update {
    
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
         
         String query = String.format("UPDATE students SET marks = %d where id=%d",0,2);
         int rowsAffected = statement.executeUpdate(query);
        if(rowsAffected>0){
            System.out.println("Data updated Sucessfully");
                    
        }
        else{
            System.out.println("Not affected");
        }
         
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            
        }
        
        
        
    }
}
