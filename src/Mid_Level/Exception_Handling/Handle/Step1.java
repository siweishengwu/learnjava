package Mid_Level.Exception_Handling.Handle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Step1 {
    public static void main(String[] args) {
        File f = new File("d:/1.exe");
        try{
            System.out.println("试图打开的d:/1.exe");
            new FileInputStream(f);
            System.out.println("打开成功");
        }catch (FileNotFoundException e){
            System.out.println("d:/LOL.exe不存在");
            e.printStackTrace();
        }
    }
}
