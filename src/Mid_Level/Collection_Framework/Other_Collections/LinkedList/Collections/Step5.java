package Mid_Level.Collection_Framework.Other_Collections.LinkedList.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Step5 {
    public static void main(String[] args) {
        //初始化集合numbers
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        System.out.println("集合中的数据：");
        System.out.println(numbers);

        Collections.rotate(numbers,2);
        System.out.println("把集合向右滚动2个单位，标的数据后，集合中的数据");
        System.out.println(numbers);
    }
}
