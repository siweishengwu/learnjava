package Mid_Level.JDBC.ExecuteAndExecuteUpdate;

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

        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1/how2java?characterEncoding=UTF-8","root","admin");
             Statement s = c.createStatement();){

            String sqlInsert = "insert into hero values (null,'盖伦',616,100)";
            String sqlDelete = "delete from hero where id = 10123";
            String sqlUpdate = "update hero set hp = 300 where id = 10123";

            // 相同点：都可以执行增加，删除，修改

            s.execute(sqlInsert);
            s.execute(sqlDelete);
            s.execute(sqlUpdate);
            s.executeUpdate(sqlInsert);
            s.executeUpdate(sqlDelete);
            s.executeUpdate(sqlUpdate);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
