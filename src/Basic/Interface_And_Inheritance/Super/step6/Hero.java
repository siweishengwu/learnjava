package Basic.Interface_And_Inheritance.Super.step6;

import Basic.Interface_And_Inheritance.ReWrite.Property.Item;

public class Hero {
    String name;
    float hp;
    float arrmor;
    int moveSpeed;

    public void useItem(Item i){
        System.out.println("hero use item");
        i.effect();
    }
}
