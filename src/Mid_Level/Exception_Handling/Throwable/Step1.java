package Mid_Level.Exception_Handling.Throwable;

import java.io.File;
import java.io.FileInputStream;

public class Step1 {
    public static void main(String[] args) {
        File f = new File("d:/1.exe");
        try{
            new FileInputStream(f);
        }catch (Throwable t){
            t.printStackTrace();
        }
    }
}
