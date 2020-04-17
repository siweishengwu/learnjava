package Mid_Level.I_O.File_Obeject;

import java.io.File;

public class Step2 {
    public static void main(String[] args) {

        File f = new File("d:/LOLFolder/LOL.exe");
        System.out.println("当前文件是：" + f);

        //文件是否存在
        System.out.println("判断是否存在：" + f.exists());

        //是否是文件夹
        System.out.println("判断是否是文件夹：" + f.isDirectory());

        //是否是文件（非文件夹）
        System.out.println("判断是否是文件：" + f.isFile());

        //文件长度
        System.out.println("获取文件的长度："+ f.length());
    }
}
