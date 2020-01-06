package Basic.Interface_And_Inheritance.InnerClass.Step1;

public class Hero {
    private String name;
    float hp;
    float armor;
    int moveSpeed;
    class BattleScore{
        int kill;
        int die;
        int assit;
        public void legendary(){
            if (kill>=8)
                System.out.println(name + "超神！");
            else
                System.out.println(name + "尚未超神！");
        }
        public void ghost(){
            if (die>=8)
                System.out.println(name + "超鬼！");
            else
                System.out.println(name + "尚未鬼神！");
        }
    }

    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.name = "盖伦";
        BattleScore score = garen.new BattleScore();
        score.kill = 7;
        score.die = 8;
        score.legendary();
        score.ghost();
    }
}
