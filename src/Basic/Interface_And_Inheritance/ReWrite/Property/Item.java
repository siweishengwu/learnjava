package Basic.Interface_And_Inheritance.ReWrite.Property;

public class Item {
    String name;
    int price;
    public void buy(){
        System.out.println("购买");
    }
    public void effect(){
        System.out.println("物品使用后，可以有效果");
    }

    public static void main(String[] args) {
        Item i = new Item();
        i.effect();

        LifePotion lp = new LifePotion();
        lp.effect();

        MagicPotion mg = new MagicPotion();
        mg.effect();
    }
}
