package day07_ifStatements;

import java.util.Scanner;

public class C09_HocaninVerdigiSoru {
    public static void main(String[] args) {

        /*

        Soru 3- Kullanicidan yasini isteyin, 65 yas ve uzeri ise “Emekli olabilirsin” yazdirin,
        yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.

        Soru 4- Kullanicidan bir karakter girmesini isteyin,
        girilen karakterin buyuk harf olup olmadigini yazdirin.

        Soru 5- Kullanicidan bir harf isteyin,
        girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin, yoksa girilen harfi yazdirin
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen yasinizi giriniz");

        int girilenYas=scanner.nextInt();

        if (girilenYas >=65){
            System.out.println("Emekli olabilirsin");
        }else {
            System.out.println(65-girilenYas + " yıl daha calismalisin");
        }
    }
}
