package day04_dataCasting_wrapperClass;

import java.util.Scanner;

public class C04_CharCasting {
    public static void main(String[] args) {
        // Kullanicidan bir char isteyin
        // girilen char 'dan sonraki 3 karakteri yazdirin.
        // Orn : input : a   output : b, c, d

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen ascii tablosundan bir karakter giriniz");

        char girilenKrk=scanner.next().charAt(0);

        // next ilk yazılan karakteri alır yani "Kara" nın "Charat(0)" dediğimiz için "0" inci deki
        // indeksi alacak yani 'k' harfini aldı.

        // Scanner.nextChar () method'u olmadığından
        // önce .next() ile String olarak alip, sonra o String'in ilk karakterini alalim.

        System.out.println("Girilen karakter : " + girilenKrk);

        System.out.println("Girilen karakter'den sonraki 3 karakter : " + (char)(girilenKrk+1) + " , " + (char)(girilenKrk+2) + " , " + (char)(girilenKrk+3));


    }
}
