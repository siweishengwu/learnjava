package Basic.NumbersAndStrings.StringDetailed;

public class Test1_2 {
    public static void main(String[] args) {
        String pool = "";
        for (short i = '0'; i <= '9'; i++){
            pool += (char)i;
        }
        for (short i = 'a'; i<= 'z'; i++){
            pool += (char)i;
        }
        for (short i = 'A'; i<= 'Z'; i++){
            pool += (char)i;
        }
        System.out.println(pool);
        char cs2[] = new char[5];
        for (int i = 0; i <cs2.length ; i++) {
            int index = (int) (Math.random()*pool.length());
            cs2[i] = pool.charAt(index);
        }
        String result2 = new String(cs2);
        System.out.println(result2);
    }
}
