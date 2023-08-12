package day02_dataTurleri_variable;

public class C03_primitiveDataTurleri {
    public static void main(String[] args) {

        //1-boolean : mantiksal değerler alan true ve false kabul eder.

        boolean bl1=true;
        boolean bl2=false;

        // char '' icinde yazilir ve sadece 1 karakter kabul eder.

        char ch1='a';
        char ch2='2';


        // tam sayi kabul eden variable turleri
        // 3-byte, 4-short, 5-int, 6-long

        // Türkiye'de şehir nufuslarini tutmak istiyoruz.
        // data turu ayni olan variable'ların degerleri ne olursa olsun
        // hafizada kapladıklari alan aynidir.


        int nufus=834250;
        int nufusBilecik=30000;

        // bir şehirdeki noter sayisini tutacağiz
        short noterSayisiIstanbul=456;

        float fl1=20f;
        float fl2=6f;

        float fl3=fl1/fl2;
        System.out.println(fl3); // 3.3333

        double db1=20;
        double db2=6;
        double db3=db1 / db2;

        System.out.println(db3); // 3.3333333
        // double bolme işlemlerinde 0.00000000001 gibi bir hata yapabilir.
        // 20 / 5 = 3.9999999999999999

        String str="Hello Wordld";

        System.out.println(str); // Hello World

        System.out.println("true veya false ");

        System.out.println("str"); // str

        // verilen iki sayiyi carpim sonucunu yazdirin

        int sayi1=10;
        int sayi2=20;

        System.out.println(sayi1*sayi2);

        System.out.println("Verilen iki sayinin çarpimi : "  + sayi1*sayi2);


    }
}
