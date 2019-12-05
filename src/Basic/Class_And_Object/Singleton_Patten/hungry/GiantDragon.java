package Basic.Class_And_Object.Singleton_Patten.hungry;

public class GiantDragon {
    private GiantDragon(){

    }
    private static GiantDragon instance = new GiantDragon();

    public static GiantDragon getInstance(){
        return instance;
    }
}
