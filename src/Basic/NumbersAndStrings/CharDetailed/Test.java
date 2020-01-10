package Basic.NumbersAndStrings.CharDetailed;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char[] cs = str.toCharArray();

        for (int i = 0; i <cs.length ; i++) {
            char c =cs[i];
            if(Character.isUpperCase(c) || Character.isDigit(c)){
                System.out.print(c);
        }
        }
    }
}
