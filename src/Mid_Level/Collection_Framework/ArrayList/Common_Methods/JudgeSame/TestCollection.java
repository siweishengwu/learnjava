package Mid_Level.Collection_Framework.ArrayList.Common_Methods.JudgeSame;

import Mid_Level.Collection_Framework.ArrayList.Common_Methods.Hero;

import java.util.ArrayList;

public class TestCollection {
    public static void main(String[] args) {
        ArrayList heros = new ArrayList();

        //初始化5个对象
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i));
        }
        Hero specialHero = new Hero("special hero");
        heros.add(specialHero);
        String name = "hero 4";
        System.out.println(heros);
        for (int i = 0; i < heros.size(); i++) {
            Hero h = (Hero) heros.get(i);
            if (name.equals(h.name)) {
                System.out.printf("找到了name是%s的对象",name);
                System.out.println();
                System.out.println(i+1);
                break;
            }
        }
    }
}
