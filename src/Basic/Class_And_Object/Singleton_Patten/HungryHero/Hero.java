package Basic.Class_And_Object.Singleton_Patten.HungryHero;

public class Hero {
    private Hero(){

    }
    public static Hero instance = new Hero();
    public static Hero getInstance(){
        return instance;
    }
}
