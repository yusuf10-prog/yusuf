package YoutbeAhmetBulutoz;

import java.util.Scanner;

public class strinmanipulationikinciOrn {
    public static void main(String[] args) {
        /*
        : Kullanicidan bir cumle alin
        - cümle içerisinden sadece ev veya is iceriyorsa "Hem ev lazim hem is"
        - hicbirini icermiyorsa "cok calisman lazim" yazdirin
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz :");

        String cumle=scanner.nextLine();

        if (cumle.contains("is") && cumle.contains("ev")){
            // içinde yer alan iki değerde varsa sonuç verir.
            // yani sonucu döndürür
            // sadece birisi varsa sonuç döndürmez
            // ikisinin de doğru olması lazım yani true olması gerekir.

            System.out.println("hem ev lazım hem is");
        }else {
            System.out.println("çok çalisman lazım");
        }

    }
}
