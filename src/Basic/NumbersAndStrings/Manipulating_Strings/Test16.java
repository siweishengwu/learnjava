package Basic.NumbersAndStrings.Manipulating_Strings;

public class Test16 {
    public static void main(String[] args) {
        String s = "lengendary";
        char[] cs = s.toCharArray();
        cs[cs.length-1] = Character.toUpperCase(cs[cs.length-1]);
        String result = new String(cs);
        System.out.println(result);
    }
}
