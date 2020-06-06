package Mid_Level.Generic.Generic_Transformation;


import Mid_Level.ADHero;
import Mid_Level.Hero;

public class Step1 {

    public static void main(String[] args) {

        Hero h = new Hero();
        ADHero ad = new ADHero();
        //子类转父类
        h = ad;
    }
}
