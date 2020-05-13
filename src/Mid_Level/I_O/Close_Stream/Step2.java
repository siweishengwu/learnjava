package Mid_Level.I_O.Close_Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Step2 {
    public static void main(String[] args) {
        File f = new File("d:/lol.txt");
        FileInputStream fis = null;
        try{
            fis = new FileInputStream(f);
            byte[] all = new byte[(int) f.length()];
            fis.read(all);
            for (byte b:all) {
                System.out.println(b);
            }
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            if (null != fis)
                try{
                    fis.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
        }
    }
}
