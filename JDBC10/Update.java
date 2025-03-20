package JDBC10;

import java.sql.*;

public class Update {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/orchid";
        String uname = "root";
        String pwd = "";

        try {
         
            Class.forName("com.mysql.jdbc.Driver");

            Connection conn = DriverManager.getConnection(url, uname, pwd);
           
            String sql = "UPDATE users SET name = 'UpdatedName' WHERE id = 3";

            Statement st = conn.createStatement();
            st.executeUpdate(sql);

            conn.close();
            System.out.println("Operation successful.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


