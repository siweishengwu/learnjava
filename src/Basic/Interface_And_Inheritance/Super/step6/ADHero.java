package Basic.Interface_And_Inheritance.Super.step6;

import Basic.Interface_And_Inheritance.ReWrite.Property.Item;
import Basic.Interface_And_Inheritance.ReWrite.Property.LifePotion;
public class ADHero extends Hero implements AD {

    int moveSpeed = 400;

    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
    public int getMoveSpeed(){
        return this.moveSpeed;
    }
    public int getMoveSpeed2(){
        return super.moveSpeed;
    }

    public void useItem(Item i){
        System.out.println("adhero use item");
        super.useItem(i);
    }

    public static void main(String[] args) {
        ADHero h = new ADHero();
        LifePotion lp = new LifePotion();
    }
}
