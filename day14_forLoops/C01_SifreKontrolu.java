package day14_forLoops;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class C01_SifreKontrolu {
    public static void main(String[] args) {

        /*
            Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin
            ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
            eger tum sartlari saglarsa, “sifre basariyla kaydedildi” yazdirin
      - ilk harf kucuk harf olmali
      - son karakter rakam olmali
      - sifre bosluk icermemeli
      - uzunlugu en az 10 karakter olmali
             */

        // flag yöntemini kullanalim

        // flag'i ilk basta true yapalım, her uygun olmayan durumda false degeri atayalım

        boolean flag=true;

        // şartlar birbirinden bağımsiz olduğundan bağımsız if cümleleri kullanalim

        // sartlar birbirinden bağımsiz olduğundan if cumleleri kullanalim

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen şifrenizi giriniz :");

        String sifre=scanner.nextLine();

        // ilk harf kucuk harf olmalı

        char ilkHarf=sifre.charAt(0);

        if (!(ilkHarf>='a' && ilkHarf<='z')){
            System.out.println("ilk karakter kucuk harf olmali");
            flag=false;

        }

        // - son karakter rakam olmali
        char sonKarakter=sifre.charAt(sifre.length()-1);
        if (!(sonKarakter>='0' && sonKarakter<='9')){
            System.out.println("son karakter rakam olmalı");
            flag=false;


            // - sifre boşluk içermemeli

            if (sifre.contains(" ")){
                System.out.println("Sifre bosluk içermemeli");
                flag=false;
            }

            // - uzunluğu en az 10 karakter olmali

            if (!(sifre.length()>=10)){
                System.out.println("Sifrenin uznuğulu en az 10 karakter olmali");
                flag=false;
            }

            if (flag){
                System.out.println("Sifre başarali bi şekilde kaydedildi");
            }

        }
    }
}
