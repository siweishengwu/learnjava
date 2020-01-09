package Basic.NumbersAndStrings.FormatOutput;

import java.util.Locale;

public class Step3 {
    public static void main(String[] args) {
        int year = 2020;
        System.out.format("%d%n",year);
        System.out.format("%8d%n",year);
        System.out.format("%-8d%n",year);
        System.out.format("%08d%n",year);
        System.out.format("%,8d%n",year*1000);
        System.out.format("%.2f%n",Math.PI);
        System.out.format(Locale.FRANCE,"%,.2f%n",Math.PI*10000);
        System.out.format(Locale.US,"%,.2f%n",Math.PI*10000);
        System.out.format(Locale.UK,"%,.2f%n",Math.PI*10000);
    }
}
