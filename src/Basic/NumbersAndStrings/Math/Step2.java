package Basic.NumbersAndStrings.Math;

public class Step2 {
    public static void main(String[] args) {
        System.out.println(Math.E);

        long[] maxN = new long[]{Byte.MAX_VALUE,Short.MAX_VALUE,Integer.MAX_VALUE,Long.MAX_VALUE};
        for (long n : maxN){
            double e = Math.pow(1+1d/n,n);
            System.out.println(e);
        }
        int  n1 = 10;
        double e1 = Math.pow(1+1d/n1,n1);
        System.out.println(e1);
    }
}
