package day17_methodOulsturma_methodOverloading;

import java.util.Scanner;

public class C01_AsalSayiBulma {
    //Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin.
    // Girilen sayinin asal sayi olup olmadigini kontrol edip,
    // sonuc olarak “asal sayi” (true) veya “asal sayi degil” (false) sonuclarini
    // donduren bir method olusturun.

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Asal sayi kontrolu için pozitif bir tamsayi giriniz");
        int sayi=scanner.nextInt();  // sayiyi kaydetme işlemi yapıyoruz

        System.out.println(asalSayiMi(35));

    }
    public static boolean asalSayiMi(int sayi){
        boolean flag=true;

        for (int i = 2; i <sayi ; i++) {
            if (sayi % i == 0){
                flag=false;
               break;
            }

        }

        if (flag){
            return true;
        }else {
            return false;
        }

    }
}




