package Basic.Array.Two_Dimensional_Array;

public class Create_double_Array {
    public static void main(String[] args) {
        int[][]a = new int[2][3];
        a[1][2] = 5;
        System.out.println(a[2][2]);

        int[][]b = new int[2][];
        b[0] = new int[3];
        b[0][2] = 5;
    }
}
