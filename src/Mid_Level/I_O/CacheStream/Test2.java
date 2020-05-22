package Mid_Level.I_O.CacheStream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test2 {
    public static void main(String[] args) {
        // 向文件lol.txt中写入三行语句
        File f = new File("d:/lol.txt");

        try (
                // 创建文件字符流
                FileWriter fw = new FileWriter(f);
                // 缓存流必须建立在一个存在的流的基础上
                PrintWriter pw = new PrintWriter(fw);
                ){
            pw.println("garen kill temmo");
            pw.println("teemo revive after 1 minutes");
            pw.println("temmo try to garen, but killed again");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
