package Basic.NumbersAndStrings.BoxingAndUnboxing.Digit;

public class TestNumer {
    public static void main(String[] args) {
        int i = 5;
        Integer it = new Integer(i);
        int i2 = it.intValue();
        System.out.println(i2+5);
    }
}
