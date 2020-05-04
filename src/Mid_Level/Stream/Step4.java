package Mid_Level.Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Step4 {
    public static void main(String[] args) {
        try{
            File f = new File("d:/lol.txt");
            FileOutputStream  fos = new FileOutputStream(f);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
