package Basic.Date.Calendar;

import java.util.Calendar;
import java.util.Date;

public class Step1 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date d = c.getTime();
        Date d2 = new Date(0);
        c.setTime(d2);
        System.out.println(c);
    }
}
