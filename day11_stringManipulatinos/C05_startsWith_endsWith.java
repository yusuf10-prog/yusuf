package day11_stringManipulatinos;

public class C05_startsWith_endsWith {
    public static void main(String[] args) {
        String str="Java cok guzel";

        // str Java ile mi basliyor?


        System.out.println(str.startsWith("Java"));  // true

        // str J ile mi baslar

        System.out.println(str.startsWith("J"));  // true


        // str Ja ile mi basliyor

        System.out.println(str.startsWith("Ja"));  // true


        // str "Java cok guzel" ile mi basliyor?

        System.out.println(str.startsWith("Java cok guzel"));  // true

        System.out.println(str.startsWith(" ")); // true


        // 5.indexden sonrasi c ile mi baslar?

        System.out.println(str.startsWith("c", 5));  // true

        // 6.indexden sonra ok ile mi baslar?

        System.out.println(str.startsWith("ok", 6));  // true




    }
}
