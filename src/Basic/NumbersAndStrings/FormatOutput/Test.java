package Basic.NumbersAndStrings.FormatOutput;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("请输入地名：");
        Scanner s = new Scanner(System.in);
        String place = s.nextLine();
        System.out.println("请输入公司类型：");
        String type = s.nextLine();
        System.out.println("请输入公司名称：");
        String firm = s.nextLine();
        System.out.println("请输入老板名称");
        String name = s.nextLine();
        System.out.println("请输入金额：");
        String m = s.nextLine();
        System.out.println("请输入产品：");
        String p = s.nextLine();
        System.out.println("请输入价格计量单位：");
        String unit = s.nextLine();
        String sentenceFormat="%s 最大 %s %s 倒闭了，" +
                          "王八蛋老板 %s 吃喝嫖赌，" +
                          "欠下了 %s 个亿，带着他的小姨子跑了!" +
                          "我们没有办法，拿着 %s 抵工资!原价都是" +
                          "一 %s 多、两 %s 多、三 %s 多的代码，现在全部只卖" +
                          "二十块，统统只要二十块!lyh王八蛋，你不是人!我" +
                          "们辛辛苦苦给你干了大半年，你不发工资，你还我血汗钱，还我血汗钱!";
        System.out.printf(sentenceFormat,place,type,firm,name,m,p,unit,unit,unit);
    }
}
