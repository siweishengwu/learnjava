package Mid_Level.Collection_Framework.RelationshipAndDifference.ArryListVsHashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class Step2 {
    public static void main(String[] args) {

        ArrayList<Integer> numberList = new ArrayList<Integer>();
        //List中的数据可以重复
        System.out.println("------------List-------------");
        System.out.println("向List 中插入 9 9");
        numberList.add(9);
        numberList.add(9);
        System.out.println("List 中出现两个9");
        System.out.println(numberList);
        System.out.println("-------------Set---------------");
        HashSet<Integer> numberSet = new HashSet<Integer>();
        System.out.println("向Set 中插入 9 9 6");
        //Set中的数据不能重复
        numberSet.add(9);
        numberSet.add(9);
        numberSet.add(6);
        System.out.println("Set 中只会保留一个9：");
        System.out.println(numberSet);
    }
}
