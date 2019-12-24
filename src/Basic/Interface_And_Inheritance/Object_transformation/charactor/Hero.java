package Basic.Interface_And_Inheritance.Object_transformation.charactor;


import Basic.Interface_And_Inheritance.Interface.ADHero;
import Basic.Interface_And_Inheritance.Interface.APHero;
import Basic.Interface_And_Inheritance.Interface.Support;

public class Hero {
    public String name;
    protected float hp;

    public static void main(String[] args) {
        ADHero ad = new ADHero();
        APHero ap = new APHero();
//        Hero h = ad;
//        AD adi = (AD)h;
//        APHero ap = (APHero) adi;
//        Hero h1 = ad;
//        Hero h2 = ap;
//        System.out.println(h1 instanceof ADHero);
    }
}
