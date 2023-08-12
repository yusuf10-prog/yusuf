package SocrativeSoruları;

import java.util.Scanner;

public class day_11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen ismini giriniz :");
        String isim=scanner.nextLine();

        isim=isim.toLowerCase();

        System.out.println(isim);

        isim=isim.toUpperCase();

        System.out.println(isim);


    }
}
