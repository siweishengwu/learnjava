package Mid_Level.I_O.File_Obeject;

import java.io.File;

public class Step1 {
    public static void main(String[] args) {
        File f1 = new File("d:/LOLFolder");
        System.out.println("f1的绝对路径:"+f1.getAbsolutePath());
        File f2 = new File("lol.exe");
        System.out.println("f2的绝对路径:"+f2.getAbsolutePath());
        File f3 = new File(f1,"LOL.exe");
        System.out.println("f3的绝对路径："+f3.getAbsolutePath());
    }
}
