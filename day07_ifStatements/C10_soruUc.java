package day07_ifStatements;

import java.util.Scanner;

public class C10_soruUc {
    public static void main(String[] args) {
        //    Soru 4- Kullanicidan bir karakter girmesini isteyin,
        //        girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");

        char girilenKarakter=scanner.next().charAt(0);

        if (girilenKarakter>='A' && girilenKarakter<='Z'){
            System.out.println("Büyük harf olarak giridiniz");
        }else if (girilenKarakter>='a' && girilenKarakter<='z'){
            System.out.println("Küçük harf olarak girdiniz");
        }else {
            System.out.println("Karakter girişi yapmadınız");
        }

    }
}
