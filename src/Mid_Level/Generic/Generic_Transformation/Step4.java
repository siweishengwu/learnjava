package Mid_Level.Generic.Generic_Transformation;

import Mid_Level.Collection_Framework.ArrayList.Common_Methods.ADHero;
import Mid_Level.Collection_Framework.ArrayList.Common_Methods.Hero;

import java.util.ArrayList;

public class Step4 {
    public static void main(String[] args) {
        ArrayList<Hero> hs = new ArrayList<>();
        ArrayList<ADHero> adhs = new ArrayList<>();

        //父类泛型转子类泛型,能否成功？为什么？
//        adhs = hs;

        //假设能成功
        //这个时候adhs实际上指向的是泛型是Hero的容器，而这个容器里面可能放的是一个APHero
        //而根据泛型，直接取出来就转换成了ADHero
        //所以就变成了APHero转型成ADHero,这是矛盾的
    }
}
