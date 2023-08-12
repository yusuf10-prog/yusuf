package day22_arrays_multiDimensionaArrays;

public class C01_Arrays {
    public static void main(String[] args) {
        String [] isimler={"Ayşe", "Yusuf", "Bugra", "Abdullah", "Nergiz", "Gulay", "Ramazan"};

        // verilen bir array'deki uzunlugu tek sayi olan isimleri
        // yan yana aralarinda bir bosluk birakarak yazdirin
        // en sonda alt satira gecerek toplam kaç isim yazdirildiğini yazdirin

        int sayac=0;
        int kelimeUzunlugu=0;

        for (int i = 0; i <isimler.length ; i++) {

            kelimeUzunlugu=isimler[i].length();

            if (kelimeUzunlugu % 2 ==1){
                System.out.println(isimler[i] + " ");
                sayac++;
            }
        }
        System.out.println("\n Toplam " + sayac + " adet isim yazdirildi");
    }
}
