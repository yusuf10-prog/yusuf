package day10_switchCase_StringManipulations;

import java.util.Scanner;

public class C02_SwitchStatements {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan gun numarasini alip hafta ici veya hafta sonu yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir gün numarası giriniz");

        int gunNo=scan.nextInt();

        switch (gunNo){
            case 1:
                System.out.println("Hafta içi");
                break;
            case 2:
                System.out.println("Hafta ici");
                break;
            case 3:
                System.out.println("Hafta içi");
                break;
            case 4:
                System.out.println("Hafta ici");
                break;
            case 5:
                System.out.println("Hafta içi");
                break;
            case 6:
                System.out.println("Hafta sonu");
                break;
            case 7:
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Gün numarasi 1-7 arasında olmalidir");

        }

    }
}
