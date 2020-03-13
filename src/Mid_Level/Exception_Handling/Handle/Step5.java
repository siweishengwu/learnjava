package Mid_Level.Exception_Handling.Handle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Step5 {
    public static void main(String[] args) {
        File f = new File("c:/1.exe");
        try{
            System.out.println("试图打开d:/1.exe");
            new FileInputStream(f);
            System.out.println("成功打开");
        }catch (FileNotFoundException e){
            System.out.println("d:/1.exe不存在");
            e.printStackTrace();
        }
        finally {
            System.out.println("无论文件是否存在，都会执行的代码");
        }
    }
}
