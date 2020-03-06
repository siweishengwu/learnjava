package Basic.NumbersAndStrings.StringBuffer;

public class Strp2 {
    public static void main(String[] args) {
        String str1 = "the";
        StringBuffer sb = new StringBuffer(str1);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
    }
}
