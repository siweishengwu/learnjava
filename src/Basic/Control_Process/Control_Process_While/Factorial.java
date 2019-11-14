package Basic.Control_Process.Control_Process_While;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("请输入一个整数:");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int factorial = 1;
        while( number > 1 ){
            //一直减的同时乘上那个数字
            factorial =  factorial * number;
            number--;
        }
        System.out.println("阶乘是:"+factorial);
    }
}
