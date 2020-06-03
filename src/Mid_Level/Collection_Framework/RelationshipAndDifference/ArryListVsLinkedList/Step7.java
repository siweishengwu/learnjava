package Mid_Level.Collection_Framework.RelationshipAndDifference.ArryListVsLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Step7 {
    public static void main(String[] args) {
        List<Integer> l;
        l = new ArrayList<>();
        insertFirst(l,"ArrayList");

        l = new LinkedList<>();
        insertFirst(l,"LinkedList");
    }

    private static void insertFirst(List<Integer> l, String type) {
        int total = 1000*100;
        final int number =5;
        long start = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            //把当前容器的一半的位置，插入数据
            l.add(l.size()/2,number);
        }
        long end = System.currentTimeMillis();
        System.out.printf("在%s 最中间插入 %d 条数据,总共耗时 %d 毫秒 %n",type,total,end-start);
    }
}
