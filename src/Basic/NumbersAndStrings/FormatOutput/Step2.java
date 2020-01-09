package Basic.NumbersAndStrings.FormatOutput;

public class Step2 {
    public static void main(String[] args) {
        String name = "盖伦";
        int kill = 8;
        String title = "超神";
        String sentenceFormat ="%s 在进行了连续 %d 次击杀后，获得了 %s 的称号%n";
        System.out.printf(sentenceFormat,name,kill,title);
        System.out.format(sentenceFormat,name,kill,title);

        System.out.printf("这是换行符%n1");
        System.out.printf("%n这是换行符%n");
    }
}
