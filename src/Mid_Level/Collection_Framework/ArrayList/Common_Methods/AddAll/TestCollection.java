package Mid_Level.Collection_Framework.ArrayList.Common_Methods.AddAll;

import Mid_Level.Collection_Framework.ArrayList.Common_Methods.Hero;

import java.util.ArrayList;

public class TestCollection {
    public static void main(String[] args) {
        ArrayList heros = new ArrayList();

        // 初始化5个对象
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero "+ i));
        }

        System.out.println("ArrayList heros:\t" + heros);

        //把另一个容器里所有的元素，都加入到该容器里来
        ArrayList anootherHeros = new ArrayList();
        anootherHeros.add(new Hero("hero a"));
        anootherHeros.add(new Hero("hero b"));
        anootherHeros.add(new Hero("hero c"));
        System.out.println("anotherHeros heros:\t" + anootherHeros);
        heros.addAll(anootherHeros);
        System.out.println("把另一个ArrayList的元素都加入到当前ArrayList：");
        System.out.println("ArrayList heros:\t" + heros);
    }
}
