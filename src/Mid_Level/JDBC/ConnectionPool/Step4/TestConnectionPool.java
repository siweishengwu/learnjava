package Mid_Level.JDBC.ConnectionPool.Step4;

import Mid_Level.JDBC.ConnectionPool.Step3.ConncectionPool;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnectionPool {

    public static void main(String[] args) {
        ConncectionPool cp = new ConncectionPool(3);
        for (int i = 0; i < 100; i++) {
            new WorkingThread("working thread" + i, cp).start();
        }

    }
}

    class WorkingThread extends Thread {
        private ConncectionPool cp;

        public WorkingThread(String name,ConncectionPool cp) {
            super(name);
            this.cp = cp;
        }

        public void run() {
            Connection c = cp.getConnection();
            System.out.println(this.getName()+ ":\t 获取了一根链接，并开始工作");
            try (Statement st = c.createStatement()) {

                //模拟时耗1秒的数据库SQL语句
                Thread.sleep(1000);
                st.execute("select  * from hero");
            } catch (SQLException | InterruptedException e){
                e.printStackTrace();
            }
            cp.returnConnection(c);
        }
    }

