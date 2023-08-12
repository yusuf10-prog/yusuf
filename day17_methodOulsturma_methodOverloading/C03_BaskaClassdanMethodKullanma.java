package day17_methodOulsturma_methodOverloading;

import day05_matematikselIslemler_incerement.C02_RakamlarToplaminiBulma;
import day16_methodOlusturma_Kullanma.C01_MethodOlusturma;
import day16_methodOlusturma_Kullanma.C03_MethodOlusturma;

public class C03_BaskaClassdanMethodKullanma {
    public static void main(String[] args) {
        C01_MethodOlusturma.altString("Method budur ...", 7,8);  // b
        // dondörmem yazdırırm diyor.

        System.out.println(C03_MethodOlusturma.isimDuzenle("omer", "GOK"));  // Omer Gok

        System.out.println(C01_AsalSayiBulma.asalSayiMi(59));  // true

    }
}
