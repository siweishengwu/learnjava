package Basic.NumbersAndStrings.Manipulating_Strings;

public class Test18 {
    public static void main(String[] args) {
        String s = "Nature has given us that two ears, two eyes, and but one tongue, to the end that we should hear and see more than we speak";
        int index = s.lastIndexOf(" two ");
        System.out.println(index);
        char[] cs = s.toCharArray();
        System.out.println(s);
        System.out.println(cs[index+1]);
        cs[index+1] = Character.toUpperCase(cs[index+1]);
        System.out.println(cs[index+1]);
        String result = new String(cs);
        System.out.println(result);
    }
}
