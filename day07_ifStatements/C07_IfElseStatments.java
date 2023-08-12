package day07_ifStatements;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class C07_IfElseStatments {
    public static void main(String[] args) {
        // kullanicidan notunu isteyin
        // 50 uzeri ise sinifi gectin
        // degilse maalesef kaldin yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");

        double not=scanner.nextDouble();

        if (not>=50) System.out.println("Sinif gecti");
        if (not< 50) System.out.println("Maalesef kalınız");

        /*
            Eger bir sart icin sadece 2 durum soz konusu ise
            iki durumu ayri ayri kontrol etmek yerine
            tek bir kontrol ile de yapabiliriz.

            Bagimsiz if cumlelerinden farkil olarak if else cumlelerinde
            if else cumlelerinde
            ya if body'si, ya else body'si calisir

            IKISININ BIRDEN calimasi mumkun olmadigi gibi,
            IKISININ DE CALISMAMASI mumkun değildir.

         */

        if (not >=50){
            System.out.println("Sinif gectin");
        }else{
            System.out.println("Maalesef kaldin");
        }
    }
}
