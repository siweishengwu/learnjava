package Mid_Level.JDBC.R.Step3;

import java.sql.*;

public class TestJDBC {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try(
                Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root","admin");
                Statement s = c.createStatement();
            )
        {
            String sql = "select count(*) from hero";

            ResultSet rs = s.executeQuery(sql);
            int total = 0;
            while (rs.next()) {
                total = rs.getInt(1);
            }
            System.out.println("表Hero中总共有：" + total + "条数据");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
