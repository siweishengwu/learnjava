package Basic.NumbersAndStrings.StringDetailed;

public class Step6 {
    public static void main(String[] args) {
//        char c ='A';
//        String a ="Merry Christmas";
//        System.out.println(c);
//        short s = (short)c;
//        System.out.println(s);

        short start = '0';
        short end = 'z' + 1;
        char c = (char) ((Math.random()*(end-start))+start);
        System.out.println(((Math.random()*(end-start))+start));
        System.out.println(c);
    }
}
