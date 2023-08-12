package day17_methodOulsturma_methodOverloading;

import java.awt.*;
import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class C01_TamBolenlerSayisiniBulma {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan main method icinde bir tamsayi alin.
        // Girilen sayinin pozitif tam bolenleri sayisini bulup
        // bize donduren bir method olusturun.
        // ornek : 20 pozitif tam bolenleri : 1, 2, 4, 5, 10, 20 :6

        Scanner scanner=new Scanner(System.in);
        System.out.println("Pozitif tam bolenlerin sayisini bulmak istediğiniz sayiyi giriniz");

        int sayi=scanner.nextInt(); // sayiya atadık

        System.out.println(tamBolenlerSayisi(sayi));

    }
    public static int tamBolenlerSayisi(int sayi){
        int sayac=0;
        for (int i = 1; i <=sayi ; i++) {
            if (sayi % i ==0){
                sayac++;
            }

        }
        return sayac;

    }
}
