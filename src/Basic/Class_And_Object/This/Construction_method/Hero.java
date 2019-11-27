package Basic.Class_And_Object.This.Construction_method;

public class Hero {
    String name;
    float hp;
    float armor;
    int moveSpeed;
    public Hero(String name){
        System.out.println("一个参数的构造方法");
        this.name = name;
    }

    public Hero(String name,float hp){
        this(name);
        System.out.println("两个参数的构造方法");
        this.hp = hp;
    }

    public Hero(String name,float hp,float armor,int moveSpeed) {
        this(name,hp);
        System.out.println("四个参数的构造方法");
        this.armor = armor;
        this.moveSpeed = moveSpeed;
    }
    public static void main(String[] args) {
        Hero temmo = new Hero("提莫",383,45,350);
        System.out.println(temmo.name);
        System.out.println(temmo.hp);
        System.out.println(temmo.armor);
        System.out.println(temmo.moveSpeed);
    }
}
