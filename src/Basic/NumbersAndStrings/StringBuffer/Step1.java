package Basic.NumbersAndStrings.StringBuffer;

public class Step1 {
    public static void main(String[] args) {
        String str1 = "let there ";
        StringBuffer sb = new StringBuffer(str1);
        sb.append("be light");
        System.out.println(sb);

        sb.delete(4,10);
        System.out.println(sb);

        sb.insert(4,"there ");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
    }
} 
