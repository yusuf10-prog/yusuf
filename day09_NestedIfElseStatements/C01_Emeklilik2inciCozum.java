package day09_NestedIfElseStatements;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class C01_Emeklilik2inciCozum {
    public static void main(String[] args) {
        // kullanicidan cinsiyetini ve yasini alin,
        // kadin, 60 yas ve üzeri, Erkek 65 yas ve üzeri emekli olabilir
        // Cinsiyet ve yasini dikkate alarak "Emekli olabilirsin"
        // veya "Emekli olmak için .. Yil daha çalisman gerekir" yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz E : Erkek, K : Kadin");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lütfen yasinizi giriniz ");

        double yas = scanner.nextDouble();

        if (yas < 10 || yas>80){
            System.out.println("Gecersiz yas");
        }else if(yas <60){
            if (cinsiyet=='K'){
                System.out.println("Kadinin Emekli olabilmek için daha " + (60-yas) + "yil daha çalışmali");
            }else if (cinsiyet == 'E'){
                System.out.println("Erkek emekli olabilmek için daha " + (65-yas) + "yil daha çalışmali");
            }else {
                System.out.println("Cinsiyet hatali");
            }
        }else if (yas<65){
            if (cinsiyet == 'K'){
                System.out.println("Erkek emekli olabilmek için daha " + (65-yas) + "yil daha çalismali");
            }else {
                System.out.println("Cinsiyet hatali");
            }
        }else {
            if (cinsiyet == 'K' || cinsiyet == 'E'){
                System.out.println("Emekli olabilir");
            }else {
                System.out.println("cinsiyet hatali");
            }
        }

    }
}
