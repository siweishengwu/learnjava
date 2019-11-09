package Basic.Operator;

import java.util.Scanner;

public class Ternary_Operator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("今天是周几？");
        int day = s.nextInt();
        String today = day < 6 ? "工作日":"周末";
        System.out.println("今天是"+today);
    }
}
