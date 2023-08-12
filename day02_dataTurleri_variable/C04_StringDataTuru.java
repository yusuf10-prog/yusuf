package day02_dataTurleri_variable;

public class C04_StringDataTuru {
    public static void main(String[] args) {
        int sayi=20;

        System.out.println(sayi); // 20

        String isim="Berk Yilmaz";

        System.out.println(isim.toUpperCase()); // BERK YILMAZ

        System.out.println(isim.toLowerCase()); // berk yilmaz

        System.out.println(isim);  // Berk Yilmaz

        String str1="Java";

        String str2="Candir";

        System.out.println(str1 + str2);

        // iki tane String + işareti ile toplamaya çalişirsa
        // java o iki String 'i BİRLEŞTİRİR.
        // JavaCandir

        String str3="30";
        String str4="40";

        System.out.println(str3 + str4);  // 3040

        // verilen isim ve soyismi
        // Girilen ali uzunkavak database'e kaydedildi
        // şeklinde yazdirin

        String adi= "Ramazan";
        String soyadi="Tatar";

        System.out.println("Girilen " + adi + " "        + soyadi +  " Databes'e kaydedildi");

        // " " arasindaki boşluklar konsola yazdirilan mente yansir.
        // ancak kodlar arasında birakilan bosluklar mentne yansimaz.

        // System.out.println("Girilen " + adi + " "        + soyadi +  " Databes'e kaydedildi");

    }
}
