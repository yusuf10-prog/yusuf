package day12_StringManipilation;

public class C04_nullPointer {
    public static void main(String[] args) {
        String str1;
        // atamayı sonradan ilerde bir yerde değer ataması yapabiliriz.

       // System.out.println(str1);

      // str1.concat("candir";


        str1="java";

        System.out.println(str1); // java
        System.out.println(str1.concat("candir")); // java candir




        /*
            null bir deger degil pointer (isaretleyici)

            26.satir icin
            str2'nin degeri null veya str2'ye null degeri atanmis ifadeleri YANLISTIR

            dogru olan ifade
            str2 'ye deger atamadik, bunun farkindayiz ve null olarak isaretledik
         */

        String str2=null;
        System.out.println(str2);  // null

        System.out.println(str2 + " candir"); //null candir

       // System.out.println(str2.concat("candir")); //NullPointerException

        str2="tava";

        System.out.println(str2); //tava
        System.out.println(str2.concat("candir")); // tava candir

        String str3=null;
        String str4="";

        System.out.println(str4.isBlank());  // true
        System.out.println(str4.isEmpty());  // true

       // System.out.println(str3.isBlank());  //NullPointerException
        // System.out.println(str3.isEmpty()); //NullPointerException
/*

        int y = 2;

        int z = 0;

        int a = z>=0 ? ++y : z--;

        System.out.println(y + "," + z + "," + a);

 */
    int gun=2;

    switch (gun){
        case 1:
            System.out.println("Pazartesi");
            break;
        case 2:
            System.out.println("Sali");
        case 3:
            System.out.println("Çarşamba");
            break;
        case 4:
            System.out.println("Perşembe");
            break;
        case 5:
            System.out.println("Cuma");
            break;
        case 6:
            System.out.println("cumartesi");
            break;
        case 7:
            System.out.println("Pazar");
            break;
        default:
            System.out.println("Geçerli bir gün sayisi giriniz");
    }
    }
}
