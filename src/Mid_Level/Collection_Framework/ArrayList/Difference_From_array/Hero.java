package Mid_Level.Collection_Framework.ArrayList.Difference_From_array;

public class Hero {
    public String name;
    public float hp;
    public int damage;

    public Hero(){

    }

    // 增加一个初始化name的构造方法
    public Hero(String name) {
        this.name = name;
    }

    // 重写toString 方法
    public String toSting(){
        return name;
    }
}
