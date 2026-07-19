package database;
import java.sql.*;

public class index {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jio", "root", "Hariom@1504");

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from employes");

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2)+ " "+rs.getInt(3));
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
