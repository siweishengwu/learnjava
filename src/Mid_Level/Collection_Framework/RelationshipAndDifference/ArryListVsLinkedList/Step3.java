package Mid_Level.Collection_Framework.RelationshipAndDifference.ArryListVsLinkedList;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.List;

public class Step3 {
    public static void main(String[] args) {
        List<Integer> l;
        l = new ArrayList<>();
        modify(l,"ArrayList");
    }

    private static void modify(List<Integer> l, String type) {
        int total = 100*1000;
        int index = total/2;
        final int number = 5;
        //初始化
        for (int i = 0; i < total; i++) {
            l.add(number);
        }
        long start = System.currentTimeMillis();

        for (int i = 0; i < total; i++) {
            int n = l.get(index);
            n++;
            l.set(index,n);
        }
        long end = System.currentTimeMillis();
        System.out.println("%s总长度是%d,定位到第%d个数据，取出来，加1，再放回去%n 重复%d遍，总共耗时 %d 毫秒");
    }
}
