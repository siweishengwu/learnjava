package Basic.Interface_And_Inheritance.Super.step3and4;

import Basic.Interface_And_Inheritance.ReWrite.Property.Item;
public class Hero {
    String name;
    float hp;
    float armor;
    int moveSpeed;
    public void useItem(Item i){
        System.out.println("hero use item");
        i.effect();
    }

    public Hero(){
        System.out.println("Hero的无参的构造方法");
    }

    public Hero(String name){
        System.out.println("Hero的有一个参数的构造方法");
        this.name = name;
    }

    public static void main(String[] args) {
        new Hero();
    }
}
