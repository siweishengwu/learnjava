package Basic.Object_oriented.variable;

public class Literal_var {
    public static void main(String[] args) {
        long val = 26L;
        int decVal = 26;
        int hexVal = 0x1a;
        int oxVal = 032;
        int binVal = 0b11010;
//        System.out.println(binVal);

        float f1 = 123.4f;
        float F2 = 123.4F;
//        System.out.println(f1);
//        System.out.println(F2);

        double d1 = 123.4;
        double d2 = 1.234e2;
        double d3 = 1.234E2;
//        System.out.println(d1);
//        System.out.println(d2);
//        System.out.println(d3);

        String name = "盖伦";
        char a= 'c';

        //以下是转义字符
        char tab = '\t'; //制表符
        char carriageReturn = '\r'; //回车
        char newLine = '\n'; //换行
        char doubleQuote = '\"'; //双引号
        char singleQuote = '\''; //单引号
        char backslash = '\\'; //反斜杠
        String doubleslash = "\\";

        System.out.print(name);
        System.out.print(backslash);
        System.out.print(doubleslash);
        System.out.print(name);
    }
}
