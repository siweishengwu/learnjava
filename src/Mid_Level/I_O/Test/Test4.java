package Mid_Level.I_O.Test;

import java.io.*;

public class Test4 {
    /*
    *
    * @param srcPath 源文件
    * @param destPath 目标文件
    */

    private static void copyFile(String srcPath, String destPath) {
        File srcFile = new File(srcPath);
        File destFile = new File(destPath);

        //缓存区，一次性读取1024字节
        byte[] buffer = new byte[1024];

        try(
                FileInputStream fis = new FileInputStream(srcFile);
                FileOutputStream fos = new FileOutputStream(destFile);
                ){
            while (true){
                //实际读取的长度是 actuallyReaded,有可能小于1024
                int actuallyReaded = fis.read(buffer);
                //-1表示没有可读的内容了
                if (-1 == actuallyReaded)
                    break;
                fos.write(buffer,0,actuallyReaded);
                fos.flush();
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    /*
    *  @param srcPath   源文件夹
    *  @param destPath  目标文件夹
    */
    public static void copyFolder(String srcPath, String destPath){

        File srcFolder = new File(srcPath);
        File destFolder =new File(destPath);
        //源文件夹不存在
        if (!srcFolder.exists())
            return;
        //源文件夹不是一个文件夹
        if (!srcFolder.isDirectory())
            return;
        //目标文件夹是一个文件
        if (destFolder.isFile())
            return;
        //目标文件夹不存在
        if (!destFolder.exists())
            destFolder.mkdirs();

        //遍历源文件夹
        File[] files = srcFolder.listFiles();
        for (File srcFile : files){
            //如果是文件，就复制
            if (srcFile.isFile()){
                File newDestFile = new File(destFolder,srcFile.getName());
                copyFile(srcFile.getAbsolutePath(),newDestFile.getAbsolutePath());
            }
            //如果是文件夹，就递归
             if (srcFile.isDirectory()) {
                 File newDestFloder = new File(destFolder,srcFile.getName());
                 copyFile(srcFile.getAbsolutePath(),newDestFloder.getAbsolutePath());
             }
        }
    }
    public static void main(String[] args) {
        copyFolder("d:/LOLFolder","d:/LOLFolder2");
    }

}
