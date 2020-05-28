package Mid_Level.Collection_Framework.ArrayList.Generic.Step5;

public class Hero implements LOL {
    public String name;
    public float hp;

    public int damage;

    public Hero(){

    }

    public Hero(String name) {
        this.name = name;
    }

    public String toString(){
        return name;
    }
}
