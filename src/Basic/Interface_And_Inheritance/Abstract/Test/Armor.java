package Basic.Interface_And_Inheritance.Abstract.Test;

public class Armor extends Item {

    int ac;
    @Override
    public boolean disposable() {
        return false;
    }
}
