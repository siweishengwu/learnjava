package Basic.NumbersAndStrings.Manipulating_Strings;

public class Step2 {
    public static void main(String[] args) {
        String sentence = "盖伦击杀八次后，获得超神";
        char[] cs = sentence.toCharArray();
        System.out.println(sentence.length()==cs.length);
        System.out.println(cs);
        System.out.println(sentence);
    }
}
