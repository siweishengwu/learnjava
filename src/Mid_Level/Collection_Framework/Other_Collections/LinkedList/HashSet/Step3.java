package Mid_Level.Collection_Framework.Other_Collections.LinkedList.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Step3 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<Integer>();

        for (int i = 0; i < 20; i++) {
            numbers.add(i);
        }

        //Set不提供get方法来获取指定位置的元素
        //numbers.get(0)

        //遍历Set可以采用迭代器iterator
        for (Iterator<Integer> iterator = numbers.iterator();iterator.hasNext();){
            Integer i = (Integer) iterator.next();
            System.out.println(i);
        }

        //或者次啊用增强型for循环
        for (Integer i : numbers) {
            System.out.println(i);
        }
    }
}
