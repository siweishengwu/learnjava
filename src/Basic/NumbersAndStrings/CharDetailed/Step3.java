package Basic.NumbersAndStrings.CharDetailed;

public class Step3 {
    public static void main(String[] args) {
        System.out.println(Character.isLetter('a'));
        System.out.println(Character.isDigit('1'));
        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));

        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));

        String a = "a";
        String a2 = Character.toString('a');
        System.out.println(a);
        System.out.println(a2);
    }
}
