package Basic.Class_And_Object.Passing_Parameters.Class_Class_Passing;

public class Hero {
    String name;
    float hp;
    float armor;
    int moveSpeed;

    public Hero(String name, float hp) {
        this.name = name;
        this.hp = hp;
    }
    public void attack(Hero hero,int damage){
        hero.hp = hero.hp - damage;
    }
    public static void main(String[] args) {
        Hero teemo = new Hero("提莫",383);
        Hero garen = new Hero("盖伦",616);
        garen.attack(teemo,100);
        System.out.println(teemo.hp);
    }
}
