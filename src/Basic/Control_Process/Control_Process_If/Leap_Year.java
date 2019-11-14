package Basic.Control_Process.Control_Process_If;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = s.nextInt();
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
            //闰年/4没有余数的同时闰年/100有余数   或者满足闰年/400没有余数
            System.out.println(year+"是闰年");
        }
        else {
            System.out.println(year+"不是闰年");
        }
    }
}

