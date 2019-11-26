package Basic.Array.Class_And_Object.Reference;

public class Hero {
    String name;
    float hp;
    float arrmor;
    int moveSpeed;

    public static void main(String[] args) {
        new Hero();
        Hero h = new Hero();
        Hero h1 = h;
        Hero gg = h1;
        Hero h4 = gg;
        Hero h2 = h4;

        Hero garen = new Hero();
        garen = new Hero();
    }
}
