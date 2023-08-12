package day10_switchCase_StringManipulations;

import java.util.Scanner;

public class C03_SwitchStatements {
    public static void main(String[] args) {
        // Soru 1- Kullanicidan bir rakam alip, rakami yaziyla yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir rakam giriniz");

        int sayi=scan.nextInt();

        switch (sayi){
            case 1:
                System.out.println("Bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("üç");
                break;
            case 4:
                System.out.println("dort");
                break;
            case 5:
                System.out.println("beş");
                break;
            case 6:
                System.out.println("altı");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;
            default:
                System.out.println("Geçersiz sayı girdiniz");

        }
    }
}
