package Basic.Class_And_Object.Class_Attributes_And_Static_Attributes.Charactor;

public class Hero {
    public String name;
    protected  float hp;
    static String copyright;

    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.name = "盖伦";

        Hero.copyright = "版权由Riot Games公司所有";

        System.out.println(garen.name);
        System.out.println(garen.copyright);

        Hero teemo = new Hero();
        teemo.name = "提莫";
        System.out.println(teemo.name);
        System.out.println(teemo.copyright);
        System.out.println(Hero.copyright);
    }
}
