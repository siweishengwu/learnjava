package Basic.NumbersAndStrings.StringConversion;

public class TestNumber {
    public static void main(String[] args) {
        float i = 3.14f;
        String i1 = String.valueOf(i);
        System.out.println(i1);
        float i2;
        i2 = Float.parseFloat(i1);
        System.out.println(i2);
        Float.parseFloat("3.1a4");
    }
}
