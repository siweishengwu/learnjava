package Basic.Class_And_Object.Attribute_Initialization.Test1.Charactor;

public class Hero {
    public String name = "some hero";
    protected float hp;
    float maxHP;
    {
        maxHP = 200;
    }

    public Hero(){
        hp = 100;
    }
}
