package day05_matematikselIslemler_incerement;

public class C04_PreIncerement_PostIncerement {
    public static void main(String[] args) {

        // Java'da bir onceki class 'da yaptigimiz gibi
        // artirma ve atama , veya arttirma ve yazdirma beraber olabilir.

        int a = 20;

        int b= 10;

        System.out.println(b = 2 * a);  // 40

        System.out.println(a = b -5); // 35

        a=10;

        // onca a ' nin degerini b 'ye atayin, sonra a 'yi arttirin.

        b = a++;

        System.out.println("a : " + a + " b : " + b);   //  a : 11 b : 10

        // onca a ' nin degerini bir artirin, sonra a 'nin degerini b 'ye atayin

        b = ++a;

        System.out.println("a : " + a + " b : " + b);  // a : 12 b : 12

        /*

            Bu kallanim sadece a++ , a--  ve ++a  --a icin gecerlidir.

            burada ++ veya -- 'yi once mi yoksa sonra mi kullanacagimiza
            bizden istenen duruma gore karar veririz.

            arttirma once ise ++a
            arttirma sonra ise a++
         */

        a=20;

        System.out.println(a++); // 20

        System.out.println(a); // 21

        a =20;

        System.out.println(--a); // 19

        System.out.println(a); // 19

    }
}
