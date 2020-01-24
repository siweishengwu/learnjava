package Basic.NumbersAndStrings.Math;
public class Isprime {
    public static void main(String[] args) {
        int max = 1000*10000;
        int count = 0;
        for (int i = 1; i <= max; i++) {
            if (isPrime(i)){
                count++;
            }
        }
        System.out.println("一千万以内的质数一共有："+ count);
    }
    private static boolean isPrime(int i){
        for (int j = 2; j <= Math.sqrt(i) ; j++) {
            if (0 == i % j)
                return false;
        }
            return true;
        }
}
