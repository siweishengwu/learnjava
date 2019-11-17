package Basic.Array.Array_Init;

public class Array_Inversion {
    public static void main(String[] args) {
        int [] a = new int[5];
        a[0] = (int) (Math.random()*100);
        a[1] = (int) (Math.random()*100);
        a[2] = (int) (Math.random()*100);
        a[3] = (int) (Math.random()*100);
        a[4] = (int) (Math.random()*100);
        int [] b = {0,1,2,3,4};
        int c = 4;
        for (int i = 0; i < a.length; i++) {
            System.out.println("a["+(i+1)+"]"+":"+a[i]);
        }
        System.out.println("");
        for (int i = 0; i < a.length; i++) {
            b[i]=a[c];
            c--;
            System.out.println("a["+(i+1)+"]"+":"+b[i]);
        }
    }
}
