package Mid_Level.Exception_Handling.Handle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Step3 {
    public static void main(String[] args) {
        File f = new File("D:/1.exe");

        try{
            System.out.println("试图打开D:/lol.exe");
            new FileInputStream(f);
            System.out.println("成功打开");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse("2016-06:03");
        } catch (FileNotFoundException e){
            System.out.println("d:/1.exe不存在");
            e.printStackTrace();
        } catch (ParseException e){
            System.out.println("日期格式解析错误");
            e.printStackTrace();
        }
    }
}
