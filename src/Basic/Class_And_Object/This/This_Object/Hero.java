package Basic.Class_And_Object.This.This_Object;

public class Hero {
    String name;
    float hp;
    float armor;
    int moveSpeed;
    public void showAddressInMemory() {
        System.out.println("打印this看到的虚拟地址"+this);
    }

    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.name = "盖伦";

        System.out.println("打印对象看到的虚拟地址"+garen);
        garen.showAddressInMemory();

        Hero teemo = new Hero();
        teemo.name = "提莫";
        System.out.println("打印对象看到的虚拟地址"+teemo);
        teemo.showAddressInMemory();
    }
}
