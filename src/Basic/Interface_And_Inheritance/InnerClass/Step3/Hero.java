package Basic.Interface_And_Inheritance.InnerClass.Step3;

import Basic.Interface_And_Inheritance.Abstract.charactor.ADHero;

public abstract class Hero {
    String name;
    float hp;
    float armor;
    int moveSpeed;
    public abstract void attack();

    public static void main(String[] args) {
        ADHero adh = new ADHero();
        adh.attack();
        System.out.println(adh);

        Hero h = new Hero() {
            @Override
            public void attack() {
                System.out.println("新的进攻手段");
            }
        };
        h.attack();
        System.out.println(h);
    }
}
