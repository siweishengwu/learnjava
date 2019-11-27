package Basic.Class_And_Object.Passing_Parameters.Basic_Passing;

public class Hero {
    String name;
    float hp;
    float armor;
    int moveSpeed;
    public Hero(){

    }
    public void huixue(int xp){
        hp = hp + xp;
        xp = 0;
    }

    public Hero(String name,float hp) {
        this.name = name;
        this.hp = hp;
    }

    public static void main(String[] args) {
        Hero teemo = new Hero("提莫",383);
        int xp = 100;
        teemo.huixue(xp);
        System.out.println(teemo.hp);
    }
}
