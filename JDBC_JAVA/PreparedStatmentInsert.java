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

/**
 *
 * @author Bibek Yogi
 */
public class PreparedStatmentInsert {
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
         String query = "INSERT INTO students(name,age,marks)VALUES(?,?,?)";
         
         PreparedStatement preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1,"Bibek");
         preparedStatement.setInt(2,25);
         preparedStatement.setInt(3,85);
         int rowsAffected = preparedStatement.executeUpdate();
        if(rowsAffected>0){
            System.out.println("Data inserted Sucessfullt");
                    
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
