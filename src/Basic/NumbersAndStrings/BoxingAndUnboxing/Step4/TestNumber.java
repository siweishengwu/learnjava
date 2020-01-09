package Basic.NumbersAndStrings.BoxingAndUnboxing.Step4;

public class TestNumber {
    public static void main(String[] args) {
        int i = 5;
        Integer it = new Integer(i);
        int i2 = it.intValue();
        System.out.println(i2);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}
