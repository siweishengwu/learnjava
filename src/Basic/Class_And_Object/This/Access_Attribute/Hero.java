package Basic.Class_And_Object.This.Access_Attribute;

public class Hero {
    String name;
    float hp;
    float armor;
    int moveSpeed;
    public void setName1(String name1) {
        name = name1;
    }
    public void setName2(String heroName) {
        name = heroName;
    }
    public void setName3(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Hero h = new Hero();
        h.setName1("temmo");
        System.out.println(h.name);
        h.setName2("garen");
        System.out.println(h.name);
        h.setName3("bh");
        System.out.println(h.name);
    }
}
