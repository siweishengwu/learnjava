package Mid_Level.Generic.WildCard.Step6;

import Mid_Level.APHero;
import Mid_Level.Collection_Framework.ArrayList.Common_Methods.ADHero;
import Mid_Level.Collection_Framework.ArrayList.Common_Methods.Hero;

import java.util.ArrayList;

public class TestGeneric {

    private static void iterate(ArrayList<? extends Hero> list) {
        for (Hero hero : list) {
            System.out.println(hero.name);
        }
    }
    public static void main(String[] args) {
        ArrayList<Hero> hs = new ArrayList<>();
        ArrayList<APHero> aphs = new ArrayList<>();
        ArrayList<ADHero> adhs = new ArrayList<>();

        iterate(hs);
//        iterate(aphs);
//        iterate(adhs);
    }


}
