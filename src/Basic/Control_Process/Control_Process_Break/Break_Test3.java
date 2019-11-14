package Basic.Control_Process.Control_Process_Break;

public class Break_Test3 {
    public static void main(String[] args) {
        dongwei777:
        for (int i = 0; i < 10 ; i++){
            for (int j = 0; j < 10; j++){
                System.out.println(i+":"+j);
                if (j % 2 == 0)
                    break dongwei777;
            }
        }
    }
}
