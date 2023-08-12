package day11_stringManipulatinos;

public class C03_suString {
    public static void main(String[] args) {
        String str= "Java Candir";


        /*

            subtring() bize verilen bir String'in istenen parcasini alma imkani tanir

            2 turlu kullanimi vardir
            1- Baslangic index'i verirseniz, o indexten sonra olan kismi verir
            2- Baslangic ve bitis index'lerini verirseniz
               baslangic intex'inden (dahi) baslar
               bitis index'ine kadar (haric) aradaki karakterleri yazdirir.

         */

        System.out.println(str.substring(3));  //a Candir
        // ücünce indexteki harf hangisi ise a ' dan baslar sona kadar yazar  'a Candir'

        System.out.println(str.substring(7));  //ndir

        System.out.println(str.substring(0)); // Java Candir

        // 0 harften başlar hepsini yazdirir.

        System.out.println(str.substring(11)); // hiclik yazdirir.

        //System.out.println(str.substring(15));  // StringIndexOutOfBoundsException

        // "Java Candir";

        System.out.println(str.substring(3,6));  // a , c

        System.out.println(str.substring(5,10)); // Candi

        System.out.println(str.substring(1,2)); // a

        System.out.println(str.substring(6,7)); // a

        // bu yazim bize istenen index'deki tek bir elementi verir.

        // charAt()'e benzer ama arti bir ozelligi var.

        // substirng bize String verdiği için manipulation yapmaya devam edebiliriz

        // 6.indexdeki harfi buyuk harf olarak yazdirin

        System.out.println(str.substring(6,7).toUpperCase());

        System.out.println(str.substring(3,3));  // hiçlik yazdirir

        // System.out.println(str.substring(8,5)); // StringIndexOutOfBoundsException

        // son 3 harfi yazdirin

        System.out.println(str.substring(str.length()-3));  // dir

        String str1="Java";
        String str2=" ";
        String str3="Candir";

        System.out.println(str1+str2+str3); // Java Candir

        System.out.println(str1.concat(str2).concat(str3)); // Java Candir

        // "Java cok guzel";


        // str guzel ile mi biter?

        System.out.println(str.endsWith("guzel")); // true

        // str el ile mi biter?

        System.out.println(str.endsWith("el"));  // true

        // str " " ile mi biter?

        System.out.println(str.endsWith(""));  // true
    }
}
