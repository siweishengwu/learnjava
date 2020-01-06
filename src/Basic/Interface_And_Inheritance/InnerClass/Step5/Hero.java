package Basic.Interface_And_Inheritance.InnerClass.Step5;

public abstract class Hero {
    public abstract void attack();

    public static void main(String[] args) {
        final int damage = 5;
        Hero h = new Hero(){
            public void attack(){
                System.out.printf("新的攻击手段，造成%d点伤害",damage);
            }
        };
    }
}
