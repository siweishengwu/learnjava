package Basic.Array.Sort;

public class Test {
    public static void main(String[] args) {
        int a [] = new int[]{18,62,68,7,65,9,};
        //排序前，先把内容打印出来
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        for (int i = 0; i <a.length ; i++) {
            for (int j = i+1;j <a.length ; j++) {
                if (a[i]>a[j]){
                    //如果后面的数比较小就移动到前面，
                    // 两个数字交换申请多一个变量也就是水杯交换
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] =temp;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }//打印

//
//        for (int i = 1; i <a.length ; i++) {
//            if (a[i] < a[0]){
//                int temp = a[i];
//                a[i] = a[0];
//                a[0] = temp;
//            }
//        }//第一个
//
//        System.out.println();
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }//打印
//
//        for (int i = 2; i <a.length ; i++) {
//            if (a[i] < a[1]){
//                int temp = a[i];
//                a[i] = a[1];
//                a[1] = temp;
//            }
//        }//第二个
//
//        System.out.println();
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }//打印
    }
}
