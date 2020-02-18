package Basic.Array.Sort;

public class Bubble218 {
    public static void main(String[] args) {
        int a[] = new int []{18,62,68,82,65,9};
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a.length-1-i ; j++) {
                if (a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("");
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
