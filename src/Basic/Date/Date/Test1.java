package Basic.Date.Date;

import java.util.Date;

public class Test1 {
    public static void main(String[] args) {
        long second = 1000;
        long minute = 60*second;
        long hour = 60*minute;
        long day = 24*hour;
        long year = 365*day;
        long year1995start = (1995-1970)*year;
        long leapDay = (1995-1970)/4*day;
        year1995start+=leapDay;
        long eighthour = hour*8;
        year1995start-=eighthour;

        Date dStart = new Date(year1995start);
        System.out.println("1995年第一天："+dStart);
        long year1995End = year1995start+year-1;
        Date dEnd = new Date(year1995End);
        System.out.println("1995年最后一天："+dEnd);

        long randomTime = (long)(Math.random()*(year-1)+year1995start);
        Date dRandom = new Date(randomTime);
        System.out.println("1995年这一年中的一个随机时间："+dRandom);
    }
}
