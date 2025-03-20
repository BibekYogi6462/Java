/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

/**
 *
 * @author Bibek Yogi
 */
public class DisplayAllColumn {
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
            
            
            ResultSetMetaData rsmd = rs.getMetaData();
            int cols = rsmd.getColumnCount();
            while(rs.next())
            {
                for(int i=1; i<=cols; i++)
                {
                    System.out.println(rs.getString(i));   
                }
            }
        }
    
}
