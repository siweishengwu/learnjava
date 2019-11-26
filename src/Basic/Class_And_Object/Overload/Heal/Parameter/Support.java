package Basic.Class_And_Object.Overload.Heal.Parameter;

public class Support extends Hero {
    public void heal() {
        System.out.println(name + "治疗了一个范围");
    }
    public void heal(Hero... heros) {
        for (int i = 0; i < heros.length ; i++) {
            System.out.println(name + "治疗了" + heros[i].name);
        }
    }
    public static void main(String[] args) {
        Support Soraka = new Support();
        Soraka.name = "索拉卡";

        Hero h1 = new Hero();
        h1.name = "盖伦";
        Hero h2 = new Hero();
        h2.name = "提莫";

        Soraka.heal();
        Soraka.heal(h1,h2);
    }
}
