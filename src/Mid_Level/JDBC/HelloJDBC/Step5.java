package Mid_Level.JDBC.HelloJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Step5 {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
                    "root","admin");
            Statement s = c.createStatement();

            // 准备sql语句
            // 注意： 字符串要用单引号
            String sql = "insert into hero values(null,"+"'提莫1'"+","+313.0f+","+50+")";
            s.execute(sql);

            System.out.println("执行插入语句成功");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
