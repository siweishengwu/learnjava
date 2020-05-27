package Mid_Level.Collection_Framework.ArrayList.Common_Methods.Size;

import Mid_Level.Collection_Framework.ArrayList.Common_Methods.Hero;

import java.util.ArrayList;

public class TestCollection {
    public static void main(String[] args) {
        ArrayList heros = new ArrayList();

        // 初始化5个对象
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i));
        }
        Hero specialHero = new Hero("special Hero");
        heros.add(specialHero);
        System.out.println(heros);
        System.out.println("获取ArrayList的大小：");
        System.out.println(heros.size());
    }
}
