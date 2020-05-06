package Mid_Level.StringStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Step3 {
    public static void main(String[] args) {
        try{
            // 准备文件LOL2.txt其中内容是空的
            File f = new File("d:/lol2.txt");
            //准备长度是2的字节数组，用88 89 初始化，其对应的字符分别是xy
            byte date[] = {88,89,100};
            //创建基于文件的输出流
            FileOutputStream fos = new FileOutputStream(f);
            //把数据写入输出流
            fos.write(date);
            //关闭输出流
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
