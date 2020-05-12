package Mid_Level.StringStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Step7 {
    public static void main(String[] args) {
        int eachSize = 2; // 100k
        File srcFile = new File("D:/新建文件夹/lol.txt");
        splitFile(srcFile,eachSize);
    }
    /*
    *拆分的思路，先把源文件的所有内容读取到内存中，然后从内存中挨个分到子文件里
    * @param srcFile 要拆分的源文件
    * @param eachSize 按照这个大小，拆分
    */
    private static  void splitFile(File srcFile,int eachSize){
        if (0 == srcFile.length())
            throw new RuntimeException("文件长度0，不可拆分");
        byte[] fileContent = new byte[(int) srcFile.length()];
        //先把文件读取到数组中
        try{
            FileInputStream fis = new FileInputStream(srcFile);
            fis.read(fileContent);
            fis.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        int fileNumber;
        if ( 0 == fileContent.length % eachSize)
            fileNumber = (int) (fileContent.length / eachSize);
        else
            fileNumber = (int) (fileContent.length / eachSize) + 1;

        for (int i = 0; i < fileNumber; i++) {
            String eachFileName = srcFile.getName() + "_" + i;
            File eachFile = new File(srcFile.getParent(),eachFileName);
            byte[] eachContent;

            if (i != fileNumber -1)
                eachContent = Arrays.copyOfRange(fileContent,eachSize * i,eachSize * (i+1));
            else
                eachContent = Arrays.copyOfRange(fileContent,eachSize*i, fileContent.length);

             try{
                 FileOutputStream fos = new FileOutputStream(eachFile);
                 fos.write(eachContent);
                 fos.close();
                 System.out.printf("输出子文件%s,其大小是 %d字节%n",eachFile.getAbsoluteFile(),eachFile.length());
             } catch (IOException e) {
                 e.printStackTrace();
             }
        }
    }
}
