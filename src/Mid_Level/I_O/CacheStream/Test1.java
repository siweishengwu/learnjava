package Mid_Level.I_O.CacheStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) {
        // 准备文件lol.txt其中的内容是
        // garen kill temmo
        // temmo revive after 1 minutes
        // temmo try to garen, but killed again
        File f = new File("d:/lol.txt");
        try(
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
            )
        {
            while(true) {
                // 一次一行
                String line = br.readLine();
                if (null == line)
                    break;
                System.out.println(line);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
