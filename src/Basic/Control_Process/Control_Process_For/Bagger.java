package Basic.Control_Process.Control_Process_For;

import java.util.Scanner;

public class Bagger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int money = 1;          //现在的钱
        int lastmoney = 1;      //昨天的钱
        for (int i=0; i<10;i++){//天数的循环
            if( i == 0 ){       //第1天的话 今天的钱=0+1； 1=1
                money = i+money;
                lastmoney = money;
            }else {             //之后的天数的话 上一次的钱*2 然后再加上今天的钱等于这次的钱
                lastmoney=lastmoney*2;
                money = lastmoney + money;
            }
            System.out.println("第"+(i+1)+"天的收入:"+money);
        }
    }
}
