package day26_forEachLoop_Constructor;

public class C09_CarRunner {
    public static void main(String[] args) {
        C08_Car car1=new C08_Car();
        System.out.println(car1.marka); // Marka belirtilmemis
        System.out.println(car1.model); // Model belirtilmemis

        System.out.println(car1);
        //C08_Car{marka='Marka belirtilmemis',
        // model='Model belirtilmemis', yil=1900, fiyat=0, renk='Renk belirtilmemis'}

        //Araba bilgileri ==>marka='Marka belirtilmemis',
        // model :'Model belirtilmemis', yil:1900, fiyat:0, renk:Renk belirtilmemis'

        car1.marka="Toyota";
        car1.model="Corolla";
        car1.yil=2011;
        car1.fiyat=7000;
        car1.renk="Kirmizi";

        System.out.println(car1);
        //Araba bilgileri ==>marka='Toyota', model :'Corolla', yil:2011, fiyat:7000, renk:Kirmizi'


        C08_Car car2=new C08_Car();
        System.out.println(car2);
        //Araba bilgileri ==>marka='Marka belirtilmemis',
        // model :'Model belirtilmemis', yil:1900, fiyat:0, renk:Renk belirtilmemis'

        car2.marka="Honda";
        car2.renk="mavi";
        car2.fiyat=8000;

        System.out.println(car2);
        //Araba bilgileri ==>marka='Honda', model :'Model belirtilmemis', yil:1900, fiyat:8000, renk:mavi'

        C08_Car car3=new C08_Car();
        System.out.println(car3);
        //Araba bilgileri ==>marka='Marka belirtilmemis', model :'Model belirtilmemis', yil:1900, fiyat:0, renk:Renk belirtilmemis'


        //                          CONSTRUCTORS

        // 1 - Constructor'lar syntax olarak method'lara benzerler ama return type'leri yoktur.
        // 2 - Isimleri mutlaka Class ismi ile ayni olmalidir. (Buyuk harfle baslar)
        // 3 - Static olarak tanimlanamazlar.
        // 4 - Method overloading 'deki gibi farkli signature'lara sahip istendiği kadar constructor olusturulabilir.
        // 5 - Constructor'lar class'in icerisinde, method'larin ve diger constructor'larin disinda olusturulabilir.

        //                          DEFAULT CONSTRUCTOR
        //              public class Araba{ }
        // Java'da bir obje olusturulup ona deger atanabilmesi icin mutlaka bir constructor calisir.
        // Java OOP consept geregi, her class obje uretmek icin olusturulmus bir kalip gorevi gorur
        // Bir class olusturuldugunda biz hic bir constructor olusturmasak da, Java o class'dan obje olusturulmasina izin verir.
        // Biz constructor oluturmasak bile class'in obje olusturma gorevini yapmasi icin java
        // her Class'a default bir constructor koyar.
        // Default constructor parametresiz ve body'sinde hic bir kod olmayan bir constructor'dir ama gorunmez
        // Biz bir class'da parametreli veya parametresiz bir constructor olusturunca Java default constructor'i siler.


    }
}
