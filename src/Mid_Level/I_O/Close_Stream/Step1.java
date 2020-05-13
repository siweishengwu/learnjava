package Mid_Level.I_O.Close_Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Step1 {
    public static void main(String[] args) {
        try{
            File f = new File("d:/lol.txt");
            FileInputStream fis = new FileInputStream(f);
            byte[] all = new byte[(int) f.length()];
            fis.read(all);
            for (byte b: all) {
                System.out.println(b);
            }
            //在try里关闭流
            fis.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
