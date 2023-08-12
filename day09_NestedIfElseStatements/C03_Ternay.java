package day09_NestedIfElseStatements;

import java.util.Scanner;

public class C03_Ternay {
    public static void main(String[] args) {
        // Kullanicidan pozitif bir tamsayi alin
        // sayinin tek mi çift mi olduğunu yazdirin.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayi giriniz");

        int sayi=scanner.nextInt();

        if (sayi % 2 == 0){
            System.out.println("Çift sayi ");
        }else {
            System.out.println("Tek sayi");
        }

        /*

            If else ile yapabileceğimiz
            basit islemleri
            daha kısa olarak yazabilmek icin ternary kullanilir.

         */

        System.out.println(sayi % 2 ==0 ?  "Çift sayi " : "Tek sayi");
    }
}
