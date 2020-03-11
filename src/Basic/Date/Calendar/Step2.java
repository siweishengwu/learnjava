package Basic.Date.Calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Step2 {

    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date now = c.getTime();
        System.out.println("当前日期:\t"+format(c.getTime()));

        c.setTime(now);
        c.add(Calendar.MONTH,1);
        System.out.println("下个月的今天:\t"+format(c.getTime()));

        c.setTime(now);
        c.add(Calendar.YEAR,-1);
        System.out.println("去年的今天：\t"+format(c.getTime()));

        c.setTime(now);
        c.add(Calendar.MONTH,-1);
        c.set(Calendar.DATE,3);
        System.out.println("下个月的第三天:\t"+format(c.getTime()));

        c.setTime(now);
        c.add(Calendar.MONTH,2);
        c.set(Calendar.DATE,1);
        c.add(Calendar.DATE,-3);
        System.out.println("下个月倒数第三天:\t"+format(c.getTime()));
    }

    private static String format(Date time){
        return sdf.format(time);
    }
}
