package Mid_Level.Collection_Framework.Others.Comparators.Step4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Mid_Level.Collection_Framework.Others.Comparators.Step4.Item;
public class TestCollection {
    public static void main(String[] args) {

        List<Item> is = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Item item =new Item();
            item.name = "Item " + i;
            item.price = (int) (Math.random()*100);
            is.add(item);
        }
        System.out.println("初始化的Items:");
        System.out.println(is);
        Collections.sort(is);
        System.out.println("排序后的Items:");
        System.out.println(is);
    }
}
