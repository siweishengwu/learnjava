package Mid_Level.JDBC.ExecuteAndExecuteUpdate;

import java.sql.*;

public class Step4 {
    public static void main(String[] args) {
        list(10,5);
    }

    private static void list(int start, int count) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root","admin");
             Statement s = c.createStatement();) {

            String sql = "select * from hero limit " + start + "," + count;
            boolean isQuery = s.execute(sql);
            if (isQuery) {

                // 执行查询语句，并把结果集返回给ResultSet
                ResultSet rs = s.getResultSet();
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString(2);
                    float hp = rs.getFloat("hp");
                    int damage = rs.getInt(4);
                    System.out.printf("%d\t%s\t%f\t%d%n",id,name,hp,damage);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
