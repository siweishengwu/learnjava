package Mid_Level.JDBC.Statement;

import java.io.DataOutputStream;
import java.sql.*;

public class Step4 {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String sql = "select * from hero where name = ?";
        try(
                Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root","admin");
                Statement s = c.createStatement();
                PreparedStatement ps = c.prepareStatement(sql);
                ){
            // 假设name是用户提交来的数据
            String name = "'盖伦' OR 1=1";
            String sql0 = "select * from hero where name = " + name;
            // 拼接出来的SQL语句就是

            // select * from hero where name '盖伦' OR 1 = 1
            // 因为有OR 1=1,所以恒成立
            // 那么就会把所有的英雄都查出来，而不只是盖伦
            // 如果Hero表里的数据是海量的，比如几百万条，把这个表里的数据全部查出来
            // 会让数据库负载变高，CPU1001%，内存消耗光，响应变得极其缓慢
            System.out.println(sql0);

            ResultSet rs = s.executeQuery(sql0);
            while (rs.next()) {
                String heroName = rs.getString("name");
                System.out.println(heroName);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
