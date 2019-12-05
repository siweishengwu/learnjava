package Basic.Class_And_Object.Singleton_Patten.Lazy;

public class GiantDragon {
    private GiantDragon(){

    }
    private static GiantDragon instance;
    public static GiantDragon getInstance(){
        if (null == instance){
            instance = new GiantDragon();
        }
        return instance;
    }
}
