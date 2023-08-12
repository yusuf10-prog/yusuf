package day08_IfElseStatments;

import java.util.Scanner;

public class C07_NestedIfElseStatement {
    public static void main(String[] args) {
        //Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak
        // “Emekli olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz E: Erkek, K: kadin");
        char cinsiyet=scanner.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yasinizi giriniz");
        double yas=scanner.nextDouble();

        /*

            Birden fazla degisken varsa
            iclerinden birini birincil değisken olarak alip
            sadece ona gore bir if - else if - else kuralim


         */

        if (cinsiyet == 'E'){
            if (yas<0 || yas>100){
                System.out.println("Gecersiz yas girisi");
            }else if (yas >=65){
                System.out.println("Erkek emekli olabilir");
            }else {
                System.out.println("Emekli olmak icin daha " + (65-yas) + "yil calismalisin");
            }

        }else if (cinsiyet=='K'){
            if (yas <10 || yas>80){
                System.out.println("gecersiz yas girisi");
            }else if (yas >60){
                System.out.println("Kadin emekli olabilir");
            }else {
                System.out.println("Emekli olmak icin daha " + (60-yas) + "yil calismalisin");

            }

        }else {
            System.out.println("Cinsiyet hatali girildi");
        }
    }
}
