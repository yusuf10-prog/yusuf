package day03_Scanner;

public class C01_NamingConvention {
    public static void main(String[] args) {
        // Java case sensitive (buyuk kuçuk harf duyali)'dir
        int sayi=10;

        // int sayi=20;
        // long sayi=345;

        int Sayi=25;
        int SAYI=23;
        int sAYİ=45;
        System.out.println(sAYİ); // 45
        System.out.println(SAYI); // 23

        // variable isimleri kucuk harfle baslar.
        // buyuk harfle baslarsaniz Java kabul eder.
        // ancak genel kullanima aykiridir.


        // int sa yi =34;
        // int sa&yi=45;

        int say_i=34;
        int sayi12345=12345;
        int say$yi=21;

        // $ ve_ isimde kullanilabilir ama lik harf olarak kullanilmasi
        // naming convention'a uygun değildir.
        int _sayi=75;
        int $sayi=87;

        // birden fazla kelimeden oluşan bir isim varsa camelCase kullanilir.
        int sinifinEnYuksekNotu=99;



    }
}
