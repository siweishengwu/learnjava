package Basic.Interface_And_Inheritance.InnerClass.Step2;

public class Hero {
    public String name;
    protected float hp;
    private static void battleWin(){
        System.out.println("battle win");
    }
    static class EnemyCrystal{
        int hp = 5000;
        String name;
        //why add?

        public void checkIfVictory(){
            if (hp==0){
                Hero.battleWin();
                System.out.println(name+"win this game");
            }
        }
    }

    public static void main(String[] args) {
        Hero.EnemyCrystal crystal = new Hero.EnemyCrystal();
        crystal.checkIfVictory();
    }
}
