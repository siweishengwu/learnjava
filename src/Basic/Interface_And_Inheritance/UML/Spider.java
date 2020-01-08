package Basic.Interface_And_Inheritance.UML;

public class Spider extends Animal {
    @Override
    public void eat() {
        System.out.println("eat");
    }
    public Spider(){
        super(8);
}
}
