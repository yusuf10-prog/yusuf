package day10_switchCase_StringManipulations;

public class CO4_StringManipulations {
    public static void main(String[] args) {

        /*

            String manipulation,
            verilen bir String üzerinde HAZIR METHOD'lar kullanarak
            - degisiklik yapmak
            - veya verilen String üzerindeki bir bilgiyi
            almak icin yaptigimiz tum islemlerdir

            String üzerinde yapılan manipulation islemleri
            String'i kalici olarak degistirmez

            Eger yapilan islem sonucundaki yeni halin kalici olmasini istersek
            ATAMA yapmaliyiz.    str = str.toLowerCase();  bu şekilde yapmaliyiz.



         */

        String str = "Java Candir";

        // str ilk harfini yazdirin

        System.out.println(str.charAt(0)); //J

        // str'i tum harfleri buyuk olacak sekilde yazdirin

        System.out.println(str.toUpperCase()); // JAVA CANDIR

        System.out.println(str);  // Java Candir

        // str'i tamamen kucuk harflerden olusan bin metne cevirin

        str = str.toLowerCase();  // tüm harfleri küçük yazdiriyor.
        System.out.println(str);  // java candir


    }
}
