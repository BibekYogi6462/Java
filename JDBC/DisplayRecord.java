package JDBC;

import java.sql.*;

public class DisplayRecord {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/orchid";
        String uname = "root";
        String pwd = "";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, uname, pwd);
            
            String sql = "SELECT * FROM users";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()) {
                System.out.println("ID: " + rs.getString("id"));
                System.out.println("Name: " + rs.getString("name"));
//                System.out.println("Address: " + rs.getString("address")); 
            }
            
            con.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
