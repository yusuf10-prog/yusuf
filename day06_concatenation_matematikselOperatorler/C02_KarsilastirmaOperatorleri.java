package day06_concatenation_matematikselOperatorler;

public class C02_KarsilastirmaOperatorleri {
    public static void main(String[] args) {

        int a=10;

        int b=20;

        // Java'da " = " isareti karsilastirma degil, atama isaretidir (asigment)

        b=2*a;

        // Java 'da esitliği kontrol etmek istersek == kullaniriz

        System.out.println(b == 2*a);  // 20 == 20  b esittir 2 a mi? diye sorucaz. ==> true

        //  asigment'a esitliğin sol tarafinda sadece variable bulunur.
        // sol tarafta matematiksel islem olmaz
        // karsilastirma operatorlerinde iki tarafta da islem olabilir.

        System.out.println(3 * b > 5*a); //  60 > 50  ==> true

        System.out.println(b>=b-a);  // 20 >= 10  ==> true


        System.out.println(a <= b-a);  // 10 <= 10 ==> true

        // Java 'da karsilastirma operatorlerinde kullanilan !
        // boolean degeri tersine çevirir.

        System.out.println(a < b); // true

        System.out.println( ! (a < b));  // ! true == > false

        System.out.println(a != b);  // true



    }
}
