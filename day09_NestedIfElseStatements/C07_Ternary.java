package day09_NestedIfElseStatements;

import java.util.Scanner;

public class C07_Ternary {
    public static void main(String[] args) {
        // Soru 6 - Kullanicidan bir sayi alin ve mutlak degerini yazdirin
/*
        Scanner scanner= new Scanner(System.in);

        System.out.println("Lütfen bir sayi giriniz");

        double sayi=scanner.nextDouble();

        System.out.println(sayi >0 ? sayi : -1*sayi);

 */
        Scanner scan = new Scanner(System.in);

        System.out.println("sifre girin");

        String sifre = scan.nextLine();

        char ilkHarf = sifre.charAt(0);



        if(ilkHarf>='A' && ilkHarf<='Z') {

            if(ilkHarf=='A') {

                System.out.println("Gecerli");

            }else {

                System.out.println("Gecersiz");

            }

        }else if(ilkHarf>='a' && ilkHarf<='z') {

            if(ilkHarf=='z') {

                System.out.println("Gecerli");

            }else {

                System.out.println("Gecersiz");

            }

        }else {

            System.out.println("Yanlis giris");

        }

    }
}

