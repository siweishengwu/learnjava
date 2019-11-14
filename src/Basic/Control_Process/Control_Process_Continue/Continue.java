package Basic.Control_Process.Control_Process_Continue;

public class Continue {
    public static void main(String[] args) {

        for (int i = 1;i < 100;i++){
//            if (i % 3 == 0)
//                continue;
//            else if (i % 5 == 0)
//                continue;
//            else
            if (i % 3 == 0 || i % 5 ==0) //遇到3和5的倍数跳过
                continue;
            System.out.println(i);
        }
    }
}
