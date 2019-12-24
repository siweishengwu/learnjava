package Basic.Interface_And_Inheritance.Polymorphism.charactor.Test;

public class ADAPHero extends Hero implements AD,AP,Mortal {
    @Override
    public void physicAttack() {

    }

    @Override
    public void MagicAttack() {

    }

    @Override
    public void die() {
        System.out.println(name+"这个混伤英雄去世");
    }
}
