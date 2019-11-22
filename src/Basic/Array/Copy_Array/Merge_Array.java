package Basic.Array.Copy_Array;

public class Merge_Array {
    public static void main(String[] args) {
        //math*5+5使得每个数组的个数在5-10之前浮动
        int[] a = new int[(int)(Math.random()*5+5)];
        int[] b = new int[(int)(Math.random()*5+5)];
        //c数组为a+b的长度
        int[] c = new int[a.length+b.length];
        //遍历顺便赋予一个随机值
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
        //先把a数组赋值到c数组
        System.arraycopy(a,0,c,0,a.length);
        //再把b数组添加爱到c数组
        System.arraycopy(b,0,c,a.length,b.length);

        System.out.println("");
        System.out.println("数组C:");
        for (int i = 0; i < c.length ; i++) {
            System.out.print(c[i]+" ");
        }
//        System.out.println(" ");
    }
}
