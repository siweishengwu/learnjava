package Mid_Level.I_O.File_Obeject;

import java.io.File;

public class Step7 {
    static long minSize = Integer.MAX_VALUE;
    static long maxSize = 0;
    static File minFile = null;
    static File maxFile = null;

    public static void listfiles(File file){
        if (file.isFile()){
            if (file.length()>maxSize){
                maxSize = file.length();
                maxFile = file;
            }
            if (file.length()!=0&&file.length()<minSize){
                minSize = file.length();
                minFile = file;
            }
            return;
        }
        if (file.isDirectory()){
            File[] fs = file.listFiles();
            if (null!=fs)
                for (File f : fs){
                    listfiles(f);
                }
        }
    }
    public static void main(String[] args) {
        File f = new File("c:\\windows");
        listfiles(f);
        System.out.printf("最大得文件是%s,其大小是%,d字节%n",maxFile.getAbsoluteFile(),maxFile.length());;
        System.out.printf("最小得文件是%s,其大小是%,d字节%n",maxFile.getAbsoluteFile(),minFile.length());;
    }
}
