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

        String name = "����";
        char a= 'c';

        //������ת���ַ�
        char tab = '\t'; //�Ʊ��
        char carriageReturn = '\r'; //�س�
        char newLine = '\n'; //����
        char doubleQuote = '\"'; //˫����
        char singleQuote = '\''; //������
        char backslash = '\\'; //��б��
        String doubleslash = "\\";

        System.out.print(name);
        System.out.print(backslash);
        System.out.print(doubleslash);
        System.out.print(name);
    }
}
