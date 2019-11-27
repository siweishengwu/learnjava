package Basic.Class_And_Object.Construction_Method.Over;

public class Hero {
    String name;
    float hp;
    float armor;
    int moveSpeed;
    public Hero(String heroname) {
        name = heroname;
    }
    public  Hero(String heroname,float herohp) {
        name = heroname;
        hp = herohp;
    }
    public Hero(String heroName,float herohp,float heroArmor,int heroMoveSpeed) {
        name = heroName;
        hp = herohp;
        armor = heroArmor;
        moveSpeed = heroMoveSpeed;
    }
    public static void main(String[] args) {
        Hero garen = new Hero("盖伦");
        Hero temmo = new Hero("提莫",383);
        Hero bh = new Hero("赏金猎人",360,35,350);
    }
}
