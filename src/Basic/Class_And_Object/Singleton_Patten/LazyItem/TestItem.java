package Basic.Class_And_Object.Singleton_Patten.LazyItem;

public class TestItem {
    public static void main(String[] args) {
        Item i1 = Item.getInstance();
        Item i2 = Item.getInstance();
        System.out.println(i1==i2);
    }
}
