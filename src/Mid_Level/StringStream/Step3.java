package Mid_Level.StringStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Step3 {
    public static void main(String[] args) {
        try{
            File f = new File("d:/lol2.txt");
            byte date[] = {88,89,100};
            FileOutputStream fos = new FileOutputStream(f);
            fos.write(date);
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
