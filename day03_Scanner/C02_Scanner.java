package day03_Scanner;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {
        // kullanicidan bir tamsayi alip, karesini yazdirin.


        // Scanner ile kullanicidan bir bilgiyi 3 adımda alabiliriz.
        // 1.adim : scanner objesi oluşturmak


        Scanner scan = new Scanner(System.in);

        // 2.adim : Kullanıciya ne istediğimizi söyleyin

        System.out.println("Lütfen bir tamsayi giriniz ");

        // 3. adim istediğimiz datanin türüne uygun variable oluşturun
        //    ve scanner objesini kullanarak uygun method'la
        //    kullanicinin girdiği değeri alin

        int girilenSayi=scan.nextInt();

        // artik kullanicinin bilgiyi sayi kod ortamimiza kaydedildi.
        // bu variable'i isteidğimiz şekilde kullanabiliriz
        System.out.println("Girilen sayinin karesi : " + girilenSayi*girilenSayi);

    }
}
