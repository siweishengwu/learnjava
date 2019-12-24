package Basic.Interface_And_Inheritance.Polymorphism.charactor.Test;

public class APHero extends Hero implements AP,Mortal{
    @Override
    public void MagicAttack() {

    }

    @Override
    public void die() {
        System.out.println(name+"这个AP英雄去世");
    }
}
