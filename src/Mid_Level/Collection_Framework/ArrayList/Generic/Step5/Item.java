package Mid_Level.Collection_Framework.ArrayList.Generic.Step5;

public class Item implements LOL{
    String name;
    int price;

    public Item(){

    }

    public Item(String name){
        this.name = name;
    }
    public void effect(){
        System.out.println("使用物品后，可以有效果");
    }

    public boolean disposable() {
        return false;
    }
}
