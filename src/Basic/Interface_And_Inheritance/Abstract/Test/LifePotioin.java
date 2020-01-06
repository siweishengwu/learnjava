package Basic.Interface_And_Inheritance.Abstract.Test;

public class LifePotioin extends Item {

    public void effect(){
        System.out.println("血瓶使用后可以回血");
    }
    @Override
    public boolean disposable() {
        return true;
    }
}
