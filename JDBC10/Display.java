package JDBC10;

import java.sql.*;

public class Display {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/orchid";
        String uname = "root";
        String pwd = "";

        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");

        
            Connection conn = DriverManager.getConnection(url, uname, pwd);

         
            String sql = "SELECT * FROM users";

            Statement st = conn.createStatement();

        
            ResultSet rs = st.executeQuery(sql);

          
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println("ID: " + id + ", Name: " + name);
            }

            rs.close();

            st.close();

            conn.close();
            System.out.println("Operation successful.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

