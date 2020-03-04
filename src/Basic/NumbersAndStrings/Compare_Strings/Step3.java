package Basic.NumbersAndStrings.Compare_Strings;

public class Step3 {
    public static void main(String[] args) {
        String str1 = "the light";
        String str2 = new String(str1);
        String str3 = str1.toUpperCase();

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str3));
    }
}
