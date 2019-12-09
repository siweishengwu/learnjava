package Basic.Class_And_Object.Singleton_Patten.LazyItem;

public class Item {
    private Item(){

    }
    public static Item instance;
    public static Item getInstance(){
        if (instance==null){
            instance = new Item();
        }
        return instance;
    }
}
