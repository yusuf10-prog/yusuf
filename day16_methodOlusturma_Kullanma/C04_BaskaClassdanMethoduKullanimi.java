package day16_methodOlusturma_Kullanma;

public class C04_BaskaClassdanMethoduKullanimi {
    public static void main(String[] args) {
        C01_MethodOlusturma.altString("Method", 1,3);  // et
        System.out.println(C03_MethodOlusturma.isimDuzenle("bugra", "CAN")); //Bugra Can

        String isimDuzenle=C03_MethodOlusturma.isimDuzenle("mehmet", "kemal");


        // duzenlenmis ismin uzunlugunu yazdirin
        System.out.println(isimDuzenle.length());

        /*
        Void olan method'da sonucu KAYDEDEMEYİZ, sadece yazdiririz

        bize deger DÖNDÜREN method'da ise sonucu
        istersek direk yazdirir, istersek de kaydederiz.
         */
    }
}
