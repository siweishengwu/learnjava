package Mid_Level.Collection_Framework.ArrayList.Traverse;

import Mid_Level.Collection_Framework.ArrayList.Generic.Step5.Hero;

import java.util.ArrayList;
import java.util.List;

public class Step3 {
    public static void main(String[] args) {
        List<Hero> heroes = new ArrayList<Hero>();

        // 放5个Hero进入容器
        for (int i = 0; i < 5; i++) {
            heroes.add(new Hero("hero name " + i));
        }

        // 第三种，增强型for循环
        System.out.println("------增强型for循环-------");
        for (Hero h : heroes) {
            System.out.println(h);
        }
    }
}
