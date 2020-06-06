package Mid_Level.Generic.WildCard.Step2;

import Basic.Interface_And_Inheritance.Interface.ADHero;
import Basic.Interface_And_Inheritance.Interface.APHero;
import Basic.Interface_And_Inheritance.Interface.Hero;

import java.util.ArrayList;

public class TestGeneric {
    public static void main(String[] args) {
        ArrayList<? super Hero> heroList = new ArrayList<Object>();

        //? super Hero 表示heroList 的泛型是Hero或者其父类泛型

        //heroList 的泛型可以是Hero
        //heroList 的泛型可以是Object

        //所以就可以插入Hero
        heroList.add(new Hero());
        //也可以插入Hero的子类
        heroList.add(new APHero());
        heroList.add(new ADHero());

        //但是，不能从里面取数据出来，因为其泛型可能是Object,而Object是强转Hero会失败
//        Hero h = heroList.get(0);
    }
}
