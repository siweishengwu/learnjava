package Basic.NumbersAndStrings.StringDetailed;

public class Step4 {
    public static void main(String[] args) {

        String name = "盖伦";
        int kill = 8;
        String title = "超神";
        String sentence = name + "在进行了连续" + kill + "次击杀后，获得了" + title + "的称号";
        String sentence2 = String.format(sentence,name,kill,title);
        System.out.println(sentence2);
    }

}
