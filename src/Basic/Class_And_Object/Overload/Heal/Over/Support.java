package Basic.Class_And_Object.Overload.Heal.Over;

public class Support extends Hero {
    public void heal() {
        System.out.println(name + "治疗了一个范围");
    }
    public void heal(Hero h1) {
        System.out.println(name + "治疗了" + h1.name);
    }
    public void heal(Hero h1,Hero h2) {
        System.out.println(name + "治疗了" + h1.name + "和" + h2.name);
    }
    public void  heal(Hero h1,int blood) {
        System.out.println(name + "治疗了" + h1.name + "加了" + blood +"点血");
    }
    public static void main(String[] args) {
        Support Soraka = new Support();
        Soraka.name = "索拉卡";

        Hero h1 = new Hero();
        h1.name = "盖伦";
        Hero h2 = new Hero();
        h2.name = "提莫";

        Soraka.heal();
        Soraka.heal(h2);
        Soraka.heal(h1,h2);
        Soraka.heal(h2,100);
    }
}
