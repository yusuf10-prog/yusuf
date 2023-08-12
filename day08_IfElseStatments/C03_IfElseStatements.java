package day08_IfElseStatments;

import java.util.Scanner;

public class C03_IfElseStatements {
    public static void main(String[] args) {
        //Ogrencinin notu 85 ve ustu ise AA,
        //(85 ve ustu degilse) 65 ve ustu ise BB,
        //(65 ve ustu de degilse) 50 ve ustu ise CC,
        //(geriye kalanlar) DD

        /*
            Bir if - else if - else ... statement else ile bitmek zorunda değildir.
            else ile biten kodlar her durum için mutlaka bir sonuc uretirler
            else ile bitmezse tum durumlari kapsamaz yani bazı degerler için
            sonuc ürütmeyebilir
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");

        double not=scanner.nextDouble();

        if (not >=85){
            System.out.println("AA");
        }else if (not >65){
            System.out.println("BB");
        }else if (not>=50){
            System.out.println("cc");
        }else {
            System.out.println("DD");
        }
    }
}
