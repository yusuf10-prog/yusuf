package day09_NestedIfElseStatements;

import java.util.Locale;
import java.util.Scanner;

public class C02_IndirimHesaplama {
    public static void main(String[] args) {
        //Soru 2- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen urun adedini giriniz");
        int urunSayisi = scanner.nextInt();

        System.out.println("Lütfen liste fiyatını giriniz ");

        double litseFiyati=scanner.nextDouble();

        System.out.println("Müşteri kartiniz var mi ? E : Evet, H : Hayir");

        char kartVarMi = scanner.next().toUpperCase().charAt(0);

        // ana değisken kart var mi bilgisi olsun
        if (kartVarMi == 'E'){// karti olanlar
            // musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
            if (urunSayisi>10){
                System.out.println("%20 indirimli toplam fiyat : " + urunSayisi*litseFiyati*80/100);
            }else {
                System.out.println("%15 indirimli toplam fiyat : " + urunSayisi*litseFiyati*85/100);
            }

        }else if (kartVarMi == 'H'){ // karti olmayanlar
            //Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin

            if (urunSayisi>10){
                System.out.println("%15 indirimli toplam fiyat : " + urunSayisi*litseFiyati*85/100);
            }

            else {
                System.out.println("%10 indirimli toplam fiyat : " + urunSayisi*litseFiyati*90/100);

            }


        }else {
            System.out.println("Kart bilgisi hatali");
        }

    }
}
