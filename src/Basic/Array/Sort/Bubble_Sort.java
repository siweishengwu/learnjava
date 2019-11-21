package Basic.Array.Sort;

public class Bubble_Sort {
    public static void main(String[] args) {
        int a [] = new int[]{18,62,7,82,65,9,};
        for (int i = 0; i < a.length ; i++) {
            System.out.print(a[i]+ " ");
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <a.length-1-i; j++) {
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;

                    System.out.println("");
                    for (int k = 0; k < a.length ; k++) {
                        System.out.print(a[k]+ " ");
                    }

                }
            }
        }

        System.out.println("");
        for (int i = 0; i < a.length ; i++) {
            System.out.print(a[i]+ " ");
        }

//        System.out.println("");
//        for (int i = 1; i < a.length-1 ; i++) {
//            if (a[i] > a[i+1]){
//                int temp = a[i+1];
//                a[i+1] = a[i];
//                a[i] = temp;
//            }
//        }
//        System.out.println("");
//        for (int i = 0; i < a.length-1 ; i++) {
//            if (a[i] > a[i+1]){
//                int temp = a[i+1];
//                a[i+1] = a[i];
//                a[i] = temp;
//            }
//        }
//        for (int i = 0; i < a.length ; i++) {
//            System.out.print(a[i]+ " ");
//        }
//
//        System.out.println("");
//        for (int i = 1; i < a.length-1 ; i++) {
//            if (a[i] > a[i+1]){
//                int temp = a[i+1];
//                a[i+1] = a[i];
//                a[i] = temp;
//            }
//        }
//        for (int i = 0; i < a.length ; i++) {
//            System.out.print(a[i]+ " ");
//        }
        
        
    }
}
