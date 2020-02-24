package Basic.NumbersAndStrings.Manipulating_Strings;

public class Step4 {
    public static void main(String[] args) {
        String sentence = "盖伦击杀八次后，获得超神";
        String subSentences[] = sentence.split("获");
        for (String sub : subSentences) {
            System.out.println(sub);
        }
    }
}
