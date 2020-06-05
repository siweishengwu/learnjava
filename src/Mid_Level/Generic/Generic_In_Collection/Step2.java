package Mid_Level.Generic.Generic_In_Collection;

import Basic.Interface_And_Inheritance.Interface.APHero;

import java.util.ArrayList;

public class Step2 {
    public static void main(String[] args) {
        ArrayList<APHero> heros = new ArrayList<APHero>();

        //只有APHero可以放进去
        heros.add(new APHero());

        //ADHero甚至放不进去
        //heros.add(new ADHero());

        //获取的时候也不需要进行转型，因为取出来一定是APHero
        APHero apHero = heros.get(0);
    }
}
