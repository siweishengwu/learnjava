package Mid_Level.I_O.Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Step4 {
    public static void main(String[] args) {
        try{
            File f = new File("d:/lol.txt");
            //创建基于文件的输出流
            FileOutputStream  fos = new FileOutputStream(f);
            //通过这个输出流，就可以把数据从内存m输出到硬盘的文件上
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
