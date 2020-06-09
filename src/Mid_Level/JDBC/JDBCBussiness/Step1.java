package Mid_Level.JDBC.JDBCBussiness;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Step1 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root","admin");
             Statement s = c.createStatement();) {

            //没有事务的前提下
            //假设业务操作时，加血，减血各做一次
            //结束时，英雄的血量不变

            //加血的SQL
            String sql1 = "update hero set hp = hp -1 where id = 10140";
            s.execute(sql1);

            //加血的SQL
            //不小心写错写成了 update(而非update)

            String sql2 = "updata hero set hp = hp -1 where id = 10140";
            s.execute(sql2);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
