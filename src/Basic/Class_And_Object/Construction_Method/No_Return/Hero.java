package Basic.Class_And_Object.Construction_Method.No_Return;

public class Hero {
    String name;
    float hp;
    float armor;
    int moveSpeed;

    public Hero() {
        System.out.println("实例化一个对象的时候，必然调用构造方法");
    }

    public static void main(String[] args) {
        Hero h  = new Hero();
    }
}
