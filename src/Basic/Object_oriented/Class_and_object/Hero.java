package Basic.Object_oriented.Class_and_object;

public class Hero {

    String name;
    float hp;
    float armor;
    int moveSpeed;

    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.name = "盖伦";
        garen.hp = 616.28f;
        garen.armor = 27.1f;
        garen.moveSpeed = 350;

        Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 383.1f;
        teemo.armor = 14.1f;
        teemo.moveSpeed = 330;
    }

}

