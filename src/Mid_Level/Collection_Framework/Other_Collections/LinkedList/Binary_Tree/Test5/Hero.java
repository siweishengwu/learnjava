package Mid_Level.Collection_Framework.Other_Collections.LinkedList.Binary_Tree.Test5;

public class Hero {
    public String name;
    public float hp;

    public int damage;
    public Hero(){

    }

    public Hero(String name) {
        this.name = name;
    }

    public String toString() {
        return String.format("[name:%s hp:%.0f]%n",name,hp);
    }
}
