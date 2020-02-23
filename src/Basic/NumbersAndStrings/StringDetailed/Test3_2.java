package Basic.NumbersAndStrings.StringDetailed;

import sun.security.util.Password;

public class Test3_2 {

    public static boolean found = false;
    public static void main(String[] args) {
        String password = randomString(3);
        System.out.println("密码是：" + password);

        char[] guessPassword = new char[password.length()];
        generatePassword(guessPassword,password);
    }

    public static  void generatePassword(char[] guessPassword,String password){
        generatePassword(guessPassword,0,password);
    }

    public static void generatePassword(char[] guessPassword,int index,String password){
        if (found)
            return;
        for (short i = '0'; i <= 'z' ; i++) {
            char c = (char) i;
            if (!Character.isLetterOrDigit(c))
                continue;
            guessPassword[index] = c;
            if (index!=guessPassword.length-1){
                    generatePassword(guessPassword,index+1,password);
                }
            else {
                String guess = new String (guessPassword);
//          System.out.println("穷举出来的密码是：" + guess);
                if (guess.equals(password)){
                        System.out.println("找到了，密码是："+guess);
                        found =true;
                        return;
                    }
                }
        }
    }

    private static String randomString(int length){
        String pool = "";
        for (int i = '0'; i <= '9' ; i++) {
            pool += (char)i;
        }
        for (int i = 'a'; i <= 'z' ; i++) {
            pool += (char)i;
        }
        for (int i = 'A'; i <= 'Z' ; i++) {
            pool += (char)i;
        }
        char cs[] = new char[length];
        for (int i = 0; i < cs.length ; i++) {
            int index = (int)(Math.random()*pool.length());
            cs[i] = pool.charAt(index);
        }
        String result = new String(cs);
        return result;
    }
}
