package Mid_Level.I_O.UTF;

import java.io.*;
import java.nio.charset.Charset;

public class Step9 {
    public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException {
        File f = new File("d:/ lol2.txt");
        System.out.println("默认编码方式："+ Charset.defaultCharset());
        //FileReader得到的是字符，所以一定是已经把字节根据某种编码识别成了字符了
        //而FileReader使用的编码方式是Charset.defaultCharset()的返回值，如果是中文的操作系统，就是GNK
        try(FileReader fr = new FileReader(f)) {
            char[] cs = new char[(int) f.length()];
            fr.read(cs);
            System.out.printf("FileReader会使用默认的编码方式%s，识别出来的字符是：%n",Charset.defaultCharset());
            System.out.println(new String(cs));
        } catch (IOException e) {
            e.printStackTrace();
        }
        //FIleReader是不能手动设置编码方式，为了使用其他的编码方式，只能使用InputStreamReader来代替
        //并且使用new InputStreamReader(new FileInputStream(f),Charset.forName("UTF-8"));这样的形式
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(f),Charset.forName("UTF-8"))) {
            char[] cs = new char[(int) f.length()];
            isr.read(cs);
            System.out.printf("InputStreamReader 指定编码方式UTF-8,识别出来的字符是：%n");
            System.out.println(new String(cs));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
