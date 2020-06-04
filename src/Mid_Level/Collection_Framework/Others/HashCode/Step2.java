package Mid_Level.Collection_Framework.Others.HashCode;

import Mid_Level.Collection_Framework.ArrayList.Common_Methods.Hero;

import java.util.HashMap;

public class Step2 {
    public static void main(String[] args) {

        HashMap<String,Hero> heroMap = new HashMap<String, Hero>();
        for (int i = 0; i < 2000000; i++) {
            Hero h = new Hero("Hero " + i);
            heroMap.put(h.name,h);
        }
        System.out.println("数据准备完成");

        for (int i = 0; i < 10; i++) {
            long start = System.currentTimeMillis();

            //查找名字是Hero 1000000的对象
            Hero target = heroMap.get("Hero 1000000");
            System.out.println("找到了 hero!" + target.name);

            long end = System.currentTimeMillis();
            long elapsed = end - start;
            System.out.println("一共花了：" + elapsed + " 毫秒");
        }
    }
}