package Basic.Interface_And_Inheritance.Super.step1and2;

import Basic.Interface_And_Inheritance.ReWrite.Property.Item;

public class Hero {
    String name;
    float hp;
    float armor;
    int moveSpeed;
    public void useItem(Item i){
        System.out.println("Hero use item");
        i.effect();
    }
    public Hero(){
        System.out.println("Hero的无参构造方法");
    }
    public static void main(String[] args) {
        new Hero();
    }
}
