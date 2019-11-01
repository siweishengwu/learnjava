package Basic.Object_oriented.Class_and_object;

public class Ways_Hero {
    String name;
    float hp;
    float armor;
    int moveSpeed;

    public float getArmor(){
        return armor;
    }

    public void keng(){
        System.out.println("坑队友！！");
    }

    public void addSpeed(int speed){
        moveSpeed = moveSpeed + speed;
        System.out.println(moveSpeed);
    }

    public void legendary(){
        System.out.println("已超神");
    }

    public float getHp(){
        return hp;
    }

    public void recovery(float blood){
        hp = hp + blood;
    }
    public static void main(String[] args) {
        Ways_Hero garen = new Ways_Hero();
        garen.name = "盖伦";
        garen.moveSpeed = 350;
        garen.addSpeed(100);
        System.out.println(garen.name+"现在血量"+garen.hp);
        garen.recovery(50);
        System.out.println(garen.name+"回血后"+garen.hp);
    }
}
