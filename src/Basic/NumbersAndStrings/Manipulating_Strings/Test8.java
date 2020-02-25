package Basic.NumbersAndStrings.Manipulating_Strings;

public class Test8 {
    public static void main(String[] args) {
        String sentence = "盖伦,在进行了连续8次击杀后,获得了超神 的称号";
        String temp = sentence.replaceAll("击杀","被击杀");
        temp = temp.replaceAll("超神","超鬼");
        System.out.println(temp);
        temp = sentence.replaceFirst(",","");
        System.out.println(temp);
    }
}
