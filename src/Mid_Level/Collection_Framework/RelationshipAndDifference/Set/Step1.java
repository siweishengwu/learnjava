package Mid_Level.Collection_Framework.RelationshipAndDifference.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Step1 {
    public static void main(String[] args) {
        HashSet<Integer> numberSet1 = new HashSet<Integer>();
        //HashSet中的数据不是按照插入顺序存放
        numberSet1.add(88);
        numberSet1.add(8);
        numberSet1.add(888);

        System.out.println(numberSet1);

        LinkedHashSet<Integer> numberSet2 = new LinkedHashSet<Integer>();
       //LinkedHashSet中的数据是按照插入顺序存放
        numberSet2.add(88);
        numberSet2.add(8);
        numberSet2.add(888);

        System.out.println(numberSet2);
        TreeSet<Integer> numberSet3 = new TreeSet<Integer>();
        //TreeSet 中的数据是进行了排序的
        numberSet3.add(88);
        numberSet3.add(8);
        numberSet3.add(888);

        System.out.println(numberSet3);
    }
}
