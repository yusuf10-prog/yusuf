package day11_stringManipulatinos;

import javax.security.sasl.SaslClient;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class C02_lenght {
    public static void main(String[] args) {
        String isim="Ramazan Uzunkavaklaraltindayataruyumazoglu";

        // son harfi yazdirin

        System.out.println("İsim uzunluğu : " + isim.length());  // 42

        System.out.println("son harf : " + isim.charAt(isim.length()-1)); // u

        // sondan 5.harfi yazdirin

        System.out.println(isim.charAt(isim.length()-5)); // z

        // kullanıcıdan ismini alin
        // ortadaki harfi yazdirin
        // ismin uzunlugu çift sayi ise orta kisimdaki 2 harfi yazirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen isminizi yaziniz");
        String girilenIsim=scanner.nextLine();

        int uzunluk= girilenIsim.length();

        if (uzunluk % 2 ==0){ // uzunluk çiftse Hatice  2.3. indeks lazım
            // omer uzunluk 4 yarisi 2 ve 2 indeks e yi veriyor öncekini de almak lazım
            System.out.println("Uzunluk çift, ortadaki iki harf : "+
                   girilenIsim.charAt(uzunluk/2-1) + girilenIsim.charAt(uzunluk/2));


        }else { // uzunluk tekse

            System.out.println("Uzunluk tek, ortadaki harf : " + girilenIsim.charAt((uzunluk-1)/2));
        }

    }
}
