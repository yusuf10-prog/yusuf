package day30_immutableClasses;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalTime {
    public static void main(String[] args) {
        LocalTime time=LocalTime.now();
        System.out.println(time); //18:45:50.164004

        System.out.println(time.getHour()); // 18

        System.out.println(time.getMinute()); //48

        System.out.println(time.minusMinutes(1000)); //02:12:10.889187

        System.out.println(time.minusHours(100)); //15:01:27.653589

        System.out.println(time.plusSeconds(10000)); //21:48:48.502828

        System.out.println(time.withHour(15));//15:04:38.563508

        System.out.println(time.withSecond(0).withNano(0)); //19:08

        LocalTime time1 = LocalTime.of(12,35);

        LocalTime time2 = LocalTime.of(14,34);

        System.out.println(time1.isBefore(time2)); // true

        System.out.println(time1.isAfter(time2)); // false

        LocalTime time3=LocalTime.now(ZoneId.of("Europe/London"));
        System.out.println("London saati :" + time3);
    }
}
