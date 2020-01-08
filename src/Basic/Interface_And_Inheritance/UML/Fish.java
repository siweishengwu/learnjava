package Basic.Interface_And_Inheritance.UML;

public class Fish extends Animal implements Pet {
   protected String name;
   public Fish(String name){
        super(0);
        this.name = name;
   }

    @Override
    public void walk() {
        System.out.println("swimming");
    }

    @Override
    public void eat() {

    }

    @Override
    public void setName(String name) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void play() {

    }
}
