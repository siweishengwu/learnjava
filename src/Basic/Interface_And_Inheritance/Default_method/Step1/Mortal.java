package Basic.Interface_And_Inheritance.Default_method.Step1;

public interface Mortal {
    public void die();
    default public void revive(){
        System.out.println("英雄复活了");
    }
    default public void attack(){
        System.out.println("attack");
    }
}
