package Mid_Level.I_O.Close_Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Step3 {
    public static void main(String[] args) {
        File f = new File("d:/lol.txt");
        //把流定义在try()里，try,catch或者finally结束的时候，会自动关闭
        try(FileInputStream fis = new FileInputStream(f)) {
            byte[] all = new byte[(int) f.length()];
            fis.read(all);
            for (byte b: all) {
                System.out.println(b);
            }
        }catch (IOException e){
            System.out.println();
        }
    }
}
