package Mid_Level.I_O.CacheStream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Step3 {
    public static void main(String[] args) {
        // 向文件lol2.txt中写入三行语句
        File f = new File("d:/lol2.txt");
        // 创建文件字符流
        // 缓存流必须建立在一个存在的流的基础上
        try(FileWriter fr = new FileWriter(f); PrintWriter pw = new PrintWriter(fr);){
            pw.println("garen kill temmo");
            // 强制把缓存中的数据写入硬盘，无论缓存是否已满
                pw.flush();
             pw.println("temmo revive after 1 minutes");
                pw.flush();
             pw.println("teemo try to garen, but killed again");
                pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
