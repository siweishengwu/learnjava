package Basic.Control_Process.Control_Process_If;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = s.nextInt();
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
            System.out.println(year+"是闰年");
        }
        else {
            System.out.println(year+"不是闰年");
        }
    }
}

