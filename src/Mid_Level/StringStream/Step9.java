package Mid_Level.StringStream;

import java.io.*;

public class Step9 {
    public static void main(String[] args) {
        murgeFile("d:/","eclipse.exe");
    }
    private static void murgeFile(String folder,String fileName){
        try {
            File destFile = new File(folder, fileName);
            FileOutputStream fos = new FileOutputStream(destFile);
            int index = 0;
            while (true){
                File eachFile = new File(folder,fileName + "-" + index++);
                if (!eachFile.exists())
                    break;
                FileInputStream fis = new FileInputStream(eachFile);
                byte[] eachContent = new byte[(int) eachFile.length()];
                fis.read(eachContent);
                fis.close();

                fos.write(eachContent);
                fos.flush();
                System.out.printf("把子文件%s写出到目标文件中%n",eachFile);
            }
            fos.close();
            System.out.printf("最后目标文件的大小:%,d字节",destFile.length());
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
