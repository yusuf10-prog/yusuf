package day18_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class C02_GirilenSayilariToplama {
    // Kullanicidan toplanmak üzere sayılar alin
    // girilen sayilarin toplami 500'u gecerse
    // bu kadar sayi yeter, girilen sayilarin toplami ... oldu yazdirin
    // girilen sayi adedi 10 veya daha yuksek olursa
    // 10'dan fazla sayi giremezsin, girilen sayilarin toplami ... oldu yazdirin
    // ve islemi bitirin

    public static void main(String[] args) {

        Scanner scanner;
        int sayac=0;
        int toplam=0;
        int sayi;

        while (sayac<=10 && toplam<500){ // while loop 'un ici true oldukca calismaya devam edecek

            scanner=new Scanner(System.in);
            System.out.println("lütfen toplanmak uzere sayi girin");

            sayi=scanner.nextInt();

            toplam +=sayi;

            sayac++;

        }

        // while loop bitti ise
        // sartlardan biri sağlanmadi

       if (sayac >=10){
           System.out.println("10'dan fazla sayi giremezsin, girilen sayilarin toplami " + toplam+ "oldu");
       }
       if (toplam>500){
           System.out.println("bu kadar sayi yeter, girilen sayilarin toplami" +toplam+ " oldu");
       }
    }
}
