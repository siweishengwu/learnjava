package Basic.Class_And_Object.Singleton_Patten.HungryHero;

public class TestHero {
    public static void main(String[] args) {
        Hero h1 = Hero.getInstance();
        Hero h2 = Hero.getInstance();
        System.out.println(h1==h2);
        System.out.println(h1==h2);
    }
}
