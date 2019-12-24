package Basic.Interface_And_Inheritance.Polymorphism.charactor.Test;

public class ADHero extends Hero implements AD,Mortal{
    @Override
    public void physicAttack() {

    }

    @Override
    public void die() {
        System.out.println(name+"这个物理英雄去世");
    }
}
