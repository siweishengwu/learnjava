package Basic.Array.Sort;

public class Sort_Test {
    public static void main(String[] args) {
        int [] a = new int [5];
        a[0] = (int) (Math.random() *100);
        a[1] = (int) (Math.random() *100);
        a[2] = (int) (Math.random() *100);
        a[3] = (int) (Math.random() *100);
        a[4] = (int) (Math.random() *100);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if (a[i] > a[j]){
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        System.out.println("");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length-1-i; j++) {//冒泡这个还是需要消化一下
                if (a[j] < a[j+1]){
                    int temp =a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }


    }
}
