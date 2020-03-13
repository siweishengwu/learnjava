package Mid_Level.Exception_Handling.Throwable;

import java.io.File;
import java.io.FileInputStream;

public class Test {

    public static void method() throws Throwable{
        File f = new File("d:/1.exe");
        new FileInputStream(f);
    }

    public static void main(String[] args) {
        try{
            method();
        }catch (Throwable e){
            e.printStackTrace();
        }
    }
}
