package Mid_Level.Generic.WildCard.Step1;

import Basic.Interface_And_Inheritance.Interface.ADHero;
import Basic.Interface_And_Inheritance.Interface.APHero;
import Basic.Interface_And_Inheritance.Interface.Hero;

import java.util.ArrayList;

public class TestGeneric {
    public static void main(String[] args) {

        ArrayList<APHero> apHeroList = new ArrayList<APHero>();
        apHeroList.add(new APHero());

        ArrayList<? extends Hero> heroList = apHeroList;
        //? extends Hero 表示这是一个Hero泛型的子类泛型

        //heroList 的泛型可以是Hero
        //heroList 的泛型可以是APHero
        //heroList 的泛型可以是ADHero

        //可以确凿的是，从heroList取取来的对象，一定是可以转型成Hero的

        Hero h = heroList.get(0);

        //但是，不能往里面放东西
//        heroList.add(new ADHero());//编译错误，因为heroList的泛型 有可能是APHero
    }
}
