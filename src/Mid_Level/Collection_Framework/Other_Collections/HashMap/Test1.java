package Mid_Level.Collection_Framework.Other_Collections.HashMap;

import java.util.HashMap;

public class Test1 {
    public static void main(String[] args) {
        HashMap<String,String> dictionary = new HashMap<>();
        dictionary.put("adc","物理英雄");
        dictionary.put("apc","魔法英雄");
        dictionary.put("t","坦克");

        System.out.println(dictionary.get("t"));
    }
}
