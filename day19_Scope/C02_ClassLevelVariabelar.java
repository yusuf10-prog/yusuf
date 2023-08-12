package day19_Scope;

public class C02_ClassLevelVariabelar {

    static boolean bls;
    boolean bli;

    static String strs = "Java";
    String stri;

    static int sayis;
    int sayii=23;

    static char chrs='a';
    char chri;


    public static void main(String[] args) {

        System.out.println(bls); // default deger olan ==> false yazdirdi
        System.out.println(strs); // Java
        System.out.println(sayis); // 0 kendisine tanımlanan default olarak yazar
        System.out.println(chrs); // a

        C02_ClassLevelVariabelar obj=new C02_ClassLevelVariabelar();


        System.out.println(obj.bli); // false
        System.out.println(obj.stri); // null
        System.out.println(obj.sayii); //23
        System.out.println(obj.chri);  // ''
    }
    /*
        Class level kurallar
        1-class level variable'lara deger atanmasa da
          hem olusturulabilir hem de kullanilabilir.
          deger atamasi yapmadiysak, java onlara default olan degerleri atar
          boolean ==> false
          sayisal variable ==> 0
          non-primitive variable 'lar ==> null
          char ==> '' char olarak hiclik
        2-İntance variable'lara static method'lar icinden direk ULASİLMAZ
          Eger static method icinde, instance variable kullanmamiz gerekirse
          o class'dan bir obje olusturup
          o obje uzerinden instance vairable'lara ulasabiliriz.

        3- Baska class'daki class level variable'lara ulasabiliriz
            static variable'lar icin calssIsmi.staticVariableIsmi
            yazarak ulasabiliriz
            instance variable'lara ulasmak icin ise
            variable'larin olduğu calss'dan obje olusturmaliyiz.

            eger static bir vairable'a obje uzerinden 



     */
}
