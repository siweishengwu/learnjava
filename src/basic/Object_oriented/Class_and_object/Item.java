package basic.Object_oriented.Class_and_object;

public class Item {
    String name ;
    int price ;

    public static void main(String[] args) {
        Item hpbox = new Item();
        hpbox.name = "ÑªÆ¿";
        hpbox.price = 50;

        Item shoes = new Item();
        shoes.name = "²ÝÐ¬";
        shoes.price = 300;

        Item long_sword = new Item();
        long_sword.name = "³¤½£";
        long_sword.price = 350;
    }
}
