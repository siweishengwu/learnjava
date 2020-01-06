package Basic.Interface_And_Inheritance.InnerClass.Step5.Test;

public abstract class Hero {
    public abstract void attack();

    public static void main(String[] args) {
        int damage = 5;
        class AnonymousHero extends Hero {
            int damage;
            public AnonymousHero(int damage) {
                this.damage = damage;
            }
            @Override
            public void attack() {
                damage = 10;
                System.out.printf("新的进攻手段，造成%d点伤害", this.damage);
            }
        }
        Hero h = new AnonymousHero(damage);
    }
}
