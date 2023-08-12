package day26_forEachLoop_Constructor;

import java.util.*;

public class C05_Runner {

    public static void main(String[] args) {

        List<String> liste=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        Set<Integer> ogrenciListesi=new HashSet<>();

        String str=new String("Java Candir");


              C04                   obje    =                 new       C04();

        // classAdi / data turu     isim  atama işareti     keyword    constructor

        System.out.println(obje.hiz);  // 0
        System.out.println(obje.kapasite); // 0
        System.out.println(obje.ogrenciIsmi); // null
        System.out.println(obje.sayi); // 10
        obje.method1();  // method1 calisti

    }

    /*
        Herhangi bir class'in icinden
        baska bir class'daki class uyelerine (variable, method )
        ulasmak isterseniz
        hedef class'dan bir obje olusturabilirsiniz.

        Java 'da bir class'dan obje olusturmak istediginizde
        MUTLAKA bir constructor calisir.

        Java da objeler class'lardan uretilir.
        class'larda obje uretilebilmesi icin CONSTRUCTOR olmalidir.
        Java bunu bildiği için olusturulan her class'a
        obje olusturulmasini saglayan DEFAULT CONSTRUCTOR yerlestirir.

        default constructor GORUNMEZ
        Parametresizdir ve body'sinde kod yoktur.


        ONEMLİ :
        Bir class'da görünür bir constructor yoksa
        o class'da default constructor vardir.
        Gorunur bir constructor varsa,
        Java default constructor'i siler.



        default kelimesi birlikte kullanildigi kelime ile anlam kazanir.
        default deger : class level ' da olusturulan variable'lara
                        biz deger atamazsak java default degerler atar
        default case : switc statetment'da hiç bir case ile uyumlu olmayan
                        degerler icin tanimlanan kodlardır.

        default access modifier : icinde bulunulan class ve icinde bulunulan package'dan
                                  erisilebilen class uyelerini belirler.
        default cnstructor :
     */
}
