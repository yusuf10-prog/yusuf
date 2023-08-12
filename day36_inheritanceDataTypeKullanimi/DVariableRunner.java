package day36_inheritanceDataTypeKullanimi;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class DVariableRunner {
    public static void main(String[] args) {
        CAvciKuslar avciKusKartal=new CAvciKuslar();
        //CAvciKuslar classindan CAvciKuslar(); obje buradan olusturuyoruz. Constructord'dan.
        // aramaya CAvciKuslar aramaya data türünden basliyoruz.


        System.out.println(avciKusKartal.hareket); //C class'ından alırlar. ucarlar
        System.out.println(avciKusKartal.beslenme); // C class'ından et yer
        System.out.println(avciKusKartal.pence); // C class'ından pencelidir.
        System.out.println(avciKusKartal.gaga); // C class'ından alır. Sivri gagalidir.
        System.out.println(avciKusKartal.kanat); // B classından alıyoruz. Kanatlidir.
        System.out.println(avciKusKartal.solunum); // B class'ından alır. akciğer
        System.out.println(avciKusKartal.cogalma); // B class'ından alır. Yumurtayla
        System.out.println(avciKusKartal.omur); // A class'ından alır. yasar ve olur.

        System.out.println("======================");

        BKuslar kusKartal=new CAvciKuslar();
        System.out.println(kusKartal.hareket); //A class'ından alırlar. hareket eder
        System.out.println(kusKartal.beslenme); // C class'ından beslenirler
        //System.out.println(kusKartal.pence); // B veya A 'da yok CTE verir.
        System.out.println(kusKartal.gaga); // B class'ından alır. gagalidir.
        System.out.println(kusKartal.kanat); // B classından alıyoruz. Kanatlidir.
        System.out.println(kusKartal.solunum); // B class'ından alır. akciğer
        System.out.println(kusKartal.cogalma); // B class'ından alır. Yumurtayla
        System.out.println(kusKartal.omur); // A class'ından alır. yasar ve olur.


        System.out.println("======================");

        AHayvan hayvanKartal=new CAvciKuslar();

        System.out.println(hayvanKartal.hareket); //A class'ından alırlar. Hareket eder.
        System.out.println(hayvanKartal.beslenme); // A class'ından beslenirler
        //System.out.println(hayvanKartal.pence); // A 'da yok CTE verir.
        //System.out.println(hayvanKartal.gaga); // A 'da yok CTE verir.
        //System.out.println(hayvanKartal.kanat); // A 'da yok CTE verir.
        System.out.println(hayvanKartal.solunum); // A class'ından alır. Nefes alirlar
        System.out.println(hayvanKartal.cogalma); // A class'ından alır. coğalir
        System.out.println(hayvanKartal.omur); // A class'ından alır. yasar ve olur.



    /*
        Java 'da en klasik obje olusturma yöntemi

        ClassAdi obj = new ClassAdi();

        ama Child class'ın constructor'ı kullanilarak olusturulan objeler icin
        data turu Parent class'lar olarak secilebilir.

        Eger constructor ve data turu farklı ise
        objenin ozelliklerini aramaya DATA TURU olan class'dan baslanır.

        EGER ozellikler variable olarak olusturuldu ise
        objenin özelliklerini DATA TURU belirler.
     */
    /*
    AbstractList<String> liste=new ArrayList<>();

    String str="Java";
    Object obj=str;

    Integer yeniSayi=(Integer) obj;

     */
    }

}
