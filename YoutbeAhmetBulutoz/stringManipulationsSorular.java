package YoutbeAhmetBulutoz;

import java.util.Scanner;

public class stringManipulationsSorular {
    public static void main(String[] args) {

        /*
        : Kullanicidan bir cumle alin
        - cumlede ev geciyorsa, "home home sweet home" yazdirin
        - cumlede is geciyorsa, "calismak guzeldir"
        - ikisini de iceriyorsa "Hem ev lazim hem is"
        - hicbirini icermiyorsa "cok calisman lazim" yazdirin
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz :");

        String cumleGiriniz=scanner.nextLine();

        if (cumleGiriniz.contains("ev") && cumleGiriniz.contains("is")){
            System.out.println("hem ev lazım hem iş");
        }else if (cumleGiriniz.contains("is")){
            System.out.println("calismak güzeldir");
        }else if (cumleGiriniz.contains("ev")){
            System.out.println("home home sweet home");
        }else {
            System.out.println("çok çalisman lazım");
        }

    }
}
