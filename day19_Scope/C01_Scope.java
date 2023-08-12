package day19_Scope;

public class C01_Scope {
    static int classLevelStatic=12;
    String strClassLevelStatciOlmayan="Java Guzeldir";


    public static void main(String[] args) {
        int sayiMain=20;

        System.out.println(classLevelStatic);

        for (int i = 0; i < 20; i++) {
            int sayiForLoop=5;

        }

    }
    public static void staticMethod(){
        String strStaticMethod="Java Candir";


    }
    public static void staticOlmayanMethod(){
        boolean blStaticOlmayanMethod=true;
        classLevelStatic=40;


    }
    /*
        Scope temelde 2'ye ayrilir.
            1- Local variable'lar
             A- scope'lari icinde olusturulduklari kod blogudur
                br method'da olusturulan variable, baska method'dan KULLANİLMAZ
             B- Loop Scope'u
                Bir loop icerisinde olusturulan variable
                sadece o loop icersinde kullanilabilir
                olusturulduğu method'da loop'un disinda da KULLANİLMAZ
            NOT: Local variable'lar deger verilmeden olusturulabilir
                ama deger atanmadan KULLANİLMAZ
            2- Class Level Variable'lar
               Class level variable'lar method'larin ve kod bloklarinin disinda olusturulur.
               ve scope'lari TUM CLASS'dir.
               Class level vairable'larin scope'u tum class olsa da
               static keyword de variable'larin kullanimina etki eder.

               Hastane ismi, hastane adresi, bashekim adi gibi variable'lar
               herkes için ortak olmalidir.
               bu tur variable'lar static olarak isaretlenir.

               personel ismi, personel adresi, personel telefonu gibi variable'lar ise
               tum personel icin tanimli olmakla birlikte
               bu variable'lardaki degisim herkesi ETKİLEMEZ
               sadece o personeli etkiler.
               bu tur variable'lari ise static yapmayiz.
               static olmayan class level'daki variable'lara INTSTANCE variable'lar denir.

                C - class level static variable'lar
                    bu variable'lar static klubune uya oldukları icin
                    her yere gidebilirler.
                    her method'un kullanabilirler.
                D - class level ınstance variable'lar
                    variable static olmayinca ustunlugu olmaz
                    bu durumda secici olan method olur

                    static method'lar istance variable 'larin girmesini izin vermez
                    ama static olmayan method'lar
                    static olmayan (instance) variable'lari kabul eder.


     */
}
