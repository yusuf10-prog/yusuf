package day28_ConstructorCall;

public class C01_CostructorCall {
    /*
    1-Constructor : Bir class'dan obje olusturup ilk deger atamasi(initialization)  icin o
    class'dan bir constructor calismalidir.
    2-Default constructor kullanilarak olusturulan objeler, calss'da verilen degerlere sahiptirler,
    bizim istediğimiz degerleri almasi için her bir variable icin atama yapmaliyiz.
    3-Eğer obje olusturulurken bizim verdiğimiz degerlere sahip olmasini istersek,
    parametreli constructor'lar kullaniriz.
    4-Constructor cagirdiğimiz kodda yazilan argumentler constructor'daki parametrelere deger
    olarak gider.
    5-Parametre olarak gönderilen degerlerin objeye atanmasi icin constructor icinde atama
    yapilmalidir.
        - parametre isimleri ile instance variable isimleri farklı ise insVar=paraIsmi;
        seklinde atama yapabiliriz. this.instVar=paramIsmi; yazmak zorunda değiliz.
        - Parametre isimleri ile instance variable isimleri ayni ise this.instVar=paraIsmi;
        yazmak zorundayiz. Aksi takdirde o scope'da ayni isimlerde variable olduğundan
        insVar. kullanilmaz
     6- Method overloading'de olduğu gibi bir class'in icerisinde signature'ı farklı olmak uzere
        istediğimiz kadar constructor olusturabiliriz.
     7- Birden fazla constructor oldugunda argument-parametre uyumuna göre constructor calisir.

     */

    /*
        Java'da bir constructor'in icinde baska bir constructor'i cağirmamız gerekebilir.
        bu durumda
        C01_CostructorCall(4); yazarsak,
        java bunu constructor olarak değil, method call olarak kabul eder.

        Eger bir constructor'in icinden başka bir constructor cağırmamiz gerekirse
        ClassIsmi(ilgiliArgumentler) yerine this(ilgiliArgumentler) kullanilir.
     */
    C01_CostructorCall(){
        System.out.println("Parametresiz constructor calisti. ");
    }
    C01_CostructorCall(String str){
        this(11); // constructor call
        C01_CostructorCall(4); //method call
        System.out.println("String parametreli constructor calisti");
    }
    C01_CostructorCall(int a){
        System.out.println("int parametreli constructor calisti");
    }

    static void C01_CostructorCall(int sayi){
        System.out.println("int parametresi olan method calisti");
    }

    public static void main(String[] args) {
        C01_CostructorCall obj1=new C01_CostructorCall("Merhaba Televole");
        // constructor calişir gelmez.
        //Parametresiz constructor calisti.
        // parametre değeri verilmediği için gidip parametre almayan constructor'ı çalıştırdı.

        new C01_CostructorCall(4); // constructor new yazdığımız için contructor çalışır.
        // parantez icinde a:4 şeklinde yazıyor.

        C01_CostructorCall(4); // Method
        // method icinde ise sayi:4 yazdığından da anlayabilirsiniz.



    }
}




















