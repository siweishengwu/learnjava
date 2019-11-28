package Basic.Class_And_Object.Package.charactor1;
import Basic.Class_And_Object.Package.charactor.Hero;
public class Support extends Hero{
    public void heal(){
        System.out.println("对一群人治疗");
    }
    public void heal(Hero hero){
        System.out.println("给英雄"+ hero + "治疗");
    }
    public void heal(Hero hero,int hp){
        System.out.println("给英雄"+ hero + "治疗"+ hp+"血");
    }
}
