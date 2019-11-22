package Basic.Array.Two_Dimensional_Array;

public class Find {
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        int max = 0;
        int inumber = 0;
        int jnumber = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = (int)(Math.random()*100);
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("");
            for (int j = 0; j < 5; j++) {
                System.out.print(a[i][j]+" ");
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (a[i][j] > max){
                    max = a[i][j];
                    inumber = i;
                    jnumber = j;
                }
            }
        }
        System.out.println("");
        System.out.println("找出来最大的是："+max);
        System.out.println("其坐标是"+"["+inumber+"]"+"["+jnumber+"]");
    }

}
