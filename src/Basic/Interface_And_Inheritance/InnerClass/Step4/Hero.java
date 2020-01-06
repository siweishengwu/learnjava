package Basic.Interface_And_Inheritance.InnerClass.Step4;

public abstract class Hero {
    String name;
    float hp;
    float armor;
    int moveSpeed;
    public abstract void attack();

    public static void main(String[] args) {
        class SomeHero extends Hero{
            public void attack(){
                System.out.println(name + "新的进攻手段");
            }
        }
        SomeHero h = new SomeHero();
        h.name = "地卜师";
        h.attack();
    }
}
