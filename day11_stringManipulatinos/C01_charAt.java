package day11_stringManipulatinos;

public class C01_charAt {
    public static void main(String[] args) {
        String str="Java Candir";

        // ilk harfini yazdirin
        // 0 inci indeksi veriyor.

        System.out.println(str.charAt(0)); // J

        // 7.Harfi yazdirin

        System.out.println(str.charAt(6));  // a
        // 7 inci harfi veriyor.


        // Bu metnin uzunlugu 11
        // son harfi yazdirin
        System.out.println(str.charAt(11-1));  //r

        // sondan 3.harfi yazdirin

        System.out.println(str.charAt(11-3));  // d

        // eğer sondan basa dogru gelecek sekilde bir char isteniyorsa
        // charAt(uzunluk - sondanKacinciKarakter)

        // metnin uzunluğundan daha buyuk bir siradaki karakter istenirse
        // 20.karakteri yazdirin

       //  System.out.println(str.charAt(20));  // StringIndexOutOfBoundsException

        // 4.harfi buyuk harf olarak yazdirin.

        System.out.println(str.toUpperCase().charAt(3));

        /*
        charAt() ' bize char data turunde bir sonuc verir(döndürür)
        toUpparCase() gibi method'lar String variable'lar ile calistiğindan
        charAt()  calistiktan sonra String Manipulation YAPILMAZ

        Eger manipulation ihtiyaci varsa, charAt() kullanilmadan önce yapılmalidir.
         */


    }
}
