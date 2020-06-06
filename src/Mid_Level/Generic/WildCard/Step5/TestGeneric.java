package Mid_Level.Generic.WildCard.Step5;

import Mid_Level.ADHero;
import Mid_Level.APHero;
import Mid_Level.Collection_Framework.ArrayList.Common_Methods.Hero;

import java.util.ArrayList;

public class TestGeneric {


    public static void iterate(ArrayList<Hero> list) {
        for (Hero hero : list) {
            System.out.println(hero.name);
        }
    }

    public static void iterateAP(ArrayList<APHero> list) {
//        for (Hero hero : list) {
//            System.out.println(hero.name);
//        }
    }

    public static void iterateAD(ArrayList<ADHero> list) {
//        for (Hero hero : list) {
//            System.out.println(hero.name);
//        }
    }

    public static void main(String[] args) {
        ArrayList<Hero> hs = new ArrayList<>();
        ArrayList<APHero> aphs = new ArrayList<>();
        ArrayList<ADHero> adhs = new ArrayList<>();

        iterate(hs);
        iterateAP(aphs);
        iterateAD(adhs);
    }
}
