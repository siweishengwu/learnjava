package Mid_Level.Exception_Handling.Handle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Step6 {
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        try{
            method2();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void method2() throws  FileNotFoundException {
        File f = new File("d:/1.exe");
        System.out.println("试图打开d:/1.exe");
        new FileInputStream(f);
        System.out.println("成功打开");
    }
}
