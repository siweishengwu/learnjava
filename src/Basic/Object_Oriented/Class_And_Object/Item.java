package Basic.Object_Oriented.Class_And_Object;

public class Item {
    String name ;
    int price ;

    public static void main(String[] args) {
        Item hpbox = new Item();
        hpbox.name = "血瓶";
        hpbox.price = 50;

        Item shoes = new Item();
        shoes.name = "草鞋";
        shoes.price = 300;

        Item long_sword = new Item();
        long_sword.name = "长剑";
        long_sword.price = 350;
    }
}
