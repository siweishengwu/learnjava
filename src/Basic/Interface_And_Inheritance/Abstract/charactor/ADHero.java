package Basic.Interface_And_Inheritance.Abstract.charactor;

public class ADHero extends Hero implements AD {
    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }

    @Override
    public void attack() {
        physicAttack();
    }
}
