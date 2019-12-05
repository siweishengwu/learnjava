package Basic.Class_And_Object.Singleton_Patten.hungry;

public class TestGiantDragon {
    public static void main(String[] args) {
        GiantDragon g1 = GiantDragon.getInstance();
        GiantDragon g2 = GiantDragon.getInstance();
        GiantDragon g3 = GiantDragon.getInstance();

        System.out.println(g1==g2);
        System.out.println(g1==g3);
    }
}
