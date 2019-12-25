package Basic.Interface_And_Inheritance.Super.step3and4;

public class ADHero extends Hero implements AD {
    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }

    public ADHero(String name){
        super(name);
        System.out.println("AD Hero的构造方法");
    }

    public static void main(String[] args) {
        new ADHero("德莱文");
    }
}
