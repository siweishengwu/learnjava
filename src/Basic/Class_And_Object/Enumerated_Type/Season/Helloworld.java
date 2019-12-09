package Basic.Class_And_Object.Enumerated_Type.Season;


public class Helloworld {
    public static void main(String[] args) {
        Season season = Season.SPRING;
        switch (season){
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;
        }
        for (int i = 0; i <Season.values().length ; i++) {
            System.out.println(Season.values()[i]);
        }
        for (Season s : Season.values()) {
            System.out.println(s);
        }
    }
}
