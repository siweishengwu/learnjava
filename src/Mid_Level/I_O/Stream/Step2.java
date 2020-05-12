package Mid_Level.I_O.Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Step2 {
    public static void main(String[] args) {
        try{
            File f = new File("d:/lol.txt");
            //创建基于文件的流
            FileInputStream fis = new FileInputStream(f);
            //通过这个输入流，就可以把数据从硬盘，读取到java的虚拟机中来，也就是读取到内存中
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
