package day08_IfElseStatments;

import java.util.Scanner;

public class C01_IfElseStatements {
    public static void main(String[] args) {


        // Soru 4- Kullanicidan bir karakter girmesini isteyin,
        //      girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char girilenKarakter=scanner.next().charAt(0);
        // kallanici ne kadar uzun kelime veya kelimeler girse de karakteri alir.

        if (girilenKarakter >= 'A' && girilenKarakter <= 'Z') {
            System.out.println("Girilen karakter buyuk harf");
        }else{
            System.out.println("Girilen karakter buyuk harf degil");
        }
    }
}
