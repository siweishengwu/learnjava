package Basic.Array.Arrays;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int a[] = new int[] {18,62,68,82,65,9,};
        int[] b = Arrays.copyOfRange(a,0,3);
        for (int i = 0; i <b.length ; i++) {
            System.out.print(b[i]+ " ");
        }
    }
}
