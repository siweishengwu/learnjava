package Mid_Level.Collection_Framework.Others.HashCode;

import Mid_Level.Collection_Framework.ArrayList.Common_Methods.Hero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Step1 {
    public static void main(String[] args) {
        List<Hero> heros = new ArrayList<Hero>();

        for (int i = 0; i < 2000000; i++) {
            Hero h  = new Hero("Hero " + i);
            heros.add(h);
        }

        // 进行10次查询，观察大体平均值
        for (int i = 0; i < 10; i++) {
            // 打乱heros中元素的顺序
            Collections.shuffle(heros);

            long start = System.currentTimeMillis();

            String target = "Hero 1000000";

            for (Hero hero : heros) {
                if (hero.name.equals(target)) {
                    System.out.println("找到了 heros!");
                    break;
                }
            }
            long end = System.currentTimeMillis();
            long elapsed = end -start;
            System.out.println("一共花了：" +elapsed + "毫秒");
        }
    }
}
