package Basic.Interface_And_Inheritance.Hide.charactor;

public class ADHero extends Hero implements AD {
    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }

    public static void battleWin(){
        System.out.println("ad hero battle win");
    }

    public static void main(String[] args) {
        Hero.battleWin();
        ADHero.battleWin();

        //test
        Hero h = new ADHero();
        h.battleWin();
        h = null;
        h.battleWin();
        ADHero adh = new ADHero();
        adh.battleWin();
        adh = null;
        adh.battleWin();
    }
}
