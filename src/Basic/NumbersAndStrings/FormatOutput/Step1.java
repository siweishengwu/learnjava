package Basic.NumbersAndStrings.FormatOutput;

public class Step1 {
    public static void main(String[] args) {
        String name = "盖伦";
        int kill = 8;
        String title = "超神";

        String sentenceFormat = name + "在进行了连续" + kill +"次击杀后，" +
                "获得了"+ title + "的称号";
        System.out.printf(sentenceFormat,name,kill,title);
        System.out.println(" ");
        String sentence = "%s在进行了连续%d次击杀后，获得了%s的称号%n";
        System.out.printf(sentence,name,kill,title);
    }
}
