package Basic.Date.Date;

import java.util.Date;

public class Step4 {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println("Date.getTime() \t\t\t返回值："+now.getTime());
        System.out.println("System.currentTimeMillis()\t返回值："+System.currentTimeMillis());
    }
}
