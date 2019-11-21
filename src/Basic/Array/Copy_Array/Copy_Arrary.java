package Basic.Array.Copy_Array;

public class Copy_Arrary {
    public static void main(String[] args) {
        int a[] = new int[] {18,62,68,82,65,9,};
        int b[] = new int[3];
        //方法一：for循环
//        for (int i = 0; i < b.length ; i++) {
//            b[i] = a[i];
//        }

        //方法二
        System.arraycopy(a,0,b,0,3);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }
    }
}
