package Basic.NumbersAndStrings.Manipulating_Strings;

public class Step7 {
    public static void main(String[] args) {
        String sentcence = "盖伦,在进行了连续8次击杀后,获得了超神 的称号";
        System.out.println(sentcence.indexOf('在'));
        System.out.println(sentcence.indexOf('8'));
        System.out.println(sentcence.indexOf("超神"));
        System.out.println(sentcence.lastIndexOf("了"));
        System.out.println(sentcence.indexOf(',',5));
        System.out.println(sentcence.contains("击杀"));
    }
}
