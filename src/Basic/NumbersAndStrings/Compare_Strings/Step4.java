package Basic.NumbersAndStrings.Compare_Strings;

public class Step4 {
    public static void main(String[] args) {
        String str1 = "the light";
        String start = "the";
        String end = "light";
        System.out.println(str1.startsWith(start));
        System.out.println(str1.startsWith(end));
        System.out.println(str1.endsWith(end));
    }
}
