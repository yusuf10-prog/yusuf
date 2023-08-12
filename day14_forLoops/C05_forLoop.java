package day14_forLoops;

import java.util.Scanner;

public class C05_forLoop {
    public static void main(String[] args) {
        // Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen pozitif bir tam sayi giriniz");

        int girilenSayi=scanner.nextInt();

        int sayi=girilenSayi;
        int birlerBasamagi=0;
        int rakamlarToplami=0;

        int basamakSayisi=(sayi + " ").length();  //

        for (int i=1; i<=basamakSayisi; i++){
            birlerBasamagi=sayi%10;
            rakamlarToplami+=birlerBasamagi;
            sayi/=10;

        }

        System.out.println("Girilen " + girilenSayi +" sayisinin rakamlar toplami " + rakamlarToplami);


    }
}
