package Basic.Operator;

import java.util.Scanner;

public class Arithmetic_Operator {

    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int a = s.nextInt();
//        int b = s.nextInt();
//        int c = a+b;
//        System.out.println(c);

//        int a = 5;
//        long b = 6;
//        int c = (int) (a+b); //a+b的运算结果是long型，所以要进行强制转换
//        long d = a+b;

//        byte a = 1;
//        byte b= 2;
//        byte c = (byte) (a+b); //虽然a b都是byte类型，但是运算结果是int类型，需要进行强制转换
//        int d = a+b;
//        System.out.println(c);
//        System.out.println(d);

//        int i = 1;
//        int j = ++i + i++ + ++i + ++i + i++;
//        System.out.println(j); //18

        Scanner s = new Scanner(System.in);
        System.out.println("请输入身高(m):");
        double a =s.nextDouble();
        System.out.println("请输入体重(kg):");
        double b =s.nextDouble();
        double c = b/(a*a);
        System.out.println("当前的BMI是:"+c);
    }
}
