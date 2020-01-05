package Basic.Interface_And_Inheritance.Abstract.charactor;

public class ADAPHero extends Hero implements AD,AP {
    @Override
    public void physicAttack() {
        System.out.println("ad攻击");
    }

    @Override
    public void magicAttack() {
        System.out.println("ap攻击");
    }

    @Override
    public void attack() {
        System.out.println("adap攻击");
    }
}
