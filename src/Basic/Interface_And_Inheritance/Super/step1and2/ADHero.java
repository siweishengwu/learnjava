package Basic.Interface_And_Inheritance.Super.step1and2;

public class ADHero extends Hero implements AD {

    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
    public ADHero(){
        System.out.println("AD Hero的构造方法");
    }
    public static void main(String[] args) {
        new ADHero();
    }
}
