package Mid_Level.Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Step2 {
    public static void main(String[] args) {
        try{
            File f = new File("d:/lol.txt");
            FileInputStream fis = new FileInputStream(f);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
