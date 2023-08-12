package day31_dateTime;

import java.time.LocalDate;

public class C01_LocalDate {
    public static void main(String[] args) {

        LocalDate tarih1= LocalDate.now();
        System.out.println(tarih1); //2023-08-10

        System.out.println(tarih1.getMonth()); //AUGUST hangi ayda olduğumuzu gösterir.
        System.out.println(tarih1.getMonthValue()); // 8 hangi ayda olduğumuzu gösterir
        System.out.println(tarih1.getDayOfYear()); // 216  yılın kaçıncı günü


        System.out.println(tarih1.isLeapYear());  // false

        LocalDate tarih2=LocalDate.of(2016,1,1);
        System.out.println(tarih2.isLeapYear()); // true artık yıl olup olmadığını gösterir.

        System.out.println(tarih1.isAfter(tarih2)); // tarih1 tarih2 den sonra mı? true

        System.out.println(tarih1.withYear(2022)); //2022-08-10

        System.out.println(tarih1.minusYears(3).minusDays(53)); //2020-06-18
        // bundan 3 yil önce ve 53 gün önce tarih neydi.

        System.out.println(tarih1.plusWeeks(15).plusDays(3)); //2023-11-26
        // 15 hafta sonra 3 gün ne olur.

        System.out.println(tarih1.lengthOfYear()); // 365 günmüş
        // 2023 yılın uzunluğu neymiş bakalım.

        System.out.println(tarih1.lengthOfMonth()); // 31
        // icinde olduğumuz ayın uzunluğunu gösterir.
    }
}
