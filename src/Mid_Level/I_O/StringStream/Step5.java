package Mid_Level.I_O.StringStream;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Step5 {
    public static void main(String[] args) {
        try{
            File f = new File("d:/xyz/abc/def/lol2.txt");
            //因为默认情况下，文件系统中不存在 d:\xyz\abc\def,所以输出会失败

            //首先获取文件所在的目录
            File dir = f.getParentFile();

            //如果该目录不存在，则创建该目录
            if (!dir.exists()){
                //dir.mkdirs(); 使用mkdir会抛出异常，因为该目录的父目录也不存在
                dir.mkdirs();
            }
            byte date[] = {88,89};
            FileOutputStream fos = new FileOutputStream(f);
            fos.write(date);
            fos.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
