package Basic.Interface_And_Inheritance.Abstract.charactor;

public class APHero extends Hero implements AP {
    @Override
    public void magicAttack() {
        System.out.println("进行魔法攻击");
    }

    @Override
    public void attack() {
        magicAttack();
    }
}
