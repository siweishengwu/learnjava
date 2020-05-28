package Mid_Level.Collection_Framework.ArrayList.Traverse;

import Mid_Level.Collection_Framework.ArrayList.Generic.Step5.Hero;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Hero> heros = new ArrayList<Hero>();

        //放100个Hero进入容器
        for (int i = 0; i < 100; i++) {
            heros.add(new Hero("hero name " + i));
        }

        //准备一个容器，专门用来装要删除的对象
        List<Hero> deletingHeros = new ArrayList<>();

        for (Hero h: heros) {
            int id = Integer.parseInt(h.name.substring(10));
            if (0 == id % 8)
                deletingHeros.add(h);
        }
        for (Hero h : deletingHeros) {
            heros.remove(h);
        }
        //heros.removeAll(deletingHeros);//直接通过removeAll删除多个Hero多项
        System.out.println(heros);
//        List<Hero> heros = new ArrayList<Hero>();
//
//        // 放100个Hero进入容器
//        for (int i = 0; i < 100; i++) {
//            if (i%8!=0){
//                heros.add(new Hero("hero name " + i));
//            }
//        }
//
//        System.out.println("--------------");
//        for (Hero h : heros) {
//            System.out.println(h);
//        }
    }
}
