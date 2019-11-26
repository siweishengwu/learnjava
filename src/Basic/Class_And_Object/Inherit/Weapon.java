package Basic.Class_And_Object.Inherit;

public class Weapon extends Item {
    int damage;
    public static void main(String[] args) {
        Weapon infinityEdge = new Weapon();
        infinityEdge.name = "无尽之刃";
        infinityEdge.damage = 75;
        infinityEdge.price = 3700;
    }
}
