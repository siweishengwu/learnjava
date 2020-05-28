package Mid_Level.Collection_Framework.ArrayList.Generic.Step5;

import Basic.Class_And_Object.Singleton_Patten.Lazy.GiantDragon;
import Mid_Level.Collection_Framework.ArrayList.Generic.Step5.Item;
import Mid_Level.Collection_Framework.ArrayList.Generic.Step5.Hero;
import Mid_Level.Collection_Framework.ArrayList.Generic.Step5.LOL;


import java.util.ArrayList;
import java.util.List;

public class TestCollection {

    public static void main(String[] args) {
        List<LOL> lolList = new ArrayList<>();
        lolList.add( new Hero("盖伦")); //能放Hero
        lolList.add( new Item("血瓶")); //也能放Item

//        lolList.add( new GiantDragon()); // GainDragon既不是Hero也不是Item
    }
}
