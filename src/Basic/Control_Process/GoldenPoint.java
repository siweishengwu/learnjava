package Basic.Control_Process;

public class GoldenPoint {
    public static void main(String[] args) {
        int value = 1;
        double inumber = 0.0;
        double jnumber = 0.0;
        double absnumber = 0.0;
        double number =0.0;
        double min = 0.0;
        double youcan = 0.0;
        for (double i = 1; i < 21 ; i++){
            for (double j = 1 ;j < 21;j++){
                if (
                        ((i % 2 == 0 && j % 2 != 0) || (i % 2 !=0 && j % 2 == 0)) ||
                                (i % 2 != 0 && j % 2 != 0)){
                    number = i / j;
                    absnumber = Math.abs((0.618 - number));
                    if (value == 1 ){
                        min = absnumber;
                        inumber = i;
                        jnumber = j;
                        System.out.println("第一次的结果i："+inumber+",j："+jnumber+",余为："+absnumber);
                        value++;
                    }else if (value >1){
                        if (min>absnumber){
                            min=absnumber;
                            inumber=i;
                            jnumber=j;
                            value++;
                            youcan =0.618-min;
                        }
                    }
                }
            }
        }
        System.out.println("最后的结果i："+inumber+",j："+jnumber+",余为："+youcan+", 第"+value+"次的时候找到了");
    }
}
