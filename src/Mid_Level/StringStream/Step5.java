package Mid_Level.StringStream;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Step5 {
    public static void main(String[] args) {
        try{
            File f = new File("d:/xyz/abc/def/lol2.txt");
            File dir = f.getParentFile();
            if (!dir.exists()){
                dir.mkdirs();
            }
            byte date[] = {88,89};
            FileOutputStream fos = new FileOutputStream(f);
            fos.write(date);
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
