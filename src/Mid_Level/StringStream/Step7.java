package Mid_Level.StringStream;

import java.io.File;

public class Step7 {
    public static void main(String[] args) {
        int eachSize = 100*1024;
        File srcFile = new File("d:/eclipse.exe");
        splitFile(srcFile,eachSize);
    }
    /*
    *拆分的思路，先把源文件的所有内容读取到内存中，然后从内存中挨个分到子文件里
    * @param srcFile 要拆分的源文件
    * @param eachSize 按照这个大小，拆分
    */
}
