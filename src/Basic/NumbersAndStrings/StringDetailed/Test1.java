package Basic.NumbersAndStrings.StringDetailed;

public class Test1 {
    public static void main(String[] args) {
        char cs[] = new char[5];
        short start = '0';
        short end = 'z' + 1;
        for (int i = 0; i < cs.length; i++) {
            while (true) {
                char c = (char) ((Math.random()*(end-start))+start);
                System.out.println(c);
                if (Character.isLetter(c) ||  Character.isDigit(c)){
                    cs[i] = c;
                    break;
                }
            }
        }
        String result = new String(cs);
        System.out.println(result);
    }
}
