package Mid_Level.Collection_Framework.RelationshipAndDifference.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Step3 {
    public static void main(String[] args) {
        Set<Integer> result = new LinkedHashSet<>();
        String str = String.valueOf(Math.PI);
        // 去掉点
        str = str.replace(".","");
        char[] cs = str.toCharArray();
        for (char c : cs) {
            int num = Integer.parseInt(String.valueOf(c));
            result.add(num);
        }
        System.out.printf("%s中的无重复数字是：%n",String.valueOf(Math.PI));
        System.out.println(result);
    }
}
