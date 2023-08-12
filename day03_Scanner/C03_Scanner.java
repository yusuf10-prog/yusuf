package day03_Scanner;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        // Soru 2- Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini yazdirin.
        //    bunlarin toplamini ve çarpimini yazdirin.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir double sayi giriniz ");

        double girilenDouble=scanner.nextDouble();

        System.out.println("Lütfen bir tamsayi giriniz ");

        int girilenInt= scanner.nextInt();

        System.out.println("İki sayinin toplami : " + (girilenInt + girilenDouble));
        System.out.println("İki sayinin çarpimi : "  + (girilenInt*girilenDouble));


    }
}
