package Basic.Array.Copy_Array;

public class Merge_Array {
    public static void main(String[] args) {
        int[] a = new int[(int)(Math.random()*5+5)];
        int[] b = new int[(int)(Math.random()*5+5)];
        int[] c = new int[a.length+b.length];
        System.out.println("数组A:");
        for (int i = 0; i < a.length ; i++) {
            a[i] = (int)(Math.random()*100);
            System.out.print(a[i]+" ");
        }
        System.out.println("");
        System.out.println("数组B:");
        for (int i = 0; i < b.length ; i++) {
            b[i] = (int)(Math.random()*100);
            System.out.print(b[i]+" ");
        }
        System.arraycopy(a,0,c,0,a.length);
        System.arraycopy(b,0,c,a.length,b.length);

        System.out.println("");
        System.out.println("数组C:");
        for (int i = 0; i < c.length ; i++) {
            System.out.print(c[i]+" ");
        }
//        System.out.println(" ");
    }
}
