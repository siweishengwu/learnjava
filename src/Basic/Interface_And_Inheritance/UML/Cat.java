package Basic.Interface_And_Inheritance.UML;

public class Cat extends Animal implements Pet {
    private String name;
    public Cat (String name){
        super(4);
        this.name = name;
    }
    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void play() {
        System.out.println("play");
    }

}
