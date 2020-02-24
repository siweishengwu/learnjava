package Basic.NumbersAndStrings.Manipulating_Strings;

public class Step3 {
    public static void main(String[] args) {
        String sentence = "盖伦击杀八次后，获得超神";
        String subString1 = sentence.substring(3);
        System.out.println(subString1);
        String subString2 = sentence.substring(3,5);
        System.out.println(subString2);
    }
}
