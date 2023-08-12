package day13_stringManipulations_forLoop;

import java.util.Scanner;

public class C03_ReplaceAll {
    public static void main(String[] args) {
        // kullanıcıdan bir metin isteyin
        // metin'deki tum sayilari ve space disindaki ozel karakterleri temizleyin
        // metnin sonuna da . koyun.
        // ornek iput : J1*2av4.a C67/an=+dir--"
        //          output "Java Candir"

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen istediğiniz mesaji girin");
        String metin=scanner.nextLine();


        // onca sayilardan kurtulalim

        metin=metin.replaceAll("\\d", ""); //J*av.a C/an=+dir--"

        // özel karakterlerden kurtulmak istediğimizde, space de kaybolur
        // bunun için önce space'i korumaya almaliyiz
        // artik metnimizde sayi yok, onun için space yerine herhangi bir sayiyi atayalim


        metin = metin.replaceAll("\\s", "1");


        // özel karakterlerden kurtulalim

        metin=metin.replaceAll("\\W", "");  // Java1Candir

        // space yerine atadiğimiz 1'i yeniden space yapalim

        metin= metin.replaceAll("1", " "); //

        metin=metin.replaceAll("_","");

        metin=metin + ".";

        System.out.println(metin);  // Java Candir



    }
}
