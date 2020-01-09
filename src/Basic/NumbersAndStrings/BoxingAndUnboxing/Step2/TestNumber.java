package Basic.NumbersAndStrings.BoxingAndUnboxing.Step2;

public class TestNumber {
    public static void main(String[] args) {
        int i = 5;
        Integer it = new Integer(i);
        System.out.println(it instanceof Number);
    }
}
