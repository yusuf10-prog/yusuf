package day14_forLoops;

import java.util.Scanner;

public class C07_StringTerstenYazdirma {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen tersten yazdirmak isteidğiniz metni giriniz");
        String str=scanner.nextLine();

        // Java Candir

        // ridnaC

        for (int i = str.length()-1; i >=0; i--) {
            System.out.print(str.charAt(i));
            
        }
        System.out.println("");

        // terse çevrilmiş halini kaydedelim

        String tersMetin="";
        for (int i = str.length()-1; i >=0 ; i--) {
            tersMetin+=str.charAt(i);

        }
        System.out.println("Terse cevirilen metin : " + tersMetin);

    }
}
