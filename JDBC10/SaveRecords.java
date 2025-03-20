package JDBC10;

import java.sql.*;

public class Insert {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/orchid";
        String uname = "root";
        String pwd = "";

        try {
            
            Class.forName("com.mysql.jdbc.Driver");

            Connection conn = DriverManager.getConnection(url, uname, pwd);

            String sql = "INSERT INTO users (id, name) VALUES ('3','JagguBandar')";
            

            Statement st = conn.createStatement();
            st.execute(sql);
            conn.close();
            System.out.println("Record saved");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}