package JDBC10;

import java.sql.*;

public class SaveRecords {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/orchid";
        String uname = "root";
        String pwd = "";

        try {
       
            Class.forName("com.mysql.jdbc.Driver");

            Connection conn = DriverManager.getConnection(url, uname, pwd);

           

            // To delete a record
            String sql = "DELETE FROM users WHERE id = 3";

            

            Statement st = conn.createStatement();

            
            st.close();

            // Close the connection
            conn.close();
            System.out.println("Operation successful.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
