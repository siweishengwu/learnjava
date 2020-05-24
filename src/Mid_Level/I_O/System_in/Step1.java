package Mid_Level.I_O.System_in;

import java.io.IOException;
import java.io.InputStream;

public class Step1 {

    public static void main(String[] args) {
        // 控制台输入
        try(InputStream is = System.in;) {
            // 控制台输入
            while(true) {
                // 敲入a,然后敲回车可以看到
                // 97 13 10
                // 97 是a的ASCII码
                // 13 10 分别对应回车换行
                int i = is.read();
                System.out.println(i);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
