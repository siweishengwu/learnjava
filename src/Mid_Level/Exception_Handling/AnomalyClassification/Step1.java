package Mid_Level.Exception_Handling.AnomalyClassification;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Step1 {
    public static void main(String[] args) {
        File f = new File("d:/1.exe");
        try{
            System.out.println("试图打开D:/1.exe");
            new FileInputStream(f);
            System.out.println("成功打开");
        }catch (FileNotFoundException e){
            System.out.println("d:/1.exe不存在");
            e.printStackTrace();
        }
    }
}
