package Mid_Level.I_O.Close_Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

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
        else
            fileNumber = (int) (fileContent.length / eachSize)+1;
        for (int i = 0; i < fileNumber; i++) {
            String eachFileName = srcFile.getName() + "_" +i;
            File eachFile = new File(srcFile.getParent(),eachFileName);
            byte[] eachContent;

            if (i != fileNumber - 1)
                eachContent = Arrays.copyOfRange(fileContent,eachSize * i,eachSize*(i+1));
            else
                eachContent = Arrays.copyOfRange(fileContent, eachSize *i, fileContent.length);

            // 为了在finally中关闭，声明在try外面
            FileOutputStream fos = null;
            try{
                fos = new FileOutputStream(eachFile);
                fos.write(eachContent);
                System.out.printf("输出子文件%s，其大小是%，d字节%n",eachFile.getAbsoluteFile(),eachFile.length());
            } catch (IOException e){
                e.printStackTrace();
            }finally {
                try{
                    if (null!=fos)
                        fos.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
    /**
    *   合并的思路，就是从eclipse.exe-0开始，读取到一个文件，就开始写出到 eclipse.exe中，直到没有文件可以读
     *
     * @param folder
     *      需要合并的文件索处于的目录
     * @param fileName
     *      需要合并的文件名称
     * @throws java.io.FileNotFoundException
    *
    * */
    private static void murgeFile(String folder,String fileName) {
        File destFile = new File(folder,fileName);
        //使用try-with-resource的方式自动关闭流
        try(FileOutputStream fos = new FileOutputStream(destFile);){
            int index = 0;
            while (true) {
                File eachFile = new File(folder,fileName + "-" + index++);
                if (!eachFile.exists())
                    break;
                //使用try-with-reasource的方式自动关闭流
                try(FileInputStream fis = new FileInputStream(eachFile);){
                    byte[] eachContent = new byte[(int) eachFile.length()];
                    fis.read(eachContent);
                    fos.write(eachContent);
                    fos.flush();
                }
                System.out.printf("把子文件%s写出到目标文件中%n",eachFile);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.printf("最后目标文件的大小：%，d字节",destFile.length());
    }
}
