package day03_Scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        /*
        Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        Isminiz : John
        Soyisminiz : Doe
        Yasiniz : 44
        Kaydiniz basariyla tamamlanmistir.

         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen isminizi yaziniz");

        String girilenIsim=scanner.nextLine();

        System.out.println("Lütfen soy isminizi giriniz ");

        String girilenSoyIsim=scanner.nextLine();

        System.out.println("Lütfen yaşinizi giriniz ");

        int girilenYas=scanner.nextInt();
        /*
        System.out.println("İsminiz : "  + girilenIsim);
        System.out.println("Soyisininiz : " + girilenSoyIsim);
        System.out.println("Yaşiniz : " + girilenYas);
        System.out.println("Kaydiniz basariyla tamamlanmistir.");

         */

        //  sout içiresindeki bir String'in yazdirilmasina
        // alt satirdan devam edilmesini isterseniz
        // String 'in alt satira geçmesini istediğiniz kisminda 
        System.out.println("İsminiz : "  + girilenIsim + " Soyisminiz : " + girilenSoyIsim + " Yaşiniz : " + girilenYas);

    }
}
