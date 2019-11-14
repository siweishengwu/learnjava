package Basic.Control_Process;

public class Millionaire {
    public static void main(String[] args) {
        double everyearmoney = 12000;                   //每年投入的钱
        double rate = 1.2;                              //预计的收益率
        double flagmoney = 1000000;                     //你的小目标
        double lastyearmoney = 0;                       //去年的总共的钱
        double money = 0;                               //现在的钱
        for (int i = 1;i < 100;i++){                    //年数循环一年循环一个周期
            money = (everyearmoney+lastyearmoney) * rate;//现在的钱=（今年投入的钱+去年总共的钱）*一个收益率
            lastyearmoney = money;                       //去年的钱等于=今年的钱
            System.out.println("第"+i+"年一共有"+money);
            if (money > flagmoney){                      //判断如果现在的钱>目标的钱就可以跳出
                System.out.println("总共需要"+i+"年");
                break;                                   //跳出
            }
        }
    }
}
