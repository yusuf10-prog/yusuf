package day08_IfElseStatments;

import java.util.Scanner;

public class C02_IfElseStatements {
    public static void main(String[] args) {
        // kullanicidan bir tam sayi isteyin
        // sayi 3'e bolunuyorsa 3'ün kati
        // sayi 5'e bolunuyorsa 5 'in kati
        // ikisine birden bolunuyorsa super sayi
        // ikisine de bolunmuyorsa yaramaz sayi yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz");
        int girilenSayi=scanner.nextInt();

        if (girilenSayi %3 ==0 && girilenSayi %5==0) System.out.println("super sayi");
        else if (girilenSayi % 5 ==0) System.out.println("5 ' in kati");
        else  if (girilenSayi % 3 ==0) System.out.println("3 'un kati");
        else System.out.println("Yaramaz sayi");
    }
}
