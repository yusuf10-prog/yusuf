package day08_IfElseStatments;

import java.util.Scanner;

public class C05_VucutKitleEndeksi {
    public static void main(String[] args) {
        //Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip
        // vucut kitle endeksini hesaplayin
        // (kilo*10000 / (boy *boy)) vucut kitle endeksi 30’dan buyukse obez,
        // 25-30 arasi ise kilolu,
        // 20-25 arasi ise normal,
        // 20’den kucukse zayif yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen kilonuzu (kg))");

        int kilo=scanner.nextInt();
        System.out.println("Boyunuzu cm olarak giriniz");

        int boy=scanner.nextInt();

        int vke= (kilo*10000) / (boy*boy);

        if (vke>30){
            System.out.println("obez");
        }else if (vke >=25) {
            System.out.println("kilolu");
        }else if (vke >=20){
            System.out.println("Normal");
        }else {
            System.out.println("Zayif");
        }
    }
}
