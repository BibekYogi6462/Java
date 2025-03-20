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

/**
 *
 * @author Bibek Yogi
 */
public class PS_Update {
    
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
         String query = "UPDATE students SET marks = ? WHERE id = ?";
//         String query = "DELETE FROM students where id = ?";
         
         PreparedStatement preparedStatement = connection.prepareStatement(query);
         preparedStatement.setInt(1,98);
         preparedStatement.setInt(2,3);
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
