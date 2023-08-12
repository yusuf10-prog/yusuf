package day03_Scanner;

import java.util.Scanner;

public class C08_Swap_tekrarKendiOrnek {
    public static void main(String[] args) {
        //  Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        Scanner scanner=new Scanner(System.in);


        System.out.println("Lütfen birinci sayıyı giriniz:");
        double birinciSayi=scanner.nextDouble();

        System.out.println("Lütfen ikinci sayiyi giriniz: ");
        double ikinciSayi=scanner.nextDouble();

        double bos=birinciSayi;

        // ikinci sayının değerini de değiştirmek için mecburen üçünü bir değer olarak
        // 'bos' değerine atamamız lazım ki iki sayının değeri de değişmiş olsun.
        // birinci sayıyı ikinciye atadık.
        // ikinci sayıyı da boşa atadık.
        // bu şekilde iki sayının değerini değiştirmiş olduk

        birinciSayi=ikinciSayi;


        ikinciSayi=bos;

        System.out.println("birinci sayıya atanan deger :" +birinciSayi);
        System.out.println("ikinci sayıya atanan değer : " + ikinciSayi);

    }
}
