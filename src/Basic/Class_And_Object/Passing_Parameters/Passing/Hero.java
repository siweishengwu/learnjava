package Basic.Class_And_Object.Passing_Parameters.Passing;

public class Hero {
    String name;
    float hp;
    float armor;
    int moveSpeed;
    public Hero() {

    }
    public Hero(String name,float hp) {
        this.name = name;
        this.hp = hp;
    }

    public void revive(Hero h) {
        h = new Hero("提莫",383);
    }

    public static void main(String[] args) {
        Hero teemo = new Hero("提莫",383);
        teemo.hp = teemo.hp - 400;
        teemo.revive(teemo);
        System.out.println(teemo.hp);
    }
}
