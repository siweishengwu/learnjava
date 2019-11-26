package Basic.Class_And_Object.Inherit;

public class Armor extends Item {
    int armorvalue;

    public static void main(String[] args) {
        Armor ClothArmor = new Armor();
        ClothArmor.name = "布甲";
        ClothArmor.price = 300;
        ClothArmor.armorvalue = 30;
        Armor ChainArmor = new Armor();
        ChainArmor.name = "锁子甲";
        ChainArmor.price = 800;
        ChainArmor.price = 50;
    }
}
