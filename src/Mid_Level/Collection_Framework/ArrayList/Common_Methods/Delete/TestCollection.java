package Mid_Level.Collection_Framework.ArrayList.Common_Methods.Delete;

import Mid_Level.Collection_Framework.ArrayList.Common_Methods.Hero;

import java.util.ArrayList;

public class TestCollection {
    public static void main(String[] args) {
        ArrayList heros = new ArrayList();

        // 初始化5个对象
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero "+ i));
        }
        Hero specialHero = new Hero("special Hero");
        heros.add(specialHero);

        System.out.println(heros);
        heros.remove(2);
        heros.remove(3);
        System.out.println("删除下标是2的对象");
        System.out.println(heros);
        System.out.println("删除special hero");
        heros.remove(specialHero);
        System.out.println(heros);
    }
}
