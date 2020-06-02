package Mid_Level.Collection_Framework.Other_Collections.LinkedList.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        int temp = 0;
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        System.out.println(numbers);
        for (int i = 0; i < 1000000; i++) {
            Collections.shuffle(numbers);
            if (numbers.get(0)== 3&&numbers.get(1)==1&&numbers.get(2)==4){
                 temp++;
//                 System.out.print(temp+"次 ");
//                 System.out.println(numbers);
                }
            }
        double rate = temp/(1000d*1000);
        System.out.println(rate*100+"%");
        }
    }
