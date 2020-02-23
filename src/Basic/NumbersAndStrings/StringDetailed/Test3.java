package Basic.NumbersAndStrings.StringDetailed;

public class Test3 {
    public static void main(String[] args) {

    }
    private static boolean isLetterOrDigit(short i,short j,short k){
        return Character.isLetterOrDigit(i)&&
                Character.isLetterOrDigit(j)&&
                Character.isLetterOrDigit(k);
    }

    private static String randomString(int length){
        String pool = "";
        for (short i = '0';i <= '9'; i++) {
            pool += (char)i;
        }
        for (short i = 'a';i <= 'z'; i++) {
            pool += (char)i;
        }
        for (short i = 'A';i <= 'Z' ; i++) {
            pool += (char)i;
        }
        char cs[] = new char[length];
        for (int i = 0; i < cs.length; i++) {
            int index = (int) (Math.random()*pool.length());
            cs[i] = pool.charAt(index);
        }
        String result = new String(cs);
        return  result;
    }
}
