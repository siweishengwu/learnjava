package Mid_Level.JDBC.ConnectionPool.Step6;

import Mid_Level.JDBC.ConnectionPool.Step3.ConncectionPool;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

 class ConnectionpoolWorkingThread extends Thread{
    private ConncectionPool cp;

    public ConnectionpoolWorkingThread(ConncectionPool cp) {
        this.cp = cp;
    }

    public void run() {
        Connection c = cp.getConnection();
        try (Statement st = c.createStatement()) {
            for (int i = 0; i < TestConnectionPool.insertTime; i++) {
                String sql = "insert into hero values(null," + "'提莫'"+ "," + 313.0f + "," + 50 +")";
                st.execute(sql);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        cp.returnConnection(c);
    }
}
