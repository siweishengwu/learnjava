package Basic.NumbersAndStrings.Compare_Strings;

public class Step1 {
    public static void main(String[] args) {
        String str1 = "the light";
        String str2 = new String(str1);
        System.out.println(str2);
        String str3 = "the light";
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
    }
}
