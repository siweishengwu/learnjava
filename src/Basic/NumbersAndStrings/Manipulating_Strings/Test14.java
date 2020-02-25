package Basic.NumbersAndStrings.Manipulating_Strings;

public class Test14 {
    public static void main(String[] args) {
        String s = "lengendary";
        char[] cs = s.toCharArray();
        int count = 0;
        for (int i = 0; i < cs.length; i++) {
            if (0 == i%2)
                cs[i] = Character.toUpperCase(cs[i]);
        }
        String result = new String(cs);
        System.out.println(result);
    }
}
