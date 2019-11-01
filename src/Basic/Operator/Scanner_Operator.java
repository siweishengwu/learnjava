package Basic.Operator;

import java.util.Scanner;

public class Scanner_Operator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        int a = s.nextInt();
//        System.out.println("第一个整数:"+a);
//        int b = s.nextInt();
//        System.out.println("第二个整数:"+b);
//
//        float c = s.nextFloat();
//        System.out.println("读取的浮点数值是:"+c);

        String d = s.nextLine();
        System.out.println("读取的字符串是:"+d);
    }
}
