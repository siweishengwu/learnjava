package Basic.Array.Arrays;

import java.util.Arrays;

public class Double_Array_Sort {
    public static void main(String[] args) {
        int a[][] = new int[5][8];
        int b[] = new int[a.length*a[0].length];
        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 8 ; j++) {
                a[i][j] = (int)(Math.random()*100);
            }
        }

        for (int i = 0; i < 5 ; i++) {
            System.out.println(" ");
            for (int j = 0; j < 8 ; j++) {
                System.out.print(a[i][j]+ " ");
            }
        }
        System.out.println(" ");
        for (int i = 0; i <a.length ; i++) {
            System.arraycopy(a[i],0,b,i*a[i].length,a[i].length);
        }
        System.out.println(" ");
        System.out.println(Arrays.toString(b));
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
        for (int i = 0; i < a.length ; i++) {
            System.arraycopy(b,i*a[i].length,a[i],0,a[i].length);
        }
        System.out.println(" ");

        for (int i = 0; i < 5 ; i++) {
            System.out.println(" ");
            for (int j = 0; j < 8 ; j++) {
                System.out.print(a[i][j]+ " ");
            }
        }
    }
}
