package Basic.Class_And_Object.Attribute_Initialization.Test2.Charactor;

public class Hero {
    public String name;
    protected float hp;
    float maxHP;

    public static int itemCapacity = 8;

    static{
        itemCapacity = 6;
    }

    public Hero(){
    }

    public static void main(String[] args) {
        System.out.println(Hero.itemCapacity);
    }
}
