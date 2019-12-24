package Basic.Interface_And_Inheritance.Polymorphism.charactor.property;

public class Hero {
    public String name;
    public float hp;
    public void useLifePotion(LifePotion lp){
        lp.effect();
    }
    public void useMagicPotion(MagicPotion mp){
        mp.effect();
    }

    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.name = "盖伦";
        LifePotion lp = new LifePotion();
        MagicPotion mp = new MagicPotion();
        garen.useLifePotion(lp);
        garen.useMagicPotion(mp);
    }
}
