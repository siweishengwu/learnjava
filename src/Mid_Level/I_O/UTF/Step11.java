package Mid_Level.I_O.UTF;

import java.io.UnsupportedEncodingException;

public class Step11 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // 找出E5 B1 8C 这3个十六进制对应UTF-8编码的汉字
        byte[] bs = new byte[3];
        bs[0] = (byte) 0XE5;
        bs[1] = (byte) 0XB1;
        bs[2] = (byte) 0X8c;

        String str = new String(bs,"UTF-8");
        System.out.println("E5 B1 8C 对应的字符是："+str);
    }
}
