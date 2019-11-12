package Basic.Control_Process.Control_Process_for;

import java.util.Scanner;

public class Bagger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int money = 1;
        int lastmoney = 1;
        for (int i=0; i<10;i++){
            if( i == 0 ){
                money = i+money;
                lastmoney = money;
            }else {
                lastmoney=lastmoney*2;
                money = lastmoney + money;
            }
            System.out.println("第"+(i+1)+"天的收入:"+money);
        }
    }
}
