package Mid_Level.Collection_Framework.ArrayList.List;

import Mid_Level.Collection_Framework.ArrayList.Common_Methods.Hero;

import java.util.ArrayList;
import java.util.List;

public class Step1 {
    public static void main(String[] args) {
        //ArrayList 实现了接口List
        //常见的写法会把引用声明为接口List类型
        //注意：是java.uitl.List,而不是java.awt.List
        //接口引用指向子类对象（多态）

        List heros = new ArrayList();
        heros.add(new Hero("盖伦"));
        System.out.println(heros.size());
    }
}
