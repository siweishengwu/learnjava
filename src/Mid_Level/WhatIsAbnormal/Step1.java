package Mid_Level.WhatIsAbnormal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Step1 {
    public static void main(String[] args) {
        File f= new File("d:/1.exe");
        //试图打开文件LOL.exe，会抛出FileNotFoundException，如果不处理该异常，就会有编译错误
//        new FileInputStream(f);
        try{
            new FileInputStream(f);
            System.out.println("成功打开1.exe");
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
