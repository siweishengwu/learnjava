package Basic.NumbersAndStrings.Manipulating_Strings;

public class Test9 {
    public static void main(String[] args) {
        String s = "let there be light";
        System.out.println(s);
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char upperCaseFirstWord = Character.toUpperCase(word.charAt(0));
            String rest = word.substring(1);
            String capitalizedWord = upperCaseFirstWord + rest;
            words[i] = capitalizedWord;
//            System.out.println(words[i]);
        }
        String result = "";
        for (String word : words) {
            result += word + " ";
        }
//        result = result.trim();
        System.out.println(result);
    }
}
