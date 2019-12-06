package Basic.Class_And_Object.Attribute_Initialization;

public class Hero {
    public Hero(){
        name = getName("构造方法");
    }
    {
        name = getName("初始化块");
    }
    public String name = getName("属性声明");
    {
        name = getName("初始化块");
    }
    public static String getName(String name){
        System.out.println("初始化："+name);
        return name;
    }

    public static void main(String[] args) {
        new Hero();
    }
}
