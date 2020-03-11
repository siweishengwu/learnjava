package Mid_Level.Exception_Handling.WhatIsAbnormal;

import java.io.File;
import java.io.FileInputStream;

public class Step1 {
    public static void main(String[] args) {

        File f= new File("d:/LOL.exe");

        //试图打开文件LOL.exe，会抛出FileNotFoundException，如果不处理该异常，就会有编译错误
//        new FileInputStream(f);

    }
}
