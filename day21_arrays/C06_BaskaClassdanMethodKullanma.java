package day21_arrays;

import java.util.Arrays;

public class C06_BaskaClassdanMethodKullanma {
    public static void main(String[] args) {

        int [] arr={2,4,6,8};

        System.out.println("eski arr : " +Arrays.toString(arr));  //[2, 4, 6, 8]

        arr=C02_ArrayinElementleriniIstenenKadarArtirma.elementleriArtir(arr,4);  //[6, 8, 10, 12]

        System.out.println("yeni array : "  + Arrays.toString(arr));

        System.out.println(C03_PozitifElementleriTopla.pozitifElementleriTopla(arr)); //36

        C04_ElementSay.elemanSay(arr,6);  //Aranan 6sayisi array'de 1 kere kullanilmis.
        //method void oldugu icin bizim sout yapmamiza gerek yok

        // kullanicidan deger alarak int [] bir array olusturmak istiyorum

        int [] kullaniciArrayi=C05_ArrayOlustur.arrayOlustur();
        System.out.println(Arrays.toString(kullaniciArrayi));


    }
}
