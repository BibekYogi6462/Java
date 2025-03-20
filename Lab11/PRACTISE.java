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

public class PRACTISE {
    static final String URL = "jdbc:mysql://localhost:3306/orchid";
    static final String Username = "root";
    static final String Password = "";
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL,Username,Password);
            Statement statement = connection.createStatement();
            String insertSql = "UPDATE employees SET username='RAMERSJOW' where id=11";
            int rowsAffected = statement.executeUpdate(insertSql);
            if(rowsAffected > 0)
            {
                System.out.println("Inserted Sucessfully");
                
            }
            else{
             
                System.out.println("Not inserted bro");
                
            }

            connection.close();
            statement.close();
        }
        catch(SQLException e){
            System.out.println(e);
        }
        
        catch(ClassNotFoundException e)
        {
            System.out.println(e);
        }
    }
}

