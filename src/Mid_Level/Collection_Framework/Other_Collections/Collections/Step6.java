package Mid_Level.Collection_Framework.Other_Collections.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Step6 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        System.out.println("把非线程安全的List转换为线程安全的List");
        List<Integer> synchronizedNumbers = (List<Integer>) Collections.synchronizedList(numbers);
    }
}
