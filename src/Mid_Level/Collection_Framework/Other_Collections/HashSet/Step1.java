package Mid_Level.Collection_Framework.Other_Collections.HashSet;

import java.util.HashSet;

public class Step1 {
    public static void main(String[] args) {

        HashSet<String> names = new HashSet<String>();

        names.add("gareen");

        System.out.println(names);

        //第二次插入同样的数据，是插不进去的，容器中只会保留一个
        names.add("gareen");
        System.out.println(names);

        names.add("Teemo");
        System.out.println(names);
    }
}
