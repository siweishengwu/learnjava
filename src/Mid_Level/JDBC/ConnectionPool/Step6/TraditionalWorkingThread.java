package Mid_Level.JDBC.ConnectionPool.Step6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TraditionalWorkingThread extends Thread {

    public void  run() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }

        try(Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root","admin");
            Statement st = c.createStatement()) {

            for (int i = 0; i < TestConnectionPool.insertTime; i++) {

                String sql = "insert into hero values(null," + "'提莫'" + "," + 313.0f + "," + 50+")";
                st.execute(sql);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
