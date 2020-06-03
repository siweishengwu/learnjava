package Mid_Level.Collection_Framework.RelationshipAndDifference.ArryListVsHashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class Step1 {
    public static void main(String[] args) {

        ArrayList<Integer> numberList = new ArrayList<Integer>();
        //List中的数据按照插入顺序存放
        System.out.println("-----------List-------------");
        System.out.println("向List 中插入 951");
        numberList.add(9);
        numberList.add(5);
        numberList.add(1);
        System.out.println("List 按照顺序存放数据");
        System.out.println(numberList);
        System.out.println("-----------Set-------------");
        HashSet<Integer> numberSet = new HashSet<Integer>();
        System.out.println("向Set 中插入9 5 1");
        //Set 中的数据不是按照插入顺序存放
        numberSet.add(9);
        numberSet.add(5);
        numberSet.add(1);
        System.out.println("Set 不是按照顺序存放数据");
        System.out.println(numberSet);
    }
}
