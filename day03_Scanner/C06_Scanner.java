package day03_Scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        // Soru 6- Kullanicidan bir çemberin yaripani alip,
        //      çevresini ve alanini yazdirin.

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen cemerin yaricapini giriniz ");

        double yaricap=scanner.nextDouble();

        System.out.println("Cemberin cevresi : " + 2*3.14*yaricap);

        System.out.println("Dairenin alani : " + 3.14*yaricap*yaricap);

    }
}
