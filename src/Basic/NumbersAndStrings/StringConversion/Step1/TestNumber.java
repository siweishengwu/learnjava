package Basic.NumbersAndStrings.StringConversion.Step1;

public class TestNumber {
    public static void main(String[] args) {
        int i = 5;
        String str = String.valueOf(i);
        System.out.println(i);
        Integer it = i;
        String str2 = it.toString();
        System.out.println(i);
    }
}
