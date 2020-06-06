package Mid_Level.Collection_Framework.ArrayList.Common_Methods;

import Basic.Interface_And_Inheritance.Interface.AD;
import Basic.Interface_And_Inheritance.Interface.Hero;

public class ADHero extends Hero implements AD {
    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
}
