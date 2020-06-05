package Mid_Level.Generic.Generic_In_Collection;

import Basic.Interface_And_Inheritance.Interface.AD;
import Basic.Interface_And_Inheritance.Interface.ADHero;
import Basic.Interface_And_Inheritance.Interface.APHero;

import java.util.ArrayList;

public class Step1 {
    public static void main(String[] args) {

        ArrayList heros = new ArrayList();

        heros.add(new APHero());
        heros.add(new ADHero());

        APHero apHero = (APHero) heros.get(0);
        ADHero adHero = (ADHero) heros.get(1);

        ADHero adHero2 = (ADHero) heros.get(0);
    }
}
