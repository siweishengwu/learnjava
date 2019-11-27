package Basic.Class_And_Object.Construction_Method.Have_Value;

public class Hero {
    String name;
    float hp;
    float armor;
    int moveSpeed;
    public Hero(String heroname) {
        name = heroname;
    }

    public static void main(String[] args) {
        Hero garen = new Hero("盖伦");

//        Hero teemo = new Hero("");
//        Hero teemo = new Hero("提莫");
    }
}
