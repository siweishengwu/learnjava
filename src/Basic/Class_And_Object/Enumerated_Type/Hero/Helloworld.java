package Basic.Class_And_Object.Enumerated_Type.Hero;

public class Helloworld {
    public static void main(String[] args) {
        Hero hero = Hero.ADC;
        switch(hero){
            case TANK:
                System.out.println("坦克");
                break;
            case ADC:
                System.out.println("远程ad");
                break;
            case ASSASSIN:
                System.out.println("刺客");
                break;
            case JUNGLE:
                System.out.println("打野");
                break;
            case WARRIOR:
                System.out.println("战士");
                break;
            case WIZARD:
                System.out.println("法师");
                break;
            case ASSIST:
                System.out.println("辅助");
                break;
        }
    }
}
