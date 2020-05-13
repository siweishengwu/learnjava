package Mid_Level.I_O.Close_Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Step5 {
    public static void main(String[] args) {
        int eachSize = 100 * 1024; //100k
        File srcFile = new File("d：/eclipse.exe");
//      splitFile(scrFile, eachSize);
    }
    /**
     *     拆分的思路，先把源文件的所有内容读取到内存中，然后从内存中挨个分到子文件中
     * @param srcFile
     *  要拆分的源文件
     * @pararm eachSize
     *   按照这个大小，拆分
     */
    private static void spiltFile(File srcFile,int eachSize){
        if (0 == srcFile.length())
            throw new RuntimeException("文件长度为0，不可拆分");
        byte[] fileContent = new byte[(int) srcFile.length()];
        //为了在finally中关闭,需要声明在try外面
        FileInputStream fis = null;
        try{
            fis = new FileInputStream(srcFile);
            fis.read(fileContent);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if (null!= fis)
                    fis.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        int fileNumber;
        if (0 == fileContent.length % eachSize)
            fileNumber = (int) (fileContent.length / eachSize);
    }

}
