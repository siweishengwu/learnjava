package Basic.Class_And_Object.Construction_Method.No_Value;

public class Hero {
    String name;
    float hp;
    float armor;
    int moveSpeed;
//    public Hero(){
//        System.out.println("调用Hero的构造方法");
//    }
    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.name = "盖伦";
        garen.hp = 616.28f;
        garen.armor = 27.536f;
        garen.moveSpeed = 350;

        Hero temmo = new Hero();
        temmo.name = "提莫";
        temmo.hp =  383f;
        temmo.armor = 14f;
        temmo.moveSpeed = 330;
    }
}
