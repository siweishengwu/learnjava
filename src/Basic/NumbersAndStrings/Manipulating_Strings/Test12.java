package Basic.NumbersAndStrings.Manipulating_Strings;

public class Test12 {
    public static void main(String[] args) {
        String s = "peter piper picked a peck of picked peppers";
        System.out.println(s);
        String [] words = s.split(" ");
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char firsWord = word.charAt(0);
            if (firsWord == 'p')
                count++;
        }
        System.out.printf("一共有%d个p开头的单词",count);
    }
}
