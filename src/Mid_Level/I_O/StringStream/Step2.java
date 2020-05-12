package Mid_Level.I_O.StringStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Step2 {
    public static void main(String[] args) {
        try{
            //准备文件LOL.txt文件其中的内容是，对应的ASCII分别是
            File f = new File("d:/lol.txt");
            //创建基于文件的输入流
            FileInputStream fis = new FileInputStream(f);
            //创建字节数组，其长度就是文件的长度
            byte[] all = new byte[(int) f.length()];
            //以字节流的形式读取文件所有内容
            fis.read(all);
            for (byte b:all) {
                //打印出来分别是
                System.out.println(b);
            }
            //分次使用完流，都应该进行关闭
            fis.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
