package day03_Scanner;

import java.util.Scanner;

public class C07_Swap {
    public static void main(String[] args) {
       //  Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        Scanner scanner=new Scanner(System.in);

        System.out.println("lütfen ilk sayiyi giriniz");

        int ilkSayi=scanner.nextInt();

        System.out.println("Lütfen ikinci sayiyi giriniz ");

        int ikinciSayi=scanner.nextInt();

        int temp=ilkSayi;

        ilkSayi=ikinciSayi;

        ikinciSayi=temp;

        System.out.println("İlk sayinin yeni değeri : " + ilkSayi);
        System.out.println("İkinci sayinin yeni değeri : " + ikinciSayi);


    }
}
