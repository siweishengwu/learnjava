package Basic.Array.Sort;

public class select216 {
    public static void main(String[] args) {
        int a[] = new int[]{18,62,68,82,65,9};
        for (int i = 0 ;i<a.length;i++){
            for (int j = i+1; j <a.length ; j++) {
                if (a[j] > a[i]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}

