package Mid_Level.Collection_Framework.ArrayList.Common_Methods.Clear;

import Mid_Level.Collection_Framework.ArrayList.Common_Methods.Hero;

import java.util.ArrayList;

public class TestCollection {
    public static void main(String[] args) {
        ArrayList heros = new ArrayList();

        // 初始化5个对象
        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("hero " + i));
        }

        System.out.println("ArrayList heros:\t" + heros);
        System.out.println("使用clear清空");
        heros.clear();
        System.out.println("ArrayList heros:\t" + heros);
    }
}
