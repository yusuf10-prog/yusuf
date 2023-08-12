package day18_whileLoop_DoWhileLoop;

import java.util.Scanner;

public class C01_SifreKontrolu {
    public static void main(String[] args) {

                //Soru 4 : Main method'da kullanicidan bir sifre isteyip,
                //          oulsturacağımız bir method'da asagidaki sartlari kontrol edin
                //          ve method'dan true veya false dondurun
                //         ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
                //         tum sartlari saglanincaya kadar tekrar deger isteyin
                //         ve sartlar saglaninca , "sifre basariyla kaydedildi" yazdirin
                //         - ilk harf kucuk harf olmali
                //         - son karakter rakam olmali
                //         - sifre bosluk icermemeli
                //         - uzunlugu en az 10 karakter olmali

        /*
        Bu soruyu day17'de cozduk
        ama java'da daha profesyonel kodlama için
        iki düzeltme yapacagiz

        while loop'un önündeki parantezi ici
        şarti sağladıkça yani true oldugu müddetçe loop çalişir.

        bu soruda sonuc variable'da boolean deger iceriyor
        ama sorunun mantığı acisindan
        sonuc false olduğu muddetçe loop çalişmali

        2 -while loop her calistiginda
         Scanner scanner=new Scanner(System.in);
          String sifre=scanner.nextLine();
         calisiyor ve yeni bir obje olusturuyor.

         bunun yerine daha guzel olani
         loop'dan önce objeyi olusturup
         Loop'un icerisinde sadece deger atamasi yapmaktir.




         */


                boolean sonuc=false;
                Scanner scanner;
                String sifre;

                while (!sonuc){  // sonuc == false

                    //

                    scanner=new Scanner(System.in);
                    System.out.println("Lütfen sifrenizi giriniz");

                    sifre=scanner.nextLine();

                    sonuc=sifreKontrolEt(sifre);

                }

                System.out.println("Sifreniz basariyla kaydedildi");

            }

            public static boolean sifreKontrolEt(String sifre) {

                int sayac = 0;  // sayac hatalari saysin

                //         - ilk harf kucuk harf olmali
                char ilkHarf = sifre.charAt(0);
                if (!(ilkHarf >= 'a' && ilkHarf <= 'z')) {
                    System.out.println("ilk karakter kucuk harf olmali");
                    sayac++;

                }
                //         - son karakter rakam olmali

                char sonKarakter = sifre.charAt(sifre.length() - 1);
                if (!(sonKarakter >= '0' && sonKarakter <= '9')) {
                    System.out.println("son karakter rakam olmali");
                    sayac++;


                }

                //         - sifre bosluk icermemeli

                if (sifre.contains(" ")) {
                    System.out.println("Sifre bosluk içermemeli");
                    sayac++;
                }

                //         - uzunlugu en az 10 karakter olmali
                if (sifre.length() < 10) {
                    System.out.println("sifrenin uzunlugu en az 10 karakter olmalidir");
                    sayac++;
                }
                if (sayac==0){
                    return true;
                }else {
                    return false;
                }
            }
        }

