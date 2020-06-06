package Mid_Level.Generic.Generic_Transformation;

import Mid_Level.APHero;
import Mid_Level.Collection_Framework.ArrayList.Common_Methods.ADHero;
import Mid_Level.Collection_Framework.ArrayList.Common_Methods.Hero;

import java.util.ArrayList;

public class Step3 {
    public static void main(String[] args) {
        ArrayList<Hero> hs = new ArrayList<>();
        ArrayList<ADHero> adhs = new ArrayList<>();

        //假设能转换成功
//        hs = adhs;

        //作为Hero泛型的hs,是可以向其中加入APHero的
        //但是这个应用，实际上是指向一个ADHero泛型的容器
        //如果能加进去，就变成了ADHero泛型的容器里放进了APHero,这就矛盾了
//        hs.add(new APHero());
    }
}
