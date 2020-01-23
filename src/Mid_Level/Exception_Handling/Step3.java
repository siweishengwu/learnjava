package Mid_Level.Exception_Handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Step3 {
    public static void main(String[] args) {
        File f = new File("d:/1.exe");
        try{
            System.out.println("试图打开 d:/LOL.exe");
            new FileInputStream(f);
            System.out.println("成功打开");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse("2016-06-03");
        }
        catch(FileNotFoundException e){
            System.out.println("1.exe不存在");
            e.printStackTrace();
        }
        catch(ParseException e){
            System.out.println("日期格式错误");
            e.printStackTrace();
        }
    }

}
