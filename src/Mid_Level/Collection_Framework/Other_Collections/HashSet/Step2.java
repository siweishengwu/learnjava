package Mid_Level.Collection_Framework.Other_Collections.HashSet;

import java.util.HashSet;

public class Step2 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<Integer>();

        numbers.add(5);
        numbers.add(9);
        numbers.add(1);
        numbers.add(2);

        // Set中的元素排列，不是按照插入顺序
        System.out.println(numbers);
    }
}
