package day21_arrays;

public class C07_EnUzunEnKisakelimeyazdir {
    public static void main(String[] args) {
        // Soru 6 - Verilen String bir array'deki
        //     en uzun ve en kisa kelimeleri yazdiran bir method olusturun


        String [] isimler={"Resul", "Omer", "Mehmet", "Ertugrul", "Ozan", "Suleyman"};


        enUzunEnKisaYazdir(isimler);

    }
    public static void enUzunEnKisaYazdir(String [] isimler){
        String enKisaKelime=isimler[0]; // sadece baslangic degeri olması icin atandi
        String enUzunKelime=isimler[0]; //    """"

        for (int i = 0; i < isimler.length ; i++) {
            if (isimler[i].length() > enUzunKelime.length()){
                // en uzun isim olarak 0 'inci indeksteki yani resul ismini baz aldı
                // ve isimler arasında gezerek resul isminden daha uzun olan ismi yazdırdı
                // isimler dizisinde yer alan en uzun ismi bulup
                // daha sonra enUzunKelimeye atama yapacak
                enUzunKelime=isimler[i];
            }
            if (isimler[i].length() < enKisaKelime.length()){
                enKisaKelime=isimler[i];
            }
        }
        System.out.println("En uzun isim : " + enUzunKelime);
        System.out.println("En kısa isim : " + enKisaKelime);
    }
}
