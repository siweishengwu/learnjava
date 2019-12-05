package Basic.Class_And_Object.Class_Method.Charactor;

public class Hero {
    public String name;
    protected float hp;

    public void die(){
        hp = 0;
    }

    public static void battleWin(){
        System.out.println("battle win");
    }
    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.name = "盖伦";
        garen.hp = 488.0f;
        System.out.println(garen.hp);
        garen.die();
        System.out.println(garen.hp);
        Hero teemo = new Hero();
        teemo.name = "提莫";
        Hero.battleWin();
    }
}
